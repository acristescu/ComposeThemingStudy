package com.example.whitelabelthemeingcomposestudy.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

@Composable
fun WhitelabelThemeingComposeStudyTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        brandConfig.darkColors
    } else {
        brandConfig.lightColors
    }

    MaterialTheme(
            colors = colors,
            typography = brandConfig.typography,
            shapes = brandConfig.shapes,
            content = content
    )
}