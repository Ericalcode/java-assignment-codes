//ERIC MAINA 
//ct100/g/21350/24
//hospital system 
class Patient {
    private String patientId, name, diagnosis;
    private int age;
    private boolean admitted;

    public Patient(String id, String name, int age, String diagnosis) {
        this.patientId = id; this.name = name;
        this.age = age; this.diagnosis = diagnosis;
        this.admitted = false;
    }

    public String getPatientId() { return patientId; }
    public void admit() { admitted = true; }
    public void discharge() { admitted = false; }
    public void updateDiagnosis(String d) { this.diagnosis = d; }
    public boolean isAdmitted() { return admitted; }

    public void displayPatientInfo() {
        System.out.println("ID: " + patientId + " | Name: " + name + " | Diag: " + diagnosis);
    }
}

class HospitalWard {
    private Patient[] patients = new Patient[20];
    private int count = 0;

    public void admitPatient(Patient p) {
        if (count < 20) {
            p.admit();
            patients[count++] = p;
        }
    }

    public void dischargePatient(String id) {
        for (int i = 0; i < count; i++) {
            if (patients[i].getPatientId().equals(id)) patients[i].discharge();
        }
    }

    public void listAdmittedPatients() {
        for (int i = 0; i < count; i++) {
            if (patients[i].isAdmitted()) patients[i].displayPatientInfo();
        }
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        HospitalWard ward = new HospitalWard();
        Patient p1 = new Patient("P1", "John", 40, "Flu");
        Patient p2 = new Patient("P2", "Sara", 30, "Injury");
        Patient p3 = new Patient("P3", "Mike", 55, "Fever");
        Patient p4 = new Patient("P4", "Anna", 20, "Migraine");

        ward.admitPatient(p1); ward.admitPatient(p2); ward.admitPatient(p3);
        ward.dischargePatient("P1");
        p2.updateDiagnosis("Recovering");

        System.out.println("--- Admitted Patients ---");
        ward.listAdmittedPatients();
    }
}
