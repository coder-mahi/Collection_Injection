package com.di.beans;
import java.util.Map;

public class InjectingMap {
    private Map<String,String> facultySubjects;
    private Map<?,?> facultyPhones;
    public void setFacultySubjects(Map<String,String> facultySubjects){
        this.facultySubjects = facultySubjects;
    }
    public void setFacultyPhones(Map<?,?> facultyPhones){
        this.facultyPhones = facultyPhones;
    }

    @Override
    public String toString(){
        return "Faculty SET[faculty sub="+facultySubjects+", faculty phones="+facultyPhones+"];";
    }
}
