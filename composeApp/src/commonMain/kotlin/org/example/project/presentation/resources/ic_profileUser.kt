package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icProfileUser: ImageVector
    get() {
        if (_icProfileUser != null) return _icProfileUser!!
        
        _icProfileUser = ImageVector.Builder(
            name = "icProfileUser",
            defaultWidth = 20.dp,
            defaultHeight = 20.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.1171f, 18.0166f)
                curveTo(14.3838f, 18.2333f, 13.5171f, 18.3333f, 12.5005f, 18.3333f)
                horizontalLineTo(7.50046f)
                curveTo(6.48379f, 18.3333f, 5.61712f, 18.2333f, 4.88379f, 18.0166f)
                curveTo(5.06712f, 15.85f, 7.29212f, 14.1416f, 10.0005f, 14.1416f)
                curveTo(12.7088f, 14.1416f, 14.9338f, 15.85f, 15.1171f, 18.0166f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.5003f, 1.6665f)
                horizontalLineTo(7.50033f)
                curveTo(3.33366f, 1.6665f, 1.66699f, 3.33317f, 1.66699f, 7.49984f)
                verticalLineTo(12.4998f)
                curveTo(1.66699f, 15.6498f, 2.61699f, 17.3748f, 4.88366f, 18.0165f)
                curveTo(5.06699f, 15.8498f, 7.29199f, 14.1415f, 10.0003f, 14.1415f)
                curveTo(12.7087f, 14.1415f, 14.9337f, 15.8498f, 15.117f, 18.0165f)
                curveTo(17.3837f, 17.3748f, 18.3337f, 15.6498f, 18.3337f, 12.4998f)
                verticalLineTo(7.49984f)
                curveTo(18.3337f, 3.33317f, 16.667f, 1.6665f, 12.5003f, 1.6665f)
                close()
                moveTo(10.0003f, 11.8082f)
                curveTo(8.35033f, 11.8082f, 7.01699f, 10.4665f, 7.01699f, 8.81652f)
                curveTo(7.01699f, 7.16652f, 8.35033f, 5.83317f, 10.0003f, 5.83317f)
                curveTo(11.6503f, 5.83317f, 12.9837f, 7.16652f, 12.9837f, 8.81652f)
                curveTo(12.9837f, 10.4665f, 11.6503f, 11.8082f, 10.0003f, 11.8082f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.9833f, 8.81684f)
                curveTo(12.9833f, 10.4668f, 11.6499f, 11.8085f, 9.99994f, 11.8085f)
                curveTo(8.34994f, 11.8085f, 7.0166f, 10.4668f, 7.0166f, 8.81684f)
                curveTo(7.0166f, 7.16684f, 8.34994f, 5.8335f, 9.99994f, 5.8335f)
                curveTo(11.6499f, 5.8335f, 12.9833f, 7.16684f, 12.9833f, 8.81684f)
                close()
            }
        }.build()
        
        return _icProfileUser!!
    }

private var _icProfileUser: ImageVector? = null

