package pt.unl.fct.iadi.novaevents.domain

class Club(
    val id: Long,
    val name: String,
    val description: String,
    val category: ClubCategory
) {
}