package JavaClases;

import java.util.ArrayList;
import java.util.List;

public class StudentsList {
    private List<Student> studentsList= new ArrayList<>();
    public void addStudent(Student a){
        studentsList.add(a);
    }

    public void facultyPrint(String faculty){
        System.out.println("List of students faculty "+faculty);
        for(Student st:studentsList){
            if(st.getFaculty().equals(faculty)){
                System.out.println(st.toString());
            }
        }
    }

    public void yearOfBirthPrint(String year){
        System.out.println("Students list after "+year+" year");
        for(Student st:studentsList){
            if(parseYear(st.getBirthDate().substring(6))>parseYear(year)){
                System.out.println(st.toString());}
        }
    }

    public void facultyCoursePrint(String faculty,String course){
        System.out.println("Students list faculty "+faculty+" course "+course);
        for(Student st:studentsList){
            if(st.getFaculty().equals(faculty)&st.getCourse().equals(course)){
                System.out.println(st.toString());}
        }
    }

    public void facultyCoursePrint(String faculty) {
        System.out.println("Students list faculty " + faculty + "all faculty ");
        for (Student st : studentsList) {
            if (st.getFaculty().equals(faculty)) {
                System.out.println(st.toString());
            }
        }
    }

    public void facultyCoursePrint(int course){
        System.out.println("Students list of all faculty , course "+course);
        for(Student st:studentsList){
            if(Integer.parseInt(st.getCourse())==course){
                System.out.println(st.toString());}
        }
    }

    public int parseYear(String years){
        return Integer.parseInt(years);
    }


}
