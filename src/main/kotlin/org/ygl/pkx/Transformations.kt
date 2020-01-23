package org.ygl.pkx

import processing.core.PApplet
import processing.core.PApplet.radians


inline fun PApplet.withTransform(block: PApplet.() -> Unit) {
    pushMatrix()
    block()
    popMatrix()
}

fun <T: Number> PApplet.translate(x: T, y: T) {
    translate(x.toFloat(), y.toFloat())
}

fun <T: Number> raidans(degrees: T) = radians(degrees.toFloat())