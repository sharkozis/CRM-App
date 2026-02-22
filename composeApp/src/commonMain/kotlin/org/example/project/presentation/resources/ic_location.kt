package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icLocation: ImageVector
    get() {
        if (_icLocation != null) return _icLocation!!
        
        _icLocation = ImageVector.Builder(
            name = "icLocation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF8B345A)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(12f, 13.4304f)
                curveTo(13.7231f, 13.4304f, 15.12f, 12.0336f, 15.12f, 10.3104f)
                curveTo(15.12f, 8.5873f, 13.7231f, 7.19043f, 12f, 7.19043f)
                curveTo(10.2769f, 7.19043f, 8.88f, 8.5873f, 8.88f, 10.3104f)
                curveTo(8.88f, 12.0336f, 10.2769f, 13.4304f, 12f, 13.4304f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF8B345A)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(3.62f, 8.49f)
                curveTo(5.59f, -0.169998f, 18.42f, -0.159997f, 20.38f, 8.5f)
                curveTo(21.53f, 13.58f, 18.37f, 17.88f, 15.6f, 20.54f)
                curveTo(13.59f, 22.48f, 10.41f, 22.48f, 8.39f, 20.54f)
                curveTo(5.63f, 17.88f, 2.47f, 13.57f, 3.62f, 8.49f)
                close()
            }
        }.build()
        
        return _icLocation!!
    }

private var _icLocation: ImageVector? = null

