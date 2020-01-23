package org.ygl.pkx

import processing.core.PApplet


fun <T: Number> PApplet.ellipse(positionX: T, positionY: T, radiusX: T, radiusY: T) {
    ellipse(positionX.toFloat(), positionY.toFloat(), radiusX.toFloat(), radiusY.toFloat())
}

fun <T: Number> PApplet.rect(positionX: T, positionY: T, width: T, height: T) {
    rect(positionX.toFloat(), positionY.toFloat(), width.toFloat(), height.toFloat())
}