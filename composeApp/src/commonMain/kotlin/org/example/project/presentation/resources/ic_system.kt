package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icSystem: ImageVector
    get() {
        if (_icSystem != null) return _icSystem!!
        
        _icSystem = ImageVector.Builder(
            name = "icSystem",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFD77CA4))
            ) {
                moveTo(18.6699f, 2f)
                horizontalLineTo(16.7699f)
                curveTo(14.5899f, 2f, 13.4399f, 3.15f, 13.4399f, 5.33f)
                verticalLineTo(7.23f)
                curveTo(13.4399f, 9.41f, 14.5899f, 10.56f, 16.7699f, 10.56f)
                horizontalLineTo(18.6699f)
                curveTo(20.8499f, 10.56f, 21.9999f, 9.41f, 21.9999f, 7.23f)
                verticalLineTo(5.33f)
                curveTo(21.9999f, 3.15f, 20.8499f, 2f, 18.6699f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD77CA4))
            ) {
                moveTo(7.24f, 13.4297f)
                horizontalLineTo(5.34f)
                curveTo(3.15f, 13.4297f, 2f, 14.5797f, 2f, 16.7597f)
                verticalLineTo(18.6597f)
                curveTo(2f, 20.8497f, 3.15f, 21.9997f, 5.33f, 21.9997f)
                horizontalLineTo(7.23f)
                curveTo(9.41f, 21.9997f, 10.56f, 20.8497f, 10.56f, 18.6697f)
                verticalLineTo(16.7697f)
                curveTo(10.57f, 14.5797f, 9.42f, 13.4297f, 7.24f, 13.4297f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD77CA4))
            ) {
                moveTo(6.29f, 10.58f)
                curveTo(8.6593f, 10.58f, 10.58f, 8.6593f, 10.58f, 6.29f)
                curveTo(10.58f, 3.9207f, 8.6593f, 2f, 6.29f, 2f)
                curveTo(3.9207f, 2f, 2f, 3.9207f, 2f, 6.29f)
                curveTo(2f, 8.6593f, 3.9207f, 10.58f, 6.29f, 10.58f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD77CA4))
            ) {
                moveTo(17.7099f, 21.9999f)
                curveTo(20.0792f, 21.9999f, 21.9999f, 20.0792f, 21.9999f, 17.7099f)
                curveTo(21.9999f, 15.3406f, 20.0792f, 13.4199f, 17.7099f, 13.4199f)
                curveTo(15.3406f, 13.4199f, 13.4199f, 15.3406f, 13.4199f, 17.7099f)
                curveTo(13.4199f, 20.0792f, 15.3406f, 21.9999f, 17.7099f, 21.9999f)
                close()
            }
        }.build()
        
        return _icSystem!!
    }

private var _icSystem: ImageVector? = null

