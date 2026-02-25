package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icPen: ImageVector
    get() {
        if (_icPen != null) return _icPen!!
        
        _icPen = ImageVector.Builder(
            name = "icPen",
            defaultWidth = 14.dp,
            defaultHeight = 14.dp,
            viewportWidth = 14f,
            viewportHeight = 14f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.25f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10f
            ) {
                moveTo(7.73707f, 3.17272f)
                lineTo(2.9479f, 8.24188f)
                curveTo(2.76707f, 8.43438f, 2.59207f, 8.81355f, 2.55707f, 9.07605f)
                lineTo(2.34124f, 10.9661f)
                curveTo(2.2654f, 11.6486f, 2.7554f, 12.1152f, 3.43207f, 11.9986f)
                lineTo(5.3104f, 11.6777f)
                curveTo(5.5729f, 11.6311f, 5.9404f, 11.4386f, 6.12124f, 11.2402f)
                lineTo(10.9104f, 6.17105f)
                curveTo(11.7387f, 5.29605f, 12.1121f, 4.29855f, 10.8229f, 3.07938f)
                curveTo(9.53957f, 1.87188f, 8.5654f, 2.29772f, 7.73707f, 3.17272f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.25f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10f
            ) {
                moveTo(6.93848f, 4.01953f)
                curveTo(7.18931f, 5.62953f, 8.49598f, 6.86036f, 10.1176f, 7.0237f)
            }
        }.build()
        
        return _icPen!!
    }

private var _icPen: ImageVector? = null

