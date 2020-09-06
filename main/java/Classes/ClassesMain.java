package Classes;

import java.time.LocalDate;

public class ClassesMain {
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
            Students students = new Students(firstStudent);
            students.AddStudent(secondStudent);
            students.AddStudent(thirdStudent);
            students.AddStudent(forthStudent);
            students.ShowGroupList("313");
            System.out.println();
            students.ShowListOfStudentsForEveryFacultyAndGroup();
            System.out.println();
            students.ShowListOfStudentsWhichAreStudyingOnEnteredFaculty("Information technology ");
            System.out.println();
            students.ShowListOfStudentsWhichWereBornAfterInputYear(2001);
        } catch (RuntimeException e){
            System.out.println(e);
        }
    }
}
