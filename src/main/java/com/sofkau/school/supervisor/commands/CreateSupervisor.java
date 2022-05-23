package com.sofkau.school.supervisor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.school.supervisor.values.ClasroomPresident;
import com.sofkau.school.supervisor.values.DesignatedTeacher;

public class CreateSupervisor extends Command {
    private final ClasroomPresident clasroomPresident;
    private final DesignatedTeacher designatedTeacher;

    public CreateSupervisor(ClasroomPresident clasroomPresident, DesignatedTeacher designatedTeacher) {
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
