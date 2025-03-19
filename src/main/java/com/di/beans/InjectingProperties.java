package com.di.beans;

import java.util.Properties;

public class InjectingProperties {
    private Properties props;
    public void setProps(Properties props){
        this.props = props;
    }

    @Override
    public String toString(){
        return "Properties [props ="+props+"];";
    }
}
