package org.example;


public class GraduateStudents extends Student{
    private String thesisTitle;
    GraduateStudents(String nm, int idd, int ag, int gp, String these) {
        super(nm, idd, ag, gp);
        thesisTitle = these;
    }
    @Override
    public String toString(){
        return super.toString() + "graduated with thesis on : "+thesisTitle;
    }

}
