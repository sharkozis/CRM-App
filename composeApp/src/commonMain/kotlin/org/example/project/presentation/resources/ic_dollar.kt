package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icDollar: ImageVector
    get() {
        if (_icDollar != null) return _icDollar!!
        
        _icDollar = ImageVector.Builder(
            name = "icDollar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF8B345A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.67188f, 14.3298f)
                curveTo(8.67188f, 15.6198f, 9.66188f, 16.6598f, 10.8919f, 16.6598f)
                horizontalLineTo(13.4019f)
                curveTo(14.4719f, 16.6598f, 15.3419f, 15.7498f, 15.3419f, 14.6298f)
                curveTo(15.3419f, 13.4098f, 14.8119f, 12.9798f, 14.0219f, 12.6998f)
                lineTo(9.99187f, 11.2998f)
                curveTo(9.20187f, 11.0198f, 8.67188f, 10.5898f, 8.67188f, 9.36984f)
                curveTo(8.67188f, 8.24984f, 9.54187f, 7.33984f, 10.6119f, 7.33984f)
                horizontalLineTo(13.1219f)
                curveTo(14.3519f, 7.33984f, 15.3419f, 8.37984f, 15.3419f, 9.66984f)
            }
            path(
                stroke = SolidColor(Color(0xFF8B345A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 6f)
                verticalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF8B345A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
                curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
                curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
                curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
                close()
            }
        }.build()
        
        return _icDollar!!
    }

private var _icDollar: ImageVector? = null

