package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icArrowleft: ImageVector
    get() {
        if (_icArrowleft != null) return _icArrowleft!!
        
        _icArrowleft = ImageVector.Builder(
            name = "icArrowleft",
            defaultWidth = 20.dp,
            defaultHeight = 20.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10f
            ) {
                moveTo(7.97484f, 4.94141f)
                lineTo(2.9165f, 9.99974f)
                lineTo(7.97484f, 15.0581f)
            }
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10f
            ) {
                moveTo(17.0831f, 10f)
                horizontalLineTo(3.05811f)
            }
        }.build()
        
        return _icArrowleft!!
    }

private var _icArrowleft: ImageVector? = null

