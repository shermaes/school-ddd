package com.sofkau.school.director.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.school.director.values.*;


public class SchoolCouncilAdded extends DomainEvent {
    private final SchoolCouncilID entityId;
    private final Delegate delegate;
    private final Topic topic;
    private final Agenda agenda;

    public SchoolCouncilAdded(SchoolCouncilID entityId, Delegate delegate, Topic topic, Agenda agenda) {
        super("shermaestre.Director.SchoolCouncilAdded");
        this.entityId = entityId;

        this.delegate = delegate;
        this.topic = topic;
        this.agenda = agenda;
    }

    public SchoolCouncilID getEntityId() {
        return entityId;
    }

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
