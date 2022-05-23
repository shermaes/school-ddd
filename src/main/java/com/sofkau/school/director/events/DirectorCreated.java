package com.sofkau.school.director.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.school.supervisor.values.ClasroomPresident;


public class DirectorCreated extends DomainEvent {

    private final ClasroomPresident clasroomPresident;

    public DirectorCreated(ClasroomPresident clasroomPresident) {
        super("shermaestre.Director.DirectorCreated");
        this.clasroomPresident = clasroomPresident;
    }

    public ClasroomPresident getClasroomPresident() {
        return clasroomPresident;
    }
}
