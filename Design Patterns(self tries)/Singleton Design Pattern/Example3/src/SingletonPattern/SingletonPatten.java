package SingletonPattern;

public class SingletonPatten {

private  static  volatile  SingletonPatten singletonPatten;

private SingletonPatten(){
    if(singletonPatten!=null){
        throw new RuntimeException("Please use getDBManager Method");
    }
}

public static SingletonPatten getInstance(){
    if(singletonPatten==null){
        synchronized ((SingletonPatten.class)){
            if(singletonPatten==null){
                singletonPatten =new SingletonPatten();
            }
        }
    }
    return singletonPatten;
}

}
