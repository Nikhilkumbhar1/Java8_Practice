package predefinedfunctions_predicate;

public class Person {
    private String pName;
    private Integer pAge;

    Person(String pName,int pAge) {
        this.pName = pName;
        this.pAge=pAge;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Integer getpAge() {
        return pAge;
    }

    public void setpAge(Integer pAge) {
        this.pAge = pAge;
    }
}
