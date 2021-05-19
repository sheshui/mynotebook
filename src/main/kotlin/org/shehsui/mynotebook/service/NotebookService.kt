package org.shehsui.mynotebook.service

import org.shehsui.mynotebook.entity.NoteEntity

interface NotebookService {
    fun getNoteList(): List<NoteEntity?>
    fun saveNote(note: NoteEntity?): NoteEntity
}