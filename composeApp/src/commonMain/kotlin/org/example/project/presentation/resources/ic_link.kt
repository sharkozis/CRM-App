package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icLink: ImageVector
    get() {
        if (_icLink != null) return _icLink!!
        
        _icLink = ImageVector.Builder(
            name = "icLink",
            defaultWidth = 20.dp,
            defaultHeight = 20.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.72496f, 10f)
                curveTo(2.06662f, 9.20833f, 1.66663f, 8.19167f, 1.66663f, 7.08333f)
                curveTo(1.66663f, 4.56667f, 3.72496f, 2.5f, 6.24996f, 2.5f)
                horizontalLineTo(10.4166f)
                curveTo(12.9333f, 2.5f, 15f, 4.56667f, 15f, 7.08333f)
                curveTo(15f, 9.6f, 12.9416f, 11.6667f, 10.4166f, 11.6667f)
                horizontalLineTo(8.33329f)
            }
            path(
                stroke = SolidColor(Color(0xFF211B2A)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.275f, 10f)
                curveTo(17.9333f, 10.7917f, 18.3333f, 11.8084f, 18.3333f, 12.9167f)
                curveTo(18.3333f, 15.4334f, 16.275f, 17.5f, 13.75f, 17.5f)
                horizontalLineTo(9.58333f)
                curveTo(7.06667f, 17.5f, 5f, 15.4334f, 5f, 12.9167f)
                curveTo(5f, 10.4f, 7.05833f, 8.33337f, 9.58333f, 8.33337f)
                horizontalLineTo(11.6667f)
            }
        }.build()
        
        return _icLink!!
    }

private var _icLink: ImageVector? = null

