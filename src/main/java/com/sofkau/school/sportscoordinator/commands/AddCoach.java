package com.sofkau.school.sportscoordinator.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.school.sportscoordinator.values.Category;
import com.sofkau.school.sportscoordinator.values.SportsCoordinatorID;
import com.sofkau.school.sportscoordinator.values.Strategy;

public class AddCoach extends Command {

    private final SportsCoordinatorID sportsCoordinatorID;
    private final Category category;
    private final Strategy strategy;

    public AddCoach(SportsCoordinatorID sportsCoordinatorID, Category category, Strategy strategy) {
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
