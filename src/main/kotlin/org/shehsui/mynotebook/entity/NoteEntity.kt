package org.shehsui.mynotebook.entity

import org.shehsui.mynotebook.DateUtils
import org.shehsui.mynotebook.entity.base.BaseEntity
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "note")
class NoteEntity : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null

    var type: String? = null

    @Temporal(TemporalType.DATE)
    var date: Date? = null

    var content: String? = null

    override fun prePersist() {
        super.prePersist()
        if (date == null) {
            date = DateUtils.now()
        }
    }
}