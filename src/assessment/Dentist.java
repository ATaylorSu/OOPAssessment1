package assessment;

import assessment.HealthProfessional;

/**
 * Subclass: assessment.Dentist
 * Inherited from: assessment.HealthProfessional
 */
public class Dentist extends HealthProfessional {
    private String specializedField;
    private boolean canDoImplant;

    // 1. Default Construction
    public Dentist() {
        super(); // Call the default construction of the parent class
        this.specializedField = "";
        this.canDoImplant = false;
    }

    // 2. Fully parameterized construction
    public Dentist(String id, String name, String professionalTitle, String specializedField, boolean canDoImplant) {
        super(id, name, professionalTitle); // Call parent class fully parameterized construction
        this.specializedField = specializedField;
        this.canDoImplant = canDoImplant;
    }

    // 3. Printing details method
    public void printDentistDetails() {
        System.out.println("=== Type of Health Professional: assessment.Dentist ===");
        super.printDetails(); // Call the parent class method to print basic information
        System.out.println("Specialized field：" + this.specializedField);
        System.out.println("Can implant surgery be performed：" + (this.canDoImplant ? "Yes" : "No"));
        System.out.println("==============================");
    }

    // Getter and Setter (unique properties of operation subclasses)
    public String getSpecializedField() {
        return specializedField;
    }

    public void setSpecializedField(String specializedField) {
        this.specializedField = specializedField;
    }

    public boolean isCanDoImplant() {
        return canDoImplant;
    }

    public void setCanDoImplant(boolean canDoImplant) {
        this.canDoImplant = canDoImplant;
    }
}