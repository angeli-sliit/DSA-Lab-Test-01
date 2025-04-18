package Q6;

public class InterleaveQueue {

    public static void main(String[] args) {
        QueueX queue = new QueueX(10);
        StackX stack = new StackX(10);

        // Sample Queue: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        for (int i = 1; i <= 6; i++) {
            queue.insert(i);
        }

        int half = 6 / 2;

        // Step 1: Push first half into stack
        for (int i = 0; i < half; i++) {
            stack.push(queue.remove());
        }

        // Step 2: Enqueue back stack items (reversed first half)
        while (!stack.isEmpty()) {
            queue.insert(stack.pop());
        }

        // Step 3: Move first half (reversed) to the back
        for (int i = 0; i < half; i++) {
            queue.insert(queue.remove());
        }

        // Step 4: Push first half (original order now) into stack again
        for (int i = 0; i < half; i++) {
            stack.push(queue.remove());
        }

        // Step 5: Interleave stack and queue
        for (int i = 0; i < half; i++) {
            queue.insert(stack.pop());    // 1st half element
            queue.insert(queue.remove()); // 2nd half element
        }

        // Display result
        System.out.print("Interleaved Queue: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
    }
}
