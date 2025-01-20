fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val newList = list.filterNot { it > 2 }
    println(list) // Output: [1, 2, 3, 4, 5] (Original list unchanged)
    println(newList) // Output: [1, 2]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    val newSet = set.filterNot { it > 2 }
    println(set) // Output: [1, 2, 3, 4, 5] (Original set unchanged)
    println(newSet) // Output: [1, 2]

    //Alternative using toMutableSet()
    val set2 = mutableSetOf<Int>(1,2,3,4,5)
    val filteredSet2 = set2.toMutableSet().also { it.removeIf { it > 2 } }
    println(set2) // Original set unchanged
    println(filteredSet2) // Filtered set
} 