package com.datastructures.stack;

/**
 * Stack class(generic type)
 */
class Stack1<T> 
{
    private int size;
    private T[] stackAr;
    private int top; // top of stack
 
    /**
     * Constructor for initializing Array.
     */
    @SuppressWarnings("unchecked")
    public Stack1(int size) 
    {
           this.size = size;
           stackAr = (T[])new Object[size]; //Creation of Generic Stack Array
           top = -1; // initialize Stack to with -1
    }
 
    /**
     * Push items in stack, it will put items on top of Stack.
     */
    public void push(T value){
           if(isFull()){
                  throw new StackFullException("Cannot push "+value+", Stack is full");
           }
           stackAr[++top] = value;
    }
 
    /**
     * Pop items in stack, it will remove items from top of Stack.
     */
    public T pop()
    {
           if(isEmpty()){
                  throw new StackEmptyException("Stack is empty");
           }
           return stackAr[top--]; // remove item and decrement top as well.
    }
 
    /**
     * @return true if Stack is empty
     */
    public boolean isEmpty(){
           return (top == -1);
    }
 
    /**
     * @return true if stack is full
     */
    
    public boolean isFull(){
           return (top == size - 1);
    }
 
}
 
/**
 * StackExampleGeneric Main class
 */
public class StackExampleGeneric {
    public static void main(String[] args) {
           Stack1<Employee> stack = new Stack1<Employee>(10); // Creation of Generic Stack
           stack.push(new Employee("11", "sam"));
           stack.push(new Employee("22", "sam"));
           stack.push(new Employee("33", "sam"));
           stack.push(new Employee("44", "sam"));
           stack.push(new Employee("11", "sam"));
           
           System.out.print("Popped items: ");
           System.out.print(stack.pop()+" ");
           System.out.print(stack.pop()+" ");
           System.out.print(stack.pop()+" ");
           System.out.print(stack.pop()+" ");
           System.out.print(stack.pop()+" ");
 
           
    }
 
}
 