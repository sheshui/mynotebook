package org.shehsui.mynotebook.api

import org.shehsui.mynotebook.entity.NoteEntity
import org.shehsui.mynotebook.service.NotebookService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/note")
class NotebookController(
    val noteService: NotebookService
) {

    @PostMapping("/body")
    fun getBody(@RequestBody x: Any, @RequestBody y: Any): Unit {
        println(x.toString())
        println(y.toString())
    }

    @GetMapping
    fun getAll(): List<NoteEntity?> {
        return noteService.getNoteList()
    }

    @PostMapping
    fun save(@RequestBody note: NoteEntity?): NoteEntity {
        return noteService.saveNote(note)
    }
}