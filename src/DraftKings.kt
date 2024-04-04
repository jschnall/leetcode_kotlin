fun main(args: Array<String>) {
    DiscountValidator.validateDiscounts(/*TODO*/)
}

class DiscountValidator {

    /**
     * Determines whether or not a list of assignment discounts are valid
     * @param assignedDiscounts A list of DiscountAssignments that contain a mapping between discountId and customerId
     * @param customers A list of customers of the super store
     * @param discounts A list of discounts that are available to offer to customers of the super store
     * @return True/False based on whether the discount assignments are valid
     */
    fun validateDiscounts(assignedDiscounts: List<DiscountAssignment>, customers: List<Customer>, discounts: List<Discount>): Boolean {
        val discountMap = discounts.associateBy { it.discountId }
        val customerMap = customers.associateBy { it.customerId }

        val map = mutableMapOf<Int, MutableSet<Int>>()
        val usedDiscounts = mutableSetOf<Int>()
        assignedDiscounts.forEach { assignedDiscount ->
            map[assignedDiscount.customerId] = (map[assignedDiscount.customerId] ?: mutableSetOf()).also { it.add(assignedDiscount.discountId)}
            usedDiscounts.add(assignedDiscount.discountId)
        }

        if (map.values.maxByOrNull { it.size }!!.size > 3) return false
        if (usedDiscounts.size < discounts.size) return false

        val spendAndDiscounts = mutableSetOf<Pair<Float, Float>>()
        map.forEach { entry ->
            val yearlySpend = customerMap[entry.key]!!.yearlySpend
            val totalDiscount = entry.value.map { discountMap[it]!!.value }.sum()

            if (totalDiscount > yearlySpend * 0.2) return false

            spendAndDiscounts.add(Pair(yearlySpend, totalDiscount))
        }

        val list = spendAndDiscounts.sortedWith(compareBy<Pair<Float, Float>> { it.first }.thenBy { it.second }).toList()
        for (i in 1 until list.size) {
            if (list[i].second >= list[i - 1].second)
                return false
        }

        return false
    }
}

data class Customer(
    val customerId: Int,
    val yearlySpend: Float
)

data class Discount(
    val discountId: Int,
    val productId: Int,
    val value: Float
)

data class DiscountAssignment(
    val discountId: Int,
    val customerId: Int
)