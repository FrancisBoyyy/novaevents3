package pt.unl.fct.iadi.novaevents.service

import org.springframework.stereotype.Service
import pt.unl.fct.iadi.novaevents.domain.Club
import pt.unl.fct.iadi.novaevents.domain.ClubCategory
import pt.unl.fct.iadi.novaevents.domain.Event
import java.util.concurrent.ConcurrentHashMap

@Service
class NovaEventsService {
    private val clubs = listOf<Club>(
        Club(
            1,
            "Chess Club",
            "Chess Club",
            ClubCategory.ACADEMIC
        ),
        Club(
            2,
            "Robotics Club",
            "The Robotics Club is the place to turn ideas into machines",
            ClubCategory.TECHNOLOGY
        ),
        Club(
            3,
            "Photography Club",
            "Photography Club",
            ClubCategory.ARTS
        ),
        Club(
            4,
            "Hiking & Outdoors Club",
            "Hiking & Outdoors Club",
            ClubCategory.SPORTS
        ),
        Club(
            5,
            "Film Society",
            "Film Society",
            ClubCategory.CULTURAL
        )
    )

    private val events = ConcurrentHashMap<Long, MutableList<Event>>(5)


}