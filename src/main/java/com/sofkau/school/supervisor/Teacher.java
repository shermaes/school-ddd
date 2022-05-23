package com.sofkau.school.supervisor;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.school.supervisor.values.Subject;
import com.sofkau.school.supervisor.values.TeacherID;
import com.sofkau.school.supervisor.values.YearsOfExperience;

import javax.lang.model.element.Name;

public class Teacher extends Entity<TeacherID> {
    private final TeacherID entityId;
    private final YearsOfExperience yearsOfExperience;
    private final Name name;
    private final Subject subject;

    public Teacher(TeacherID entityId, YearsOfExperience yearsOfExperience, Name name, Subject subject) {
        super(entityId);
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
