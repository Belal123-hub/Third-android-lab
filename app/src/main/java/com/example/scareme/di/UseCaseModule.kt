package com.example.scareme.di


import com.example.domain.auth.useCase.IsUserSignedInUseCase
import com.example.domain.auth.useCase.IsUserSignedInUseCaseImpl
import com.example.domain.auth.useCase.SignInUseCase
import com.example.domain.auth.useCase.SignInUseCaseImpl
import com.example.domain.auth.useCase.SignOutUseCase
import com.example.domain.auth.useCase.SignOutUseCaseImpl
import com.example.domain.auth.useCase.SignUpUseCase
import com.example.domain.auth.useCase.SignUpUseCaseImpl
import com.example.domain.chat.usecase.CreateChatUseCase
import com.example.domain.chat.usecase.CreateChatUseCaseImpl
import com.example.domain.chat.usecase.GetChatListUseCase
import com.example.domain.chat.usecase.GetChatListUseCaseImpl

import com.example.domain.profile.usecase.GetAllTopicsUseCase
import com.example.domain.profile.usecase.GetAllTopicsUseCaseImpl
import com.example.domain.profile.usecase.GetProfileUseCase
import com.example.domain.profile.usecase.UpdateProfileUseCase
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module
import com.example.domain.profile.usecase.UpdateProfileUseCaseImpl
import com.example.domain.profile.usecase.GetProfileUseCaseImpl
import com.example.domain.users.usecase.DislikeUserUseCase
import com.example.domain.users.usecase.DislikeUserUseCaseImpl
import com.example.domain.users.usecase.GetAllUsersUseCase
import com.example.domain.users.usecase.GetAllUsersUseCaseImpl
import com.example.domain.users.usecase.LikeUserUseCase
import com.example.domain.users.usecase.LikeUserUseCaseImpl

val useCaseModule = module {
    factoryOf(::IsUserSignedInUseCaseImpl) { bind<IsUserSignedInUseCase>() }
    factoryOf(::SignInUseCaseImpl) { bind<SignInUseCase>() }
    factoryOf(::SignUpUseCaseImpl) { bind<SignUpUseCase>() }
    factoryOf(::SignOutUseCaseImpl) { bind<SignOutUseCase>() }
    factoryOf(::GetAllTopicsUseCaseImpl) { bind<GetAllTopicsUseCase>() }
    factoryOf(::UpdateProfileUseCaseImpl) { bind<UpdateProfileUseCase>() }
    factoryOf(::GetProfileUseCaseImpl) { bind<GetProfileUseCase>() }
    factoryOf(::GetAllUsersUseCaseImpl) { bind<GetAllUsersUseCase>() }
    factoryOf(::LikeUserUseCaseImpl) { bind<LikeUserUseCase>() }
    factoryOf(::DislikeUserUseCaseImpl) { bind<DislikeUserUseCase>() }
    factoryOf(::GetChatListUseCaseImpl) { bind<GetChatListUseCase>() }
    factoryOf(::CreateChatUseCaseImpl) { bind<CreateChatUseCase>() }
    //factoryOf(::SendMessageUseCaseImpl) { bind<SendMessageUseCase>() }
    //factoryOf(::GetChatMessagesUseCaseImpl) { bind<GetChatMessagesUseCase>() }

}