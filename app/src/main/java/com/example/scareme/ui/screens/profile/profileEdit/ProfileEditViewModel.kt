package com.example.scareme.ui.screens.profile.profileEdit

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.auth.useCase.SignOutUseCase
import com.example.domain.profile.model.Topic
import com.example.domain.profile.usecase.GetAllTopicsUseCase
import com.example.scareme.ui.screens.profile.profileEdit.model.TopicUi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ProfileEditViewModel(
    private val signOutUseCase: SignOutUseCase,
    private val getAllTopicsUseCase: GetAllTopicsUseCase
):ViewModel() {
    private val _topics = MutableStateFlow(emptyList<TopicUi>())
    val topics = _topics.asStateFlow()

    init {
        getAllTopics()
    }

    fun onTopicSelected(topicId: String) {
        _topics.value = _topics.value.map { topic ->
            if (topic.id == topicId) {
                topic.copy(isSelected = !topic.isSelected)
            } else {
                topic
            }
        }
    }

    private fun getAllTopics() {
        viewModelScope.launch {
            runCatching { getAllTopicsUseCase() }
                .onFailure { throwable -> println("Error: ${throwable.message}") }
                .onSuccess { topics ->
                    _topics.value = topics.map { topic: Topic ->
                        TopicUi(
                            id = topic.id,
                            title = topic.title
                        )
                    }
                }
        }
    }

    fun signOut() {
        viewModelScope.launch {
            runCatching { signOutUseCase() }
                .onFailure { throwable -> println("Error: ${throwable.message}") }
                .onSuccess { println("Success") }
        }
    }
}