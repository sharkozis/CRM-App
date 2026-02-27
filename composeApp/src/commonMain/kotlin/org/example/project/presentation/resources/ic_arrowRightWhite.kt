package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icArrowRightWhite: ImageVector
    get() {
        if (_icArrowRightWhite != null) return _icArrowRightWhite!!
        
        _icArrowRightWhite = ImageVector.Builder(
            name = "icArrowRightWhite",
            defaultWidth = 20.dp,
            defaultHeight = 20.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFFFFFFFF)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10f
            ) {
                moveTo(12.0254f, 4.94141f)
                lineTo(17.0837f, 9.99974f)
                lineTo(12.0254f, 15.0581f)
            }
            path(
                stroke = SolidColor(Color(0xFFFFFFFF)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10f
            ) {
                moveTo(2.91699f, 10f)
                horizontalLineTo(16.942f)
            }
        }.build()
        
        return _icArrowRightWhite!!
    }

private var _icArrowRightWhite: ImageVector? = null

