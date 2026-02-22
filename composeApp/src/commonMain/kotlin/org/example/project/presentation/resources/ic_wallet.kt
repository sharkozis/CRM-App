package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icWallet: ImageVector
    get() {
        if (_icWallet != null) return _icWallet!!
        
        _icWallet = ImageVector.Builder(
            name = "icWallet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFA6A4AA))
            ) {
                moveTo(14.85f, 3.9498f)
                verticalLineTo(7.7498f)
                horizontalLineTo(13.35f)
                verticalLineTo(3.9498f)
                curveTo(13.35f, 3.6798f, 13.11f, 3.5498f, 12.95f, 3.5498f)
                curveTo(12.9f, 3.5498f, 12.85f, 3.5598f, 12.8f, 3.5798f)
                lineTo(4.87f, 6.56981f)
                curveTo(4.34f, 6.76981f, 4f, 7.2698f, 4f, 7.8398f)
                verticalLineTo(8.5098f)
                curveTo(3.09f, 9.1898f, 2.5f, 10.2798f, 2.5f, 11.5098f)
                verticalLineTo(7.8398f)
                curveTo(2.5f, 6.6498f, 3.23f, 5.5898f, 4.34f, 5.1698f)
                lineTo(12.28f, 2.1698f)
                curveTo(12.5f, 2.0898f, 12.73f, 2.0498f, 12.95f, 2.0498f)
                curveTo(13.95f, 2.0498f, 14.85f, 2.8598f, 14.85f, 3.9498f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFA6A4AA))
            ) {
                moveTo(21.5002f, 14.5f)
                verticalLineTo(15.5f)
                curveTo(21.5002f, 15.77f, 21.2902f, 15.99f, 21.0102f, 16f)
                horizontalLineTo(19.5502f)
                curveTo(19.0202f, 16f, 18.5402f, 15.61f, 18.5002f, 15.09f)
                curveTo(18.4702f, 14.78f, 18.5902f, 14.49f, 18.7902f, 14.29f)
                curveTo(18.9702f, 14.1f, 19.2202f, 14f, 19.4902f, 14f)
                horizontalLineTo(21.0002f)
                curveTo(21.2902f, 14.01f, 21.5002f, 14.23f, 21.5002f, 14.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFA6A4AA))
            ) {
                moveTo(19.48f, 12.95f)
                horizontalLineTo(20.5f)
                curveTo(21.05f, 12.95f, 21.5f, 12.5f, 21.5f, 11.95f)
                verticalLineTo(11.51f)
                curveTo(21.5f, 9.44f, 19.81f, 7.75f, 17.74f, 7.75f)
                horizontalLineTo(6.26f)
                curveTo(5.41f, 7.75f, 4.63f, 8.03f, 4f, 8.51f)
                curveTo(3.09f, 9.19f, 2.5f, 10.28f, 2.5f, 11.51f)
                verticalLineTo(18.24f)
                curveTo(2.5f, 20.31f, 4.19f, 22f, 6.26f, 22f)
                horizontalLineTo(17.74f)
                curveTo(19.81f, 22f, 21.5f, 20.31f, 21.5f, 18.24f)
                verticalLineTo(18.05f)
                curveTo(21.5f, 17.5f, 21.05f, 17.05f, 20.5f, 17.05f)
                horizontalLineTo(19.63f)
                curveTo(18.67f, 17.05f, 17.75f, 16.46f, 17.5f, 15.53f)
                curveTo(17.29f, 14.77f, 17.54f, 14.04f, 18.04f, 13.55f)
                curveTo(18.41f, 13.17f, 18.92f, 12.95f, 19.48f, 12.95f)
                close()
                moveTo(14f, 12.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 12.75f, 6.25f, 12.41f, 6.25f, 12f)
                curveTo(6.25f, 11.59f, 6.59f, 11.25f, 7f, 11.25f)
                horizontalLineTo(14f)
                curveTo(14.41f, 11.25f, 14.75f, 11.59f, 14.75f, 12f)
                curveTo(14.75f, 12.41f, 14.41f, 12.75f, 14f, 12.75f)
                close()
            }
        }.build()
        
        return _icWallet!!
    }

private var _icWallet: ImageVector? = null

