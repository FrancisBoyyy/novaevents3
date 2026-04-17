package pt.unl.fct.iadi.novaevents.repository

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.User
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.provisioning.UserDetailsManager
import org.springframework.stereotype.Component
import pt.unl.fct.iadi.novaevents.domain.Club
import pt.unl.fct.iadi.novaevents.domain.Event
import pt.unl.fct.iadi.novaevents.domain.EventType
import pt.unl.fct.iadi.novaevents.domain.EventTypeRepository
import pt.unl.fct.iadi.novaevents.domain.enums.ClubCategory
import java.time.LocalDate

@Component
class DataInitializer(
    private val userDetailsManager: UserDetailsManager,
    private val passwordEncoder: PasswordEncoder
) : ApplicationRunner {
    override fun run(args: ApplicationArguments) {
        if (!userDetailsManager.userExists("alice")) {
            listOf(
                User("alice", passwordEncoder.encode("password123"), listOf(SimpleGrantedAuthority("ROLE_EDITOR"))),
                User("bob", passwordEncoder.encode("password123"), listOf(SimpleGrantedAuthority("ROLE_EDITOR"))),
                User("charlie", passwordEncoder.encode("password123"), listOf(SimpleGrantedAuthority("ROLE_ADMIN"))),
            ).forEach { userDetailsManager.createUser(it) }
        }
    }
}