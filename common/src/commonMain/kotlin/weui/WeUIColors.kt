package weui

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

/**
 * 颜色相关配置
 */

/**
 * @property brand 品牌色
 * @property success 成功，用于标识操作顺利达成
 * @property tip 提示，用于表示信息提示，也常用于缺乏条件的操作拦截，提示用户所需信息
 * @property warn 普通警告，用于表示操作后将引起一定后果的情况
 * @property error 强烈警告，用于表示操作引起严重的不可挽回的后果的情况
 * @property wait 等待，用于表示等待
 * @property background 背景色，用于底层容器背景颜色
 * @property surface 表面色，用于放置于底层容器之上的表层容器的背景颜色
 * @property divider 分割线颜色，用于部件之间的分割线的颜色
 * @property isLight 是否为亮色模式
 */
@Stable
class WeUIColors(
    brand: Color,
    success: Color,
    tip: Color,
    warn: Color,
    error: Color,
    wait: Color,
    background: Color,
    surface: Color,
    divider: Color,
    isLight: Boolean
) {
    var brand by mutableStateOf(brand, structuralEqualityPolicy())
        internal set
    var success by mutableStateOf(success, structuralEqualityPolicy())
        internal set
    var tip by mutableStateOf(tip, structuralEqualityPolicy())
        internal set
    var warn by mutableStateOf(warn, structuralEqualityPolicy())
        internal set
    var error by mutableStateOf(error, structuralEqualityPolicy())
        internal set
    var wait by mutableStateOf(wait, structuralEqualityPolicy())
        internal set
    var background by mutableStateOf(background, structuralEqualityPolicy())
        internal set
    var surface by mutableStateOf(surface, structuralEqualityPolicy())
        internal set
    var divider by mutableStateOf(divider, structuralEqualityPolicy())
        internal set
    var isLight by mutableStateOf(isLight, structuralEqualityPolicy())
        internal set

    fun copy(
        brand: Color = this.brand,
        success: Color = this.success,
        tip: Color = this.tip,
        warn: Color = this.warn,
        error: Color = this.error,
        wait: Color = this.wait,
        background: Color = this.background,
        surface: Color = this.surface,
        divider: Color = this.divider,
        isLight: Boolean = this.isLight
    ): WeUIColors = WeUIColors(
        brand, success, tip, warn, error, wait, background, surface, divider, isLight
    )

    override fun toString(): String {
        return "WeUIColors(" +
                "brand=$brand" +
                "success=$success" +
                "tip=$tip" +
                "warn=$warn" +
                "error=$error" +
                "wait=$wait" +
                "background=$background" +
                "surface=$surface" +
                "divider=$divider" +
                "isLight=$isLight" +
                ")"
    }
}

fun lightWeUIColors(
    brand: Color = Color(0xFF07C160),
    success: Color = Color(0xFF07C160),
    tip: Color = Color(0xFF10AEFF),
    warn: Color = Color(0xFFFFC300),
    error: Color = Color(0xFFFA5151),
    wait: Color = Color(0xFF10AEFF),
    background: Color = Color(0xFFF7F7F7),
    surface: Color = Color.White,
    divider: Color = Color(0x1A000000),
    isLight: Boolean = true
): WeUIColors = WeUIColors(
    brand, success, tip, warn, error, wait, background, surface, divider, isLight
)

fun darkWeUIColors(
    brand: Color = Color(0xFF07C160),
    success: Color = Color(0xFF07C160),
    tip: Color = Color(0xFF10AEFF),
    warn: Color = Color(0xFFFFC300),
    error: Color = Color(0xFFFA5151),
    wait: Color = Color(0xFF10AEFF),
    background: Color = Color.Black,
    surface: Color = Color(0xFF1E1E1E),
    divider: Color = Color.White.copy(alpha = 0.05f),
    isLight: Boolean = false
): WeUIColors = WeUIColors(
    brand, success, tip, warn, error, wait, background, surface, divider, isLight
)

internal val LocalWeUIColors = staticCompositionLocalOf { lightWeUIColors() }