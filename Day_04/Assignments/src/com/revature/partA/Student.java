/*Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of
name as "John" by creating an object of the class Student. Assign and print the roll number, phone number and address of two students having
names "Sam" and "John" respectively by creating two objects of class 'Student'.*/

package com.revature.partA;

class Student {
    String name;
    int roll_no;
    long phoneNumber;
    String address;

    Student(String name, int roll_no, long phoneNumber, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Sam", 1, 7894561236L, "Bangalore");
        Student student2 = new Student("John", 2, 8569852365L, "Mangalore");
        student1.printDetails();
        student2.printDetails();
    }
}

