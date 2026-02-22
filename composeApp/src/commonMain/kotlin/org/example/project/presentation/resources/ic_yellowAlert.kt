package com.composables

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val icYellowAlert: ImageVector
    get() {
        if (_icYellowAlert != null) return _icYellowAlert!!
        
        _icYellowAlert = ImageVector.Builder(
            name = "icYellowAlert",
            defaultWidth = 28.dp,
            defaultHeight = 28.dp,
            viewportWidth = 28f,
            viewportHeight = 28f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFEEBA31))
            ) {
                moveTo(14f, 20f)
                curveTo(14.7956f, 20f, 15.5587f, 20.3161f, 16.1213f, 20.8787f)
                curveTo(16.6839f, 21.4413f, 17f, 22.2044f, 17f, 23f)
                curveTo(17f, 23.7956f, 16.6839f, 24.5587f, 16.1213f, 25.1213f)
                curveTo(15.5587f, 25.6839f, 14.7956f, 26f, 14f, 26f)
                curveTo(13.2044f, 26f, 12.4413f, 25.6839f, 11.8787f, 25.1213f)
                curveTo(11.3161f, 24.5587f, 11f, 23.7956f, 11f, 23f)
                curveTo(11f, 22.2044f, 11.3161f, 21.4413f, 11.8787f, 20.8787f)
                curveTo(12.4413f, 20.3161f, 13.2044f, 20f, 14f, 20f)
                close()
                moveTo(14f, 2f)
                curveTo(15.3261f, 2f, 16.5979f, 2.52678f, 17.5355f, 3.46447f)
                curveTo(18.4732f, 4.40215f, 19f, 5.67392f, 19f, 7f)
                curveTo(19f, 7.538f, 18.874f, 8.257f, 18.696f, 9.02f)
                curveTo(18.4902f, 9.87784f, 18.2561f, 10.7286f, 17.994f, 11.571f)
                curveTo(17.4972f, 13.1722f, 16.9614f, 14.761f, 16.387f, 16.336f)
                curveTo(16.2088f, 16.8253f, 15.8839f, 17.2477f, 15.4567f, 17.5455f)
                curveTo(15.0294f, 17.8433f, 14.5208f, 18.002f, 14f, 18f)
                curveTo(13.4792f, 18.002f, 12.9706f, 17.8433f, 12.5433f, 17.5455f)
                curveTo(12.1161f, 17.2477f, 11.7912f, 16.8253f, 11.613f, 16.336f)
                curveTo(11.0386f, 14.761f, 10.5028f, 13.1722f, 10.006f, 11.571f)
                curveTo(9.74395f, 10.729f, 9.50983f, 9.87851f, 9.304f, 9.021f)
                curveTo(9.126f, 8.257f, 9f, 7.538f, 9f, 7f)
                curveTo(9f, 5.67392f, 9.52678f, 4.40215f, 10.4645f, 3.46447f)
                curveTo(11.4021f, 2.52678f, 12.6739f, 2f, 14f, 2f)
                close()
            }
        }.build()
        
        return _icYellowAlert!!
    }

private var _icYellowAlert: ImageVector? = null

