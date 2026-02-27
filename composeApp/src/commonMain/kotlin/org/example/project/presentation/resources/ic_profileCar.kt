package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icProfileCar: ImageVector
    get() {
        if (_icProfileCar != null) return _icProfileCar!!
        
        _icProfileCar = ImageVector.Builder(
            name = "icProfileCar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.51f, 2.83008f)
                horizontalLineTo(8.49f)
                curveTo(6f, 2.83008f, 5.45f, 4.07008f, 5.13f, 5.59008f)
                lineTo(4f, 11.0001f)
                horizontalLineTo(20f)
                lineTo(18.87f, 5.59008f)
                curveTo(18.55f, 4.07008f, 18f, 2.83008f, 15.51f, 2.83008f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.9897f, 19.82f)
                curveTo(22.0997f, 20.99f, 21.1597f, 22f, 19.9597f, 22f)
                horizontalLineTo(18.0797f)
                curveTo(16.9997f, 22f, 16.8497f, 21.54f, 16.6597f, 20.97f)
                lineTo(16.4597f, 20.37f)
                curveTo(16.1797f, 19.55f, 15.9997f, 19f, 14.5597f, 19f)
                horizontalLineTo(9.43974f)
                curveTo(7.99974f, 19f, 7.78974f, 19.62f, 7.53974f, 20.37f)
                lineTo(7.33974f, 20.97f)
                curveTo(7.14974f, 21.54f, 6.99974f, 22f, 5.91974f, 22f)
                horizontalLineTo(4.03974f)
                curveTo(2.83974f, 22f, 1.89974f, 20.99f, 2.00974f, 19.82f)
                lineTo(2.56974f, 13.73f)
                curveTo(2.70974f, 12.23f, 2.99974f, 11f, 5.61974f, 11f)
                horizontalLineTo(18.3797f)
                curveTo(20.9997f, 11f, 21.2897f, 12.23f, 21.4297f, 13.73f)
                lineTo(21.9897f, 19.82f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 8f)
                horizontalLineTo(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 8f)
                horizontalLineTo(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                verticalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 5f)
                horizontalLineTo(13.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 15f)
                horizontalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 15f)
                horizontalLineTo(18f)
            }
        }.build()
        
        return _icProfileCar!!
    }

private var _icProfileCar: ImageVector? = null

