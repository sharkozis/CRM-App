package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icMark: ImageVector
    get() {
        if (_icMark != null) return _icMark!!
        
        _icMark = ImageVector.Builder(
            name = "icMark",
            defaultWidth = 20.dp,
            defaultHeight = 20.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF3B9865))
            ) {
                moveTo(9.99984f, 1.66675f)
                curveTo(5.40817f, 1.66675f, 1.6665f, 5.40841f, 1.6665f, 10.0001f)
                curveTo(1.6665f, 14.5917f, 5.40817f, 18.3334f, 9.99984f, 18.3334f)
                curveTo(14.5915f, 18.3334f, 18.3332f, 14.5917f, 18.3332f, 10.0001f)
                curveTo(18.3332f, 5.40841f, 14.5915f, 1.66675f, 9.99984f, 1.66675f)
                close()
                moveTo(13.9832f, 8.08341f)
                lineTo(9.25817f, 12.8084f)
                curveTo(9.1415f, 12.9251f, 8.98317f, 12.9917f, 8.8165f, 12.9917f)
                curveTo(8.64984f, 12.9917f, 8.4915f, 12.9251f, 8.37484f, 12.8084f)
                lineTo(6.0165f, 10.4501f)
                curveTo(5.77484f, 10.2084f, 5.77484f, 9.80841f, 6.0165f, 9.56675f)
                curveTo(6.25817f, 9.32508f, 6.65817f, 9.32508f, 6.89984f, 9.56675f)
                lineTo(8.8165f, 11.4834f)
                lineTo(13.0998f, 7.20008f)
                curveTo(13.3415f, 6.95842f, 13.7415f, 6.95842f, 13.9832f, 7.20008f)
                curveTo(14.2248f, 7.44175f, 14.2248f, 7.83341f, 13.9832f, 8.08341f)
                close()
            }
        }.build()
        
        return _icMark!!
    }

private var _icMark: ImageVector? = null

