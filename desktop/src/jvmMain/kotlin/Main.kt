// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import weui.core.CompactMaxWidth
import weui.core.LocalWindowSizeClasses
import weui.core.MediumMaxWidth
import weui.core.WindowSizeClasses
import weui.sample.App

fun main() = application {
    val state = rememberWindowState(
        position = WindowPosition.Aligned(Alignment.Center)
    )
    val windowSizeClasses by derivedStateOf {
        val width = state.size.width

        when {
            width > MediumMaxWidth -> WindowSizeClasses.Expanded
            width > CompactMaxWidth -> WindowSizeClasses.Medium
            else -> WindowSizeClasses.Compact
        }
    }
    Window(
        onCloseRequest = ::exitApplication,
        state = state
    ) {

        CompositionLocalProvider(
            LocalWindowSizeClasses provides windowSizeClasses,
        ) {
            App()
        }
    }
}