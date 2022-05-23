package com.sofkau.school.sportscoordinator.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.school.sportscoordinator.values.SportsOffice;

public class ChangeSportsCoordinatorSportOffice extends Command {
    private final SportsOffice sportsOffice;

    public ChangeSportsCoordinatorSportOffice(SportsOffice sportsOffice) {
        this.sportsOffice = sportsOffice;
    }

    public SportsOffice getSportsOffice() {
        return sportsOffice;
    }
}
