package assessment;

/**
 * Class：assessment.ClassObjectDemo
 */
public class ClassObjectDemo {
    // ===================== Part 3 – Using classes and objects =====================
    public static void runPart3() {
        System.out.println("Part 3: Class and Object Usage");
        System.out.println("----------------------------------------");

        // 1. Create 3 General Practitioners
        GeneralPractitioner gp1 = new GeneralPractitioner("GP1", "Alan", "Attending Physician", 20);
        GeneralPractitioner gp2 = new GeneralPractitioner("GP2", "Simon", "Associate Chief Physician", 18);
        GeneralPractitioner gp3 = new GeneralPractitioner("GP3", "Agenda", "Attending Physician", 15);

        // 2. Create 2 dental doctor objects (Dentists)
        Dentist dentist1 = new Dentist("D1", "Jack", "Associate Chief Physician", "Orthodontics", true);
        Dentist dentist2 = new Dentist("D2", "Fiona", "Attending Physician", "Pediatric Dentistry", false);

        // 3. Print all details of health professionals
        System.out.println("1. General practitioner information：");
        gp1.printGPDetails();
        gp2.printGPDetails();
        gp3.printGPDetails();

        System.out.println("2. Dental Doctor Information：");
        dentist1.printDentistDetails();
        dentist2.printDentistDetails();

        System.out.println("------------------------------");
    }
}