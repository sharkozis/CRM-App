package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icDownload: ImageVector
    get() {
        if (_icDownload != null) return _icDownload!!
        
        _icDownload = ImageVector.Builder(
            name = "icDownload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF211B2A))
            ) {
                moveTo(9f, 17.75f)
                curveTo(8.9f, 17.75f, 8.81f, 17.73f, 8.71f, 17.69f)
                curveTo(8.43f, 17.58f, 8.25f, 17.3f, 8.25f, 17f)
                verticalLineTo(11f)
                curveTo(8.25f, 10.59f, 8.59f, 10.25f, 9f, 10.25f)
                curveTo(9.41f, 10.25f, 9.75f, 10.59f, 9.75f, 11f)
                verticalLineTo(15.19f)
                lineTo(10.47f, 14.47f)
                curveTo(10.76f, 14.18f, 11.24f, 14.18f, 11.53f, 14.47f)
                curveTo(11.82f, 14.76f, 11.82f, 15.24f, 11.53f, 15.53f)
                lineTo(9.53f, 17.53f)
                curveTo(9.39f, 17.67f, 9.19f, 17.75f, 9f, 17.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF211B2A))
            ) {
                moveTo(8.99994f, 17.7499f)
                curveTo(8.80994f, 17.7499f, 8.61994f, 17.6799f, 8.46994f, 17.5299f)
                lineTo(6.46994f, 15.5299f)
                curveTo(6.17994f, 15.2399f, 6.17994f, 14.7599f, 6.46994f, 14.4699f)
                curveTo(6.75994f, 14.1799f, 7.23994f, 14.1799f, 7.52994f, 14.4699f)
                lineTo(9.52994f, 16.4699f)
                curveTo(9.81994f, 16.7599f, 9.81994f, 17.2399f, 9.52994f, 17.5299f)
                curveTo(9.37994f, 17.6799f, 9.18994f, 17.7499f, 8.99994f, 17.7499f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF211B2A))
            ) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(14f)
                curveTo(14.41f, 1.25f, 14.75f, 1.59f, 14.75f, 2f)
                curveTo(14.75f, 2.41f, 14.41f, 2.75f, 14f, 2.75f)
                horizontalLineTo(9f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(10f)
                curveTo(21.25f, 9.59f, 21.59f, 9.25f, 22f, 9.25f)
                curveTo(22.41f, 9.25f, 22.75f, 9.59f, 22.75f, 10f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF211B2A))
            ) {
                moveTo(22f, 10.75f)
                horizontalLineTo(18f)
                curveTo(14.58f, 10.75f, 13.25f, 9.41999f, 13.25f, 5.99999f)
                verticalLineTo(1.99999f)
                curveTo(13.25f, 1.69999f, 13.43f, 1.41999f, 13.71f, 1.30999f)
                curveTo(13.99f, 1.18999f, 14.31f, 1.25999f, 14.53f, 1.46999f)
                lineTo(22.53f, 9.46999f)
                curveTo(22.74f, 9.67999f, 22.81f, 10.01f, 22.69f, 10.29f)
                curveTo(22.57f, 10.57f, 22.3f, 10.75f, 22f, 10.75f)
                close()
                moveTo(14.75f, 3.80999f)
                verticalLineTo(5.99999f)
                curveTo(14.75f, 8.57999f, 15.42f, 9.24999f, 18f, 9.24999f)
                horizontalLineTo(20.19f)
                lineTo(14.75f, 3.80999f)
                close()
            }
        }.build()
        
        return _icDownload!!
    }

private var _icDownload: ImageVector? = null

