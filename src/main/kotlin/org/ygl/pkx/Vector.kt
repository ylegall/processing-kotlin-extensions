package org.ygl.pkx

import processing.core.PVector


fun <T: Number> pvector(x: T, y: T) = PVector(x.toFloat(), y.toFloat())

fun pvector(vector: PVector) = vector.copy()

fun PVector.magnitudeSquared() = x * x + y * y

fun PVector.distanceSquared(other: PVector): Float {
    val dx = x - other.x
    val dy = y - other.y
    return dx * dx + dy * dy
}

operator fun <T: Number> PVector.times(scalar: T): PVector {
    val floatValue = scalar.toFloat()
    return PVector(x * floatValue, y * floatValue)
}

operator fun <T: Number> PVector.timesAssign(scalar: T) {
    val floatValue = scalar.toFloat()
    this.x *= floatValue
    this.y *= floatValue
}

operator fun PVector.plus(other: PVector) = PVector(x + other.x, y + other.y)

operator fun PVector.plusAssign(other: PVector) {
    this.x += other.x
    this.y += other.y
}

operator fun PVector.minus(other: PVector) = PVector(x - other.x, y - other.y)

operator fun PVector.minusAssign(other: PVector) {
    this.x -= other.x
    this.y -= other.y
}

operator fun <T: Number> PVector.div(scalar: T): PVector {
    val floatValue = scalar.toFloat()
    return PVector(x / floatValue, y / floatValue)
}

operator fun <T: Number> PVector.divAssign(scalar: T) {
    val floatValue = scalar.toFloat()
    this.x /= floatValue
    this.y /= floatValue
}