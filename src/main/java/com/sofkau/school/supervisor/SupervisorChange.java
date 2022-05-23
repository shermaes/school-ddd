package com.sofkau.school.supervisor;

import co.com.sofka.domain.generic.EventChange;
import com.sofkau.school.supervisor.events.StudentAdded;
import com.sofkau.school.supervisor.events.SupervisorCreated;

import java.util.HashSet;

public class SupervisorChange extends EventChange {

    public SupervisorChange(Supervisor supervisor){
        //welcome lambda! here we are hearing the events
        apply((SupervisorCreated event)->{
            supervisor.clasroomPresident = event.getClasroomPresident();
            supervisor.designatedTeacher = event.getDesignatedTeacher();
            supervisor.students = new HashSet<>();
            supervisor.teachers = new HashSet<>();
        });

        apply((StudentAdded event)->{
            var numberOfStudents = supervisor.Students().size();
            if (numberOfStudents>10){
                throw new IllegalArgumentException("You can't create more than 10 students");
            }
            supervisor.students.add(new Student(event.EntityId(), event.YearsApproved(), event.Name(),  event.Grades()));
        });
    }

}
