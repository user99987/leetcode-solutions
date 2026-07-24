package popular

/**
 * Medium
 * Gas Station
 */
class GasStationK {

    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        var total = 0
        var tank = 0
        var start = 0
        for (i in gas.indices) {
            val balance = gas[i] - cost[i]
            tank += balance
            total += balance
            if (tank < 0) {
                tank = 0
                start = i + 1
            }
        }
        return if (total >= 0) start else -1
    }
}

