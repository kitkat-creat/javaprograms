import java.util.Scanner;

public class main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        // insert students into student class
        Student s1 = new Student(1,"Emi","Wong","healthy@mail");
        Student s2 = new Student(2,"Mint","Attha","kids@mail");
        Student s3 = new Student(5,"Lala","Cat","animal@mail");
        Student s4 = new Student(1,"Walt","Disney","disney@mail");
        Student s5 = new Student(6,"Las","Vegas","casino@mail");
        linkedlist list = new linkedlist();

        list.insertstudent(s1);
        list.insertstudent(s2);
        list.insertstudent(s3);
        list.insertstudent(s4);
        list.insertstudent(s5);

        list.display();

        list.deletestudent(6);
        list.display();
        Student searchstudent = list.search("Mint");
        if(searchstudent != null) {        //if the search was found, then display info
            System.out.println("Student(s) found: ");
            System.out.println("ID: " + searchstudent.id);
            System.out.println("Name: " + searchstudent.first + " " + searchstudent.last);
            System.out.println("Email: " + searchstudent.email);
        }
        else
            System.out.println("No students found.");
    }
}
