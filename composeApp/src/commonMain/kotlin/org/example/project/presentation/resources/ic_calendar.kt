package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icCalendar: ImageVector
    get() {
        if (_icCalendar != null) return _icCalendar!!
        
        _icCalendar = ImageVector.Builder(
            name = "icCalendar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF8B345A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10f
            ) {
                moveTo(8f, 2f)
                verticalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF8B345A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10f
            ) {
                moveTo(16f, 2f)
                verticalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF8B345A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10f
            ) {
                moveTo(3.5f, 9.08997f)
                horizontalLineTo(20.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF8B345A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10f
            ) {
                moveTo(21f, 8.5f)
                verticalLineTo(17f)
                curveTo(21f, 20f, 19.5f, 22f, 16f, 22f)
                horizontalLineTo(8f)
                curveTo(4.5f, 22f, 3f, 20f, 3f, 17f)
                verticalLineTo(8.5f)
                curveTo(3f, 5.5f, 4.5f, 3.5f, 8f, 3.5f)
                horizontalLineTo(16f)
                curveTo(19.5f, 3.5f, 21f, 5.5f, 21f, 8.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF8B345A)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.6947f, 13.7f)
                horizontalLineTo(15.7037f)
            }
            path(
                stroke = SolidColor(Color(0xFF8B345A)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.6947f, 16.7f)
                horizontalLineTo(15.7037f)
            }
            path(
                stroke = SolidColor(Color(0xFF8B345A)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.9955f, 13.7f)
                horizontalLineTo(12.0045f)
            }
            path(
                stroke = SolidColor(Color(0xFF8B345A)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.9955f, 16.7f)
                horizontalLineTo(12.0045f)
            }
            path(
                stroke = SolidColor(Color(0xFF8B345A)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.29431f, 13.7f)
                horizontalLineTo(8.30329f)
            }
            path(
                stroke = SolidColor(Color(0xFF8B345A)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.29431f, 16.7f)
                horizontalLineTo(8.30329f)
            }
        }.build()
        
        return _icCalendar!!
    }

private var _icCalendar: ImageVector? = null

