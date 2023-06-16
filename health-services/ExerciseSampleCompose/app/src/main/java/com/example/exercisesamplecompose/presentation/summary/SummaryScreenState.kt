package com.example.exercisesamplecompose.presentation.summary

import kotlin.time.Duration

data class SummaryScreenState(
    val averageHeartRate: Double,
    val totalDistance: Double,
    val totalCalories: Double,
    val elapsedTime: Duration,
)