package pl.TomDal.RentACarProjectv2.model;

public class Car {
    private String company;
    private String model;
    private String type;
    private String idNumber;
    private String vinNumber;
    private int yearOfProduction;

    public Car(String company, String model, String type, String idNumber, String vinNumber, int yearOfProduction) {
        this.company = company;
        this.model = model;
        this.type = type;
        this.idNumber = idNumber;
        this.vinNumber = vinNumber;
        this.yearOfProduction = yearOfProduction;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", vinNumber='" + vinNumber + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
