package br.com.thalesnishida.datastructure

class MergeSort {
    fun mergeSort(arr: IntArray) : IntArray {
        if(arr.size <= 1) return arr

        val middle = arr.size / 2
        val left = arr.copyOfRange(0, middle)
        val right = arr.copyOfRange(middle, arr.size)

        return merge(mergeSort(left), mergeSort(right))
    }

    fun merge(left: IntArray, right: IntArray) : IntArray {
        var i = 0
        var j = 0
        val result = mutableListOf<Int>()

        while(i < left.size && j < right.size) {
            if(left[i] <= right[j]) {
                result.add(left[i])
                i++
            } else {
                result.add(right[j])
                j++
            }
        }

        while (i < left.size) {
            result.add(left[i])
            i++
        }
        while (j < right.size) {
            result.add(right[j])
            j++
        }

        return result.toIntArray()
    }

    fun runExample() {
        val arr = intArrayOf(38, 27, 43, 3, 9, 82, 10)
        val sortedArr = mergeSort(arr)
        println("Sorted Array: ${sortedArr.joinToString(", ")}")
    }
}