package com.sofkau.school.supervisor;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.school.supervisor.values.Grades;
import com.sofkau.school.supervisor.values.StudentID;
import com.sofkau.school.supervisor.values.YearsApproved;

import javax.lang.model.element.Name;
import java.util.Objects;

public class Student extends Entity<StudentID> {
    //valueo bjects
    private YearsApproved yearsApproved;
    private Name name;
    private Grades grades;

        //constructor
    public Student(StudentID entityId, YearsApproved yearsApproved, Name name, Grades grades) {
        super(entityId);
        this.yearsApproved = yearsApproved;
        this.name = name;
        this.grades = grades;
    }

    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void updateYearsApproved( YearsApproved yearsApproved){
        this.yearsApproved = yearsApproved;
    }

    public void updateGrades( Grades grades){
        this.grades = grades;
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
}
