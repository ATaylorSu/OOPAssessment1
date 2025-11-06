/**
 * Subclass: General Practitioner
 * Inherited from: HealthProfessional
 */
public class GeneralPractitioner extends HealthProfessional {
    private int maxDailyPatients;

    // 1. Default Construction
    public GeneralPractitioner() {
        super(); // Call the default construction of the parent class
        this.maxDailyPatients = 0;
    }

    // 2. Fully parameterized construction
    public GeneralPractitioner(String id, String name, String professionalTitle, int maxDailyPatients) {
        super(id, name, professionalTitle); // Call parent class fully parameterized construction
        this.maxDailyPatients = maxDailyPatients;
    }

    // 3. Printing details method
    public void printGPDetails() {
        System.out.println("=== Type of Health Professional: General Practitioner ===");
        super.printDetails(); // 调用父类方法打印基础信息
        System.out.println("Maximum daily number of consultations：" + this.maxDailyPatients + "person");
        System.out.println("==============================");
    }

    // Getter and Setter (unique properties of operation subclasses)
    public int getMaxDailyPatients() {
        return maxDailyPatients;
    }

    public void setMaxDailyPatients(int maxDailyPatients) {
        this.maxDailyPatients = maxDailyPatients;
    }
}