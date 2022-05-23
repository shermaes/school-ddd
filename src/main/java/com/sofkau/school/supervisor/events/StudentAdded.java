package com.sofkau.school.supervisor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.school.supervisor.values.Grades;
import com.sofkau.school.supervisor.values.StudentID;
import com.sofkau.school.supervisor.values.YearsApproved;

import javax.lang.model.element.Name;

public class StudentAdded extends DomainEvent {
    private final YearsApproved yearsApproved;
    private final Name name;
    private final Grades grades;
    private final StudentID entityId;

    public StudentAdded(StudentID entityId, Name name, YearsApproved yearsApproved, Grades grades){
        super("SherMaestre.Supervisor.StudentAdded");
        this.yearsApproved = yearsApproved;
        this.name = name;
        this.grades = grades;
        this.entityId = entityId;
    }

    //getters
    public YearsApproved YearsApproved() {
        return yearsApproved;
    }

    public Name Name() {
        return name;
    }

    public Grades Grades() {
        return grades;
    }

    public StudentID EntityId() {
        return entityId;
    }
}
