import java.util.ArrayList;

/* Implementation of a stack with Arrays */

public class Stack {

    private ArrayList<Integer> stack;
    private int top;
    
    public Stack(){
        stack = new ArrayList<>();
        top = 0;
    }
    
    public boolean push(int item){
        stack.add(item);
        top++;
        return false;
    }

    public boolean pop(){
        if(isempty()){
            return false;
        }
        stack.remove(top-1);
        top--;
        return true;
    }

    public int peek(){
        int top_item;
        top_item = stack.get(top-1);
        return top_item;
    }

    public boolean in_Stack(int item){
        return stack.contains(item);
    }

    public int size(){
        return top;
    }

    private boolean isempty(){
        return stack.isEmpty();
    }
    
    public String toString(){
        return stack.toString();
    }
    public static void main(String[] args) {
        Stack testStack = new Stack();
        testStack.push(4);
        testStack.push(3);
        testStack.push(2);
        testStack.push(1);

        System.out.println(testStack.toString());

        testStack.pop();
        testStack.pop();
        testStack.pop();
        
        System.out.println(testStack.toString());
    }
}

