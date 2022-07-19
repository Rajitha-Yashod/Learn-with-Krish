public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setId(1).setName("Ram").setAddress("USA");
        student2.setId(2).setName("sam");
        student3.setName("tom");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);


    }
}
