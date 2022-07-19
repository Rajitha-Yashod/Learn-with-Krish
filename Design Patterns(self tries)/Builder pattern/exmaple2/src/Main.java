public class Main {
    public static void main(String[] args) {
        /*ShoppingUser.Builder shop = new ShoppingUser.Builder();
        ShoppingUser shoppingUser1 = shop.firstName("jerry").lastName("Tom").build();
        System.out.println(shoppingUser1);*/

        ShoppingTelescopic shoppingTelescopic = new ShoppingTelescopic("Tom","Jerry","good");
        System.out.println(shoppingTelescopic);

        ShoppingTelescopic shoppingTelescopic1 = new ShoppingTelescopic("aa");
        System.out.println(shoppingTelescopic1);
    }
}
