package Builder;

public class Client {
    public static void main(String[] args) {

//        Student s1 = new Student("Mohit" , 24 , 2024);

//        Builder b = new Builder();
//        Builder b = Student.getBuilder();
//        b.setAge(29);
//        b.setBatch("Apr23");
//        b.setGradYear(2024);

         Student s = Student.getBuilder()
                    .setAge(29)
                    .setBatch("Apr23")
                    .setGradYear(2024)
                    .build();

//        Student s = new Student(b);
    }
}
