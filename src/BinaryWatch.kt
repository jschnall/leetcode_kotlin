fun readBinaryWatch(turnedOn: Int): List<String> {
    val result = mutableListOf<String>()

    for (i in 0 .. 11) {
        for (j in 0 .. 59) {
            val count = Integer.toBinaryString(i).count { it == '1' } + Integer.toBinaryString(j).count { it == '1' }
            if (count == turnedOn) {
                if (j < 10) {
                    result.add("$i:0$j")
                } else {
                    result.add("$i:$j")
                }
            }
        }
    }
    return result
}