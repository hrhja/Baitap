package BAI81;

public class TEST {
    public static void main(String[] args) {
        MyIntStack stack = new MyIntStack(5);

      
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
            System.out.println("Pushed: " + i);
        }

      
        System.out.println("Peek top element: " + stack.peek());

  
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

   
        try {
            stack.pop();
        } catch (IllegalStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

