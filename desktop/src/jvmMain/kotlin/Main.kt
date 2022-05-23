// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.ui.Alignment
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import weui.sample.App

fun main() = application {
    val state = rememberWindowState(
        position = WindowPosition.Aligned(Alignment.Center)
    )

    Window(
        onCloseRequest = ::exitApplication,
        state = state
    ) {
        App()
    }
}