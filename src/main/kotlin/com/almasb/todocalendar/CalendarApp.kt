package com.almasb.todocalendar

import javafx.application.Application
import javafx.scene.Parent
import tornadofx.App
import tornadofx.View
import tornadofx.borderpane

/**
 *
 *
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
class CalendarApp : App(CalendarView::class) {
}

class CalendarView : View() {
    override val root: Parent = borderpane()
}

fun main(args: Array<String>) {
    Application.launch(CalendarApp::class.java)
}