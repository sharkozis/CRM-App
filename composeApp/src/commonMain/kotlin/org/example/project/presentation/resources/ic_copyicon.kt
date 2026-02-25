package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icCopyicon: ImageVector
    get() {
        if (_icCopyicon != null) return _icCopyicon!!
        
        _icCopyicon = ImageVector.Builder(
            name = "icCopyicon",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF8E53EE))
            ) {
                moveTo(10.6668f, 8.59992f)
                verticalLineTo(11.3999f)
                curveTo(10.6668f, 13.7333f, 9.7335f, 14.6666f, 7.40016f, 14.6666f)
                horizontalLineTo(4.60016f)
                curveTo(2.26683f, 14.6666f, 1.3335f, 13.7333f, 1.3335f, 11.3999f)
                verticalLineTo(8.59992f)
                curveTo(1.3335f, 6.26658f, 2.26683f, 5.33325f, 4.60016f, 5.33325f)
                horizontalLineTo(7.40016f)
                curveTo(9.7335f, 5.33325f, 10.6668f, 6.26658f, 10.6668f, 8.59992f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF8E53EE))
            ) {
                moveTo(11.3998f, 1.33325f)
                horizontalLineTo(8.59984f)
                curveTo(6.29984f, 1.33325f, 5.36651f, 2.24659f, 5.33984f, 4.49992f)
                horizontalLineTo(7.39984f)
                curveTo(10.1998f, 4.49992f, 11.4998f, 5.79992f, 11.4998f, 8.59992f)
                verticalLineTo(10.6599f)
                curveTo(13.7532f, 10.6333f, 14.6665f, 9.69992f, 14.6665f, 7.39992f)
                verticalLineTo(4.59992f)
                curveTo(14.6665f, 2.26659f, 13.7332f, 1.33325f, 11.3998f, 1.33325f)
                close()
            }
        }.build()
        
        return _icCopyicon!!
    }

private var _icCopyicon: ImageVector? = null

