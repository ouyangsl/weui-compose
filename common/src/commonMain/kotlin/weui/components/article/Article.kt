package weui.components.article

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.withStyle
import weui.theme.WeUI

@Composable
fun AnnotatedString.Builder.headline(
    text: String
) = withStyle(
    style = WeUI.typography.headline.toSpanStyle()
) {
    append(text)
}

@Composable
fun AnnotatedString.Builder.title(
    text: String
) = withStyle(
    style = WeUI.typography.title.toSpanStyle()
) {
    append(text)
}

@Composable
fun AnnotatedString.Builder.subtitle(
    text: String
) = withStyle(
    style = WeUI.typography.subtitle.toSpanStyle()
) {
    append(text)
}

@Composable
fun AnnotatedString.Builder.body(
    text: String
) = withStyle(
    style = WeUI.typography.body.toSpanStyle()
) {
    append(text)
}

@Composable
fun AnnotatedString.Builder.content(
    text: String
) = withStyle(
    style = WeUI.typography.content.toSpanStyle()
) {
    append(text)
}

@Composable
fun AnnotatedString.Builder.desc(
    text: String
) = withStyle(
    style = WeUI.typography.desc.toSpanStyle()
) {
    append(text)
}

@Composable
fun AnnotatedString.Builder.caption(
    text: String
) = withStyle(
    style = WeUI.typography.caption.toSpanStyle()
) {
    append(text)
}

@Composable
fun AnnotatedString.Builder.link(
    text: String,
    tag: String,
    annotation: String,
) {
    pushStringAnnotation(tag, annotation)

    withStyle(
        style = WeUI.typography.link.toSpanStyle()
    ) {
        append(text)
    }

    pop()
}