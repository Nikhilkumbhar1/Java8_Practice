package streams;

public class Person {

    private String pName;

    private String pCountry;


    public Person(String pName, String pCountry) {
        this.pName = pName;
        this.pCountry = pCountry;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpCountry() {
        return pCountry;
    }

    public void setpCountry(String pCountry) {
        this.pCountry = pCountry;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pName='" + pName + '\'' +
                ", pCountry='" + pCountry + '\'' +
                '}';
    }
}
