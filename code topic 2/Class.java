public class Class {
    private int id;
    private static int nextId = 0;
    private String name;
    private String address;
    private String ptiorityLevel;
    private String examSubject;

    public Class(String name, String address, String ptiorityLevel, String examSubject) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.address = address;
        this.ptiorityLevel = ptiorityLevel;
        this.examSubject = examSubject;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAddRess() {
        return this.address;
    }

    public String getPtiorityLevel() {
        return ptiorityLevel;
    }

    public String getExamSubject() {
        return examSubject;
    }
    public String getData(){
        String data = String.valueOf(getId()) + "\n" + getName() + "\n" + getAddRess() + "\n" + getPtiorityLevel() + "\n" + getExamSubject();
        return data;
    }
}