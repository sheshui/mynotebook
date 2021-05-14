package org.shehsui.mynotebook.entity

import org.shehsui.mynotebook.entity.base.BaseEntity
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "note")
data class NoteEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: String?,
    var type: String?,
    var date: Date?,
    var content: String?
) : BaseEntity() {
    constructor() : this(null, null, null, null) {

    }

}