package JavaClases;

public class Student {


    private int id;
    private String first;
    private String last;
    private String patronymic;
    private String birthDate;
    private String adress;
    private String phoneNumber;
    private String faculty;
    private String course;
    private String group;

    public Student(int id, String first, String last, String patronymic, String birthDate , String adress, String phoneNumber,
                   String faculty, String course, String group) {
        this.id=id;
        this.first = first;
        this.last = last;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }




    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public String toString() {
        return "Student{"+" id " +id+
                ", name='" + first + '\'' +
                ", middleName='" + patronymic + '\'' +
                ", dateOfBirth='" + birthDate + '\'' +
                ", surname='" + last + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
