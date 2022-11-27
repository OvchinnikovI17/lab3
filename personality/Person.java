package personality;


public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Его имя " + this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person man = (Person) o;
        return hashCode() == man.hashCode();
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

}
