package search

import java.io.File

enum class Strategy(val type: String) {
    ALL("all"),
    ANY("any"),
    NONE("none");
}

fun findStrategy(str: String): Strategy {
    for (strategy in Strategy.values()) {
        if (str.lowercase() == strategy.type) return strategy
    }
    return Strategy.ALL
}

fun processMenu(lines: MutableList<String>, where: MutableMap<String, MutableList<Int>>) {
    when (readln().toInt()) {
        1 -> showStrategiesMenu(lines, where)
        2 -> printAllPeople(lines, where)
        0 -> sayGoodBay().also { return }
        else -> {
            println("Incorrect option! Try again.")
            showMenu(lines, where)
        }
    }

}

fun compareIndices(xList: MutableList<Int>, yList: MutableList<Int>): MutableList<Int> {
    val matched = mutableListOf<Int>()

    x@ for (x in xList) {
        y@ for (y in yList) {
            if (x == y) {
                matched.add(x)
                continue@x
            }
        }
    }

    return matched
}

fun findAllWordsPerson(lines: MutableList<String>, where: MutableMap<String, MutableList<Int>>) {
    println("Enter a name or email to search all suitable people.")
    val what = readln().split(" ").map { it.lowercase() }

    val filtered = where.filter { (key, _) ->
        what.contains(key.lowercase())
    }

    if (filtered.size == what.size) {
        var matched = mutableListOf<Int>()

        val filteredIter = filtered.iterator()
        if (filtered.size > 1) {
            while (filteredIter.hasNext()) {
                matched.addAll(compareIndices(filteredIter.next().value, filteredIter.next().value))
            }
        } else {
            matched = filteredIter.next().value
        }

        matched.forEach {
            println(lines[it])
        }
    } else {
        println("No matching people found.")
    }

    showMenu(lines, where)

}

fun findAnyWordsPerson(lines: MutableList<String>, where: MutableMap<String, MutableList<Int>>) {
    println("Enter a name or email to search all suitable people.")
    val what = readln().split(" ").map { it.lowercase() }

    val filtered = where.filter { (key, _) ->
        what.contains(key.lowercase())
    }

    if (filtered.isNotEmpty()) {
        var matched = mutableListOf<Int>()
        filtered.forEach { (_, v) ->
            matched.addAll(v)
        }
        matched = matched.distinct().toMutableList()
        println("${matched.size} persons found:")
        matched.forEach {
            println(lines[it])
        }
    } else {
        println("No matching people found.")
    }
    showMenu(lines, where)

}

fun findNoneWordsPerson(lines: MutableList<String>, where: MutableMap<String, MutableList<Int>>) {
    println("Enter a name or email to search all suitable people.")
    val what = readln().split(" ").map { it.lowercase() }

    val exclude = mutableListOf<Int>()
    where.forEach { (k, v) ->
        if (k.lowercase() in what) {
            exclude.addAll(v)
        }
    }

    if (lines.size > 0) {
        for (i in lines.indices) {
            if (i !in exclude) println(lines[i])
        }
    } else {
        println("No matching people found.")
    }
    showMenu(lines, where)
}

fun printAllPeople(lines: MutableList<String>, where: MutableMap<String, MutableList<Int>>) {
    for (people in lines) {
        println(people)
    }
    showMenu(lines, where)
}

fun showMenu(lines: MutableList<String>, where: MutableMap<String, MutableList<Int>>) {
    println("=== Menu ===")
    println("1. Find a person")
    println("2. Print all people")
    println("0. Exit")
    processMenu(lines, where)
}

fun showStrategiesMenu(lines: MutableList<String>, where: MutableMap<String, MutableList<Int>>) {
    println("Select a matching strategy: ALL, ANY, NONE")
    val strategy = readln().lowercase()
    when (findStrategy(strategy)) {
        Strategy.ALL -> findAllWordsPerson(lines, where)
        Strategy.ANY -> findAnyWordsPerson(lines, where)
        Strategy.NONE -> findNoneWordsPerson(lines, where)
    }
}

fun sayGoodBay() {
    println("Bye!")
}


fun main(args: Array<String>) {
    if (args.contains("--data")) {
        //val lines = readln().split(',').toMutableList()
        val lines = File(args[1]).readLines().toMutableList()
        val where = mutableMapOf<String, MutableList<Int>>()
        for (line in lines) {
            line.split(' ').forEach {
                if (!where.containsKey(it)) {
                    where[it] = mutableListOf(lines.indexOf(line))
                } else {
                    where[it]?.add(lines.indexOf(line))
                }
            }
        }
        showMenu(lines, where)
    }
}
