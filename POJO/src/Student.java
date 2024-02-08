public class Student {
    private String ID;
    private  String Name;
    private String DateOfBirth;
    private String ClassList;

    public Student(String ID, String name, String dateOfBirth, String classList) {
        this.ID = ID;
        Name = name;
        DateOfBirth = dateOfBirth;
        ClassList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", DateOfBirth='" + DateOfBirth + '\'' +
                ", ClassList='" + ClassList + '\'' +
                '}';
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public String getClassList() {
        return ClassList;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public void setClassList(String classList) {
        ClassList = classList;
    }
}
