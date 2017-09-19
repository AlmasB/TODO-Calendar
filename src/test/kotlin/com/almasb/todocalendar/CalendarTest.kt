package com.almasb.todocalendar

import org.hamcrest.CoreMatchers.*
import org.hamcrest.MatcherAssert.*
import org.junit.jupiter.api.Test
import java.time.LocalDate

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

        val day = LocalDate.now()

        calendar.addTODOItem(day, item)
        assertThat(calendar.getItemsForDay(day), hasItem(item))
    }
}