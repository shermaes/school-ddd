package com.sofkau.school.supervisor;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.school.supervisor.events.StudentAdded;
import com.sofkau.school.supervisor.events.SupervisorCreated;
import com.sofkau.school.supervisor.values.*;

import javax.lang.model.element.Name;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Supervisor extends AggregateEvent<SupervisorID> {

    protected ClasroomPresident clasroomPresident;
    protected DesignatedTeacher designatedTeacher;
    protected Set<Teacher> teachers;
    protected Set<Student> students;

 // this is not a behavior but an action that has to be executed so we can create our aggregate
    public Supervisor(SupervisorID entityId, ClasroomPresident clasroomPresident, DesignatedTeacher designatedTeacher)  {
        super(entityId);
        appendChange(new SupervisorCreated(clasroomPresident, designatedTeacher)).apply();
    }

    private Supervisor(SupervisorID supervisorID){
        super(supervisorID);
        subscribe(new SupervisorChange(this));
    }

    public static Supervisor from(SupervisorID supervisorID, List<DomainEvent> events){
        Supervisor supervisor = new Supervisor(supervisorID);
        events.forEach((event) -> supervisor.applyEvent(event));
        return supervisor;
    }

    //commands
     public void addStudent(StudentID entityId, Name name, YearsApproved yearsApproved, Grades grades){
         Objects.requireNonNull(entityId);
         Objects.requireNonNull(name);
         Objects.requireNonNull(yearsApproved);
         Objects.requireNonNull(grades);
         //here we append this change in order to create the event / applying that event into this aggregate
         appendChange(new StudentAdded(entityId, name, yearsApproved, grades)).apply();
     }




    //these are my getters we need to remove the get word as a convention
    public ClasroomPresident ClasroomPresident() {
        return clasroomPresident;
    }

    public DesignatedTeacher DesignatedTeacher() {
        return designatedTeacher;
    }

    public Set<Teacher> Teachers() {
        return teachers;
    }

    public Set<Student> Students() {
        return students;
    }
}
