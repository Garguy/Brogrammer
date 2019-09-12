package com.example.domain.domainmodel

data class WorkoutTemplate (
    val name: String,
    val thumbnailRes: String,
    val description: String,
    val difficulty: Int,
    val targets: List<ExerciseTarget>
)