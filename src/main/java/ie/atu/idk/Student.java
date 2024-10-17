
package ie.atu.idk;

public class Student {
    private String name;
    private String email;
    private String course;

    public Student() {
        this.name = "";
        this.email = "";
        this.course = "";
    }

    public Student(String name) {
        this.name = name;
        this.email = "";
        this.course = "";
    }

    public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    /**
     *
     * @return returns nothing as names are printed using getter methods '-'
     */
    @Override
    public String toString() {
        return "Student: " +
                "Name = '" + name + '\'' +
                ", Email = '" + email + '\'' +
                ", Course = '" + course;
    }
}
