import java.util.Scanner;

public class Input {
    public Student nhapdulieu(Scanner scaner){
        System.out.println(" Nhập ID: ");
        int id = scaner.nextInt();

        System.out.println( " Nhập tên: ");
        String name = scaner.nextLine();

        System.out.println(" Nhập địa chỉ: ");
        String address = scaner.nextLine();

        System.out.println( " Nhập mức ưu tiên: ");
        int priority = scaner.nextInt();

        Student student= new Student(id,name,address,priority);
        return student;

    }



}
