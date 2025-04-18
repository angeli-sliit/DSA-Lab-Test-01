package Q5;

public class ReverseFirstK {

    public static void main(String[] args) {
        QueueX queue = new QueueX(10);
        StackX stack = new StackX(10);

        // Sample Queue: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        for (int i = 1; i <= 6; i++) {
            queue.insert(i);
        }

        int k = 3;

        // Step 1: Push first k elements to stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }

        // Step 2: Enqueue stack elements back to queue
        while (!stack.isEmpty()) {
            queue.insert(stack.pop());
        }

        // Step 3: Move the remaining (n - k) elements to the back
        int size = 6; // original queue size
        for (int i = 0; i < size - k; i++) {
            queue.insert(queue.remove());
        }

        // Display result
        System.out.print("Queue after reversing first " + k + " elements: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
    }
}
