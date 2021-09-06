package com.example.whitelabelthemeingcomposestudy.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
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
        small = RoundedCornerShape(4.dp),
        medium = RoundedCornerShape(4.dp),
        large = RoundedCornerShape(0.dp)
    )

    override val lightColors = lightColors(
        primary = Color(0xFFBB86FC),
        onPrimary = Color(0xFFFFFFFF),
        background = Color(0xFFDDFFDD)
    )

    override val darkColors = darkColors(
        primary = Color(0xFF03DAC5),
        onPrimary = Color(0xFF000000),
        background = Color(0xFF000000)
    )

    override val typography = Typography(
        body1 = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        )
    )
}

val brandConfig: BrandConfig = BrandConfigImpl()