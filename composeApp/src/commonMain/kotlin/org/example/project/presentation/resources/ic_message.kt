package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icMessage: ImageVector
    get() {
        if (_icMessage != null) return _icMessage!!
        
        _icMessage = ImageVector.Builder(
            name = "icMessage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFA6A4AA))
            ) {
                moveTo(21.9999f, 12.86f)
                curveTo(21.9999f, 15.15f, 20.8199f, 17.18f, 18.9999f, 18.46f)
                lineTo(17.6599f, 21.41f)
                curveTo(17.3499f, 22.08f, 16.4499f, 22.21f, 15.9799f, 21.64f)
                lineTo(14.4999f, 19.86f)
                curveTo(12.6399f, 19.86f, 10.9299f, 19.23f, 9.62988f, 18.18f)
                lineTo(10.2299f, 17.47f)
                curveTo(14.8499f, 17.12f, 18.4999f, 13.46f, 18.4999f, 9.00002f)
                curveTo(18.4999f, 8.24002f, 18.3899f, 7.49002f, 18.1899f, 6.77002f)
                curveTo(20.4599f, 7.97002f, 21.9999f, 10.25f, 21.9999f, 12.86f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFA6A4AA))
            ) {
                moveTo(16.3f, 6.07f)
                curveTo(15.13f, 3.67f, 12.52f, 2f, 9.5f, 2f)
                curveTo(5.36f, 2f, 2f, 5.13f, 2f, 9f)
                curveTo(2f, 11.29f, 3.18f, 13.32f, 5f, 14.6f)
                lineTo(6.34f, 17.55f)
                curveTo(6.65f, 18.22f, 7.55f, 18.34f, 8.02f, 17.78f)
                lineTo(8.57f, 17.12f)
                lineTo(9.5f, 16f)
                curveTo(13.64f, 16f, 17f, 12.87f, 17f, 9f)
                curveTo(17f, 7.95f, 16.75f, 6.96f, 16.3f, 6.07f)
                close()
                moveTo(12f, 9.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 9.75f, 6.25f, 9.41f, 6.25f, 9f)
                curveTo(6.25f, 8.59f, 6.59f, 8.25f, 7f, 8.25f)
                horizontalLineTo(12f)
                curveTo(12.41f, 8.25f, 12.75f, 8.59f, 12.75f, 9f)
                curveTo(12.75f, 9.41f, 12.41f, 9.75f, 12f, 9.75f)
                close()
            }
        }.build()
        
        return _icMessage!!
    }

private var _icMessage: ImageVector? = null

