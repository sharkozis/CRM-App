package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icMedal: ImageVector
    get() {
        if (_icMedal != null) return _icMedal!!
        
        _icMedal = ImageVector.Builder(
            name = "icMedal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF8B345A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                curveTo(15.7279f, 15f, 18.75f, 12.0899f, 18.75f, 8.5f)
                curveTo(18.75f, 4.91015f, 15.7279f, 2f, 12f, 2f)
                curveTo(8.27208f, 2f, 5.25f, 4.91015f, 5.25f, 8.5f)
                curveTo(5.25f, 12.0899f, 8.27208f, 15f, 12f, 15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF8B345A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.51999f, 13.52f)
                lineTo(7.51001f, 20.9f)
                curveTo(7.51001f, 21.8f, 8.14001f, 22.24f, 8.92001f, 21.87f)
                lineTo(11.6f, 20.6f)
                curveTo(11.82f, 20.49f, 12.19f, 20.49f, 12.41f, 20.6f)
                lineTo(15.1f, 21.87f)
                curveTo(15.87f, 22.23f, 16.51f, 21.8f, 16.51f, 20.9f)
                verticalLineTo(13.34f)
            }
        }.build()
        
        return _icMedal!!
    }

private var _icMedal: ImageVector? = null

