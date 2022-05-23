package com.sofkau.school.sportscoordinator;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.school.sportscoordinator.events.CoachAdded;
import com.sofkau.school.sportscoordinator.events.SportsCoordinatorCreated;
import com.sofkau.school.sportscoordinator.values.*;
import com.sofkau.school.supervisor.events.StudentAdded;
import com.sofkau.school.supervisor.values.Grades;
import com.sofkau.school.supervisor.values.StudentID;
import com.sofkau.school.supervisor.values.YearsApproved;


import javax.lang.model.element.Name;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class SportsCoordinator extends AggregateEvent<SportsCoordinatorID> {

    protected SportsOffice sportsOffice;
    protected Set<Coach> coaches;
    protected Set<Player> players;


    public SportsCoordinator(SportsCoordinatorID sportsCoordinatorID, SportsOffice sportsOffice) {
        super(sportsCoordinatorID);
        this.sportsOffice = sportsOffice;
        appendChange(new SportsCoordinatorCreated(sportsOffice)).apply();
    }

    private SportsCoordinator(SportsCoordinatorID sportsCoordinatorID){
        super(sportsCoordinatorID);
        subscribe(new SportsCoordinatorChange(this));
    }

    public static SportsCoordinator from(SportsCoordinatorID sportsCoordinatorID, List<DomainEvent> events){
        SportsCoordinator sportsCoordinator = new SportsCoordinator(sportsCoordinatorID);
        events.forEach((event) -> sportsCoordinator.applyEvent(event));
        return sportsCoordinator;
    }
    //commands
    public void addCoach(CoachID entityId, Category category, Strategy strategy){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(category);
        Objects.requireNonNull(strategy);
        //here we append this change in order to create the event / applying that event into this aggregate
        appendChange(new CoachAdded(entityId, category, strategy)).apply();
    }

    public SportsOffice getSportsOffice() {
        return sportsOffice;
    }

    public Set<Coach> getCoaches() {
        return coaches;
    }

    public Set<Player> getPlayers() {
        return players;
    }
}
