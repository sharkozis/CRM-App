package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icRightArrowMaroon: ImageVector
    get() {
        if (_icRightArrowMaroon != null) return _icRightArrowMaroon!!
        
        _icRightArrowMaroon = ImageVector.Builder(
            name = "icRightArrowMaroon",
            defaultWidth = 12.dp,
            defaultHeight = 12.dp,
            viewportWidth = 12f,
            viewportHeight = 12f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF8B345A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.5f, 3f)
                lineTo(7.5f, 6f)
                lineTo(4.5f, 9f)
            }
        }.build()
        
        return _icRightArrowMaroon!!
    }

private var _icRightArrowMaroon: ImageVector? = null

