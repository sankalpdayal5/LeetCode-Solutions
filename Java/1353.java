class Solution {
    public int maxEvents(int[][] events) {
        int Count = 0;
        int i = 0;
        int n = events.length;
        Arrays.sort(events, (e1, e2) -> Integer.compare(e1[0], e2[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int d=1; d<=100000; d++) {
            while (i<n && events[i][0] == d)
                pq.add(events[i++][1]);
            while (!pq.isEmpty() && pq.peek() < d)
                pq.poll();
            if (!pq.isEmpty()) {
                Count += 1;
                pq.poll();
            }
        }
        return Count;
        
    }
}
