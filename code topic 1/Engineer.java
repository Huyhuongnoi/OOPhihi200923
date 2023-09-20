public class Engineer extends Officer {
    private String trainingIndustry;

    public Engineer(String name, int age, String sex, String address, String trainingIndustry) {
        super(name, age, sex, address);
        this.trainingIndustry = trainingIndustry;
    }

    public String getTrainingIndustry() {
        return this.trainingIndustry;
    }

    public String dataEngineer() {
        String data = getName() + "\n" + String.valueOf(getAge()) + "\n" + getSex() + "\n" + getAddress() + "\n" + getTrainingIndustry();
        return data;
    }

    @Override
    public String getName() {
        return super.getName();
    }

}
