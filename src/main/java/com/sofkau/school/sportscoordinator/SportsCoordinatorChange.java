package com.sofkau.school.sportscoordinator;
import co.com.sofka.domain.generic.EventChange;
import com.sofkau.school.sportscoordinator.events.CoachAdded;
import com.sofkau.school.sportscoordinator.events.SportsCoordinatorCreated;
import com.sofkau.school.sportscoordinator.events.SportsCoordinatorSportOfficeChanged;
import java.util.HashSet;


public class SportsCoordinatorChange extends EventChange {

    public SportsCoordinatorChange(SportsCoordinator sportsCoordinator){
        //welcome lambda! here we are hearing the events
        apply((SportsCoordinatorCreated event)->{
            sportsCoordinator.sportsOffice = event.getSportsOffice();
            sportsCoordinator.coaches =  new HashSet<>();
            sportsCoordinator.players =  new HashSet<>();
        });

        apply((CoachAdded event)->{
            var numberOfCoaches = sportsCoordinator.getCoaches().size();
            if (numberOfCoaches>10){
                throw new IllegalArgumentException("You can't create more than 10 coaches");
            }
            sportsCoordinator.coaches.add(new Coach(event.getEntityId(), event.getCategory(), event.getStrategy()));
        });

        apply((SportsCoordinatorSportOfficeChanged event) -> sportsCoordinator.sportsOffice = event.getSportsOffice());

    }
}
