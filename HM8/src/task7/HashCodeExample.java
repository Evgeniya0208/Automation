package task7;

import java.util.HashSet;
import java.util.Set;

public class HashCodeExample {
    private final String first, last;

    public HashCodeExample(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(this == o) return true;
        if (getClass() != o.getClass()) return false;
        HashCodeExample myHashCode = (HashCodeExample) o; //object casting
        return this.first == myHashCode.first && this.last == myHashCode.last;
    }

    @Override
    public int hashCode() {
        return (3 * first.hashCode() + 7 * last.hashCode());
    }

    public static void main(String[] args) {

        Set<HashCodeExample> s = new HashSet<>();
        s.add(new HashCodeExample("Donald", "Duck"));
        System.out.println(s.contains(new HashCodeExample("Donald", "Duck")));


        HashCodeExample myHashCode = new HashCodeExample("Cat", "Dog");
        HashCodeExample anotherHashCode = new HashCodeExample("Cat", "Dog");
        HashCodeExample someHashCode = new HashCodeExample("Cat", "Bird");

        System.out.println(myHashCode.equals(anotherHashCode));
        System.out.println(myHashCode.hashCode() == anotherHashCode.hashCode());

        System.out.println(myHashCode.equals(someHashCode));
        System.out.println(myHashCode.hashCode() == someHashCode.hashCode());
    }
}
