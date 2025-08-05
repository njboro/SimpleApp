package com.example.simpleapp

fun main() {
    //sortedBySalary()
    //sortedBySalaryThenByName()
    //sortByDescendingOrder()
    //sortedBySalaryThenByNameDescending()
    //sortedBySalaryDescendingThenByName()
    //findCount()
    //findDeciBinaryIntList(855)
    //findDuplicateItemsInAList()
    //removeDuplicateItemsFromListDistinct()
    //removeDuplicatesSet()
    //removeDuplicatesWithoutInBuiltFunction()
    //removeDuplicateUsingHashSet()
    //removeDuplicateItemsUsingHashMap()
    printDuplicateItemsWithCountUsingHashMap()
}

//Option 1: Non-mutating (sortedBy)
fun sortedBySalary() {
    val sortedList = getSampleList().sortedBy { it.salary }
    sortedList.forEach {
        println("${it.name} earns ${it.salary}")
    }
}

//Option 2: sortedWith
fun sortedBySalaryThenByName() {
    val sortedList = getSampleList().sortedWith(compareBy<Person> {
        it.salary
    }.thenBy { it.name })
    sortedList.forEach {
        println("${it.name} earns ${it.salary}")
    }
}

//Option 3: sortByDescending or sortByAscending
fun sortByDescendingOrder() {
    val sortedList = getSampleList().sortedByDescending { it.salary }
    sortedList.forEach {
        println("${it.name} earns ${it.salary}")
    }
}

//Option 4: sortBySalaryThenByNameDescending
fun sortedBySalaryThenByNameDescending() {
    val sortedList = getSampleList().sortedWith(compareBy<Person> {
        it.salary
    }.thenByDescending { it.name })
    sortedList.forEach {
        println("${it.name} earns ${it.salary}")
    }
}

//Option 5: sortedWith
fun sortedBySalaryDescendingThenByName() {
    val sortedList = getSampleList().sortedWith(compareByDescending<Person> {
        it.salary
    }.thenBy { it.name })
    sortedList.forEach {
        println("${it.name} earns ${it.salary}")
    }
}


fun getSampleList(): List<Person> {

    val list = mutableListOf<Person>()

    list.add(Person("Nabajyoti", 10000))
    list.add(Person("Siva", 20000))
    list.add(Person("Divya", 30000))
    list.add(Person("Deepak", 15000))
    list.add(Person("Rajat", 16000))
    list.add(Person("Rama", 20000))

    return list
}


//find 0 and 1
fun findCount() {
    val arrayOFData = arrayOf(1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0)
    val mapper = arrayOFData.groupBy { it }.mapValues { (_, value) -> value.size }
    println (mapper)
}

//Find deci-binary numbers
fun findDeciBinaryIntList(n: Int) {
    val digits = n.toString().map { it - '0' }
    val maxDigit = digits.max()
    val result = mutableListOf<Int>()

    for (i in 0 until maxDigit) {
        val sb = StringBuilder()
        for(d in digits) {
            sb.append(if ( d > 1) '1' else '0')
        }
        result.add(sb.toString().toInt())
    }

    println(result)
}

fun findDuplicateItemsInAList() {
    val list = listOf(1,2,3,4,2,4,5,6,7,8,9,7,6,2)

    val map = mutableMapOf<Int,Int>()

    for (i in list) {
        val count = map.getOrDefault(i, 0)
        map.put(i, count+1)
    }

    println(map)
}

/*To remove duplicate items from a list in Kotlin, you can use the distinct() function.
It returns a list containing only distinct elements.*/
fun removeDuplicateItemsFromListDistinct() {
    val list = listOf(1,2,3,4,2,4,5,6,7,8,9,7,6,2)

    val newList = list.distinct()

    println(newList)
}

/*
* If you're using a MutableList and want to mutate it in place, you can do something like
* */
fun removeDuplicatesSet() {
    val list = listOf(1,2,3,4,2,4,5,6,7,8,9,7,6,2)
    val unique = list.toSet().toMutableList()
    println("Removed duplicates using set:\n$unique")
}

/*
* The old-fashioned way — manually iterating and checking
* O(n^2)
* */
fun removeDuplicatesWithoutInBuiltFunction() {
    val list = listOf(1,2,3,4,2,4,5,6,7,8,9,7,6,2)
    val uniqueList = mutableListOf<Int>()

    for (item in list) {
        var isDuplicate = false
        for (uniqueItem in uniqueList) {
            if (item == uniqueItem) {
                isDuplicate = true
                break
            }
        }

        if (!isDuplicate) {
            uniqueList.add(item)
        }
    }
    println("Original list : $list")
    println("New list without inbuilt functions:\n $uniqueList")
}

/*
* Let’s give your code some caffeine and upgrade it to run in O(n) time using a HashSet
* */
fun removeDuplicateUsingHashSet() {
    val list = listOf(1, 2, 3, 4, 2, 4, 5, 6, 7, 8, 9, 7, 6, 2)
    val uniqueList = mutableListOf<Int>()
    val seen = mutableSetOf<Int>()

    for (item in list) {
        if (!seen.contains(item)) {
            seen.add(item)
            uniqueList.add(item)
        }
    }

    println("Original list: $list")
    println("Optimized list without duplicates: $uniqueList")
}
/*
* Remove duplicates using HashMap
* */
fun removeDuplicateItemsUsingHashMap() {
    val list = listOf(1, 2, 3, 3, 4, 2, 4, 5, 6, 7, 8, 9, 7, 6, 2)
    val uniqueList = mutableListOf<Int>()
    val myMap = mutableMapOf<Int, Boolean>()
    for (item in list) {
        if (myMap[item] == null) {
            myMap[item] = true
            uniqueList.add(item)
        } else {
            myMap[item] = false
        }
    }

    println("New list :\n$uniqueList")
    println("Duplicate numbers are:")
    println(myMap.filterValues { it }.keys)
}

/*
* Time Complexity O(n)
* */
fun printDuplicateItemsWithCountUsingHashMap() {
    val list = listOf(1, 2, 3, 3, 4, 2, 4, 5, 6, 7, 8, 9, 7, 6, 2)

    val myMap = mutableMapOf<Int, Int>()

    for (item in list) {
        if (myMap.containsKey(item)) {
            myMap[item] = myMap[item]!! + 1
        } else {
            myMap[item] = 1
        }
    }

    println("Duplicate items with count in the list:")
    for ((key, count) in myMap) {
        if (count > 1) {
            println("$key appears $count times")
        }
    }

    println("Duplicate items in the list")
    println("${myMap.filterValues { it > 1 }.keys}")

}


