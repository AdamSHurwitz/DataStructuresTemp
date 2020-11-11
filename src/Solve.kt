import java.util.*

fun someFun(){
    val someString = "Some string"

    val someInt = 18

    val someDouble = 18.18

    val someBoxedArray = arrayOf("stringOne", "stringTwo", "stringThree")

    // More performant using primitive type vs. object
    val someUnboxedArray = charArrayOf('c')

    val someUnboxedNullArray = CharArray(18)

    val someTwoDArray = arrayOf(arrayOf("stringOne"), arrayOf("stringTwo"), arrayOf("stringThree"))

    val someArrayList = arrayListOf("stringOne", "stringTwo", "stringThree")

    val someLinkedList = LinkedList<SomeObject>()

    // Use for stacks and queues.
    val someArrayDeque = ArrayDeque<String>()

    // Use for min/max heap
    val somePriorityQueue = PriorityQueue<String>()

    val someHashMap = hashMapOf<String, Int>()

    // Use for binary search.
    val someTreeMap = TreeMap<String, Int>()

    val someHashSet = hashSetOf<String>()

}

class SomeObject(val someData: String)