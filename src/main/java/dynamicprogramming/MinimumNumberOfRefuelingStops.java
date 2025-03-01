package dynamicprogramming;

import java.util.PriorityQueue;

/**
 * Hard
 * <p>
 * A car travels from a starting position to a destination which is target miles east of the starting position.
 * <p>
 * There are gas stations along the way. The gas stations are represented as an array stations where stations[i] = [positioni, fueli] indicates that the ith gas station is positioni miles east of the starting position and has fueli liters of gas.
 * <p>
 * The car starts with an infinite tank of gas, which initially has startFuel liters of fuel in it. It uses one liter of gas per one mile that it drives. When the car reaches a gas station, it may stop and refuel, transferring all the gas from the station into the car.
 * <p>
 * Return the minimum number of refueling stops the car must make in order to reach its destination. If it cannot reach the destination, return -1.
 * <p>
 * Note that if the car reaches a gas station with 0 fuel left, the car can still refuel there. If the car reaches the destination with 0 fuel left, it is still considered to have arrived.
 * <p>
 * Example 1:
 * <p>
 * Input: target = 1, startFuel = 1, stations = []
 * <p>
 * Output: 0
 * <p>
 * Explanation: We can reach the target without refueling.
 * <p>
 * Example 2:
 * <p>
 * Input: target = 100, startFuel = 1, stations = [[10,100]]
 * <p>
 * Output: -1
 * <p>
 * Explanation: We can not reach the target (or even the first gas station).
 * <p>
 * Example 3:
 * <p>
 * Input: target = 100, startFuel = 10, stations = [[10,60],[20,30],[30,30],[60,40]]
 * <p>
 * Output: 2
 * <p>
 * Explanation: We start with 10 liters of fuel. We drive to position 10, expending 10 liters of fuel.
 * <p>
 * We refuel from 0 liters to 60 liters of gas.
 * <p>
 * Then, we drive from position 10 to position 60 (expending 50 liters of fuel),
 * <p>
 * and refuel from 10 liters to 50 liters of gas. We then drive to and reach the target.
 * <p>
 * We made 2 refueling stops along the way, so we return 2.
 * <p>
 * Constraints:
 * <p>
 * 1 <= target, startFuel <= 109
 * 0 <= stations.length <= 500
 * 0 <= positioni <= positioni+1 < target
 * 1 <= fueli < 109
 */
public class MinimumNumberOfRefuelingStops {


    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int fuel = startFuel, stops = 0, index = 0;

        while (fuel < target) {
            while (index < stations.length && stations[index][0] <= fuel) {
                pq.offer(stations[index++][1]);
            }
            if (pq.isEmpty()) return -1;
            fuel += pq.poll();
            stops++;
        }
        return stops;
    }
}
