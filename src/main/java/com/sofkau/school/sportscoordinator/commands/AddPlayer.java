package com.sofkau.school.sportscoordinator.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.school.sportscoordinator.values.Category;
import com.sofkau.school.sportscoordinator.values.SportsCoordinatorID;
import com.sofkau.school.sportscoordinator.values.Uniform;

public class AddPlayer extends Command {

    private final SportsCoordinatorID sportsCoordinatorID;
    private final Uniform uniform;
    private final Category category;

    public AddPlayer(SportsCoordinatorID sportsCoordinatorID, Uniform uniform, Category category) {
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
