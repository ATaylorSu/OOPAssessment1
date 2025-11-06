package assessment;


/**
 * Clasee：Appointment（预约）
 * Function: Encapsulate all information of a single appointment (patient, time slot, selected doctor)
 */
public class Appointment {
    // Instance variable 1: Patient name
    private String patientName;
    // Instance variable 2: Patient's phone number
    private String patientPhone;
    // Instance variable 3: Appointment time slot
    private String timeSlot;
    // Instance variable 4: Selected doctor
    private HealthProfessional selectedDoctor;

    // 1. Default Construction
    public Appointment() {
        this.patientName = "";
        this.patientPhone = "";
        this.timeSlot = "";
        this.selectedDoctor = null;
    }

    // 2. Fully parameterized construction
    public Appointment(String patientName, String patientPhone, String timeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.timeSlot = timeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // 3. Method for printing all instance variables
    public void printAppointmentDetails() {
        System.out.println("Patient's name：" + this.patientName);
        System.out.println("Patient's mobile phone number：" + this.patientPhone);
        System.out.println("Appointment Slot：" + this.timeSlot);
        System.out.println("Selected doctor information：");
        // Call the doctor's printing method
        if (selectedDoctor instanceof GeneralPractitioner) {
            ((GeneralPractitioner) selectedDoctor).printGPDetails();
        } else if (selectedDoctor instanceof Dentist) {
            ((Dentist) selectedDoctor).printDentistDetails();
        }
    }

    // Getter and Setter
    public String getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    public void setSelectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }
}