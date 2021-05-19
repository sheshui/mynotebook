package org.shehsui.mynotebook.entity.base

import org.shehsui.mynotebook.DateUtils
import java.util.*
import javax.persistence.*

@MappedSuperclass
open class BaseEntity {
    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private var createTime: Date? = null

    @Column(name = "update_time")
    @Temporal(TemporalType.TIMESTAMP)
    private var updateTime: Date? = null

    @PrePersist
    open fun prePersist(): Unit {
        val now = DateUtils.now()
        if (createTime == null) {
            createTime = now
        }
        if (updateTime == null) {
            updateTime = now
        }
    }
}
