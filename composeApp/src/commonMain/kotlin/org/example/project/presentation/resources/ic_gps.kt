package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icGps: ImageVector
    get() {
        if (_icGps != null) return _icGps!!
        
        _icGps = ImageVector.Builder(
            name = "icGps",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF8B345A))
            ) {
                moveTo(8f, 13.5f)
                curveTo(4.96667f, 13.5f, 2.5f, 11.0333f, 2.5f, 8f)
                curveTo(2.5f, 4.96667f, 4.96667f, 2.5f, 8f, 2.5f)
                curveTo(11.0333f, 2.5f, 13.5f, 4.96667f, 13.5f, 8f)
                curveTo(13.5f, 11.0333f, 11.0333f, 13.5f, 8f, 13.5f)
                close()
                moveTo(8f, 3.5f)
                curveTo(5.52f, 3.5f, 3.5f, 5.52f, 3.5f, 8f)
                curveTo(3.5f, 10.48f, 5.52f, 12.5f, 8f, 12.5f)
                curveTo(10.48f, 12.5f, 12.5f, 10.48f, 12.5f, 8f)
                curveTo(12.5f, 5.52f, 10.48f, 3.5f, 8f, 3.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF8B345A))
            ) {
                moveTo(8f, 10.5f)
                curveTo(6.62f, 10.5f, 5.5f, 9.38f, 5.5f, 8f)
                curveTo(5.5f, 6.62f, 6.62f, 5.5f, 8f, 5.5f)
                curveTo(9.38f, 5.5f, 10.5f, 6.62f, 10.5f, 8f)
                curveTo(10.5f, 9.38f, 9.38f, 10.5f, 8f, 10.5f)
                close()
                moveTo(8f, 6.5f)
                curveTo(7.17333f, 6.5f, 6.5f, 7.17333f, 6.5f, 8f)
                curveTo(6.5f, 8.82667f, 7.17333f, 9.5f, 8f, 9.5f)
                curveTo(8.82667f, 9.5f, 9.5f, 8.82667f, 9.5f, 8f)
                curveTo(9.5f, 7.17333f, 8.82667f, 6.5f, 8f, 6.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF8B345A))
            ) {
                moveTo(8f, 3.16659f)
                curveTo(7.72667f, 3.16659f, 7.5f, 2.93992f, 7.5f, 2.66659f)
                verticalLineTo(1.33325f)
                curveTo(7.5f, 1.05992f, 7.72667f, 0.833252f, 8f, 0.833252f)
                curveTo(8.27333f, 0.833252f, 8.5f, 1.05992f, 8.5f, 1.33325f)
                verticalLineTo(2.66659f)
                curveTo(8.5f, 2.93992f, 8.27333f, 3.16659f, 8f, 3.16659f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF8B345A))
            ) {
                moveTo(2.66683f, 8.5f)
                horizontalLineTo(1.3335f)
                curveTo(1.06016f, 8.5f, 0.833496f, 8.27333f, 0.833496f, 8f)
                curveTo(0.833496f, 7.72667f, 1.06016f, 7.5f, 1.3335f, 7.5f)
                horizontalLineTo(2.66683f)
                curveTo(2.94016f, 7.5f, 3.16683f, 7.72667f, 3.16683f, 8f)
                curveTo(3.16683f, 8.27333f, 2.94016f, 8.5f, 2.66683f, 8.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF8B345A))
            ) {
                moveTo(8f, 15.1666f)
                curveTo(7.72667f, 15.1666f, 7.5f, 14.9399f, 7.5f, 14.6666f)
                verticalLineTo(13.3333f)
                curveTo(7.5f, 13.0599f, 7.72667f, 12.8333f, 8f, 12.8333f)
                curveTo(8.27333f, 12.8333f, 8.5f, 13.0599f, 8.5f, 13.3333f)
                verticalLineTo(14.6666f)
                curveTo(8.5f, 14.9399f, 8.27333f, 15.1666f, 8f, 15.1666f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF8B345A))
            ) {
                moveTo(14.6668f, 8.5f)
                horizontalLineTo(13.3335f)
                curveTo(13.0602f, 8.5f, 12.8335f, 8.27333f, 12.8335f, 8f)
                curveTo(12.8335f, 7.72667f, 13.0602f, 7.5f, 13.3335f, 7.5f)
                horizontalLineTo(14.6668f)
                curveTo(14.9402f, 7.5f, 15.1668f, 7.72667f, 15.1668f, 8f)
                curveTo(15.1668f, 8.27333f, 14.9402f, 8.5f, 14.6668f, 8.5f)
                close()
            }
        }.build()
        
        return _icGps!!
    }

private var _icGps: ImageVector? = null

