public class Patient {
    private String name;
    private int age;
    private String phone;

    public Patient(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String toString() {
        return "Өвчтөн: " + name + ", Нас: " + age + ", Утас: " + phone;
    }
}
