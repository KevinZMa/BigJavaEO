package ch03;

import java.util.NoSuchElementException;

/**
 * P3.6 A Person has a name (just a first name for simplicity) and friends.
 */
public class Person {

    private String name;
    /**
     * For the purpose of this assignment, friends will be stored in a string
     * instead of a more practical data structure.
     */
    private String friends;

    public Person(String name) {
        if (name.contains(" ")) throw new IllegalArgumentException(
            "Name must not contain a space"
        );
        this.name = name;
    }

    public void befriend(Person p) {
        if (friends == null || friends.isEmpty()) {
            friends = p.name;
        } else {
            friends = friends + " " + p.name;
        }
    }

    public void unfriend(Person p) {
        int index = friends.indexOf(p.name);

        if (index < 0) throw new NoSuchElementException(
            "No such friend named \"" + p.name + "\""
        );

        // prettier-ignore
        friends =
            (
                friends.substring(0, index) +
                friends.substring(index + p.name.length())
            ).replaceAll(" +", " ").strip();
    }

    public String getFriendNames() {
        return friends;
    }

    /**
     * P3.7 Get amount of friends
     * @return amount of friends
     */
    public int getFriendCount() {
        return friends.split(" ").length;
    }

    /**
     * Unit Testing
     */
    public static void main(String[] args) {
        Person a = new Person("Andy");
        Person b = new Person("Bob");
        Person c = new Person("Chris");
        Person d = new Person("David");

        a.befriend(b);
        a.befriend(c);
        a.befriend(d);

        System.out.println(a.getFriendNames());
        System.out.println("Expected: Bob Chris David");

        System.out.println(a.getFriendCount());
        System.out.println("Expected: 3");

        a.unfriend(c);
        System.out.println(a.getFriendNames());
        System.out.println("Expected: Bob David");
    }
}
