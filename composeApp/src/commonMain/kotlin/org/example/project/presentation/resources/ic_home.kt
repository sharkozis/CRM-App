package com.composables

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icHome: ImageVector
    get() {
        if (_icHome != null) return _icHome!!
        
        _icHome = ImageVector.Builder(
            name = "icHome",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colors = listOf(Color(0xFFEE2A7B), Color(0xFFF65399), Color(0xFFFF7DB8)),
                    start = Offset(20.6269f, 20.9836f),
                    end = Offset(-1.60813f, 8.32009f),
                    tileMode = TileMode.Clamp
                )
            ) {
                moveTo(20.0402f, 6.81969f)
                lineTo(14.2802f, 2.78969f)
                curveTo(12.7102f, 1.68969f, 10.3002f, 1.74969f, 8.79023f, 2.91969f)
                lineTo(3.78023f, 6.82969f)
                curveTo(2.78023f, 7.60969f, 1.99023f, 9.20969f, 1.99023f, 10.4697f)
                verticalLineTo(17.3697f)
                curveTo(1.99023f, 19.9197f, 4.06023f, 21.9997f, 6.61023f, 21.9997f)
                horizontalLineTo(17.3902f)
                curveTo(19.9402f, 21.9997f, 22.0102f, 19.9297f, 22.0102f, 17.3797f)
                verticalLineTo(10.5997f)
                curveTo(22.0102f, 9.24969f, 21.1402f, 7.58969f, 20.0402f, 6.81969f)
                close()
                moveTo(12.7502f, 17.9997f)
                curveTo(12.7502f, 18.4097f, 12.4102f, 18.7497f, 12.0002f, 18.7497f)
                curveTo(11.5902f, 18.7497f, 11.2502f, 18.4097f, 11.2502f, 17.9997f)
                verticalLineTo(14.9997f)
                curveTo(11.2502f, 14.5897f, 11.5902f, 14.2497f, 12.0002f, 14.2497f)
                curveTo(12.4102f, 14.2497f, 12.7502f, 14.5897f, 12.7502f, 14.9997f)
                verticalLineTo(17.9997f)
                close()
            }
        }.build()
        
        return _icHome!!
    }

private var _icHome: ImageVector? = null

