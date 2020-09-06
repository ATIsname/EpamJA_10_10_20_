package Classes;

import java.util.ArrayList;
import java.util.Comparator;

public class Students {
    ArrayList<Student> students;

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Students(ArrayList<Student> students) {
        this.students = students;
    }

    public Students(Student student) {
        students = new ArrayList<Student>();
        AddStudent(student);
    }

    public void AddStudent(Student student){
        this.students.add(student);
    }

    public void RemoveStudent(Student student){
        this.students.remove(student);
    }

    public Student getStudentFromListByItsId(int id){
        for (Student s:
             students) {
            if(s.getId() == id)
                return s;
        }
        throw new RuntimeException("Student with such id hasn't been found id = " + id);
    }

    //a
    public void ShowListOfStudentsWhichAreStudyingOnEnteredFaculty(String faculty){
        for (Student student:
             students) {
            if(student.getFaculty() == faculty)
                System.out.println(student.toString());
        };
    }

    //b
    public void ShowListOfStudentsForEveryFacultyAndGroup(){
        Comparator<Student> studentComparator = Comparator
                .comparing(Student::getFaculty).thenComparing(Student::getGroup);
        students.sort(studentComparator);
        System.out.println("////" + students.get(0).getFaculty() + "////");
        System.out.println("////////" + students.get(0).getGroup() + "////////");
        System.out.println(students.get(0));
        for(int i = 1; i < students.size(); i++) {
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
    public void ShowListOfStudentsWhichWereBornAfterInputYear(int inputYear){
        for (Student x : students) {
            if(x.getBirthdate().getYear() > inputYear){
                System.out.println(x.toString());
            }
        }
    }

    //d
    public void ShowGroupList(String group){
        for (Student student:
                students) {
            if(student.getGroup() == group)
                System.out.println(student.toString());
        };
    }
}
