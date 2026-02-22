package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icUpArrow: ImageVector
    get() {
        if (_icUpArrow != null) return _icUpArrow!!
        
        _icUpArrow = ImageVector.Builder(
            name = "icUpArrow",
            defaultWidth = 12.dp,
            defaultHeight = 7.dp,
            viewportWidth = 12f,
            viewportHeight = 7f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.25f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.625f, 5.625f)
                lineTo(5.625f, 0.625f)
                lineTo(0.625f, 5.625f)
            }
        }.build()
        
        return _icUpArrow!!
    }

private var _icUpArrow: ImageVector? = null

