package Basics;

import java.util.Stack;  
public class StackExample   
{  
    public static void main(String[] args)   
    {  
        //1.Create a stack  
        Stack<Integer> stack=new Stack<>();  
  
        //2.Push elements onto the stack  
        stack.push(10);  
        stack.push(20);  
        stack.push(30);  
  
        //3.Print the top element of the stack  
        System.out.println("Top element:"+stack.peek());  
  
        //4.Pop elements from the stack  
        int poppedElement=stack.pop();  
        System.out.println("Popped element:"+poppedElement);  
  
        //5.Check if the stack is empty  
        System.out.println("Is stack empty?"+stack.isEmpty());  
  
        //6.Get the size of the stack  
        System.out.println("Stack size:"+stack.size());  
  
        //7.Iterate over the stack  
        System.out.println("Stack elements:");  
        for (Integer element:stack)   
        {  
            System.out.println(element);  
        }  
    }  
} 
