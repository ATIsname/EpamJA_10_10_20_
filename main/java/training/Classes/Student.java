package training.Classes;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String thirdName;
    private LocalDate birthdate;
    private String address;
    private String telephoneNumber = "no TN";
    private String faculty;
    private int course;
    private String group;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getThirdName() {
        return thirdName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            throw new RuntimeException("Variables cannot take in an value less then 1 for the \"id\"");
        }
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        } else {
            throw new RuntimeException("Variables cannot take in an empty String or null value for the \"name\"");
        }
    }

    public void setSurname(String surname) {
        if (!surname.isEmpty()) {
            this.surname = surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase();
        } else {
            throw new RuntimeException("Variables cannot take in an empty String or null value for the \"surname\"");
        }
    }

    public void setThirdName(String thirdName) {
        if (!thirdName.isEmpty()) {
            this.thirdName = thirdName.substring(0, 1).toUpperCase() + thirdName.substring(1).toLowerCase();
        } else {
            throw new RuntimeException("Variables cannot take in an empty String or null value for the \"thirdName\"");
        }
    }

    private void setBirthdate(LocalDate birthdate) {
        LocalDate nowDate = LocalDate.now();
        if (birthdate.getYear() < nowDate.getYear()) {
            this.birthdate = birthdate;
        } else {
            throw new RuntimeException("Variables cannot take in an empty String or null or less " +
                    "then this year value of date value for the \"birthdate\"");
        }
    }

    public void setAddress(String address) {
        if (!address.isEmpty()) {
            this.address = address;
        } else {
            throw new RuntimeException("Variables cannot take in an empty String or null value for the \"address\"");
        }
    }

    public void setTelephoneNumber(String telephoneNumber) {
        Pattern pattern = Pattern.compile("\\d{9}|(?:\\d{2}-){3}\\d{4}|\\(\\d{2}\\)\\d{3}-?\\d{4}");
        Matcher matcher = pattern.matcher(telephoneNumber);
        if (matcher.matches()) {
            this.telephoneNumber = telephoneNumber;
        } else {
            throw new RuntimeException("Variables cannot take in an empty String or null value or patter of" +
                    " telephone humber haven't been used for the \"telephone number\"");
        }
    }

    public void setFaculty(String faculty) {
        if (!faculty.isEmpty()) {
            this.faculty = faculty;
        } else {
            throw new RuntimeException("Variables cannot take in an empty String or null value for the \"faculty\"");
        }
    }

    public void setCourse(int course) {
        if (course > 0 && course < 6) {
            this.course = course;
        } else {
            throw new RuntimeException("Variables cannot take null value out of range 1 - 5 for the \"course\"");
        }
    }

    public void setGroup(String group) {
        if (!group.isEmpty()) {
            this.group = group;
        } else {
            throw new RuntimeException("Variables cannot take in an empty String or null value for the \"group\"");
        }
    }

    //with inputting telephone number
    public Student(int id, String name, String surname, String thirdName, LocalDate birthdate,
                   String address, String telephoneNumber, String faculty, int course, String group) {
        setId(id);
        setName(name);
        ;
        setSurname(surname);
        setThirdName(thirdName);
        setBirthdate(birthdate);
        setAddress(address);
        setTelephoneNumber(telephoneNumber);
        setFaculty(faculty);
        setCourse(course);
        setGroup(group);
    }

    //without inputting telephone number
    public Student(int id, String name, String surname, String thirdName, LocalDate birthdate,
                   String address, String faculty, int course, String group) {
        setId(id);
        setName(name);
        ;
        setSurname(surname);
        setThirdName(thirdName);
        setBirthdate(birthdate);
        setAddress(address);
        setFaculty(faculty);
        setCourse(course);
        setGroup(group);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", birthdate=" + birthdate +
                ", address='" + address + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }
}
