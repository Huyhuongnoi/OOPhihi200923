
public class Officer {
    private String name;
    private int age;
    private String sex;
    private String address;

    public Officer(String name, int age, String sex, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getSex() {
        return this.sex;
    }

    public String getAddress() {
        return address;
    }
}


