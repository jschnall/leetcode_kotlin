package atm

// 2241. Design an ATM Machine
class ATM() {
    private val inventory = LongArray(5)

    fun deposit(banknotesCount: IntArray) {
        banknotesCount.forEachIndexed { index, count ->
            inventory[index] += count.toLong()
        }
    }

    fun withdraw(amount: Int): IntArray {
        val withdrawl = IntArray(5)

        var remainder = amount
        for (i in 4 downTo 0) {
            val count = remainder / getValue(i)
            withdrawl[i] += minOf(count.toLong(), inventory[i]).toInt()
            remainder -= withdrawl[i] * getValue(i)

            if (remainder < 0) {
                return intArrayOf(-1)
            }
            if (remainder == 0) {
                withdrawl.forEachIndexed { index, count ->
                    inventory[index] -= count.toLong()
                }
                return withdrawl
            }
        }

        if (remainder == 0) {
            withdrawl.forEachIndexed { index, count ->
                inventory[index] -= count.toLong()
            }
            return withdrawl
        }

        return intArrayOf(-1)
    }

    fun getValue(index: Int): Int {
        return when (index) {
            4 -> 500
            3 -> 200
            2 -> 100
            1 -> 50
            else -> 20
        }
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * var obj = ATM()
 * obj.deposit(banknotesCount)
 * var param_2 = obj.withdraw(amount)
 */