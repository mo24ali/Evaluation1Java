package org.example;

import java.util.List;
import java.lang.*;
import java.util.*;
public class StudentManager {
    private List<Student> listeEtudiant ;
    private Map<Integer,Student> MapStudent;
    StudentManager(){
        listeEtudiant = new ArrayList<Student>();
        MapStudent = new HashMap<Integer, Student>();
    }
    public void AjoutStud(Student st){
        listeEtudiant.add(st);
        MapStudent.put(st.getId(),st);
    }
    public void ViewAllStudents(){
        Iterator<Student> it = listeEtudiant.iterator();
        while(it.hasNext()){
            String st = it.next().toString();
            System.out.println(st);
            System.out.println("///////////////");
        }
    }

    public Student chercheStudent(int id){
        return MapStudent.getOrDefault(id,null);
    }
    public void deleteStudent(int id){
        Student st = MapStudent.remove(id);
        if(st != null){
            listeEtudiant.remove(st);
            System.out.println("deleted : "+st);
        }else{
            System.out.println("student not found");
        }
    }
}
