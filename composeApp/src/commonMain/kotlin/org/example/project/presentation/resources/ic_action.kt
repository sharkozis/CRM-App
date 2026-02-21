package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icAction: ImageVector
    get() {
        if (_icAction != null) return _icAction!!
        
        _icAction = ImageVector.Builder(
            name = "icAction",
            defaultWidth = 20.dp,
            defaultHeight = 20.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF1B0E2F)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10f
            ) {
                moveTo(10.0165f, 2.42505f)
                curveTo(7.25816f, 2.42505f, 5.0165f, 4.66672f, 5.0165f, 7.42505f)
                verticalLineTo(9.83338f)
                curveTo(5.0165f, 10.3417f, 4.79983f, 11.1167f, 4.5415f, 11.55f)
                lineTo(3.58316f, 13.1417f)
                curveTo(2.9915f, 14.125f, 3.39983f, 15.2167f, 4.48316f, 15.5834f)
                curveTo(8.07483f, 16.7834f, 11.9498f, 16.7834f, 15.5415f, 15.5834f)
                curveTo(16.5498f, 15.25f, 16.9915f, 14.0584f, 16.4415f, 13.1417f)
                lineTo(15.4832f, 11.55f)
                curveTo(15.2332f, 11.1167f, 15.0165f, 10.3417f, 15.0165f, 9.83338f)
                verticalLineTo(7.42505f)
                curveTo(15.0165f, 4.67505f, 12.7665f, 2.42505f, 10.0165f, 2.42505f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF1B0E2F)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10f
            ) {
                moveTo(11.5584f, 2.66694f)
                curveTo(11.3001f, 2.59194f, 11.0334f, 2.53361f, 10.7584f, 2.50028f)
                curveTo(9.95843f, 2.40028f, 9.19176f, 2.45861f, 8.4751f, 2.66694f)
                curveTo(8.71676f, 2.05028f, 9.31676f, 1.61694f, 10.0168f, 1.61694f)
                curveTo(10.7168f, 1.61694f, 11.3168f, 2.05028f, 11.5584f, 2.66694f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF1B0E2F)),
                strokeLineWidth = 1.5f,
                strokeLineMiter = 10f
            ) {
                moveTo(12.5166f, 15.8831f)
                curveTo(12.5166f, 17.2581f, 11.3916f, 18.3831f, 10.0166f, 18.3831f)
                curveTo(9.33327f, 18.3831f, 8.69993f, 18.0997f, 8.24993f, 17.6497f)
                curveTo(7.79993f, 17.1997f, 7.5166f, 16.5664f, 7.5166f, 15.8831f)
            }
        }.build()
        
        return _icAction!!
    }

private var _icAction: ImageVector? = null

