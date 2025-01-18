package ir.anishehparsi.ikps

data class RpoData(
    val name: String,
    val image: Int,

    )

val RpoListData = listOf(
    RpoData(
        "Saturday",
        R.drawable.sat

    ),
    RpoData(
        "Sunday",
        R.drawable.sun

    ),
    RpoData(
        "Monday",
        R.drawable.mon

    ),
    RpoData(
        "Tuesday",
        R.drawable.tue

    ),
    RpoData(
        "Wednesday",
        R.drawable.wed

    ),
    RpoData(
        "Thursday",
        R.drawable.thu

    ),
    RpoData(
        "Friday",
        R.drawable.fri

    ),

    )
