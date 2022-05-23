package com.sofkau.school.supervisor.values;


import co.com.sofka.domain.generic.Identity;

public class StudentID extends Identity {
    //constructors
    private StudentID(String vvid){
        super(vvid);
    }

    public StudentID(){
    }

    public static StudentID of(String id){
        return new StudentID(id);
    }
}
