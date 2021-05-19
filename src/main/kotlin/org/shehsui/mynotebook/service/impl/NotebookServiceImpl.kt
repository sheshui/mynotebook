package org.shehsui.mynotebook.service.impl

import lombok.extern.slf4j.Slf4j
import org.shehsui.mynotebook.entity.NoteEntity
import org.shehsui.mynotebook.repo.NoteRepo
import org.shehsui.mynotebook.service.NotebookService
import org.springframework.stereotype.Service

@Service
@Slf4j
class NotebookServiceImpl(
    val noteRepo: NoteRepo
) : NotebookService {


    override fun getNoteList(): List<NoteEntity?> {

        return noteRepo.findAll()

    }

    override fun saveNote(note: NoteEntity?): NoteEntity {
        if (note == null) {
            throw RuntimeException("请确认日及不为空")
        }
        return noteRepo.save(note)
    }
}