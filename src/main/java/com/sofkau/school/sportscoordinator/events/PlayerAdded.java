package com.sofkau.school.sportscoordinator.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.school.sportscoordinator.values.Category;
import com.sofkau.school.sportscoordinator.values.SportsCoordinatorID;
import com.sofkau.school.sportscoordinator.values.Uniform;


public class PlayerAdded extends DomainEvent {

    private final SportsCoordinatorID sportsCoordinatorID;
    private final Uniform uniform;
    private final Category category;

    public PlayerAdded(SportsCoordinatorID sportsCoordinatorID, Uniform uniform, Category category) {
        super("SherMaestre.SportsCoordinator.PlayerAdded");
        this.sportsCoordinatorID = sportsCoordinatorID;
        this.uniform = uniform;
        this.category = category;
    }

    public SportsCoordinatorID getSportsCoordinatorID() {

        return sportsCoordinatorID;
    }

    public Uniform getUniform() {
        return uniform;
    }

    public Category getCategory() {
        return category;
    }
}
