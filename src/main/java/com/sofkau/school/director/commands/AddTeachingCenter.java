package com.sofkau.school.director.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.school.director.values.Activity;
import com.sofkau.school.director.values.Agenda;
import com.sofkau.school.director.values.Auditorium;
import com.sofkau.school.supervisor.values.SupervisorID;

public class AddTeachingCenter extends Command {
    private final SupervisorID supervisorID;
    private final Auditorium auditorium;
    private final Agenda agenda;
    private final Activity activity;

    public AddTeachingCenter(SupervisorID supervisorID, Auditorium auditorium, Agenda agenda, Activity activity) {
        this.supervisorID = supervisorID;
        this.auditorium = auditorium;
        this.agenda = agenda;
        this.activity = activity;
    }

    public SupervisorID getSupervisorID() {
        return supervisorID;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public Activity getActivity() {
        return activity;
    }
}
