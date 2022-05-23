package com.sofkau.school.sportscoordinator.values;

import co.com.sofka.domain.generic.Identity;

public class PlayerID extends Identity {
    //constructors
    private PlayerID(String vvid){
        super(vvid);
    }

    public PlayerID(){
    }

    public static PlayerID of(String id){
        return new PlayerID(id);
    }

}
