import java.util.Arrays;

class Patient {
    // Instance variables
    private int patientId;
    private String patientName;
    private int age;
    private String disease;
    private String[] medicines;

    // Static variable - shared across all objects
    private static int totalBeds = 30;

    // Setter Methods (NO validation - just simple assignment)
    public void setPatientId(int patientId) {
        this.patientId = patientId;
        System.out.println("Patient ID set to: " + patientId);
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
        System.out.println("Patient Name set to: " + patientName);
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Age set to: " + age + " years");
    }

    public void setDisease(String disease) {
        this.disease = disease;
        System.out.println("Disease set to: " + disease);
    }

    public void setMedicines(String[] medicines) {
        this.medicines = medicines;
        System.out.println("Medicines prescribed successfully!");
    }

    // Getter Methods
    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public String[] getMedicines() {
        return medicines;
    }

    // Static method to get available beds
    public static int getAvailableBeds() {
        return totalBeds;
    }

    // Business Method: Admit Patient
    public int admitPatient() {
        totalBeds = totalBeds - 1;
        System.out.println("🏥 Patient " + patientName + " has been admitted to the hospital");
        System.out.println("Remaining beds: " + totalBeds);
        return totalBeds;
    }

    // Business Method: Discharge Patient
    public int dischargePatient() {
        totalBeds = totalBeds + 1;
        System.out.println("✅ Patient " + patientName + " has been discharged. Thank you!");
        System.out.println("Remaining beds: " + totalBeds);
        return totalBeds;
    }

    // Method to display medicines (using for loop)
    public void displayMedicines() {
        System.out.println("💊 Prescribed Medicines for " + patientName + ":");
        for (int i = 0; i < medicines.length; i++) {
            System.out.println("   " + (i + 1) + ". " + medicines[i]);
        }
    }

    // Method to display patient details
    public void displayPatientDetails() {
        System.out.println("============================================");
        System.out.println("         🏥 PATIENT DETAILS");
        System.out.println("============================================");
        System.out.println("Patient ID     : " + patientId);
        System.out.println("Patient Name   : " + patientName);
        System.out.println("Age            : " + age + " years");
        System.out.println("Disease        : " + disease);
        System.out.println("Medicines      :");
        for (int i = 0; i < medicines.length; i++) {
            System.out.println("                 • " + medicines[i]);
        }
        System.out.println("Available Beds : " + totalBeds);
        System.out.println("============================================");
    }
}

// Main Class
public class HospitalManagementSystem {
    public static void main(String[] args) {
        System.out.println("🏥 HOSPITAL PATIENT MANAGEMENT SYSTEM\n");

        // 1. Create Patient Objects
        Patient patient1 = new Patient();
        Patient patient2 = new Patient();

        // 2. Initialize Patient 1 using Setters
        System.out.println("📝 Initializing Patient 1 Data...\n");
        patient1.setPatientId(1001);
        patient1.setPatientName("Rajesh Kumar");
        patient1.setAge(45);
        patient1.setDisease("Diabetes Type 2");
        String[] medicines1 = {"Metformin", "Insulin", "Vitamin D"};
        patient1.setMedicines(medicines1);
        System.out.println();

        // 3. Initialize Patient 2 using Setters
        System.out.println("📝 Initializing Patient 2 Data...\n");
        patient2.setPatientId(1002);
        patient2.setPatientName("Priya Sharma");
        patient2.setAge(28);
        patient2.setDisease("Dengue Fever");
        String[] medicines2 = {"Paracetamol", "Antibiotic", "Vitamin C"};
        patient2.setMedicines(medicines2);
        System.out.println();

        // 4. Display Patient Details using Getters
        System.out.println("📊 Displaying Patient Details using Getters:\n");

        System.out.println("Patient 1 Details:");
        System.out.println("-----------------------------------");
        System.out.println("Patient ID     : " + patient1.getPatientId());
        System.out.println("Patient Name   : " + patient1.getPatientName());
        System.out.println("Age            : " + patient1.getAge() + " years");
        System.out.println("Disease        : " + patient1.getDisease());
        System.out.println("Medicines      : " + Arrays.toString(patient1.getMedicines()));
        System.out.println();

        System.out.println("Patient 2 Details:");
        System.out.println("-----------------------------------");
        System.out.println("Patient ID     : " + patient2.getPatientId());
        System.out.println("Patient Name   : " + patient2.getPatientName());
        System.out.println("Age            : " + patient2.getAge() + " years");
        System.out.println("Disease        : " + patient2.getDisease());
        System.out.println("Medicines      : " + Arrays.toString(patient2.getMedicines()));
        System.out.println();

        // 5. Display Complete Patient Details
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();

        // 6. Show available beds
        System.out.println("\n🛏️ Total Available Beds: " + Patient.getAvailableBeds());

        // 7. Admit Patient 1
        System.out.println("\n🏥 ADMITTING PATIENT:\n");
        patient1.admitPatient();

        // 8. Admit Patient 2
        System.out.println("\n🏥 ADMITTING PATIENT:\n");
        patient2.admitPatient();

        // 9. Check available beds after admissions
        System.out.println("\n🛏️ Remaining Beds: " + Patient.getAvailableBeds());

        // 10. Discharge Patient 1
        System.out.println("\n✅ DISCHARGING PATIENT:\n");
        patient1.dischargePatient();

        // 11. Check available beds after discharge
        System.out.println("\n🛏️ Remaining Beds: " + Patient.getAvailableBeds());

        // 12. Display Medicines
        System.out.println();
        patient1.displayMedicines();
        System.out.println();
        patient2.displayMedicines();

        // 13. Admit another patient to show bed reduction
        Patient patient3 = new Patient();
        System.out.println("\n📝 Initializing Patient 3 Data...\n");
        patient3.setPatientId(1003);
        patient3.setPatientName("Amit Patel");
        patient3.setAge(60);
        patient3.setDisease("Heart Disease");
        String[] medicines3 = {"Aspirin", "Beta Blocker", "Statin"};
        patient3.setMedicines(medicines3);

        System.out.println("\n🏥 ADMITTING PATIENT 3:\n");
        patient3.admitPatient();

        System.out.println("\n🛏️ Final Available Beds: " + Patient.getAvailableBeds());
    }
}