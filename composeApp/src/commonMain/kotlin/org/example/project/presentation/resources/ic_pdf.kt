package com.composables

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icPdf: ImageVector
    get() {
        if (_icPdf != null) return _icPdf!!
        
        _icPdf = ImageVector.Builder(
            name = "icPdf",
            defaultWidth = 40.dp,
            defaultHeight = 40.dp,
            viewportWidth = 40f,
            viewportHeight = 40f
        ).apply {
            group {
                path(
                    fill = Brush.linearGradient(
                        colors = listOf(Color(0xFFF7F7F7), Color(0xFFFFA8A8)),
                        start = Offset(19f, 1f),
                        end = Offset(19f, 39f),
                        tileMode = TileMode.Clamp
                    )
                ) {
                    moveTo(8.2f, 39f)
                    horizontalLineTo(31.8f)
                    curveTo(32.9201f, 39f, 33.4802f, 39f, 33.908f, 38.782f)
                    curveTo(34.2843f, 38.5903f, 34.5903f, 38.2843f, 34.782f, 37.908f)
                    curveTo(35f, 37.4802f, 35f, 36.9201f, 35f, 35.8f)
                    verticalLineTo(16f)
                    lineTo(23f, 1f)
                    horizontalLineTo(8.2f)
                    curveTo(7.0799f, 1f, 6.51984f, 1f, 6.09202f, 1.21799f)
                    curveTo(5.71569f, 1.40973f, 5.40973f, 1.71569f, 5.21799f, 2.09202f)
                    curveTo(5f, 2.51984f, 5f, 3.0799f, 5f, 4.2f)
                    verticalLineTo(35.8f)
                    curveTo(5f, 36.9201f, 5f, 37.4802f, 5.21799f, 37.908f)
                    curveTo(5.40973f, 38.2843f, 5.71569f, 38.5903f, 6.09202f, 38.782f)
                    curveTo(6.51984f, 39f, 7.0799f, 39f, 8.2f, 39f)
                    close()
                }
            }
            group {
                path(
                    fill = Brush.linearGradient(
                        colors = listOf(Color(0xFFFEFEFE), Color(0xFFE8E8E8), Color(0xFFBEBEBE)),
                        start = Offset(25.5f, -1.5f),
                        end = Offset(37.5f, 26.5f),
                        tileMode = TileMode.Clamp
                    )
                ) {
                    moveTo(23f, 1f)
                    verticalLineTo(14f)
                    curveTo(23f, 15.1046f, 23.8954f, 16f, 25f, 16f)
                    horizontalLineTo(35f)
                    lineTo(23f, 1f)
                    close()
                }
            }
            group {
                path {
                }
            }
        }.build()
        
        return _icPdf!!
    }

private var _icPdf: ImageVector? = null

