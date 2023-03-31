package predefinedfunctions_predicate;

public class Employee {

    private String eName;
    private String eLocation;

    private String eDept;

    public Employee(String eName, String eLocation, String eDept) {
        this.eName = eName;
        this.eLocation = eLocation;
        this.eDept = eDept;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteLocation() {
        return eLocation;
    }

    public void seteLocation(String eLocation) {
        this.eLocation = eLocation;
    }

    public String geteDept() {
        return eDept;
    }

    public void seteDept(String eDept) {
        this.eDept = eDept;
    }
}
