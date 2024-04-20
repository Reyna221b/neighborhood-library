package org.pluralsight;

import java.util.Scanner;

public class Main
{
    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {

        Book[] books = {
                new Book(1,"9781435159570","Dracula", true,"Bram"),
                new Book(2,"9781435159624", "Frankenstein", true, "Victor"),
                new Book(3,"9781421561325", "Uzumaki", false, ""),
                new Book(4,"9781421594811", "Tomie", true, "Tadashi"),
                new Book(5,"9781250301703", "The Silent Patient", false,""),
                new Book(6,"9781451673319","Fahrenheit 451", false , ""),
                new Book(7,"9780312924584","The Silence of the Lambs", true, "Thomas"),
                new Book(8,"9780375703768","House of Leaves",true, "Mark"),
                new Book(9,"9780307474278","The Da Vinci Code", true, "Dan"),
                new Book(10,"9780547928227" ,"The Hobbit", true, "Tolkein"),
                new Book(11,"9780486284736", "Pride and Prejudice",true, "Jane"),
                new Book(12,"9780061007224","The Exorcist", false,""),
                new Book(13,"9780525478812", "The Fault In Our Stars", false, ""),
                new Book(14,"9780439023481", "The Hunger Games", false, ""),
                new Book(15,"9780385490818", "The Handmaid's Tale", true, "Margaret"),
                new Book(16,"9781594480003","The Kite Runner", true, "Khaled"),
                new Book(17,"9781594489501","A Thousand Splendid Suns", false, ""),
                new Book(18,"9780307743657", "The Shining", false, ""),
                new Book(19,"9780553213079","The Hound of the Baskervilles", false,""),
                new Book(20,"9780062315007","The Alchemist",false,"")
        };
        int userChoice = 0;

        System.out.println("Welcome to the neighborhood Library!");
        while (userChoice != 3) {
            userChoice = getHomeScreenChoice();

            switch (userChoice)
            {
                case 1:
                    availableBooks(books);
                    break;
                case 2:
                    checkedOutBooks(books);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Thank you for visiting the NeighborHood Library!\nGoodbye!");
                    return;
                default:
                    System.out.println();
                    System.out.println("Sorry that is not an option.");
                    break;
            }

        }
    }
    public static int getHomeScreenChoice()
    {
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("1 - Show Available Books");
        System.out.println("2 - Show Checked Out Books");
        System.out.println("3 - Exit");
        System.out.println();
        System.out.print("Enter your choice: ");
        return Integer.parseInt(userInput.nextLine());
    }

    public static void availableBooks(Book[] books)
    {
        System.out.println();
        System.out.println("All Available Books\n ");
        System.out.println("----------------------------------------");

        for (Book book : books) {
            if(!book.getIsCheckedOut()){
                System.out.printf("ID:%-5d Title:%-30s ISBN:%-30s\n",
                        book.getId(), book.getTitle(),book.getIsbn());
            }
        }
        checkOutDisplay(books);

    }

    public static void checkOutDisplay(Book[]books)
    {
        //System.out.println("What would you like to do?\n");
        System.out.println("----------------------------------------");
        System.out.println("C - Check Out a Book");
        System.out.println("X - Exit to Home");
        System.out.println();
        System.out.print("Enter your choice: ");
        String option = userInput.nextLine().strip();

        if(option.equalsIgnoreCase("c"))
        {
            System.out.println("What book would you like to check out?");
            System.out.print("Please enter the ID of the book: ");
            int choice = Integer.parseInt(userInput.nextLine().strip());

            System.out.print("What is your name? ");
            String name = userInput.nextLine().strip();
            for (Book book : books) {
                if (book.getId() == choice) {
                    book.checkOut(name);

                }
            }
            System.out.println("\nThank you for checking out a book " + name + "!!\n");
        }
    }

    public static void checkedOutBooks(Book[] books)
    {
        System.out.println();
        System.out.println("All Checked Out Books\n ");
        System.out.println("----------------------------------------");

        // first    last    age
        for (Book book : books) {
            if(book.getIsCheckedOut()){
                System.out.printf("ID:%-5d Title:%-30s ISBN:%-30s Checked Out By:%-10s\n",
                        book.getId(), book.getTitle(),book.getIsbn(),book.getCheckedOutTo());
            }
        }
        checkInDisplay(books);

    }
    public static void checkInDisplay(Book[]books)
    {
        //System.out.println("What would you like to do?\n");
        System.out.println("----------------------------------------");
        System.out.println("C - Check In a Book");
        System.out.println("X - Exit to Home");
        System.out.println();
        System.out.print("Enter your choice: ");
        String option = userInput.nextLine().strip();

        if(option.equalsIgnoreCase("c"))
        {
            System.out.println("What book would you like to check in?");
            System.out.print("Please enter the ID of the book: ");
            int choice = Integer.parseInt(userInput.nextLine().strip());

            for (Book book : books) {
                if (book.getId() == choice) {
                    System.out.printf("\nThank you for checking in the %s %s" ,book.getTitle(), book.getCheckedOutTo() + "!!\n");
                    book.checkIn();

                }
            }

        }
    }




}