import java.util.ArrayList;
import java.util.List;

public class Patient extends User {
    private String name;
    private int age;
    private String phone;
    private List<VisitRecord> visitRecords;

    public Patient(String username, String password, String name, int age, String phone) {
        super(username, password);

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Өвчтөний нэр хоосон байж болохгүй.");
        }

        if (age <= 0 || age > 120) {
            throw new IllegalArgumentException("Настай утга буруу байна: " + age);
        }

        if (phone == null || !phone.matches("\\d{8}")) {
            throw new IllegalArgumentException("Утасны дугаар 8 оронтой тоо байх ёстой.");
        }

        this.name = name;
        this.age = age;
        this.phone = phone;
        this.visitRecords = new ArrayList<>();
    }

    @Override
    public String getRole() {
        return "Patient";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public void addVisitRecord(VisitRecord record) {
        if (record == null) {
            throw new IllegalArgumentException("Оношилгооны бичлэг хоосон байж болохгүй.");
        }
        visitRecords.add(record);
    }

    public List<VisitRecord> getVisitRecords() {
        return visitRecords;
    }

    @Override
    public String toString() {
        return "Өвчтөн: " + name + ", Нас: " + age + ", Утас: " + phone;
    }
}
