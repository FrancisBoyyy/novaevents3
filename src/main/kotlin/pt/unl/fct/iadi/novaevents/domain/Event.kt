package pt.unl.fct.iadi.novaevents.domain

import java.time.LocalDate

class Event(
    val id: Long,
    val clubId: Long,
    val name: String,
    val date: LocalDate,
    val location: String,
    val description: String
) {
}