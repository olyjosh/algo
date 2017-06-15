
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benflavors02
 */
public class Josephus {
//do not use to compute more than 4155400 users on the queue
//worst case runtime is about 2.5 seconds for this size
    static Scanner input = new Scanner(System.in);
    
    public static int getCount()
    {
        System.out.println("Enter the number of count before killing");
        return input.nextInt();
    }
    public static int getQueueSize()
    {
        System.out.println("Get the number of rebels on the queue");
        return input.nextInt();
    }
    //inner class with constructor to help refer to a node
    //you may consider this a circular list as there is no start or end. iteration continues through the elements
    static class Node 
      { 
        int val; 
        Node next; 
        Node(int v) //constructor
        { 
            val = v; 
        } 
      } 
    public static void main(String[] args) 
      { 
        int sizeOfQueue = getQueueSize();
        int countBeforeKill = getCount(); 
        long start = System.currentTimeMillis();
        Node t = new Node(1); //initialise constructor with node of value 1
        Node x = t; //Create another node object with content starting from the content of t
        for (int i = 2; i <= sizeOfQueue; i++) //iterate through to insert all people on the queue
          x = (x.next = new Node(i)); //new Node(i) accepts the value and x.next put the vale in the next node position
        x.next = t; 
        while (x != x.next) //ensure not last element
          { 
            for (int i = 1; i < countBeforeKill; i++) //iterate count times resetting current node to the next for each iteration
                x = x.next; 
            x.next = x.next.next; //remove the node precisely after the current node from the linked list 
          } 
        System.out.println("Survivor is " + x.val); //output the last element that will be returned from the while loop above
    System.out.println("Time is: "+(System.currentTimeMillis()-start));  
    } 

}
