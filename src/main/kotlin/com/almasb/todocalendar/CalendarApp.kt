package com.almasb.todocalendar

import javafx.application.Application
import javafx.collections.FXCollections
import javafx.scene.Parent
import tornadofx.*
import java.time.LocalDate
import javafx.scene.control.DatePicker
import com.sun.javafx.scene.control.skin.DatePickerSkin
import javafx.beans.binding.Bindings
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.layout.BorderPane
import java.util.concurrent.Callable


/**
 *
 *
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
class CalendarApp : App(CalendarView::class)

class CalendarView : View() {

    private val calendar by inject<Calendar>()
    private val items = FXCollections.observableArrayList<TODOItem>()

    override val root: Parent = borderpane {

        center {
            hbox {
                paddingAll = 15

                listview(items)

                vbox(spacing = 10, alignment = Pos.TOP_CENTER) {
                    val datePicker = DatePicker(LocalDate.now())
                    val datePickerSkin = DatePickerSkin(datePicker)
                    add(datePickerSkin.popupContent)

                    datePicker.valueProperty().addListener { _, _, day ->
                        items.setAll(calendar.getItemsForDay(day))
                    }

                    button("Add Item") {
                        action {
                            openInternalWindow(AddItemFragment::class)
                        }
                    }
                }
            }
        }
    }
}

class AddItemFragment : Fragment("Add Item") {
    override val root = vbox {

    }
}

fun main(args: Array<String>) {
    Application.launch(CalendarApp::class.java)
}