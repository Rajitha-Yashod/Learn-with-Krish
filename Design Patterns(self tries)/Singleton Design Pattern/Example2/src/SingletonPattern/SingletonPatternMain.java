package SingletonPattern;

public class SingletonPatternMain {

    public static void main(String[] args) {
        // get only one object of SingleObject class to a variable
        SingleObject obj = SingleObject.getInstance();
        System.out.println("Print 1st variable :"+ obj);

        // get only one object of SingleObject class to another variable
        SingleObject obj2 = SingleObject.getInstance();
        System.out.println("Print 2nd variable :"+ obj2);



    }
}
