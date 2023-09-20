
public class Staff extends Officer {
    private String job;

    public Staff(String name, int age, String sex, String address, String job) {
        super(name, age, sex, address);
        this.job = job;
    }

    public String getJob() {
        return this.job;
    }

    public String dataStaff() {
        String data = getName() + "\n" + String.valueOf(getAge()) + "\n" + getSex() + "\n" + getAddress() + "\n" + getJob();
        return data;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
