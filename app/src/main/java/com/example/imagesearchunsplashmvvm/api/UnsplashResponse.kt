package com.example.imagesearchunsplashmvvm.api

import android.speech.RecognizerResultsIntent
import com.example.imagesearchunsplashmvvm.data.UnsplashPhoto

data class UnsplashResponse (
    val results: List<UnsplashPhoto>
        )