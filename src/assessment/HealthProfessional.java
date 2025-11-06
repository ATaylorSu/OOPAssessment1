package assessment;

/**
 * Base class: assessment.HealthProfessional
 * Function: Encapsulate the common attributes and behaviors of all health professionals, providing inheritance basis for subclasses
 */
public class HealthProfessional {
    private String id;
    private String name;
    private String professionalTitle;

    // 1. Default Construction
    public HealthProfessional() {
        this.id = "";
        this.name = "";
        this.professionalTitle = "";
    }

    // 2. Fully parameterized construction
    public HealthProfessional(String id, String name, String professionalTitle) {
        this.id = id;
        this.name = name;
        this.professionalTitle = professionalTitle;
    }

    // 3. Method for printing all instance variables
    public void printDetails() {
        System.out.println("Basic information of health professionals:");
        System.out.println("ID：" + this.id);
        System.out.println("Name：" + this.name);
        System.out.println("Professional title ：" + this.professionalTitle);
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

    public String getProfessionalTitle() {
        return professionalTitle;
    }

    public void setProfessionalTitle(String professionalTitle) {
        this.professionalTitle = professionalTitle;
    }
}