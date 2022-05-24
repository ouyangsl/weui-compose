package weui

import androidx.compose.ui.unit.dp

/**
 * [支持不同的屏幕尺寸](https://developer.android.google.cn/guide/topics/large-screens/support-different-screen-sizes#window_size_classes)
 */
enum class WindowSizeClasses {
    Compact,  // 较小宽度设备
    Medium,   // 中等宽度设备
    Expanded  // 展开宽度设备
}

/**
 * 较小宽度设备[WindowSizeClasses.Compact] 的最大宽度
 */
val CompactMaxWidth = 600.dp

/**
 * 中等宽度设备[WindowSizeClasses.Medium] 的最大宽度
 */
val MediumMaxWidth = 840.dp