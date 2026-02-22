package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icEye: ImageVector
    get() {
        if (_icEye != null) return _icEye!!
        
        _icEye = ImageVector.Builder(
            name = "icEye",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF645F6A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.3867f, 7.99995f)
                curveTo(10.3867f, 9.31995f, 9.32001f, 10.3866f, 8.00001f, 10.3866f)
                curveTo(6.68001f, 10.3866f, 5.61334f, 9.31995f, 5.61334f, 7.99995f)
                curveTo(5.61334f, 6.67995f, 6.68001f, 5.61328f, 8.00001f, 5.61328f)
                curveTo(9.32001f, 5.61328f, 10.3867f, 6.67995f, 10.3867f, 7.99995f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF645F6A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.00002f, 13.5138f)
                curveTo(10.3534f, 13.5138f, 12.5467f, 12.1271f, 14.0734f, 9.72713f)
                curveTo(14.6734f, 8.78713f, 14.6734f, 7.20713f, 14.0734f, 6.26713f)
                curveTo(12.5467f, 3.86713f, 10.3534f, 2.48047f, 8.00002f, 2.48047f)
                curveTo(5.64668f, 2.48047f, 3.45335f, 3.86713f, 1.92668f, 6.26713f)
                curveTo(1.32668f, 7.20713f, 1.32668f, 8.78713f, 1.92668f, 9.72713f)
                curveTo(3.45335f, 12.1271f, 5.64668f, 13.5138f, 8.00002f, 13.5138f)
                close()
            }
        }.build()
        
        return _icEye!!
    }

private var _icEye: ImageVector? = null

