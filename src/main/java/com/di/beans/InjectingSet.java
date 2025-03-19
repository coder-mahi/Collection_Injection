package com.di.beans;
import java.util.Set;

public class InjectingSet {
    private Set<String> phones; // injecting Set --it allows duplicate values

    public void setPhones(Set<String> phones){
        this.phones = phones;
    }

    @Override
    public String toString(){
        return "Set[Phone = "+phones+"]";
    }
}
