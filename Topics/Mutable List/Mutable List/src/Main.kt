fun names(namesList: List<String>): List<String> {
    var count: Int
    val nameCount = mutableListOf<String>()
    val newNameList = namesList.distinct()
    for (name in newNameList) {
        count = namesList.count { it == name }
        nameCount.add("The name $name is repeated $count times")
    }
    return nameCount
}