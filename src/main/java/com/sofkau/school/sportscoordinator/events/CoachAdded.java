package com.sofkau.school.sportscoordinator.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.school.sportscoordinator.values.Category;
import com.sofkau.school.sportscoordinator.values.CoachID;
import com.sofkau.school.sportscoordinator.values.SportsCoordinatorID;
import com.sofkau.school.sportscoordinator.values.Strategy;


public class CoachAdded extends DomainEvent {


    private final Category category;
    private final Strategy strategy;
    private final CoachID entityId;

    public CoachAdded(CoachID entityId, Category category, Strategy strategy) {
        super("SherMaestre.SportsCoordinator.CoachAdded");
        this.entityId = entityId;
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

    public CoachID getEntityId() {
        return entityId;
    }
}
