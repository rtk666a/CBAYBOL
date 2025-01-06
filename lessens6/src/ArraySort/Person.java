package ArraySort;

public class Person implements Comparable<Person>{
    String name ;
    Integer height;

    public Person() {
    }

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int compareTo(Person taht) {
        if(this.height > taht.height){
            return -1;
        }else if (this.height.equals(taht.height)) return 0;

        return 1;
    }
}
