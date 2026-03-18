//ERIC MAINA
//Ct100/G/21350/24
//grading system


class Student {
    private String studentId, name;
    private int[] marks;

    public Student(String studentId, String name, int[] marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public int calculateTotal() {
        int total = 0;
        for (int m : marks) total += m;
        return total;
    }

    public double calculateAverage() { return calculateTotal() / 5.0; }

    public char findGrade() {
        double avg = calculateAverage();
        if (avg >= 80) return 'A';
        if (avg >= 60) return 'B';
        if (avg >= 50) return 'C';
        return 'F';
    }

    public void displayStudentReport() {
        System.out.println("ID: " + studentId + " | Name: " + name + 
            " | Total: " + calculateTotal() + " | Avg: " + calculateAverage() + 
            " | Grade: " + findGrade());
    }
    
    public String getName() { return name; }
}

public class StudentGradeSystem {
    public static void main(String[] args) {
        Student s1 = new Student("S1", "Alice", new int[]{85, 90, 80, 70, 95});
        Student s2 = new Student("S2", "Bob", new int[]{60, 55, 65, 50, 70});
        Student s3 = new Student("S3", "Charlie", new int[]{45, 40, 50, 30, 45});

        Student[] students = {s1, s2, s3};
        Student top = s1;

        for (Student s : students) {
            s.displayStudentReport();
            if (s.calculateAverage() > top.calculateAverage()) top = s;
        }
        System.out.println("\nTop Student: " + top.getName());
    }
}
