package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icProfileLogin: ImageVector
    get() {
        if (_icProfileLogin != null) return _icProfileLogin!!
        
        _icProfileLogin = ImageVector.Builder(
            name = "icProfileLogin",
            defaultWidth = 20.dp,
            defaultHeight = 20.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFFE35959)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.41699f, 6.3002f)
                curveTo(7.67533f, 3.3002f, 9.21699f, 2.0752f, 12.592f, 2.0752f)
                horizontalLineTo(12.7003f)
                curveTo(16.4253f, 2.0752f, 17.917f, 3.56686f, 17.917f, 7.29186f)
                verticalLineTo(12.7252f)
                curveTo(17.917f, 16.4502f, 16.4253f, 17.9419f, 12.7003f, 17.9419f)
                horizontalLineTo(12.592f)
                curveTo(9.24199f, 17.9419f, 7.70033f, 16.7335f, 7.42533f, 13.7835f)
            }
            path(
                stroke = SolidColor(Color(0xFFE35959)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(1.66699f, 10f)
                horizontalLineTo(12.4003f)
            }
            path(
                stroke = SolidColor(Color(0xFFE35959)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.542f, 7.2085f)
                lineTo(13.3337f, 10.0002f)
                lineTo(10.542f, 12.7918f)
            }
        }.build()
        
        return _icProfileLogin!!
    }

private var _icProfileLogin: ImageVector? = null

