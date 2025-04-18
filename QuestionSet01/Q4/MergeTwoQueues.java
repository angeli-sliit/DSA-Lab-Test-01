package Q4;

public class MergeTwoQueues {

    public static void main(String[] args) {
        QueueX queue1 = new QueueX(10);
        QueueX queue2 = new QueueX(10);
        StackX stack = new StackX(20);
        QueueX resultQueue = new QueueX(20);

        
        queue1.insert(1);
        queue1.insert(3);
        queue1.insert(5);

        queue2.insert(2);
        queue2.insert(4);
        queue2.insert(6);

        
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            if (queue1.peekFront() < queue2.peekFront()) {
                stack.push(queue1.remove());
            } else {
                stack.push(queue2.remove());
            }
        }

        
        while (!queue1.isEmpty()) {
            stack.push(queue1.remove());
        }

        
        while (!queue2.isEmpty()) {
            stack.push(queue2.remove());
        }

        
        while (!stack.isEmpty()) {
            resultQueue.insert(stack.pop());
        }

        
        System.out.print("Output Queue (Descending): ");
        while (!resultQueue.isEmpty()) {
            System.out.print(resultQueue.remove() + " ");
        }
        System.out.println();
    }
}
