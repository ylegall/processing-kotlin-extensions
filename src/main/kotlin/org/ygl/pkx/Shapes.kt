package org.ygl.pkx

import processing.core.PApplet
import processing.core.PGraphics
import processing.core.PVector


fun <T: Number> PApplet.ellipse(positionX: T, positionY: T, radiusX: T, radiusY: T) {
    ellipse(positionX.toFloat(), positionY.toFloat(), radiusX.toFloat(), radiusY.toFloat())
}

fun <T: Number> PGraphics.circle(positionX: T, positionY: T, radius: T) {
    ellipse(positionX.toFloat(), positionY.toFloat(), radius.toFloat(), radius.toFloat())
}

fun <T: Number> PGraphics.circle(position: PVector, radius: T) {
    ellipse(position.x, position.y, radius.toFloat(), radius.toFloat())
}

fun <T: Number> PApplet.rect(positionX: T, positionY: T, width: T, height: T) {
    rect(positionX.toFloat(), positionY.toFloat(), width.toFloat(), height.toFloat())
}