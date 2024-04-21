package org.pluralsight;

public class Book
{
    private int id;
    private String isbn, title, checkedOutTo;
    private boolean isCheckedOut;

    public Book(int id,String isbn, String title, boolean isCheckedOut, String checkedOutTo)
    {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;

    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    public String getIsbn()
    {
        return  isbn;
    }
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getCheckedOutTo()
    {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo)
    {
        this.checkedOutTo = checkedOutTo;
    }

    public boolean getIsCheckedOut()
    {
        return isCheckedOut;
    }
    public void setIsCheckedOut(boolean isCheckedOut)
    {
        this.isCheckedOut = isCheckedOut;
    }

    //checkOut(name) function
    //have to set the new name and state it as true
    public void checkOut(String name)
    {
        if(isCheckedOut){

            System.out.println("Sorry this book is already checked out.");
            System.out.println("*******Returning to Home Menu!*******");
        }
        else{
            setCheckedOutTo(name);
            setIsCheckedOut(true);
            System.out.printf("\nThank you for checking out %s, %s",getTitle(),getCheckedOutTo() + "!!\n");
        }

    }

    //checkIn()
    public void checkIn()
    {
        if(!isCheckedOut){

            System.out.println("Sorry this book is currently NOT checked out.");
            System.out.println("******Returning to Home Menu!*******");
        }
        else
        {
            System.out.printf("\nThank you for checking in %s, %s" ,getTitle(),getCheckedOutTo() + "!!\n");
            setCheckedOutTo("");
            setIsCheckedOut(false);
        }

    }


}

