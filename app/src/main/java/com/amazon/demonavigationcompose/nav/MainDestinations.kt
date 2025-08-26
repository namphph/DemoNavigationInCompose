package com.amazon.demonavigationcompose.nav

import com.amazon.demonavigationcompose.R
import kotlinx.serialization.Serializable

@Serializable
sealed class MainDestinations(
    val titleRes: Int,
) {
    @Serializable
    object Home : MainDestinations(R.string.home)

    @Serializable
    object List : MainDestinations(R.string.list)

    @Serializable
    object Search : MainDestinations(R.string.search)

    @Serializable
    object Profile : MainDestinations(R.string.profile)
}
