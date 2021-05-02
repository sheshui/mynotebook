package org.shehsui.mynotebook

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ListController {
    @Value("\${profile.name}")
    lateinit var profileName: String

    @Value("\${profile.version}")
    lateinit var profileVer: String

    @GetMapping("/profile")
    fun profile(): String {
        return profileName + profileVer
    }

}