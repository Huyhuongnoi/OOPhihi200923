public class Worker extends Officer {
    private int rank;

    public Worker(String name, int age, String sex, String address, int rank) {
        super(name, age, sex, address);
        this.rank = rank;
    }

    public int getRank() {
        return this.rank;
    }

    public String dataWorker() {
        String data = getName() + "\n" + String.valueOf(getAge()) + "\n" + getSex() + "\n" + getAddress() + "\n" + String.valueOf(getRank());
        return data;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}