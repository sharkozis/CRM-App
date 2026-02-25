package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icCameraBg: ImageVector
    get() {
        if (_icCameraBg != null) return _icCameraBg!!
        
        _icCameraBg = ImageVector.Builder(
            name = "icCameraBg",
            defaultWidth = 73.dp,
            defaultHeight = 57.dp,
            viewportWidth = 73f,
            viewportHeight = 57f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFBD6E6))
            ) {
                moveTo(69.782f, 8.85141f)
                curveTo(68.3411f, 7.34187f, 66.3512f, 6.44986f, 64.0869f, 6.44986f)
                horizontalLineTo(52.6968f)
                verticalLineTo(6.31263f)
                curveTo(52.6968f, 4.59724f, 52.0106f, 2.95047f, 50.8441f, 1.85262f)
                curveTo(49.6777f, 0.686155f, 48.0995f, 0f, 46.3841f, 0f)
                horizontalLineTo(25.7994f)
                curveTo(24.0154f, 0f, 22.4373f, 0.686155f, 21.2708f, 1.85262f)
                curveTo(20.1044f, 3.01908f, 19.4182f, 4.59724f, 19.4182f, 6.31263f)
                verticalLineTo(6.44986f)
                horizontalLineTo(8.09664f)
                curveTo(5.83232f, 6.44986f, 3.84247f, 7.34187f, 2.40154f, 8.85141f)
                curveTo(0.960618f, 10.2923f, 0f, 12.3508f, 0f, 14.5465f)
                verticalLineTo(48.7171f)
                curveTo(0f, 50.9814f, 0.892002f, 52.9712f, 2.40154f, 54.4121f)
                curveTo(3.84247f, 55.8531f, 5.90094f, 56.8137f, 8.09664f, 56.8137f)
                horizontalLineTo(64.0869f)
                curveTo(66.3512f, 56.8137f, 68.3411f, 55.9217f, 69.782f, 54.4121f)
                curveTo(71.223f, 52.9712f, 72.1836f, 50.9128f, 72.1836f, 48.7171f)
                verticalLineTo(14.5465f)
                curveTo(72.1836f, 12.2822f, 71.2916f, 10.2923f, 69.782f, 8.85141f)
                close()
                moveTo(68.6156f, 48.7171f)
                horizontalLineTo(68.5469f)
                curveTo(68.5469f, 49.9521f, 68.0666f, 51.05f, 67.2432f, 51.8734f)
                curveTo(66.4199f, 52.6968f, 65.322f, 53.1771f, 64.0869f, 53.1771f)
                horizontalLineTo(8.09664f)
                curveTo(6.86156f, 53.1771f, 5.76371f, 52.6968f, 4.94032f, 51.8734f)
                curveTo(4.11693f, 51.05f, 3.63662f, 49.9521f, 3.63662f, 48.7171f)
                verticalLineTo(14.5465f)
                curveTo(3.63662f, 13.3114f, 4.11693f, 12.2136f, 4.94032f, 11.3902f)
                curveTo(5.76371f, 10.5668f, 6.86156f, 10.0865f, 8.09664f, 10.0865f)
                horizontalLineTo(21.3394f)
                curveTo(22.3687f, 10.0865f, 23.1921f, 9.2631f, 23.1921f, 8.23387f)
                verticalLineTo(6.24402f)
                curveTo(23.1921f, 5.48924f, 23.4665f, 4.80309f, 23.9468f, 4.32278f)
                curveTo(24.4271f, 3.84247f, 25.1133f, 3.56801f, 25.8681f, 3.56801f)
                horizontalLineTo(46.3841f)
                curveTo(47.1389f, 3.56801f, 47.825f, 3.84247f, 48.3054f, 4.32278f)
                curveTo(48.7857f, 4.80309f, 49.0601f, 5.48924f, 49.0601f, 6.24402f)
                verticalLineTo(8.23387f)
                curveTo(49.0601f, 9.2631f, 49.8835f, 10.0865f, 50.9127f, 10.0865f)
                horizontalLineTo(64.1555f)
                curveTo(65.3906f, 10.0865f, 66.4885f, 10.5668f, 67.3119f, 11.3902f)
                curveTo(68.1353f, 12.2136f, 68.6156f, 13.3114f, 68.6156f, 14.5465f)
                verticalLineTo(48.7171f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFBD6E6))
            ) {
                moveTo(36.0918f, 14.7523f)
                curveTo(31.426f, 14.7523f, 27.1718f, 16.6736f, 24.1527f, 19.6926f)
                curveTo(21.065f, 22.7803f, 19.2124f, 26.9659f, 19.2124f, 31.6317f)
                curveTo(19.2124f, 36.2976f, 21.1336f, 40.5518f, 24.1527f, 43.5709f)
                curveTo(27.2404f, 46.6586f, 31.426f, 48.5112f, 36.0918f, 48.5112f)
                curveTo(40.7577f, 48.5112f, 45.0119f, 46.5899f, 48.0309f, 43.5709f)
                curveTo(51.1186f, 40.4832f, 52.9713f, 36.2976f, 52.9713f, 31.6317f)
                curveTo(52.9713f, 26.9659f, 51.05f, 22.7117f, 48.0309f, 19.6926f)
                curveTo(45.0119f, 16.6736f, 40.7577f, 14.7523f, 36.0918f, 14.7523f)
                close()
                moveTo(45.4235f, 41.0321f)
                curveTo(43.022f, 43.365f, 39.7285f, 44.8745f, 36.0918f, 44.8745f)
                curveTo(32.4552f, 44.8745f, 29.1617f, 43.365f, 26.7601f, 41.0321f)
                curveTo(24.3586f, 38.6305f, 22.9176f, 35.337f, 22.9176f, 31.7004f)
                curveTo(22.9176f, 28.0637f, 24.4272f, 24.7702f, 26.7601f, 22.3686f)
                curveTo(29.1617f, 19.9671f, 32.4552f, 18.5262f, 36.0918f, 18.5262f)
                curveTo(39.7285f, 18.5262f, 43.022f, 20.0357f, 45.4235f, 22.3686f)
                curveTo(47.8251f, 24.7702f, 49.266f, 28.0637f, 49.266f, 31.7004f)
                curveTo(49.3346f, 35.337f, 47.8251f, 38.6305f, 45.4235f, 41.0321f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFBD6E6))
            ) {
                moveTo(60.5189f, 21.408f)
                curveTo(62.3758f, 21.408f, 63.8811f, 19.9027f, 63.8811f, 18.0458f)
                curveTo(63.8811f, 16.189f, 62.3758f, 14.6837f, 60.5189f, 14.6837f)
                curveTo(58.662f, 14.6837f, 57.1567f, 16.189f, 57.1567f, 18.0458f)
                curveTo(57.1567f, 19.9027f, 58.662f, 21.408f, 60.5189f, 21.408f)
                close()
            }
        }.build()
        
        return _icCameraBg!!
    }

private var _icCameraBg: ImageVector? = null

