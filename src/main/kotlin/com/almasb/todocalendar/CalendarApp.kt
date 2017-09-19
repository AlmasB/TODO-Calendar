package com.almasb.todocalendar

import javafx.application.Application
import javafx.collections.FXCollections
import javafx.scene.Parent
import tornadofx.*
import java.time.LocalDate
import javafx.scene.control.DatePicker
import com.sun.javafx.scene.control.skin.DatePickerSkin
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.layout.BorderPane



/**
 *
 *
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
class CalendarApp : App(CalendarView::class)

class CalendarView : View() {
    override val root: Parent = borderpane {

        center {
            hbox {
                paddingAll = 15

                listview(FXCollections.observableArrayList<String>())

                val datePickerSkin = DatePickerSkin(DatePicker(LocalDate.now()))
                add(datePickerSkin.popupContent)
            }
        }
    }
}

fun main(args: Array<String>) {
    Application.launch(CalendarApp::class.java)
}