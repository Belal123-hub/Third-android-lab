package com.example.scareme.ui.navigation

sealed class NavigationItem(val route: String) {
    data object Splash : NavigationItem(Screen.Splash.name)
    data object Start : NavigationItem(Screen.START.name)
    data object SignIn : NavigationItem(Screen.SIGN_IN.name)
    data object SignUp : NavigationItem(Screen.SIGN_UP.name)
    data object Home : NavigationItem(Screen.Main.name)
    data object ProfileEdit:NavigationItem(Screen.ProfileEdit.name)
    data object ProfileInfo:NavigationItem(Screen.ProfileInfo.name)
    data object ChatList:NavigationItem(Screen.ChatList.name)
    data object Chat:NavigationItem(Screen.Chat.name)
}