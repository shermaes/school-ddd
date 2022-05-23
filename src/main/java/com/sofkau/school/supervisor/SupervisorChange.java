package com.sofkau.school.supervisor;

import co.com.sofka.domain.generic.EventChange;
import com.sofkau.school.supervisor.events.ClassroomPresidentChanged;
import com.sofkau.school.supervisor.events.StudentAdded;
import com.sofkau.school.supervisor.events.SupervisorCreated;
import com.sofkau.school.supervisor.events.TeacherAdded;

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

        apply((TeacherAdded event)->{
            var numberOfTeachers = supervisor.Teachers().size();
            if (numberOfTeachers>5){
                throw new IllegalArgumentException("You can't create more than 5 teachers");
            }
            supervisor.teachers.add(new Teacher(event.getEntityId(), event.getYearsOfExperience(), event.getName(),  event.getSubject()));
        });

        apply((ClassroomPresidentChanged event) -> supervisor.clasroomPresident = event.getClasroomPresident());
    }

}
