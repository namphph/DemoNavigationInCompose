package com.amazon.demonavigationcompose.nav

import kotlinx.serialization.Serializable

@Serializable
data class Item(
    val path: String,
    val title: String
)

@Serializable
object Home
@Serializable
object List
@Serializable
object Search
@Serializable
object Profile
