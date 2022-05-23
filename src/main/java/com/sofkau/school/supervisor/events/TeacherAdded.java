package com.sofkau.school.supervisor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.school.supervisor.values.SupervisorID;
import com.sofkau.school.supervisor.values.YearsOfExperience;

import javax.lang.model.element.Name;
import javax.security.auth.Subject;


public class TeacherAdded extends DomainEvent {
    private final SupervisorID supervisorID;
    private final YearsOfExperience yearsOfExperience;
    private final Name name;
    private final Subject subject;

    public TeacherAdded(SupervisorID supervisorID, YearsOfExperience yearsOfExperience, Name name, Subject subject) {
        super("SherMaestre.Supervisor.TeacherAdded");
        this.supervisorID = supervisorID;
        this.yearsOfExperience = yearsOfExperience;
        this.name = name;
        this.subject = subject;
    }

    public SupervisorID getSupervisorID() {
        return supervisorID;
    }

    public YearsOfExperience getYearsOfExperience() {
        return yearsOfExperience;
    }

    public Name getName() {
        return name;
    }

    public Subject getSubject() {
        return subject;
    }
}
