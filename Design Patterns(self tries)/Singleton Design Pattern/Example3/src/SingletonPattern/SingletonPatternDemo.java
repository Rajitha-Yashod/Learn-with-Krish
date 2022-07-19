package SingletonPattern;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        long start, end,time;

        // get only one object of SingleObject class to a variable
        start=System.currentTimeMillis();
        SingletonPatten obj = SingletonPatten.getInstance();
        end=System.currentTimeMillis();
        time=end-start;
        System.out.println("Time that get create a 1st instance :"+time);
        //System.out.println("Print 1st variable :" + obj);

        // get only one object of SingleObject class to another variable
        start=System.currentTimeMillis();
        SingletonPatten obj2 = SingletonPatten.getInstance();
        end=System.currentTimeMillis();
        time=end-start;
        //System.out.println("Print 2nd variable :" + obj2);
        System.out.println("Time that get create a 2nd instance :"+time);

    }
}
