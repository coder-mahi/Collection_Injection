package com.di.beans;
import java.util.List;

public class InjectingList {
    private List<String> cities; // injecting List --it allows duplicate values

    public void setCities(List<String> cities){
        this.cities = cities;
    }

    @Override
    public String toString(){
        return "List[cities="+cities+"]";
    }
}
