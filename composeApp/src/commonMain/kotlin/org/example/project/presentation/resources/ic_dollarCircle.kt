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

val icDollarCircle: ImageVector
    get() {
        if (_icDollarCircle != null) return _icDollarCircle!!
        
        _icDollarCircle = ImageVector.Builder(
            name = "icDollarCircle",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f
        ).apply {
            path(
                stroke = Brush.linearGradient(
                    colors = listOf(Color(0xFFEE2A7B), Color(0xFFF65399), Color(0xFFFF7DB8)),
                    start = Offset(19.8413f, 21.5816f),
                    end = Offset(8.62023f, 17.0131f),
                    tileMode = TileMode.Clamp
                ),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.5625f, 19.1064f)
                curveTo(11.5625f, 20.8264f, 12.8825f, 22.213f, 14.5225f, 22.213f)
                horizontalLineTo(17.8692f)
                curveTo(19.2958f, 22.213f, 20.4558f, 20.9997f, 20.4558f, 19.5064f)
                curveTo(20.4558f, 17.8797f, 19.7492f, 17.3064f, 18.6958f, 16.933f)
                lineTo(13.3225f, 15.0664f)
                curveTo(12.2692f, 14.693f, 11.5625f, 14.1197f, 11.5625f, 12.493f)
                curveTo(11.5625f, 10.9997f, 12.7225f, 9.78638f, 14.1492f, 9.78638f)
                horizontalLineTo(17.4958f)
                curveTo(19.1358f, 9.78638f, 20.4558f, 11.173f, 20.4558f, 12.893f)
            }
            path(
                stroke = Brush.linearGradient(
                    colors = listOf(Color(0xFFEE2A7B), Color(0xFFF65399), Color(0xFFFF7DB8)),
                    start = Offset(16.9309f, 23.187f),
                    end = Offset(15.4619f, 23.1348f),
                    tileMode = TileMode.Clamp
                ),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 8f)
                verticalLineTo(24f)
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
                moveTo(15.9998f, 29.3334f)
                curveTo(23.3636f, 29.3334f, 29.3332f, 23.3639f, 29.3332f, 16.0001f)
                curveTo(29.3332f, 8.63628f, 23.3636f, 2.66675f, 15.9998f, 2.66675f)
                curveTo(8.63604f, 2.66675f, 2.6665f, 8.63628f, 2.6665f, 16.0001f)
                curveTo(2.6665f, 23.3639f, 8.63604f, 29.3334f, 15.9998f, 29.3334f)
                close()
            }
        }.build()
        
        return _icDollarCircle!!
    }

private var _icDollarCircle: ImageVector? = null

