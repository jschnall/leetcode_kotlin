package dp

class OutOfBoundaryPaths {
    fun findPaths(m: Int, n: Int, maxMove: Int, startRow: Int, startColumn: Int): Int {
        var dp = Array(m) { IntArray(n) }

        // Init corners
        dp[0][0] = 2
        dp[m-1][0] = 2
        dp[0][n-1] = 2
        dp[m-1][n-1] = 2
        //Init edges
        for (i in 1 until m - 1) {
            dp[i][0] = 1
            dp[i][n-1] = 1
        }
        for (j in 1 until n - 1) {
            dp[0][j] = 1
            dp[m-1][j] = 1
        }

        // Update dp until maxMove is reached
        for (i in 1 until maxMove) {
            dp = nextDp(dp)
        }

        return dp[startRow][startColumn]
    }

    private fun nextDp(dp: Array<IntArray>): Array<IntArray> {
        val newDp = Array(dp.size) { IntArray(dp[0].size) }

        for (i in dp.indices) {
            for (j in dp[0].indices) {
                newDp[i][j] = dp[i][j]
                if (i > 0) {
                    newDp[i][j] += dp[i-1][j]
                }
                if (i < dp.size - 1) {
                    newDp[i][j] += dp[i+1][j]
                }
                if (j > 0) {
                    newDp[i][j] += dp[i][j-1]
                }
                if (j < dp[0].size - 1) {
                    newDp[i][j] += dp[i][j+1]
                }
            }
        }

        return newDp
    }
}