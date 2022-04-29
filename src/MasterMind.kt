package wordladder2

// RGBY, RWYM (1,1)
// RGBY, RWYY (2,0)
// RGRR, GRRW (1,2)
// WRGG, GGGW (1,2)
// REDGREENBLUE, REDGREENBLUE (12,0)
// YYYGRYYYYGRYYY, BPBPBPYYYYYYYY (6,2)


// This probably needs to be switched to do 2 passes, 1 for the first value returned, and then another for the second, without the ones that were part of the first answer
fun main(args: Array<String>) {
    println(buildHint("RGBY", "RWYM"))
    println(buildHint("RGBY", "RWYY"))
    println(buildHint("RGRR", "GRRW"))
    println(buildHint("WRGG", "GGGW"))
    println(buildHint("REDGREENBLUE", "REDGREENBLUE"))
    println(buildHint("YYYGRYYYYGRYYY", "BPBPBPYYYYYYYY"))
}

fun buildHint(secret: String, guess: String): Pair<Int, Int> {
    val set = secret.toSet()
    var notContains = 0
    var r1 = 0
    var r2 = 0

    for (i in secret.indices) {
        if (guess[i] == secret[i]) {
            r1++
        } else if (!set.contains(guess[i])) {
            notContains++
        }
    }
    r2 = secret.length - notContains - r1

    return Pair(r1, r2)
}