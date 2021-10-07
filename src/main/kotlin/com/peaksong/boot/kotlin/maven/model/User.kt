package com.peaksong.boot.kotlin.maven.model

import com.peaksong.boot.kotlin.maven.util.KotlinNoArg


@KotlinNoArg
data class User(
    val id: String,
    val name: String
)
