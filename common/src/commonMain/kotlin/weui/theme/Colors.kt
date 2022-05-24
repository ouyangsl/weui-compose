package weui.theme

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

/**
 * 全局颜色配置
 */
//val WeUI.Colors.Brand: Color
//    get() = Color(0xFF07C160)
//
//val WeUI.Colors.Red: Color
//    get() = Color(0xFFDC3636)
//val WeUI.Colors.Orange: Color
//    get() = Color(0xFFE17719)
//val WeUI.Colors.Yellow: Color
//    get() = Color(0xFFBB8E00)
//val WeUI.Colors.Green: Color
//    get() = Color(0xFF4F8400)
//val WeUI.Colors.LightGreen: Color
//    get() = Color(0xFF2E8800)
//val WeUI.Colors.Blue: Color
//    get() = Color(0xFF007DBB)
//val WeUI.Colors.Indigo: Color
//    get() = Color(0xFF0075E2)
//val WeUI.Colors.Purple: Color
//    get() = Color(0xFF6265F1)
//val WeUI.Colors.White: Color
//    get() = Color(0xFFFFFFFF)
//val WeUI.Colors.Link: Color
//    get() = Color(0xFF576B95)
//
//val WeUI.Colors.Foreground: Color
//    get() = Color(0xFF000000)
//val WeUI.Colors.Foreground0: Color
//    get() = Foreground.copy(alpha = 0.6f)
//val WeUI.Colors.Foreground1: Color
//    get() = Foreground.copy(alpha = 0.42f)
//val WeUI.Colors.Foreground2: Color
//    get() = Foreground.copy(alpha = 0.1f)
//
//val WeUI.Colors.Background: Color
//    get() = Color(0xFFFFFFFF)
//val WeUI.Colors.Background0: Color
//    get() = Color(0xFFEDEDED)
//val WeUI.Colors.Background1: Color
//    get() = Color(0xFFF7F7F7)
//val WeUI.Colors.Background2: Color
//    get() = Color(0xFF4C4C4C)
//
//val WeUI.Colors.TextGreen: Color
//    get() = Color(0xFF06AE56)
//val WeUI.Colors.TextOrange: Color
//    get() = Color(0xFFE17719)
//val WeUI.Colors.TextBlue: Color
//    get() = Color(0xFF007DBB)
//
//val WeUI.Colors.Primary: Color
//    get() = Brand
//val WeUI.Colors.Tips: Color
//    get() = Color(0xFF10AEFF)
//val WeUI.Colors.Warn: Color
//    get() = Color(0xFFFA5151)
//val WeUI.Colors.Error: Color
//    get() = Color(0xFFFA5151)
/**
 * @property brand 品牌色
 * @property success 成功，用于标识操作顺利达成
 * @property tip 提示，用于表示信息提示，也常用于缺乏条件的操作拦截，提示用户所需信息
 * @property warn 普通警告，用于表示操作后将引起一定后果的情况
 * @property error 强烈警告，用于表示操作引起严重的不可挽回的后果的情况
 * @property wait 等待，用于表示等待
 * @property link 链接颜色
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
    link: Color,
    background: Color,
    surface: Color,
    mask: Color,
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
    var link by mutableStateOf(link, structuralEqualityPolicy())
        internal set
    var background by mutableStateOf(background, structuralEqualityPolicy())
        internal set
    var surface by mutableStateOf(surface, structuralEqualityPolicy())
        internal set
    var mask by mutableStateOf(mask, structuralEqualityPolicy())
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
        link: Color = this.link,
        background: Color = this.background,
        surface: Color = this.surface,
        mask: Color = this.mask,
        divider: Color = this.divider,
        isLight: Boolean = this.isLight
    ): WeUIColors = WeUIColors(
        brand, success, tip, warn, error, wait, link, background, surface, mask, divider, isLight
    )

    override fun toString(): String {
        return "WeUIColors(" +
                "brand=$brand" +
                "success=$success" +
                "tip=$tip" +
                "warn=$warn" +
                "error=$error" +
                "wait=$wait" +
                "link=$link" +
                "background=$background" +
                "surface=$surface" +
                "mask=$mask" +
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
    link: Color = Color(0xFF576B95),
    background: Color = Color(0xFFF7F7F7),
    surface: Color = Color.White,
    mask: Color = Color.Black.copy(0.4f),
    divider: Color = Color(0x1A000000),
    isLight: Boolean = true
): WeUIColors = WeUIColors(
    brand, success, tip, warn, error, wait, link, background, surface, mask, divider, isLight
)

fun darkWeUIColors(
    brand: Color = Color(0xFF07C160),
    success: Color = Color(0xFF07C160),
    tip: Color = Color(0xFF10AEFF),
    warn: Color = Color(0xFFFFC300),
    error: Color = Color(0xFFFA5151),
    wait: Color = Color(0xFF10AEFF),
    link: Color = Color(0xFF576B95),
    background: Color = Color.Black,
    surface: Color = Color(0xFF1E1E1E),
    mask: Color = Color.White.copy(0.4f),
    divider: Color = Color.White.copy(alpha = 0.05f),
    isLight: Boolean = false
): WeUIColors = WeUIColors(
    brand, success, tip, warn, error, wait, link, background, surface, mask, divider, isLight
)

internal val LocalWeUIColors = staticCompositionLocalOf { lightWeUIColors() }