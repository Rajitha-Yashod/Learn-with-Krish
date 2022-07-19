public class CarOption {
    private String bodyColor;
    private String interiorColor;
    private boolean sunRoof;
    private boolean fogLamps;
    private boolean nickelHandles;

    public CarOption(String bodyColor){
        this.bodyColor=bodyColor;
    }
    public CarOption(String bodyColor,String interiorColor){
        this(bodyColor);
        this.bodyColor=bodyColor;
    }
    public CarOption(String bodyColor,String interiorColor,boolean sunRoof){
        this(bodyColor,interiorColor);
        this.sunRoof=sunRoof;
    }
    public CarOption(String bodyColor,String interiorColor, boolean sunRoof,boolean fogLamps){
        this(bodyColor,interiorColor,sunRoof);
        this.fogLamps=fogLamps;
    }
    public CarOption(String bodyColor,String interiorColor,boolean sunRoof,boolean fogLamps,boolean nickelHandles){
        this(bodyColor,interiorColor,sunRoof,fogLamps);
        this.nickelHandles=nickelHandles;
    }

    @Override
    public String toString() {
        return "CarOption{" +
                "bodyColor='" + bodyColor + '\'' +
                ", interiorColor='" + interiorColor + '\'' +
                ", sunRoof=" + sunRoof +
                ", fogLamps=" + fogLamps +
                ", nickelHandles=" + nickelHandles +
                '}';
    }
}
