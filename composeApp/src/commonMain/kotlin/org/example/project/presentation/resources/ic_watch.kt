package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icWatch: ImageVector
    get() {
        if (_icWatch != null) return _icWatch!!
        
        _icWatch = ImageVector.Builder(
            name = "icWatch",
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
                moveTo(12f, 9.65997f)
                verticalLineTo(12.45f)
                lineTo(13.4f, 13.85f)
            }
            path(
                stroke = SolidColor(Color(0xFF8B345A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.5f, 12f)
                curveTo(5.5f, 8.41f, 8.41f, 5.5f, 12f, 5.5f)
                curveTo(15.59f, 5.5f, 18.5f, 8.41f, 18.5f, 12f)
                curveTo(18.5f, 14.08f, 17.52f, 15.94f, 16f, 17.13f)
                horizontalLineTo(15.99f)
                curveTo(14.89f, 17.99f, 13.51f, 18.5f, 12f, 18.5f)
                curveTo(10.51f, 18.5f, 9.14f, 18f, 8.04f, 17.15f)
                horizontalLineTo(8.03f)
                curveTo(6.49f, 15.96f, 5.5f, 14.1f, 5.5f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF8B345A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.03f, 17.15f)
                horizontalLineTo(8.04f)
                curveTo(9.14f, 18f, 10.51f, 18.5f, 12f, 18.5f)
                curveTo(13.51f, 18.5f, 14.89f, 17.99f, 15.99f, 17.13f)
                horizontalLineTo(16f)
                lineTo(15.49f, 19.6f)
                curveTo(15f, 21.5f, 13.9f, 22f, 12.55f, 22f)
                horizontalLineTo(11.46f)
                curveTo(10.11f, 22f, 9f, 21.5f, 8.52f, 19.59f)
                lineTo(8.03f, 17.15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF8B345A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.03f, 6.85f)
                horizontalLineTo(8.04f)
                curveTo(9.14f, 6f, 10.51f, 5.5f, 12f, 5.5f)
                curveTo(13.51f, 5.5f, 14.89f, 6.01f, 15.99f, 6.87f)
                horizontalLineTo(16f)
                lineTo(15.49f, 4.4f)
                curveTo(15f, 2.5f, 13.9f, 2f, 12.55f, 2f)
                horizontalLineTo(11.46f)
                curveTo(10.11f, 2f, 9f, 2.5f, 8.52f, 4.41f)
                lineTo(8.03f, 6.85f)
                close()
            }
        }.build()
        
        return _icWatch!!
    }

private var _icWatch: ImageVector? = null

