public class Main {
    public static void main(String[] args) {
        //CarOption carOption=new CarOption("red","black",true,false,true);
        //System.out.println(carOption);

       CarBuilderPattern.Builder builder = new CarBuilderPattern.Builder("red","black");
       CarBuilderPattern builderPattern=builder.sunRoof(true).fogLamps(true).builder();
       System.out.println(builderPattern);
    }

}
