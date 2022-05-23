package com.sofkau.school.director.values;

import co.com.sofka.domain.generic.Identity;

public class TeachingCenterID extends Identity {
    //constructors
    private TeachingCenterID(String vvid){
        super(vvid);
    }

    public TeachingCenterID(){
    }

    public static TeachingCenterID of(String id){
        return new TeachingCenterID(id);
    }
}
