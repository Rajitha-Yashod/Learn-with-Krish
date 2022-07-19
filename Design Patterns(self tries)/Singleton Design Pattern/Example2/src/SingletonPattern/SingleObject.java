package SingletonPattern;

public class SingleObject {

    private static SingleObject singleObject;

    private SingleObject(){}

    public static SingleObject getInstance(){
        if(singleObject == null){
            singleObject = new SingleObject();
        }
        return singleObject;
    }


}
