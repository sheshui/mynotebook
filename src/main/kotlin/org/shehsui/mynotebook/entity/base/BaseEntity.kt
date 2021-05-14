package org.shehsui.mynotebook.entity.base

import org.shehsui.mynotebook.DateUtils
import java.util.*
import javax.persistence.*

@MappedSuperclass
open class BaseEntity(

    @Column(name = "create_time") @Temporal(TemporalType.TIMESTAMP) var createTime: Date?,

    @Column(name = "update_time") @Temporal(TemporalType.TIMESTAMP) var updateTime: Date?
) {
    constructor() : this(null, null)

    @PrePersist
    fun prePersist(): Unit {
        val now = DateUtils.now()
        if (createTime == null) {
            createTime = now
        }
        if (updateTime == null) {
            updateTime = now
        }
    }
}
