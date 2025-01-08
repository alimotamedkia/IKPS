package ir.anishehparsi.ikps

data class RpoData(
    val name:String,
    val description:String,
    val date:String,
    val image:Int
)

val RpoListData = listOf(
    RpoData(
        "Ali Motamedkia",
        "online",
        "online",
        R.drawable.ali
    ),
    RpoData(
        "Amin Sakha",
        "Master",
        "online",
        R.drawable.amin
    ),
    RpoData(
        "MFT Vanak",
        "Owner",
        "online",
        R.drawable.mft
    ),
    RpoData(
        "Hossein",
        "User & student",
        "at 18:28",
        R.drawable.hosein
    ),
    RpoData(
        "Sam Hatami",
        "User & student",
        "2025/01/05",
        R.drawable.sam
    ),
    RpoData(
        "Arshia",
        "User & student",
        "at 22:10",
        R.drawable.arshia
    ),
    RpoData(
        "Mahdiar",
        "User & student",
        "at 22:10",
        R.drawable.ic_launcher_foreground
    ),
    RpoData(
        "Shayan",
        "User & student",
        "at 22:10",
        R.drawable.ic_launcher_foreground
    ),
    RpoData(
        "(a)",
        "User & student",
        "at 22:10",
        R.drawable.ic_launcher_foreground
    )
)
