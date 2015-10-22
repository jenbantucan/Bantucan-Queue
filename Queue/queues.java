import java.util.*;
public class queues {
    public static void main (String[] args) {
        
      PriorityQueue<String> q = new PriorityQueue<>();
      
      q.offer("first");
      q.offer("second");
      q.offer("third");
      
      System.out.printf("%s ", q.peek());
      System.out.println();
      
      q.poll();
      System.out.printf("%s ", q);
    }
}
