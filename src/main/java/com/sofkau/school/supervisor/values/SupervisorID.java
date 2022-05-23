package com.sofkau.school.supervisor.values;

import co.com.sofka.domain.generic.Identity;

public class SupervisorID extends Identity {

    public SupervisorID(){
    }

    public SupervisorID(String vvid){
        super(vvid);
    }
    public static SupervisorID of(String id){
        return new SupervisorID(id);
    }
}
