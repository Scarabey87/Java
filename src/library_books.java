
class book
{
    private static int next_book_id;
    public int book_id;
    public String name_book;
    public book(String name_book)
    {
        this.book_id = ++book.next_book_id;
        this.name_book = name_book;
    }
    public String getBookName()
    {
        return name_book;
    }
    public void setBookName(String name_book)
    {
        this.name_book = name_book;
    }

}

