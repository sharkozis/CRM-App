package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icCamera: ImageVector
    get() {
        if (_icCamera != null) return _icCamera!!
        
        _icCamera = ImageVector.Builder(
            name = "icCamera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFD77CA4))
            ) {
                moveTo(6.76017f, 22f)
                horizontalLineTo(17.2402f)
                curveTo(20.0002f, 22f, 21.1002f, 20.31f, 21.2302f, 18.25f)
                lineTo(21.7502f, 9.99f)
                curveTo(21.8902f, 7.83f, 20.1702f, 6f, 18.0002f, 6f)
                curveTo(17.3902f, 6f, 16.8302f, 5.65f, 16.5502f, 5.11f)
                lineTo(15.8302f, 3.66f)
                curveTo(15.3702f, 2.75f, 14.1702f, 2f, 13.1502f, 2f)
                horizontalLineTo(10.8602f)
                curveTo(9.83017f, 2f, 8.63017f, 2.75f, 8.17017f, 3.66f)
                lineTo(7.45017f, 5.11f)
                curveTo(7.17017f, 5.65f, 6.61017f, 6f, 6.00017f, 6f)
                curveTo(3.83017f, 6f, 2.11017f, 7.83f, 2.25017f, 9.99f)
                lineTo(2.77017f, 18.25f)
                curveTo(2.89017f, 20.31f, 4.00017f, 22f, 6.76017f, 22f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD77CA4))
            ) {
                moveTo(13.5f, 8.75f)
                horizontalLineTo(10.5f)
                curveTo(10.09f, 8.75f, 9.75f, 8.41f, 9.75f, 8f)
                curveTo(9.75f, 7.59f, 10.09f, 7.25f, 10.5f, 7.25f)
                horizontalLineTo(13.5f)
                curveTo(13.91f, 7.25f, 14.25f, 7.59f, 14.25f, 8f)
                curveTo(14.25f, 8.41f, 13.91f, 8.75f, 13.5f, 8.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD77CA4))
            ) {
                moveTo(12.0001f, 18.1301f)
                curveTo(13.8668f, 18.1301f, 15.3801f, 16.6168f, 15.3801f, 14.7501f)
                curveTo(15.3801f, 12.8834f, 13.8668f, 11.3701f, 12.0001f, 11.3701f)
                curveTo(10.1334f, 11.3701f, 8.62012f, 12.8834f, 8.62012f, 14.7501f)
                curveTo(8.62012f, 16.6168f, 10.1334f, 18.1301f, 12.0001f, 18.1301f)
                close()
            }
        }.build()
        
        return _icCamera!!
    }

private var _icCamera: ImageVector? = null

