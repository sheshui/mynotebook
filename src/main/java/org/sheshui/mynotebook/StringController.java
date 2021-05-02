package org.sheshui.mynotebook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class StringController {
    @GetMapping("/funcI")
    public String func(@RequestParam String str) {
        StringUtil st = str1 -> str1 + " is a String.";
        return st.format(str);
    }
}