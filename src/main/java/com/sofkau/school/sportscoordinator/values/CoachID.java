package com.sofkau.school.sportscoordinator.values;

import co.com.sofka.domain.generic.Identity;


public class CoachID extends Identity {
    //constructors
    private CoachID(String vvid){
        super(vvid);
    }

    public CoachID(){
    }

    public static CoachID of(String id){
        return new CoachID(id);
    }

}
