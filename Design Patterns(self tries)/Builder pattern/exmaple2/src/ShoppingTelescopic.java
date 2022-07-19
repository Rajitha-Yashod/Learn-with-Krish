public class ShoppingTelescopic {

    //How to use Telescopic Constructor..
    private  String firstName;
    private String lastName;
    private String feedback;
    private String phoneNumber;
    private String address;

    public ShoppingTelescopic(String firstName){
        this.firstName=firstName;
    }
    public ShoppingTelescopic(String firstName,String lastName){
        this(firstName);
        this.firstName=lastName;
    }
    public ShoppingTelescopic(String firstName,String lastName,String feedback){
        this(firstName,lastName);
        this.feedback=feedback;
    }
    public ShoppingTelescopic(String firstName,String lastName,String feedback,String phoneNumber){
        this(firstName,lastName,feedback);
        this.phoneNumber=phoneNumber;
    }
    public ShoppingTelescopic(String firstName,String lastName,String feedback,String phoneNumber,String address){
        this(firstName,lastName,feedback,phoneNumber);
        this.address=address;
    }

    @Override
    public String toString() {
        return "ShoppingTelescopic{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", feedback='" + feedback + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
