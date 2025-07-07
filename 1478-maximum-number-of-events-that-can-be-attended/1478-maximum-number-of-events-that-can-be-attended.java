import java.util.*;

class Solution {
    public static int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> {
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });

        TreeSet<Integer> availableDays = new TreeSet<>();
        for (int i = 1; i <= 100000; i++) {
            availableDays.add(i);
        }

        int count = 0;

        for (int[] event : events) {
            int start = event[0];
            int end = event[1];

            Integer day = availableDays.ceiling(start);

            if (day != null && day <= end) {
                count++;
                availableDays.remove(day);
            }
        }

        return count;
    }
}
