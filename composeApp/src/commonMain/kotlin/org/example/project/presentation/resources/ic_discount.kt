package com.composables

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icDiscount: ImageVector
    get() {
        if (_icDiscount != null) return _icDiscount!!
        
        _icDiscount = ImageVector.Builder(
            name = "icDiscount",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f
        ).apply {
            path(
                stroke = Brush.linearGradient(
                    colors = listOf(Color(0xFFEE2A7B), Color(0xFFF65399), Color(0xFFFF7DB8)),
                    start = Offset(19.4472f, 19.5935f),
                    end = Offset(10.5573f, 14.536f),
                    tileMode = TileMode.Clamp
                ),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 20f)
                lineTo(20f, 12f)
            }
            path(
                stroke = Brush.linearGradient(
                    colors = listOf(Color(0xFFEE2A7B), Color(0xFFF65399), Color(0xFFFF7DB8)),
                    start = Offset(27.4906f, 27.9785f),
                    end = Offset(-2.14265f, 11.1202f),
                    tileMode = TileMode.Clamp
                ),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.33317f, 8.00008f)
                curveTo(3.6665f, 10.2267f, 2.6665f, 13.0001f, 2.6665f, 16.0001f)
                curveTo(2.6665f, 23.3601f, 8.63984f, 29.3334f, 15.9998f, 29.3334f)
                curveTo(23.3598f, 29.3334f, 29.3332f, 23.3601f, 29.3332f, 16.0001f)
                curveTo(29.3332f, 8.64008f, 23.3598f, 2.66675f, 15.9998f, 2.66675f)
                curveTo(14.0932f, 2.66675f, 12.2665f, 3.06672f, 10.6265f, 3.80005f)
            }
            path(
                stroke = Brush.linearGradient(
                    colors = listOf(Color(0xFFEE2A7B), Color(0xFFF65399), Color(0xFFFF7DB8)),
                    start = Offset(19.9052f, 19.9323f),
                    end = Offset(18.4251f, 19.092f),
                    tileMode = TileMode.Clamp
                ),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.3258f, 19.3334f)
                horizontalLineTo(19.3378f)
            }
            path(
                stroke = Brush.linearGradient(
                    colors = listOf(Color(0xFFEE2A7B), Color(0xFFF65399), Color(0xFFFF7DB8)),
                    start = Offset(13.2387f, 13.2656f),
                    end = Offset(11.7586f, 12.4252f),
                    tileMode = TileMode.Clamp
                ),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.6593f, 12.6667f)
                horizontalLineTo(12.6713f)
            }
        }.build()
        
        return _icDiscount!!
    }

private var _icDiscount: ImageVector? = null

