public class CarBuilderPattern {
    private String bodyColour;
    private String interiorColor;
    private boolean sunRoof;
    private boolean fogLamps;
    private boolean nickelHandles;

    public CarBuilderPattern(Builder builder){
        this.bodyColour=builder.bodyColour;
        this.interiorColor=builder.interiorColor;
        this.sunRoof=builder.sunRoof;
        this.fogLamps=builder.fogLamps;
        this.nickelHandles= builder.nickelHandles;

    }

    public static class Builder{
        private String bodyColour;
        private String interiorColor;
        private boolean sunRoof;
        private boolean fogLamps;
        private boolean nickelHandles;

        public Builder(String bodyColour, String interiorColor) {
            this.bodyColour = bodyColour;
            this.interiorColor = interiorColor;
        }

        public Builder() {

        }

        public Builder sunRoof(boolean sunRoof){
            this.sunRoof=sunRoof;
            return this;
        }
        public Builder fogLamps(boolean fogLamps){
            this.fogLamps=fogLamps;
            return this;
        }
        public Builder nickelHandles(boolean nickelHandles){
            this.nickelHandles=nickelHandles;
            return this;
        }


        public CarBuilderPattern builder() {

            return new CarBuilderPattern(this);
        }
    }


    @Override
    public String toString() {
        return "CarBuilderPattern{" +
                "bodyColour='" + bodyColour + '\'' +
                ", interiorColor='" + interiorColor + '\'' +
                ", sunRoof=" + sunRoof +
                ", fogLamps=" + fogLamps +
                ", nickelHandles=" + nickelHandles +
                '}';
    }
}
