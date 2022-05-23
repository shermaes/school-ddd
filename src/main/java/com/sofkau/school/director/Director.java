package com.sofkau.school.director;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.school.director.events.DirectorCreated;
import com.sofkau.school.director.events.SchoolCouncilAdded;
import com.sofkau.school.director.events.TeachingCenterAdded;
import com.sofkau.school.director.values.*;
import com.sofkau.school.supervisor.SupervisorChange;
import com.sofkau.school.supervisor.values.*;
import com.sofkau.school.supervisor.values.ClasroomPresident;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Director extends AggregateEvent<DirectorID> {


    protected ClasroomPresident clasroomPresident;
    protected Set<TeachingCenter> teachingCenters;
    protected  Set<SchoolCouncil> schoolCouncils;

    public Director(DirectorID directorID, ClasroomPresident clasroomPresident ) {
        super(directorID);
        this.clasroomPresident = clasroomPresident;
        appendChange(new DirectorCreated(clasroomPresident)).apply();
    }

    private Director(DirectorID directorID){
        super(directorID);
        subscribe(new DirectorChange(this));
    }

    public static Director from(DirectorID directorID, List<DomainEvent> events){
        Director director = new Director(directorID);
        events.forEach((event) -> director.applyEvent(event));
        return director;
    }
    //commands
    public void addSchoolCouncil(SchoolCouncilID entityId, Delegate delegate, Topic topic, Agenda agenda){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(delegate);
        Objects.requireNonNull(topic);
        Objects.requireNonNull(agenda);
        //here we append this change in order to create the event / applying that event into this aggregate
        appendChange(new SchoolCouncilAdded(entityId, delegate, topic, agenda)).apply();
    }

    public void addTeachingCenter(TeachingCenterID entityId, Auditorium auditorium, Agenda agenda, Activity activity){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(auditorium);
        Objects.requireNonNull(agenda);
        Objects.requireNonNull(activity);
        //here we append this change in order to create the event / applying that event into this aggregate
        appendChange(new TeachingCenterAdded(entityId, auditorium, agenda, activity)).apply();
    }



//getters
    public ClasroomPresident getClasroomPresident() {
        return clasroomPresident;
    }

    public Set<TeachingCenter> getTeachingCenters() {
        return teachingCenters;
    }

    public Set<SchoolCouncil> getSchoolCouncils() {
        return schoolCouncils;
    }
}
