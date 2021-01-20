import java.util.*

fun someFun(){
    val someString = "Some string"

    val someInt = 18

    val someDouble = 18.18

    val someBoxedArray = arrayOf("stringOne", "stringTwo", "stringThree")

    // More performant using primitive type vs. object
    val someUnboxedArray = charArrayOf('c')

    val someUnboxedNullArray = CharArray(18)

    // Rows by columns
    val someTwoDArray = arrayOf(
            arrayOf("columnOne", "columnTwo"),
            arrayOf("columnOne", "columnTwo"),
            arrayOf("columnOne", "columnTwo")
    )
    val emptyTwoDArray = Array(3, { CharArray(3) })
    val anotherEmptyTwoDArray = Array(3) { CharArray(3) }

    val someArrayList = arrayListOf("stringOne", "stringTwo", "stringThree")

    val someLinkedList = LinkedList<SomeObject>()

    // Use for stacks and queues.
    val someArrayDeque = ArrayDeque<String>()

    // Use for min/max heap
    // Min
    val someMinPriorityQueue = PriorityQueue<String>()
    // Max
    val someMaxPriorityQueue = PriorityQueue<String>(Collections.reverseOrder())

    val someHashMap = hashMapOf<String, Int>()

    // Use for binary search.
    val someTreeMap = TreeMap<String, Int>()

    val someSet = setOf<String>()

    val someHashSet = hashSetOf<String>()

}

class SomeObject(val someData: String)