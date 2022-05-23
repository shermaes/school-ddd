package com.sofkau.school.director;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.school.director.values.Agenda;
import com.sofkau.school.director.values.Delegate;
import com.sofkau.school.director.values.SchoolCouncilID;
import com.sofkau.school.director.values.Topic;
import java.util.Objects;

public class SchoolCouncil extends Entity<SchoolCouncilID> {

    private  Delegate delegate;
    private  Topic topic;
    private  Agenda agenda;

    public SchoolCouncil(SchoolCouncilID entityId, Delegate delegate, Topic topic, Agenda agenda) {
        super(entityId);
        this.delegate = delegate;
        this.topic = topic;
        this.agenda = agenda;
    }
    //behaviors
    public void changeTopic(Topic topic){
        this.topic = Objects.requireNonNull(topic);
    }

    public void changeAgenda( Agenda agenda){
        this.agenda = agenda;
    }

    //getters

    public Delegate getDelegate() {
        return delegate;
    }

    public Topic getTopic() {
        return topic;
    }

    public Agenda getAgenda() {
        return agenda;
    }
}
