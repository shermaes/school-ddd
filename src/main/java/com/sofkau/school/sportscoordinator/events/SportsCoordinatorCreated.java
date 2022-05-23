package com.sofkau.school.sportscoordinator.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.school.sportscoordinator.values.SportsOffice;


public class SportsCoordinatorCreated extends DomainEvent {

    private final SportsOffice sportsOffice;

    public SportsCoordinatorCreated(SportsOffice sportsOffice) {
        super("shermaestre.SportCoordinator.SportsCoordinatorCreated");
        this.sportsOffice = sportsOffice;
    }

    public SportsOffice getSportsOffice() {
        return sportsOffice;
    }
}
