package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icProfileLicenseImg: ImageVector
    get() {
        if (_icProfileLicenseImg != null) return _icProfileLicenseImg!!

        _icProfileLicenseImg = ImageVector.Builder(
            name = "icProfileLicenseImg",
            defaultWidth = 80.dp,
            defaultHeight = 56.dp,
            viewportWidth = 80f,
            viewportHeight = 56f
        ).apply {
            // Card body
            path(
                fill = SolidColor(Color(0xFFEDE8F5)),
                stroke = SolidColor(Color(0xFFCEC8D8)),
                strokeLineWidth = 1f
            ) {
                moveTo(4f, 0f)
                horizontalLineTo(76f)
                curveTo(78.2f, 0f, 80f, 1.8f, 80f, 4f)
                verticalLineTo(52f)
                curveTo(80f, 54.2f, 78.2f, 56f, 76f, 56f)
                horizontalLineTo(4f)
                curveTo(1.8f, 56f, 0f, 54.2f, 0f, 52f)
                verticalLineTo(4f)
                curveTo(0f, 1.8f, 1.8f, 0f, 4f, 0f)
                close()
            }
            // Photo placeholder box
            path(
                fill = SolidColor(Color(0xFFD0C8E0)),
            ) {
                moveTo(6f, 8f)
                horizontalLineTo(24f)
                curveTo(25.1f, 8f, 26f, 8.9f, 26f, 10f)
                verticalLineTo(46f)
                curveTo(26f, 47.1f, 25.1f, 48f, 24f, 48f)
                horizontalLineTo(6f)
                curveTo(4.9f, 48f, 4f, 47.1f, 4f, 46f)
                verticalLineTo(10f)
                curveTo(4f, 8.9f, 4.9f, 8f, 6f, 8f)
                close()
            }
            // Person icon in photo box
            path(
                fill = SolidColor(Color(0xFFB0A8C0)),
            ) {
                moveTo(15f, 18f)
                curveTo(17.2f, 18f, 19f, 20.05f, 19f, 22.6f)
                curveTo(19f, 25.15f, 17.2f, 27.2f, 15f, 27.2f)
                curveTo(12.8f, 27.2f, 11f, 25.15f, 11f, 22.6f)
                curveTo(11f, 20.05f, 12.8f, 18f, 15f, 18f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB0A8C0)),
            ) {
                moveTo(7f, 44f)
                curveTo(7f, 39.5f, 10.6f, 35.9f, 15f, 35.9f)
                curveTo(19.4f, 35.9f, 23f, 39.5f, 23f, 44f)
                close()
            }
            // Text lines on right side
            path(
                fill = SolidColor(Color(0xFFCEC8D8)),
            ) {
                moveTo(30f, 12f)
                horizontalLineTo(62f)
                curveTo(62.6f, 12f, 63f, 12.4f, 63f, 13f)
                curveTo(63f, 13.6f, 62.6f, 14f, 62f, 14f)
                horizontalLineTo(30f)
                curveTo(29.4f, 14f, 29f, 13.6f, 29f, 13f)
                curveTo(29f, 12.4f, 29.4f, 12f, 30f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCEC8D8)),
            ) {
                moveTo(30f, 18f)
                horizontalLineTo(55f)
                curveTo(55.6f, 18f, 56f, 18.4f, 56f, 19f)
                curveTo(56f, 19.6f, 55.6f, 20f, 55f, 20f)
                horizontalLineTo(30f)
                curveTo(29.4f, 20f, 29f, 19.6f, 29f, 19f)
                curveTo(29f, 18.4f, 29.4f, 18f, 30f, 18f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCEC8D8)),
            ) {
                moveTo(30f, 24f)
                horizontalLineTo(70f)
                curveTo(70.6f, 24f, 71f, 24.4f, 71f, 25f)
                curveTo(71f, 25.6f, 70.6f, 26f, 70f, 26f)
                horizontalLineTo(30f)
                curveTo(29.4f, 26f, 29f, 25.6f, 29f, 25f)
                curveTo(29f, 24.4f, 29.4f, 24f, 30f, 24f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCEC8D8)),
            ) {
                moveTo(30f, 30f)
                horizontalLineTo(60f)
                curveTo(60.6f, 30f, 61f, 30.4f, 61f, 31f)
                curveTo(61f, 31.6f, 60.6f, 32f, 60f, 32f)
                horizontalLineTo(30f)
                curveTo(29.4f, 32f, 29f, 31.6f, 29f, 31f)
                curveTo(29f, 30.4f, 29.4f, 30f, 30f, 30f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCEC8D8)),
            ) {
                moveTo(30f, 36f)
                horizontalLineTo(50f)
                curveTo(50.6f, 36f, 51f, 36.4f, 51f, 37f)
                curveTo(51f, 37.6f, 50.6f, 38f, 50f, 38f)
                horizontalLineTo(30f)
                curveTo(29.4f, 38f, 29f, 37.6f, 29f, 37f)
                curveTo(29f, 36.4f, 29.4f, 36f, 30f, 36f)
                close()
            }
        }.build()

        return _icProfileLicenseImg!!
    }

private var _icProfileLicenseImg: ImageVector? = null
