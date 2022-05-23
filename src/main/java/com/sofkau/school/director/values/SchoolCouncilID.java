package com.sofkau.school.director.values;

import co.com.sofka.domain.generic.Identity;

public class SchoolCouncilID extends Identity {
    //constructors
    private SchoolCouncilID(String vvid){
        super(vvid);
    }

    public SchoolCouncilID(){
    }

    public static SchoolCouncilID of(String id){
        return new SchoolCouncilID(id);
    }
}

