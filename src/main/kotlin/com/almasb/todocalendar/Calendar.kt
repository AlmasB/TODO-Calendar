package com.almasb.todocalendar

import javafx.collections.FXCollections
import javafx.collections.ObservableList
import tornadofx.ViewModel
import java.time.LocalDate

/**
 *
 *
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
class Calendar : ViewModel() {

    private val data = hashMapOf<LocalDate, ObservableList<TODOItem>>()

    fun addTODOItem(day: LocalDate, item: TODOItem) {
        val items = data[day] ?: FXCollections.observableArrayList()
        items.add(item)

        data[day] = items
    }

    fun getItemsForDay(day: LocalDate): List<TODOItem> {
        return data[day] ?: emptyList()
    }

    fun removeTODOItem(day: LocalDate, item: TODOItem) {
        data[day]?.remove(item)
    }
}