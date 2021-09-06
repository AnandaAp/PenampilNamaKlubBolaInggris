fun main() {
    val clubs = arrayListOf<String>()
    val limit = addListOfClub(clubs)
    showClassement(clubs,limit)
}

fun showClassement(clubs: ArrayList<String>,limit: Int) {
    println("Premiere League Classement")
    for (i in 0..limit){
        val tempRank = i+1
        println("$tempRank. ${clubs[i]}")
        print("Class : ")
        val showclubs = { _: ArrayList<String> ->
            when(i){
                in 0..9 -> "Top Tier"
                in 10..14 -> "Black Horse"
                in 15..limit -> "Beware of Degradation"
                else -> false
            }
        }
        val result = showclubs(clubs)
        println(result)
    }
    println("Tampilkan berdasarkan: ")
    println("1. Top tier")
    println("2. Black Horse")
    println("3. Beware of Degradation")
    print("Pilihanmu : ")
    val pilihan = readLine()
    sortList(pilihan?.toInt(),clubs,limit)
}

fun addListOfClub(clubs: ArrayList<String>): Int {
    clubs.add("Tottenham Hotspur")
    clubs.add("West Ham United")
    clubs.add("Manchester United")
    clubs.add("Chelsea")
    clubs.add("Liverpool")
    clubs.add("Everton")
    clubs.add("Manchester City")
    clubs.add("Brighton & Hove Albion")
    clubs.add("Leicester City")
    clubs.add("Brentford")
    clubs.add("Aston Villa")
    clubs.add("Watford")
    clubs.add("Southampton")
    clubs.add("Crystal Palace")
    clubs.add("Leeds United")
    clubs.add("Burnley")
    clubs.add("New Castle")
    clubs.add("Wolverhampton Wanderers")
    clubs.add("Norwich City")
    clubs.add("Arsenal")
    return clubs.size-1
}

fun sortList(pilihan: Int?, clubs: ArrayList<String>, limit: Int) {
    when(pilihan){
        1 -> showTopTier(clubs,limit)
        2 -> showBlackHorse(clubs,limit)
        3 -> showDegrade(clubs,limit)
    }

}

fun showTopTier(clubs: ArrayList<String>, limit: Int) {
    for (i in 0..limit) {
        val rank = i+1
        if(rank < 11){
            println("$rank. ${clubs[i]}")
        }
    }
}

fun showBlackHorse(clubs: ArrayList<String>, limit: Int) {
    for (i in 0..limit) {
        val rank = i+1
        if(rank in 11..15){
            println("$rank. ${clubs[i]}")
        }
    }
}

fun showDegrade(clubs: java.util.ArrayList<String>, limit: Int) {
    for (i in 0..limit) {
        val rank = i+1
        if(rank in 16..limit){
            println("$rank. ${clubs[i]}")
        }
    }
}
