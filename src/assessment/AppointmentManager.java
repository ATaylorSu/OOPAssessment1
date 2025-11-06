package assessment;

import java.util.ArrayList;

/**
 * Class：AppointmentManager
 */
public class AppointmentManager {
    private static ArrayList<Appointment> appointmentList = new ArrayList<>();

    // ===================== Part 5 – Collection of appointments =====================
    public static void runPart5() {
        System.out.println("\nPart 5: Appointment Collection Management");
        System.out.println("----------------------------------------");

        // 1. Demo: Create 2 general practitioner appointments+2 dentist appointments
        System.out.println("1. Create an appointment：");
        // General practitioner appointment (gp1, gp2)
        createAppointment("Andy", "11111111111", "09:30", new GeneralPractitioner("GP1", "Alan", "Attending Physician", 20));
        createAppointment("Able", "11111111112", "14:00", new GeneralPractitioner("GP2", "Simon", "Associate Chief Physician", 18));
        // Dentist Appointment (Dentist1, Dentist2)
        createAppointment("Andrew", "11111111113", "10:15", new Dentist("D1", "Jack", "Associate Chief Physician", "Orthodontics", true));
        createAppointment("Frank", "11111111114", "15:30", new Dentist("D2", "Fiona", "Attending Physician", "Pediatric Dentistry", false));

        // 2. Print existing appointments
        System.out.println("\n2. Existing appointment list:");
        printExistingAppointments();

        // 3. Cancel 1 appointment (by phone number: 11111111112)
        System.out.println("\n3. Cancel reservation (phone number: 11111111112):");
        cancelBooking("11111111112");

        // 4. 再次打印预约（验证取消效果）
        System.out.println("\n4. Cancelled appointment list:");
        printExistingAppointments();

        System.out.println("------------------------------");
    }

    /**
     * Class：createAppointment
     * @param patientName
     * @param patientPhone
     * @param timeSlot
     * @param healthProfessional
     */
    private static void createAppointment(String patientName, String patientPhone, String timeSlot, HealthProfessional healthProfessional) {
        if (patientName == null || patientName.trim().isEmpty()) {
            System.out.println("Creation failed: Patient name cannot be empty!");
            return;
        }
        if (patientPhone == null || patientPhone.trim().isEmpty() || patientPhone.length() != 11) {
            System.out.println("Creation failed: Patient phone number format error (requires 11 digits)!");
            return;
        }
        if (timeSlot == null || timeSlot.trim().isEmpty()) {
            System.out.println("Creation failed: Reservation period cannot be empty!");
            return;
        }
        if (healthProfessional == null) {
            System.out.println("Creation failed: The selected doctor cannot be empty!");
            return;
        }

        Appointment newAppointment = new Appointment(patientName, patientPhone, timeSlot, healthProfessional);
        appointmentList.add(newAppointment);
        System.out.println("Appointment creation successful! patient:" + patientName + "，Doctor：" + healthProfessional.getName());
    }

    /**
     * Class：printExistingAppointments
     */
    private static void printExistingAppointments() {
        if (appointmentList.isEmpty()) {
            System.out.println("There are currently no appointments available!");
            return;
        }

        for (int i = 0; i < appointmentList.size(); i++) {
            System.out.println("\n[Appointment" + (i + 1) + "]");
            appointmentList.get(i).printAppointmentDetails();
        }
    }

    /**
     * Class：cancelBooking
     * @param patientPhone
     */
    private static void cancelBooking(String patientPhone) {
        boolean isCancelled = false;

        for (int i = 0; i < appointmentList.size(); i++) {
            Appointment appointment = appointmentList.get(i);
            if (appointment.getPatientPhone().equals(patientPhone)) {
                // Found: Remove Appointment
                appointmentList.remove(i);
                isCancelled = true;
                System.out.println("Cancelled successfully! Patient's mobile phone number:" + patientPhone + "，The corresponding appointment has been deleted.");
                break;
            }
        }

        // No matching phone number found
        if (!isCancelled) {
            System.out.println("Failed to cancel! Mobile number not found " + patientPhone + " The appointment.");
        }
    }
}