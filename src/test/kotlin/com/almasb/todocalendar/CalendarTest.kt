package com.almasb.todocalendar

import org.hamcrest.CoreMatchers.*
import org.hamcrest.MatcherAssert.*
import org.junit.jupiter.api.Test

/**
 *
 *
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
class CalendarTest {

    @Test
    fun `Assign a TODO item to a day`() {
        val calendar = Calendar()
        val item = TODOItem()

        calendar.addTODOItem(item)
        assertThat(calendar.items, hasItem(item))
    }
}