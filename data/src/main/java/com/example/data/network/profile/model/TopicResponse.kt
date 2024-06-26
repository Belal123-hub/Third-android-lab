package com.example.data.network.profile.model

import kotlinx.serialization.Serializable

@Serializable
data class TopicResponse(
    val id: String,
    val title: String
)
