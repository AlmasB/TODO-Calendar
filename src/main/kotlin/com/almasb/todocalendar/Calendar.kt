package com.almasb.todocalendar

import java.time.LocalDate

/**
 *
 *
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
class Calendar {

    private val data = hashMapOf<LocalDate, MutableList<TODOItem>>()

    fun addTODOItem(day: LocalDate, item: TODOItem) {
        val items = data[day] ?: arrayListOf()
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