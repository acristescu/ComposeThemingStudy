package com.example.whitelabelthemeingcomposestudy.ui.theme

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class BrandConfigImpl : BrandConfig {
    override val shapes = Shapes(
        small = CutCornerShape(8.dp),
        medium = CutCornerShape(8.dp),
        large = CutCornerShape(8.dp)
    )

    override val lightColors = lightColors(
        primary = Color(0xFF0086FC),
        onPrimary = Color(0xFF88FFFF),
        background = Color(0xFFDDDDFF)
    )

    override val darkColors = darkColors(
        primary = Color(0xFFFFDAC5),
        onPrimary = Color(0xFF000000),
        background = Color(0xFF000000)
    )
    override val typography = Typography(
        body1 = TextStyle(
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Normal,
            fontSize = 26.sp
        )
    )
}

val brandConfig: BrandConfig = BrandConfigImpl()