package com.github.ajalt.mordant

import com.github.ajalt.colormath.Color
import com.github.ajalt.colormath.RGB
import com.github.ajalt.mordant.TextColors.Companion.hsl
import com.github.ajalt.mordant.TextColors.Companion.rgb
import com.github.ajalt.mordant.rendering.DEFAULT_STYLE
import com.github.ajalt.mordant.rendering.TextStyle

class TerminalColors internal constructor(
        private val level: AnsiLevel
) {
    val black: TextStyle get() = downsample(TextColors.black)
    val red: TextStyle get() = downsample(TextColors.red)
    val green: TextStyle get() = downsample(TextColors.green)
    val yellow: TextStyle get() = downsample(TextColors.yellow)
    val blue: TextStyle get() = downsample(TextColors.blue)
    val magenta: TextStyle get() = downsample(TextColors.magenta)
    val cyan: TextStyle get() = downsample(TextColors.cyan)
    val white: TextStyle get() = downsample(TextColors.white)
    val gray: TextStyle get() = downsample(TextColors.gray)

    val brightRed: TextStyle get() = downsample(TextColors.brightRed)
    val brightGreen: TextStyle get() = downsample(TextColors.brightGreen)
    val brightYellow: TextStyle get() = downsample(TextColors.brightYellow)
    val brightBlue: TextStyle get() = downsample(TextColors.brightBlue)
    val brightMagenta: TextStyle get() = downsample(TextColors.brightMagenta)
    val brightCyan: TextStyle get() = downsample(TextColors.brightCyan)
    val brightWhite: TextStyle get() = downsample(TextColors.brightWhite)

    // TODO
//    /** Clear all active styles */
//    val reset: AnsiCode get() = style(TextStyles.reset)

    /**
     * Render text as bold or increased intensity.
     *
     * Might be rendered as a different color instead of a different font weight.
     */
    val bold: TextStyle get() = downsample(TextStyles.bold)

    /**
     * Render text as faint or decreased intensity.
     *
     * Not widely supported.
     */
    val dim: TextStyle get() = downsample(TextStyles.dim)

    /**
     * Render text as italic.
     *
     * Not widely supported, might be rendered as inverse instead of italic.
     */
    val italic: TextStyle get() = downsample(TextStyles.italic)

    /**
     * Underline text.
     *
     * Might be rendered with different colors instead of underline.
     */
    val underline: TextStyle get() = downsample(TextStyles.underline)

    /** Render text with background and foreground colors switched. */
    val inverse: TextStyle get() = downsample(TextStyles.inverse)

    /**
     * Render text with a strikethrough.
     *
     * Not widely supported.
     */
    val strikethrough: TextStyle get() = downsample(TextStyles.strikethrough)

    /**
     * No style.
     */
    val plain: TextStyle get() = DEFAULT_STYLE

    /** @param hex An rgb hex string in the form "#ffffff" or "ffffff" */
    fun rgb(hex: String): TextStyle = color(RGB(hex))

    /**
     * Create a color code from an RGB color.
     *
     * @param r The red amount, in the range \[0, 255]
     * @param g The green amount, in the range \[0, 255]
     * @param b The blue amount, in the range \[0, 255]
     */
    fun rgb(r: Int, g: Int, b: Int): TextStyle = TextColors.rgb(r, g, b, level)

    /**
     * Create a color code from an HSL color.
     *
     * @param h The hue, in the range \[0, 360]
     * @param s The saturation, in the range \[0, 100]
     * @param l The lightness, in the range \[0, 100]
     */
    fun hsl(h: Int, s: Int, l: Int): TextStyle = TextColors.hsl(h, s, l, level)

    /**
     * Create a color code from an HSV color.
     *
     * @param h The hue, in the range \[0, 360]
     * @param s The saturation, in the range \[0,100]
     * @param v The value, in the range \[0,100]
     */
    fun hsv(h: Int, s: Int, v: Int): TextStyle = TextColors.hsv(h, s, v, level)

    /**
     * Create a color code from a CMYK color.
     *
     * @param c The cyan amount, in the range \[0, 100]
     * @param m The magenta amount, in the range \[0,100]
     * @param y The yellow amount, in the range \[0,100]
     * @param k The black amount, in the range \[0,100]
     */
    fun cmyk(c: Int, m: Int, y: Int, k: Int): TextStyle = TextColors.cmyk(c, m, y, k, level)

    /**
     * Create a grayscale color code from a fraction in the range \[0, 1].
     *
     * @param fraction The fraction of white in the color. 0 is pure black, 1 is pure white.
     */
    fun gray(fraction: Double): TextStyle = TextColors.gray(fraction, level)

    /**
     * Create a color code from a CIE XYZ color.
     *
     * Conversions use D65 reference white, and sRGB profile.
     *
     * [x], [y], and [z] are generally in the interval [0, 100], but may be larger
     */
    fun xyz(x: Double, y: Double, z: Double): TextStyle = TextColors.xyz(x, y, z, level)


    /**
     * Create a color code from a CIE LAB color.
     *
     * Conversions use D65 reference white, and sRGB profile.
     *
     * [l] is in the interval [0, 100]. [a] and [b] have unlimited range,
     * but are generally in [-100, 100]
     */
    fun lab(l: Double, a: Double, b: Double): TextStyle = TextColors.lab(l, a, b, level)

    /**
     * Create a [TextStyle] with a foreground of [color], downsampled to a given [level].
     *
     * It's usually easier to use a function like [rgb] or [hsl] instead.
     */
    fun color(color: Color): TextStyle = TextColors.color(color, level)

// TODO

//    /**
//     * Create an ANSI code to move the cursor up [count] cells.
//     *
//     * If ANSI codes are not supported, or [count] is 0, an empty string is returned.
//     * If [count] is negative, the cursor will be moved down instead.
//     */
//    fun cursorUp(count: Int): String = moveCursor(if (count < 0) "B" else "A", abs(count))
//
//    /**
//     * Create an ANSI code to move the cursor down [count] cells.
//     *
//     * If ANSI codes are not supported, or [count] is 0, an empty string is returned.
//     * If [count] is negative, the cursor will be moved up instead.
//     */
//    fun cursorDown(count: Int): String = moveCursor(if (count < 0) "A" else "B", abs(count))
//
//    /**
//     * Create an ANSI code to move the cursor left [count] cells.
//     *
//     * If ANSI codes are not supported, or [count] is 0, an empty string is returned.
//     * If [count] is negative, the cursor will be moved right instead.
//     */
//    fun cursorLeft(count: Int): String = moveCursor(if (count < 0) "C" else "D", abs(count))
//
//    /**
//     * Create an ANSI code to move the cursor right [count] cells.
//     *
//     * If ANSI codes are not supported, or [count] is 0, an empty string is returned.
//     * If [count] is negative, the cursor will be moved left instead.
//     */
//    fun cursorRight(count: Int): String = moveCursor(if (count < 0) "D" else "C", abs(count))
//
//    /**
//     * Create an ANSI code to hide the cursor.
//     *
//     * If ANSI codes are not supported, an empty string is returned.
//     */
//    val hideCursor: String get() = if (level == AnsiLevel.NONE) "" else "$CSI?25l"
//
//    /**
//     * Create an ANSI code to show the cursor.
//     *
//     * If ANSI codes are not supported, an empty string is returned.
//     */
//    val showCursor: String get() = if (level == AnsiLevel.NONE) "" else "$CSI?25h"
//
//    private fun moveCursor(dir: String, count: Int): String {
//        return if (count == 0 || level == AnsiLevel.NONE) ""
//        else "$CSI$count$dir"
//    }

    private fun downsample(style: TextStyleContainer): TextStyle =
            if (level == AnsiLevel.NONE) DEFAULT_STYLE else style.style
}
