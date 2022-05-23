package com.sofkau.school.supervisor.values;

import co.com.sofka.domain.generic.Identity;

public class TeacherID extends Identity {

    public TeacherID(){
    }

    public TeacherID(String vvid){
        super(vvid);
    }
    public static TeacherID of(String id){
        return new TeacherID(id);
    }
}
