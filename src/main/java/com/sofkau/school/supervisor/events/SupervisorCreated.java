package com.sofkau.school.supervisor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.school.supervisor.values.ClasroomPresident;
import com.sofkau.school.supervisor.values.DesignatedTeacher;

public class SupervisorCreated extends DomainEvent {

 //why is this final?
    private final ClasroomPresident clasroomPresident;
    private final DesignatedTeacher designatedTeacher;


    public SupervisorCreated(ClasroomPresident clasroomPresident, DesignatedTeacher designatedTeacher){
        super("shermaestre.supervisor.supervisorcreated");

        this.clasroomPresident = clasroomPresident;
        this.designatedTeacher = designatedTeacher;
    }



    public ClasroomPresident getClasroomPresident() {
        return clasroomPresident;
    }

    public DesignatedTeacher getDesignatedTeacher() {
        return designatedTeacher;
    }
}
