/* Directory Problem */

package com.revature.partB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Directory {
    static class Entry {
        String name;
        String address;
        String telephoneNumber;
        String mobileNumber;
        String headOfFamily;
        String uniqueID;

        public Entry(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily, String uniqueID) {
            this.name = name;
            this.address = address;
            this.telephoneNumber = telephoneNumber;
            this.mobileNumber = mobileNumber;
            this.headOfFamily = headOfFamily;
            this.uniqueID = uniqueID;
        }

        @Override
        public String toString() {
            return "Unique ID: " + uniqueID + ", Name: " + name + ", Address: " + address +
                    ", Telephone Number: " + telephoneNumber + ", Mobile Number: " + mobileNumber +
                    ", Head of Family: " + headOfFamily;
        }
    }

    List<Entry> entries;
    Scanner scanner;

    public Directory() {
        entries = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void createEntry() {
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter address:");
        String address = scanner.nextLine();
        System.out.println("Enter telephone number (with STD code):");
        String telephoneNumber = scanner.nextLine();
        System.out.println("Enter mobile number:");
        String mobileNumber = scanner.nextLine();
        System.out.println("Enter head of family:");
        String headOfFamily = scanner.nextLine();
        System.out.println("Enter unique ID:");
        String uniqueID = scanner.nextLine();

        Entry newEntry = new Entry(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueID);
        entries.add(newEntry);
        System.out.println("Entry created successfully.");
    }

    public void editEntry() {
        System.out.println("Enter the unique ID of the entry you want to edit:");
        String uniqueID = scanner.nextLine();
        for (Entry entry : entries) {
            if (entry.uniqueID.equals(uniqueID)) {
                System.out.println("Enter new address:");
                entry.address = scanner.nextLine();
                System.out.println("Entry updated successfully.");
                return;
            }
        }
        System.out.println("Entry not found.");
    }

    public void searchByKeyword() {
        System.out.println("Enter a keyword to search:");
        String keyword = scanner.nextLine().toLowerCase();
        for (Entry entry : entries) {
            if (entry.name.toLowerCase().contains(keyword) || entry.address.toLowerCase().contains(keyword) ||
                    entry.telephoneNumber.contains(keyword) || entry.mobileNumber.contains(keyword) ||
                    entry.headOfFamily.toLowerCase().contains(keyword) || entry.uniqueID.contains(keyword)) {
                System.out.println(entry);
            }
        }
    }

    public static void main(String[] args) {
        Directory directory = new Directory();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Create database entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Search by keyword");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    directory.createEntry();
                    break;
                case 2:
                    directory.editEntry();
                    break;
                case 3:
                    directory.searchByKeyword();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

