package org.sheshui.mynotebook

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class StringController {
    @GetMapping("/funcI")
    fun func(@RequestParam str: String): String? {
        val st = StringUtil { str1: String? -> "$str is a String." }
        return st.format(str)
    }
}