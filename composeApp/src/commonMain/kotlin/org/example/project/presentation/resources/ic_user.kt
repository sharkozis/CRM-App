package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icUser: ImageVector
    get() {
        if (_icUser != null) return _icUser!!
        
        _icUser = ImageVector.Builder(
            name = "icUser",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFA6A4AA))
            ) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(2f, 19f, 3.29f, 20.93f, 5.56f, 21.66f)
                curveTo(6.22f, 21.89f, 6.98f, 22f, 7.81f, 22f)
                horizontalLineTo(16.19f)
                curveTo(17.02f, 22f, 17.78f, 21.89f, 18.44f, 21.66f)
                curveTo(20.71f, 20.93f, 22f, 19f, 22f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(20.5f, 16.19f)
                curveTo(20.5f, 18.33f, 19.66f, 19.68f, 17.97f, 20.24f)
                curveTo(17f, 18.33f, 14.7f, 16.97f, 12f, 16.97f)
                curveTo(9.3f, 16.97f, 7.01f, 18.32f, 6.03f, 20.24f)
                horizontalLineTo(6.02f)
                curveTo(4.35f, 19.7f, 3.5f, 18.34f, 3.5f, 16.2f)
                verticalLineTo(7.81f)
                curveTo(3.5f, 4.99f, 4.99f, 3.5f, 7.81f, 3.5f)
                horizontalLineTo(16.19f)
                curveTo(19.01f, 3.5f, 20.5f, 4.99f, 20.5f, 7.81f)
                verticalLineTo(16.19f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFA6A4AA))
            ) {
                moveTo(11.9999f, 8f)
                curveTo(10.0199f, 8f, 8.41992f, 9.6f, 8.41992f, 11.58f)
                curveTo(8.41992f, 13.56f, 10.0199f, 15.17f, 11.9999f, 15.17f)
                curveTo(13.9799f, 15.17f, 15.5799f, 13.56f, 15.5799f, 11.58f)
                curveTo(15.5799f, 9.6f, 13.9799f, 8f, 11.9999f, 8f)
                close()
            }
        }.build()
        
        return _icUser!!
    }

private var _icUser: ImageVector? = null

