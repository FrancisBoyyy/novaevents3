package pt.unl.fct.iadi.novaevents.domain

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import pt.unl.fct.iadi.novaevents.domain.enums.AppRole
import pt.unl.fct.iadi.novaevents.domain.enums.ClubCategory
import java.awt.desktop.AppEvent

@Entity
class AppUser(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(unique = true)
    var username: String? = null,

    var password: String? = null,

    @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    var roles: MutableSet<AppRole> = mutableSetOf<AppRole>()
) {}