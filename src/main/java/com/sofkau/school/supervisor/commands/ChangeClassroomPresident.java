package com.sofkau.school.supervisor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.school.supervisor.values.ClasroomPresident;

public class ChangeClassroomPresident extends Command {
    private final ClasroomPresident clasroomPresident;

    public ChangeClassroomPresident(ClasroomPresident clasroomPresident) {
        this.clasroomPresident = clasroomPresident;
    }

    public ClasroomPresident getClasroomPresident() {
        return clasroomPresident;
    }
}
