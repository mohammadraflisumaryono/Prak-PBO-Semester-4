public class MainStudent {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setId(1);
        student1.setNim("123456789");
        student1.setName("Mohammad Rafli Sumaryono");
        student1.setAge((byte) 20);
        student1.setAddress("123 Main Street");
        student1.setPhoneNo("123-456-7890");

        System.out.println("Student 1:");
        System.out.println("ID: " + student1.getId());
        System.out.println("NIM: " + student1.getNim());
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Address: " + student1.getAddress());
        System.out.println("Phone Number: " + student1.getPhoneNo());
        System.out.println();

        Student student2 = new Student();
        student2.setId(2);
        student2.setNim("987654321");
        student2.setName("Arkan Raihan");
        student2.setAge((byte) 22);
        student2.setAddress("456 Elm Street");
        student2.setPhoneNo("987-654-3210");

        System.out.println("Student 2:");
        System.out.println("ID: " + student2.getId());
        System.out.println("NIM: " + student2.getNim());
        System.out.println("Name: " + student2.getName());
        System.out.println("Age: " + student2.getAge());
        System.out.println("Address: " + student2.getAddress());
        System.out.println("Phone Number: " + student2.getPhoneNo());
        System.out.println();

        Student student3 = new Student();
        student3.setId(3);
        student3.setNim("543216789");
        student3.setName("Ghani");
        student3.setAge((byte) 21);
        student3.setAddress("789 Oak Street");
        student3.setPhoneNo("789-123-4567");

        System.out.println("Student 3:");
        System.out.println("ID: " + student3.getId());
        System.out.println("NIM: " + student3.getNim());
        System.out.println("Name: " + student3.getName());
        System.out.println("Age: " + student3.getAge());
        System.out.println("Address: " + student3.getAddress());
        System.out.println("Phone Number: " + student3.getPhoneNo());
    }
}
