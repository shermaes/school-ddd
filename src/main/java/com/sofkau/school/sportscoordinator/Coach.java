package com.sofkau.school.sportscoordinator;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.school.sportscoordinator.values.Category;
import com.sofkau.school.sportscoordinator.values.CoachID;
import com.sofkau.school.sportscoordinator.values.Strategy;
import java.util.Objects;


public class Coach extends Entity<CoachID> {

    private CoachID entityId;
    private Category category;
    private Strategy strategy;

    public Coach(CoachID entityId, Category category, Strategy strategy) {
        super(entityId);
        this.entityId = entityId;
        this.category = category;
        this.strategy = strategy;
    }
//behaviors
public void changeCategory(Category category){
    this.category = Objects.requireNonNull(category);
}

    public void updateStrategy( Strategy strategy){
        this.strategy = strategy;
    }

    public CoachID getEntityId() {
        return entityId;
    }

    public Category getCategory() {
        return category;
    }

    public Strategy getStrategy() {
        return strategy;
    }
}
