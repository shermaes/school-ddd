package com.sofkau.school.sportscoordinator;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.school.sportscoordinator.values.Category;
import com.sofkau.school.sportscoordinator.values.PlayerID;
import com.sofkau.school.sportscoordinator.values.Uniform;
import java.util.Objects;


public class Player extends Entity<PlayerID> {
    private Uniform uniform;
    private  Category category;

    public Player(PlayerID entityId, Uniform uniform, Category category) {
        super(entityId);
        this.uniform = uniform;
        this.category = category;
    }
//behaviors
public void updateUniform(Uniform uniform){
    this.uniform = Objects.requireNonNull(uniform);
}

    public void updateCategory( Category category){
        this.category = category;
    }

    //getters
    public Uniform getUniform() {
        return uniform;
    }

    public Category getCategory() {
        return category;
    }
}
