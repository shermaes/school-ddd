package com.sofkau.school.supervisor.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.school.supervisor.values.Grades;
import com.sofkau.school.supervisor.values.StudentID;
import com.sofkau.school.supervisor.values.YearsApproved;

import javax.lang.model.element.Name;

public class AddStudent extends Command {
    private final StudentID entityId;
    private final Name name;
    private final YearsApproved yearsApproved;
    private final Grades grades;

    public AddStudent(StudentID entityId, Name name, YearsApproved yearsApproved, Grades grades) {
        this.entityId = entityId;
        this.name = name;
        this.yearsApproved = yearsApproved;
        this.grades = grades;
    }

    public StudentID getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }

    public YearsApproved getYearsApproved() {
        return yearsApproved;
    }

    public Grades getGrades() {
        return grades;
    }
}
