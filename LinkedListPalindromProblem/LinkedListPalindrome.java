
import java.util.*;

public class LinkedListPalindrome {

    //if n element of link1List1 is equal to linkList2, return a is ture;
    public static boolean isEqual(LinkedList linkedList1,LinkedList linkedList2,int n){
        boolean equal = true;
        for(int i=0; i<n; i++){
            if(linkedList1.get(i) != linkedList2.get(i)){
                equal = false;
                break;
            }
        }
        return equal;
    }


    public static void main(String args[]){

        LinkedList<String> linkedList1 = new LinkedList<String>(); //Create a Linklist (linkedList1)
        //When Number of element is odd.
        /*linkedList1.add("A"); //(Enter the elements to linkedList)
        linkedList1.add("B");
        linkedList1.add("C");
        linkedList1.add("D");
        linkedList1.add("C");
        linkedList1.add("B");
        linkedList1.add("A");*/

       /* linkedList1.add("A"); //(Enter the elements to linkedList)
        linkedList1.add("B");
        linkedList1.add("C");
        linkedList1.add("D");
        linkedList1.add("E");
        linkedList1.add("B");
        linkedList1.add("A");*/

        //When Number of element is odd.
        /* linkedList1.add("A");
        linkedList1.add("B");
        linkedList1.add("C");
        linkedList1.add("C");
        linkedList1.add("B");
        linkedList1.add("A");*/

        linkedList1.add("A");
        linkedList1.add("B");
        linkedList1.add("C");
        linkedList1.add("D");
        linkedList1.add("B");
        linkedList1.add("A");


        System.out.println("Entered LinkedList is: "+linkedList1); //(print the entered linklist)


        LinkedList<String> linkedList2;
        linkedList2 = (LinkedList) linkedList1.clone(); //clone linkedList1


        // Reverse the cloned LinkedList
        for(int i=0; i<linkedList2.size()-1; i++){
            for(int j=0; j<linkedList2.size()-i-1; j++){
                String x = linkedList2.get(j);
                String y = linkedList2.get(j+1);
                linkedList2.set(j,y);
                linkedList2.set(j+1,x);
            }
        }
        //System.out.println("Reversed Linked List is: "+linkedList2); //Print the reversed LinkedList

        if(isEqual(linkedList1,linkedList2,linkedList2.size())==true){
            System.out.println("The LinkedList is a Palindrome");
        }else{
            System.out.println("The LinkedList is not a Palindrome");
        }
    }

}
