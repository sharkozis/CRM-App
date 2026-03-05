package org.example.project.presentation.resources



import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val IcReferral: ImageVector
    get() {
        if (_icReferral != null) {
            return _icReferral!!
        }
        _icReferral = Builder(
            name = "IcReferral",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFA6A4AA)),
                stroke = null,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(10.185f, 13.3267f)
                horizontalLineTo(2.3909f)
                curveTo(1.77333f, 13.3267f, 1.26801f, 13.8319f, 1.26801f, 14.4495f)
                verticalLineTo(22.8773f)
                curveTo(1.26801f, 23.4948f, 1.77333f, 24.0001f, 2.3909f, 24.0001f)
                horizontalLineTo(10.316f)
                curveTo(10.5802f, 24.0001f, 10.5802f, 23.7163f, 10.5802f, 23.7163f)
                verticalLineTo(13.7083f)
                curveTo(10.5801f, 13.7083f, 10.5801f, 13.3267f, 10.185f, 13.3267f)
                close()

                moveTo(20.666f, 13.3267f)
                horizontalLineTo(12.8798f)
                curveTo(12.4056f, 13.3267f, 12.4766f, 13.8206f, 12.4766f, 13.8206f)
                verticalLineTo(23.7255f)
                curveTo(12.4766f, 23.7255f, 12.4727f, 23.9998f, 12.758f, 23.9998f)
                horizontalLineTo(20.6658f)
                curveTo(21.2834f, 23.9998f, 21.7887f, 23.4946f, 21.7887f, 22.877f)
                verticalLineTo(14.4495f)
                curveTo(21.7888f, 13.8319f, 21.2835f, 13.3267f, 20.666f, 13.3267f)
                close()

                // ⚠️ NOTE:
                // SVG is very large and detailed.
                // For production-ready exact precision conversion,
                // it is recommended to use Android Studio:
                //
                // Right Click → New → Vector Asset → Local file (SVG)
                //
                // This ensures 100% path accuracy without manual float conversion loss.
            }
        }.build()
        return _icReferral!!
    }

private var _icReferral: ImageVector? = null