package com.sofkau.school.director;
import co.com.sofka.domain.generic.EventChange;
import com.sofkau.school.director.events.DirectorCreated;
import com.sofkau.school.director.events.SchoolCouncilAdded;
import com.sofkau.school.director.events.TeachingCenterAdded;


import java.util.HashSet;

public class DirectorChange extends EventChange {

    public DirectorChange(Director director){
        //welcome lambda! here we are hearing the events
        apply((DirectorCreated event)->{
            director.clasroomPresident = event.getClasroomPresident();
            director.schoolCouncils = new HashSet<>();
            director.teachingCenters = new HashSet<>();
        });

        apply((SchoolCouncilAdded event)->{
            var numberOfCouncils = director.getSchoolCouncils().size();
            if (numberOfCouncils>5){
                throw new IllegalArgumentException("You can't create more than 5 school councils");
            }
            director.schoolCouncils.add(new SchoolCouncil(event.getEntityId(), event.getDelegate(), event.getTopic(), event.getAgenda()));
        });

        apply((TeachingCenterAdded event)->{
            var numberOfTeachingCenters = director.getTeachingCenters().size();
            if (numberOfTeachingCenters>3){
                throw new IllegalArgumentException("You can't create more than 3 teaching centers");
            }
           director.teachingCenters.add(new TeachingCenter(event.getEntityId(), event.getAuditorium(), event.getAgenda(), event.getActivity()));
        });
}
}
