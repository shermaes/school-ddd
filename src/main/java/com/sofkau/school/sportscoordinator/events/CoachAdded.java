package com.sofkau.school.sportscoordinator.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.school.sportscoordinator.values.Category;
import com.sofkau.school.sportscoordinator.values.SportsCoordinatorID;
import com.sofkau.school.sportscoordinator.values.Strategy;


public class CoachAdded extends DomainEvent {

    private final SportsCoordinatorID sportsCoordinatorID;
    private final Category category;
    private final Strategy strategy;

    public CoachAdded(SportsCoordinatorID sportsCoordinatorID, Category category, Strategy strategy) {
        super("SherMaestre.SportsCoordinator.CoachAdded");
        this.sportsCoordinatorID = sportsCoordinatorID;
        this.category = category;
        this.strategy = strategy;
    }

    public SportsCoordinatorID getSportsCoordinatorID() {
        return sportsCoordinatorID;
    }

    public Category getCategory() {
        return category;
    }

    public Strategy getStrategy() {
        return strategy;
    }
}
