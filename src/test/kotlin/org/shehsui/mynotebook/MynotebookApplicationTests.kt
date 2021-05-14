package org.shehsui.mynotebook

import org.junit.jupiter.api.Test
import java.util.*
import java.util.concurrent.TimeUnit

//@SpringBootTest
class MynotebookApplicationTests {

    @Test
    fun contextLoads() {
        val date = DateUtils.add(Date(), 5, TimeUnit.DAYS)
        println(date)
    }

}
