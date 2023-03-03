public class Person {
    private String id;
    private String name;
    private int tuoi;
    private String diachi;

    public void display(){
    }

    public Person() {
    }

    public Person(String id, String name, int tuoi, String diachi) {
        this.id = id;
        this.name = name;
        this.tuoi = tuoi;
        this.diachi = diachi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}
