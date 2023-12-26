package com.app.jetpackbottomnavigation.ui

import com.app.jetpackbottomnavigation.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home", R.drawable.baseline_home_24, "Home")
    object Music : NavigationItem("music", R.drawable.baseline_library_music_24, "Music")
    object Movies : NavigationItem("movies", R.drawable.baseline_movie_24, "Movies")
    object Profile : NavigationItem("profile", R.drawable.baseline_person_24, "Profile")
}