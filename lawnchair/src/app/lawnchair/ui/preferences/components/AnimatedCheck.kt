package app.lawnchair.ui.preferences.components

import androidx.compose.animation.Crossfade
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Check
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
@ExperimentalAnimationApi
fun AnimatedCheck(
    visible: Boolean,
    tint: Color = MaterialTheme.colors.primary
) {
    Box(modifier = Modifier.size(24.dp)) {
        Crossfade(targetState = visible) {
            if (it) {
                Icon(
                    imageVector = Icons.Rounded.Check,
                    contentDescription = null,
                    tint = tint
                )
            }
        }
    }
}
