package com.almasb.todocalendar

/**
 *
 *
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
class Calendar {

    val items = arrayListOf<TODOItem>()

    fun addTODOItem(item: TODOItem) {
        items.add(item)
    }
}