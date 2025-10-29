package Leetcode;
import java.util.*;
public class code48 {
    public static void main(String[] args) {
        List<Integer> user = Arrays.asList(1, 1, 1);
        List<Integer> timestamp = Arrays.asList(0, 10, 65);
        int k = 2;

        List<Integer> res = getAllowedRequests(user,timestamp,k);
        System.out.println(res);
    }

    public static List<Integer> getAllowedRequests(List<Integer> user, List<Integer> timestamp, int k) {
        Map<Integer, Queue<Integer>> userRequests = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < user.size(); i++) {
            int uid = user.get(i);
            int time = timestamp.get(i);

            userRequests.putIfAbsent(uid, new LinkedList<>());
            Queue<Integer> queue = userRequests.get(uid);

            // Remove timestamps older than 60 seconds (strictly outside the 60-second window)
            while (!queue.isEmpty() && time - queue.peek() >= 60) {
                queue.poll();
            }

            if (queue.size() < k) {
                queue.offer(time);
                result.add(1); // request allowed
            } else {
                result.add(0); // request denied
            }
        }

        return result; // <-- fixed: return the result list
    }

}
