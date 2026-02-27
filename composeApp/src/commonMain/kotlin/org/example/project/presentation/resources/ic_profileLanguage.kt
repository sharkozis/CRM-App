package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icProfileLanguage: ImageVector
    get() {
        if (_icProfileLanguage != null) return _icProfileLanguage!!
        
        _icProfileLanguage = ImageVector.Builder(
            name = "icProfileLanguage",
            defaultWidth = 20.dp,
            defaultHeight = 20.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.25f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.1584f, 7.4668f)
                horizontalLineTo(5.8418f)
            }
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.25f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 6.06689f)
                verticalLineTo(7.46689f)
            }
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.25f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.083f, 7.4502f)
                curveTo(12.083f, 11.0335f, 9.28301f, 13.9335f, 5.83301f, 13.9335f)
            }
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.25f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.1667f, 13.9333f)
                curveTo(12.6667f, 13.9333f, 11.3333f, 13.1333f, 10.375f, 11.875f)
            }
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.25f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.50033f, 18.3332f)
                horizontalLineTo(12.5003f)
                curveTo(16.667f, 18.3332f, 18.3337f, 16.6665f, 18.3337f, 12.4998f)
                verticalLineTo(7.49984f)
                curveTo(18.3337f, 3.33317f, 16.667f, 1.6665f, 12.5003f, 1.6665f)
                horizontalLineTo(7.50033f)
                curveTo(3.33366f, 1.6665f, 1.66699f, 3.33317f, 1.66699f, 7.49984f)
                verticalLineTo(12.4998f)
                curveTo(1.66699f, 16.6665f, 3.33366f, 18.3332f, 7.50033f, 18.3332f)
                close()
            }
        }.build()
        
        return _icProfileLanguage!!
    }

private var _icProfileLanguage: ImageVector? = null

