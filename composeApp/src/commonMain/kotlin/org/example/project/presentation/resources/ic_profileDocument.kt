package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icProfileDocument: ImageVector
    get() {
        if (_icProfileDocument != null) return _icProfileDocument!!
        
        _icProfileDocument = ImageVector.Builder(
            name = "icProfileDocument",
            defaultWidth = 20.dp,
            defaultHeight = 20.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.25f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.50033f, 18.3332f)
                horizontalLineTo(12.5003f)
                curveTo(16.667f, 18.3332f, 18.3337f, 16.6665f, 18.3337f, 12.4998f)
                verticalLineTo(7.49984f)
                curveTo(18.3337f, 3.33317f, 16.667f, 1.6665f, 12.5003f, 1.6665f)
                horizontalLineTo(7.50033f)
                curveTo(3.33366f, 1.6665f, 1.66699f, 3.33317f, 1.66699f, 7.49984f)
                verticalLineTo(12.4998f)
                curveTo(1.66699f, 16.6665f, 3.33366f, 18.3332f, 7.50033f, 18.3332f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.25f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.125f, 7.5f)
                horizontalLineTo(6.875f)
            }
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.25f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.125f, 12.5f)
                horizontalLineTo(6.875f)
            }
        }.build()
        
        return _icProfileDocument!!
    }

private var _icProfileDocument: ImageVector? = null

