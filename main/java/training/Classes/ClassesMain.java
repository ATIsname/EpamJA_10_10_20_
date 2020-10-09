package training.Classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class ClassesMain {
    public static Student getStudentFromListByItsId(ArrayList<Student> students, int id) {
        for (Student s :
                students) {
            if (s.getId() == id) {
                return s;
            }
        }
        throw new RuntimeException("Student with such id hasn't been found id = " + id);
    }

    //a
    public static void ShowListOfStudentsWhichAreStudyingOnEnteredFaculty(ArrayList<Student> students, String faculty) {
        for (Student student :
                students) {
            if (student.getFaculty() == faculty) {
                System.out.println(student.toString());
            }
        }
    }

    //b
    public static void ShowListOfStudentsForEveryFacultyAndGroup(ArrayList<Student> students) {
        Comparator<Student> studentComparator = Comparator
                .comparing(Student::getFaculty).thenComparing(Student::getGroup);
        students.sort(studentComparator);
        System.out.println("////" + students.get(0).getFaculty() + "////");
        System.out.println("////////" + students.get(0).getGroup() + "////////");
        System.out.println(students.get(0));
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getFaculty() != students.get(i - 1).getFaculty()) {
                System.out.println("////" + students.get(i).getFaculty() + "////");
            }
            if (students.get(i).getGroup() != students.get(i - 1).getGroup()) {
                System.out.println("////////" + students.get(i).getGroup() + "////////");
            }
            System.out.println(students.get(i));
        }
    }

    //c
    public static void ShowListOfStudentsWhichWereBornAfterInputYear(ArrayList<Student> students, int inputYear) {
        for (Student x : students) {
            if (x.getBirthdate().getYear() > inputYear) {
                System.out.println(x.toString());
            }
        }
    }

    //d
    public static void ShowGroupList(ArrayList<Student> students, String group) {
        for (Student student :
                students) {
            if (student.getGroup() == group) {
                System.out.println(student.toString());
            }
        }
    }

    public static void main(String[] args) {
        try {
            Student firstStudent = new Student(1, "Ivan", "Ivanov", "Ivanovich",
                    LocalDate.of(2001, 1, 1), "Petropavlovsky street 12, 123",
                    "251211232", "Information technology software", 2, "213");
            Student secondStudent = new Student(2, "Ilia", "Ivanov", "Ivanovich",
                    LocalDate.of(2001, 1, 1), "Petropavlovsky street 12, 123",
                    "251211232", "Information technology software", 2, "313");
            Student thirdStudent = new Student(3, "Sergey", "Ivanov", "Ivanovich",
                    LocalDate.of(2002, 1, 1), "Petropavlovsky street 12, 123",
                    "251211232", "Information technology software", 2, "413");
            Student forthStudent = new Student(4, "Alexei", "Ivanov", "Ivanovich",
                    LocalDate.of(2000, 1, 1), "Petropavlovsky street 12, 123",
                    "251211232", "Information technology software", 2, "313");
            ArrayList<Student> students = new ArrayList<Student>();
            students.add(secondStudent);
            students.add(thirdStudent);
            students.add(forthStudent);
            ShowGroupList(students, "313");
            System.out.println();
            ShowListOfStudentsForEveryFacultyAndGroup(students);
            System.out.println();
            ShowListOfStudentsWhichAreStudyingOnEnteredFaculty(students, "Information technology ");
            System.out.println();
            ShowListOfStudentsWhichWereBornAfterInputYear(students, 2001);
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }
}
