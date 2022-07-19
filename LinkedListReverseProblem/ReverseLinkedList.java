import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String args[]){
       //Create a linkedList Object and it refers by numbers
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        //Then add value to linkedList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("Linked List is: "+numbers);//Print initial LinkedList

        //Reverse Existing One
        for(int i=0; i<numbers.size()-1; i++){
            for(int j=0; j<numbers.size()-i-1; j++){
                int a = numbers.get(j); // Get the (j)th index position value and store it into a
                int b = numbers.get(j+1);  // Get the (j+1)th index position value and store it into b

                numbers.set(j,b); //Swap the (j)th index to (j+1) index
                numbers.set(j+1,a);// Do opposite One here.
            }
        }
        //Print reverse LinkedList
        System.out.println("Reversed Linked List is: "+numbers);

    }
}
