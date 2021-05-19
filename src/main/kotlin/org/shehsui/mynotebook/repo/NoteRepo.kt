package org.shehsui.mynotebook.repo

import org.shehsui.mynotebook.entity.NoteEntity
import org.springframework.data.jpa.repository.JpaRepository

interface NoteRepo : JpaRepository<NoteEntity, Int>
