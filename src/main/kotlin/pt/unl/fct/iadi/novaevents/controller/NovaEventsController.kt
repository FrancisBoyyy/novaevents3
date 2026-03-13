package pt.unl.fct.iadi.novaevents.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import pt.unl.fct.iadi.novaevents.service.NovaEventsService
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = arrayOf("/nv/events"), produces = [(MediaType.APPLICATION_JSON_VALUE)])
class NovaEventsController(private val service: NovaEventsService) {
}