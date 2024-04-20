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
        setCheckedOutTo(name);
        setIsCheckedOut(true);
    }

    //checkIn()
    public void checkIn()
    {
        setCheckedOutTo("");
        setIsCheckedOut(false);
    }


}

