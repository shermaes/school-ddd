package com.sofkau.school.sportscoordinator.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.school.sportscoordinator.values.SportsOffice;


public class SportsCoordinatorSportOfficeChanged extends DomainEvent {

    private final SportsOffice sportsOffice;

    public SportsCoordinatorSportOfficeChanged(SportsOffice sportsOffice) {
        super("SherMaestre.SportsCoordinator.SportsCoordinatorSportOfficeChanged");
        this.sportsOffice = sportsOffice;
    }

    public SportsOffice getSportsOffice() {
        return sportsOffice;
    }
}
