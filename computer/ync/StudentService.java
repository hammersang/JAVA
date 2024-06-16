package kr.ac.ync.computer.ync;

import java.util.ArrayList;
import java.util.Objects;

public class StudentService {
    // CRUD
    private ArrayList<Student> students;

    public StudentService(){
        students = new ArrayList<>();
    }

    public void register(Student student){
        students.add(student);


    }

    public Student get(String id){
        return null;
    }

    public ArrayList<Student> getAll(){
        for(Student m : students) {
            System.out.println("학번 : "+m.getId());
            System.out.println("이름 : "+m.getName());
            for(Grade g: m.getGrades()) {
                System.out.print("성적 : [ " +g.getSubject()+": "+g.getScore()+" ]");
            }
            System.out.println();

        }
        return null;
    }

    public void modify(Student student){
        for(Student m : students){
            if(Objects.equals(student.getId(), m.getId())){
                m.setId(student.getId());
                m.setName(student.getName());
                m.setGrades(student.getGrades());
            }
        }
    }

    public void remove(String id){
        for(Student m:students){
            if(Objects.equals(m.getId(), id)){
                students.remove(m);
                break;
            }
        }
    }

}
