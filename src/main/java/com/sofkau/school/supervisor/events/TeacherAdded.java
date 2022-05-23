package com.sofkau.school.supervisor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.school.supervisor.values.Subject;
import com.sofkau.school.supervisor.values.TeacherID;
import com.sofkau.school.supervisor.values.YearsOfExperience;

import javax.lang.model.element.Name;


public class TeacherAdded extends DomainEvent {
    private final TeacherID entityId;
    private final YearsOfExperience yearsOfExperience;
    private final Name name;

    private final Subject subject;


    public TeacherAdded(TeacherID entityId, YearsOfExperience yearsOfExperience, Name name, Subject subject) {
        super("SherMaestre.Supervisor.TeacherAdded");
        this.entityId = entityId;
        this.yearsOfExperience = yearsOfExperience;
        this.name = name;
        this.subject = subject;
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

    public TeacherID getEntityId() {
        return entityId;
    }
}
