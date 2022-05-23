package com.sofkau.school.director.values;

import co.com.sofka.domain.generic.Identity;

public class DirectorID extends Identity {
    //constructors
    private DirectorID(String vvid){
        super(vvid);
    }

    public DirectorID(){
    }

    public static DirectorID of(String id){
        return new DirectorID(id);
    }
}
