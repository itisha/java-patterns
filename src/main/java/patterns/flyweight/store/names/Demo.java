package patterns.flyweight.store.names;

public class Demo {
    public static void main(String[] args) {
        // User user = new User("John Smith");
        // User user1 = new User("Jane Smith");

        // have "Smith" in common

        User2 user2 = new User2("John Smith");
        User2 user3 = new User2("Jane Smith");

        System.out.println(user2.getFullName());
        System.out.println(user3.getFullName());
    }
}
