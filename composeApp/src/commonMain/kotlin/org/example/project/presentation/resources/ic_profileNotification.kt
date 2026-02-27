package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icProfileNotification: ImageVector
    get() {
        if (_icProfileNotification != null) return _icProfileNotification!!
        
        _icProfileNotification = ImageVector.Builder(
            name = "icProfileNotification",
            defaultWidth = 20.dp,
            defaultHeight = 20.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFEE2A7B)),
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.25f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.833f, 6.6665f)
                curveTo(17.2137f, 6.6665f, 18.333f, 5.54722f, 18.333f, 4.1665f)
                curveTo(18.333f, 2.78579f, 17.2137f, 1.6665f, 15.833f, 1.6665f)
                curveTo(14.4523f, 1.6665f, 13.333f, 2.78579f, 13.333f, 4.1665f)
                curveTo(13.333f, 5.54722f, 14.4523f, 6.6665f, 15.833f, 6.6665f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.25f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.83301f, 10.8335f)
                horizontalLineTo(9.99968f)
            }
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.25f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.83301f, 14.1665f)
                horizontalLineTo(13.333f)
            }
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.25f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.667f, 1.6665f)
                horizontalLineTo(7.50033f)
                curveTo(3.33366f, 1.6665f, 1.66699f, 3.33317f, 1.66699f, 7.49984f)
                verticalLineTo(12.4998f)
                curveTo(1.66699f, 16.6665f, 3.33366f, 18.3332f, 7.50033f, 18.3332f)
                horizontalLineTo(12.5003f)
                curveTo(16.667f, 18.3332f, 18.3337f, 16.6665f, 18.3337f, 12.4998f)
                verticalLineTo(8.33317f)
            }
        }.build()
        
        return _icProfileNotification!!
    }

private var _icProfileNotification: ImageVector? = null

