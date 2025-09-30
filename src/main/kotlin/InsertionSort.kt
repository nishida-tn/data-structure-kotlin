package br.com.thalesnishida.datastructure

class InsertionSort {
    fun insertionSort(arr: IntArray): IntArray {
        val n = arr.size
        for (i in 1 until n) {
            val key = arr[i]
            var j = i - 1
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]
                j -= 1
            }
            arr[j + 1] = key
        }
        return arr
    }

    fun runExample() {
        val arr = intArrayOf(12, 11, 13, 5, 6)
        val sortedArr = insertionSort(arr)
        println("Sorted array: ${sortedArr.joinToString(", ")}")
    }
}