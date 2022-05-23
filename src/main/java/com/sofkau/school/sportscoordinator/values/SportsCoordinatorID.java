package com.sofkau.school.sportscoordinator.values;

import co.com.sofka.domain.generic.Identity;

public class SportsCoordinatorID extends Identity {
    //constructors
    private SportsCoordinatorID(String vvid){
        super(vvid);
    }

    public SportsCoordinatorID(){
    }

    public static SportsCoordinatorID of(String id){
        return new SportsCoordinatorID(id);
    }

}
