package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icProfileSubtitle: ImageVector
    get() {
        if (_icProfileSubtitle != null) return _icProfileSubtitle!!
        
        _icProfileSubtitle = ImageVector.Builder(
            name = "icProfileSubtitle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF211B2A))
            ) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF211B2A))
            ) {
                moveTo(17.5004f, 17.8301f)
                horizontalLineTo(15.6504f)
                curveTo(15.2404f, 17.8301f, 14.9004f, 17.4901f, 14.9004f, 17.0801f)
                curveTo(14.9004f, 16.6701f, 15.2404f, 16.3301f, 15.6504f, 16.3301f)
                horizontalLineTo(17.5004f)
                curveTo(17.9104f, 16.3301f, 18.2504f, 16.6701f, 18.2504f, 17.0801f)
                curveTo(18.2504f, 17.4901f, 17.9104f, 17.8301f, 17.5004f, 17.8301f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF211B2A))
            ) {
                moveTo(12.97f, 17.8301f)
                horizontalLineTo(6.5f)
                curveTo(6.09f, 17.8301f, 5.75f, 17.4901f, 5.75f, 17.0801f)
                curveTo(5.75f, 16.6701f, 6.09f, 16.3301f, 6.5f, 16.3301f)
                horizontalLineTo(12.97f)
                curveTo(13.38f, 16.3301f, 13.72f, 16.6701f, 13.72f, 17.0801f)
                curveTo(13.72f, 17.4901f, 13.39f, 17.8301f, 12.97f, 17.8301f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF211B2A))
            ) {
                moveTo(17.4997f, 14.0703f)
                horizontalLineTo(11.9697f)
                curveTo(11.5597f, 14.0703f, 11.2197f, 13.7303f, 11.2197f, 13.3203f)
                curveTo(11.2197f, 12.9103f, 11.5597f, 12.5703f, 11.9697f, 12.5703f)
                horizontalLineTo(17.4997f)
                curveTo(17.9097f, 12.5703f, 18.2497f, 12.9103f, 18.2497f, 13.3203f)
                curveTo(18.2497f, 13.7303f, 17.9097f, 14.0703f, 17.4997f, 14.0703f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF211B2A))
            ) {
                moveTo(9.27f, 14.0703f)
                horizontalLineTo(6.5f)
                curveTo(6.09f, 14.0703f, 5.75f, 13.7303f, 5.75f, 13.3203f)
                curveTo(5.75f, 12.9103f, 6.09f, 12.5703f, 6.5f, 12.5703f)
                horizontalLineTo(9.27f)
                curveTo(9.68f, 12.5703f, 10.02f, 12.9103f, 10.02f, 13.3203f)
                curveTo(10.02f, 13.7303f, 9.68f, 14.0703f, 9.27f, 14.0703f)
                close()
            }
        }.build()
        
        return _icProfileSubtitle!!
    }

private var _icProfileSubtitle: ImageVector? = null

