public class Doctor {
    private String name;
    private String department;

    public Doctor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return "Эмч: " + name + ", Тасаг: " + department;
    }
}

