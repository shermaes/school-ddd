package com.sofkau.school.director.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.school.supervisor.values.ClasroomPresident;

public class CreateDirector extends Command {
    private final ClasroomPresident clasroomPresident;

    public CreateDirector(ClasroomPresident clasroomPresident) {
        this.clasroomPresident = clasroomPresident;
    }

    public ClasroomPresident getClasroomPresident() {
        return clasroomPresident;
    }
}
