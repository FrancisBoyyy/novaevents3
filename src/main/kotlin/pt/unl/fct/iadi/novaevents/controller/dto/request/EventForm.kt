package pt.unl.fct.iadi.novaevents.controller.dto.request

import jakarta.validation.constraints.NotBlank
import org.hibernate.validator.constraints.Range
import pt.unl.fct.iadi.novaevents.domain.EventType
import java.time.LocalDate

data class EventForm(
    @field:NotBlank
    @field:Range(min = 1, max = 5, message = "Name must be between 1 and 5.")
    val clubId: Long,

    @field:NotBlank
    val name: String,

    @field:NotBlank
    val date: LocalDate,

    val location: String,

    @field:NotBlank
    val type: EventType,

    val description: String
) {
}