package company.barnhouse.repo

import company.barnhouse.R

object Repo {
    fun getHouses(): List<Houses> {
        return listOf(
            Houses(1, "Barnhouse L88", R.drawable.houseone),
            Houses(2, "Barnhouse L88", R.drawable.housetwo),
            Houses(3, "Barnhouse X101", R.drawable.housethree),
            Houses(4, "Barnhouse L88", R.drawable.houseone),
            Houses(5, "Barnhouse L88", R.drawable.housetwo),
            Houses(6, "Barnhouse X101", R.drawable.housethree),
            Houses(7, "Barnhouse L88", R.drawable.houseone),
            Houses(8, "Barnhouse L88", R.drawable.housetwo),
            Houses(9, "Barnhouse X101", R.drawable.housethree),

        )
    }
}