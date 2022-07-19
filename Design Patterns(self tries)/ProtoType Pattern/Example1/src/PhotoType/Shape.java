package PhotoType;

public abstract class Shape implements Cloneable{
    private String id;
    protected String type;

    abstract void draw();

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Object clone(){
      Object clone =null;
      try {
        clone=super.clone();
      } catch (CloneNotSupportedException e) {
          e.printStackTrace();
      }
        return clone;
    }
}
