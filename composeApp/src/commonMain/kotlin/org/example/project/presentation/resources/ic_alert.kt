package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icAlert: ImageVector
    get() {
        if (_icAlert != null) return _icAlert!!
        
        _icAlert = ImageVector.Builder(
            name = "icAlert",
            defaultWidth = 32.dp,
            defaultHeight = 31.dp,
            viewportWidth = 32f,
            viewportHeight = 31f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFC63C3C))
            ) {
                moveTo(17.7322f, 4.06616f)
                lineTo(29.2442f, 23.3817f)
                curveTo(29.4198f, 23.6763f, 29.5122f, 24.0104f, 29.5122f, 24.3505f)
                curveTo(29.5122f, 24.6906f, 29.4198f, 25.0247f, 29.2442f, 25.3192f)
                curveTo(29.0687f, 25.6138f, 28.8162f, 25.8583f, 28.5122f, 26.0284f)
                curveTo(28.2082f, 26.1985f, 27.8633f, 26.288f, 27.5122f, 26.288f)
                horizontalLineTo(4.48823f)
                curveTo(4.13716f, 26.288f, 3.79228f, 26.1985f, 3.48825f, 26.0284f)
                curveTo(3.18422f, 25.8583f, 2.93175f, 25.6138f, 2.75622f, 25.3192f)
                curveTo(2.58069f, 25.0247f, 2.48828f, 24.6906f, 2.48828f, 24.3505f)
                curveTo(2.48828f, 24.0104f, 2.5807f, 23.6763f, 2.75623f, 23.3817f)
                lineTo(14.2682f, 4.06616f)
                curveTo(15.0376f, 2.7745f, 16.9616f, 2.7745f, 17.7322f, 4.06616f)
                close()
                moveTo(16.0002f, 19.375f)
                curveTo(15.6466f, 19.375f, 15.3075f, 19.5111f, 15.0574f, 19.7533f)
                curveTo(14.8074f, 19.9956f, 14.6669f, 20.3241f, 14.6669f, 20.6667f)
                curveTo(14.6669f, 21.0092f, 14.8074f, 21.3378f, 15.0574f, 21.58f)
                curveTo(15.3075f, 21.8222f, 15.6466f, 21.9583f, 16.0002f, 21.9583f)
                curveTo(16.3539f, 21.9583f, 16.693f, 21.8222f, 16.943f, 21.58f)
                curveTo(17.1931f, 21.3378f, 17.3336f, 21.0092f, 17.3336f, 20.6667f)
                curveTo(17.3336f, 20.3241f, 17.1931f, 19.9956f, 16.943f, 19.7533f)
                curveTo(16.693f, 19.5111f, 16.3539f, 19.375f, 16.0002f, 19.375f)
                close()
                moveTo(16.0002f, 10.3333f)
                curveTo(15.6737f, 10.3334f, 15.3584f, 10.4495f, 15.1144f, 10.6598f)
                curveTo(14.8704f, 10.87f, 14.7144f, 11.1597f, 14.6762f, 11.4739f)
                lineTo(14.6669f, 11.625f)
                verticalLineTo(16.7917f)
                curveTo(14.6673f, 17.1209f, 14.7974f, 17.4375f, 15.0307f, 17.6769f)
                curveTo(15.264f, 17.9163f, 15.5828f, 18.0604f, 15.9221f, 18.0797f)
                curveTo(16.2613f, 18.099f, 16.5954f, 17.992f, 16.856f, 17.7807f)
                curveTo(17.1166f, 17.5694f, 17.2841f, 17.2697f, 17.3242f, 16.9428f)
                lineTo(17.3336f, 16.7917f)
                verticalLineTo(11.625f)
                curveTo(17.3336f, 11.2824f, 17.1931f, 10.9539f, 16.943f, 10.7117f)
                curveTo(16.693f, 10.4694f, 16.3539f, 10.3333f, 16.0002f, 10.3333f)
                close()
            }
        }.build()
        
        return _icAlert!!
    }

private var _icAlert: ImageVector? = null

