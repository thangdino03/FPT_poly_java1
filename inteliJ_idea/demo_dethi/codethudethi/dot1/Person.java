package codethudethi.dot1;

public class Person {
    private String iD;
    private String name;
    private int age;
    private String address;

    private void Display(){

    }

    public Person() {
    }

    public Person(String iD, String name, int age, String address) {
        this.iD = iD;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
