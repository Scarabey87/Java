class User
{
    private static int next_id = 0;
    private int id;
    String name;
    int balance;
    public User(String name, int balance)
    {
        this.id = ++User.next_id;
        this.name = name;
        this.balance = balance;
    }
    public int getInfo()
    {
        return id;
    }
}

public class Main {
    public static void main(String[] args) {
        User j1 = new User("John", 3500);
        User j2 = new User("Sarah", 17200);
        System.out.println(j1.getInfo());
        System.out.println(j2.getInfo());
    }
}