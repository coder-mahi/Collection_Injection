package com.di.beans;
import java.util.*;

public class Student {
    private int marks[]; // injecting array
    private List<String> names; // injecting List --it allows duplicate values

    public void setNames(List<String> names){
        this.names = names;
    }
    public void setMarks(int[] marks){
        this.marks = marks;
    }

    @Override
    public String toString(){
        return "Student[marks="+Arrays.toString(marks)+", names="+names+"]";
    }
}
