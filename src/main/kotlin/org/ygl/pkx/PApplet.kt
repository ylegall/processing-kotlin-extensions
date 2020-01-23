package org.ygl.pkx

import processing.core.PApplet


inline fun <reified T: PApplet> launchApplet() {
    PApplet.main(T::class.java.canonicalName)
}