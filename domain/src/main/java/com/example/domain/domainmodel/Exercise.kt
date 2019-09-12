package com.example.domain.domainmodel

import com.example.domain.domainmodel.enums.ExerciseType

data class Exercise (
    val name: String,
    val sets: List<Set>,
    val type: ExerciseType
)