package org.shehsui.mynotebook

import org.apache.commons.lang3.time.DateUtils
import org.springframework.util.Assert
import java.util.*
import java.util.concurrent.TimeUnit

object DateUtils {

    /**
     * get current date
     * @return current date
     */
    fun now(): Date {
        return Date()
    }

    fun add(date: Date, time: Long?, timeUnit: TimeUnit): Date {
        Assert.isTrue(time!! >= 0, "Addition time must not be less than 1")
        val result: Date
        val timeIntValue: Int =
            if (time > Int.MAX_VALUE) {
                Int.MAX_VALUE
            } else {
                time.toInt()
            }

        result = when (timeUnit) {
            TimeUnit.DAYS -> DateUtils.addDays(date, timeIntValue)
            TimeUnit.HOURS -> DateUtils.addHours(date, timeIntValue)
            TimeUnit.MINUTES -> DateUtils.addMinutes(date, timeIntValue)
            TimeUnit.SECONDS -> DateUtils.addSeconds(date, timeIntValue)
            TimeUnit.MILLISECONDS -> DateUtils.addMilliseconds(date, timeIntValue)
            else -> date
        }

        return result
    }
}