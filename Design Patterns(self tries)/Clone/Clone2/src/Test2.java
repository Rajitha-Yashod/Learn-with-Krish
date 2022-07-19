public class Test2 implements Cloneable{
    int a,b;
    Test c =new Test();
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
