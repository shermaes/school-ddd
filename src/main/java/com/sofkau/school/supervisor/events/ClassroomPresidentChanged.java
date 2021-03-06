package com.sofkau.school.supervisor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.school.supervisor.values.ClasroomPresident;


public class ClassroomPresidentChanged extends DomainEvent {

    private final ClasroomPresident clasroomPresident;

    public ClassroomPresidentChanged(ClasroomPresident clasroomPresident) {
        super("SherMaestre.supervisor.ClasroomPresidentChanged");

        this.clasroomPresident = clasroomPresident;
    }

    public ClasroomPresident getClasroomPresident() {
        return clasroomPresident;
    }
}
