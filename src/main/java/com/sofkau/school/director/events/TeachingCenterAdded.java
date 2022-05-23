package com.sofkau.school.director.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.school.director.values.*;



public class TeachingCenterAdded extends DomainEvent {
    private final Auditorium auditorium;
    private final Agenda agenda;
    private final Activity activity;
    private final TeachingCenterID entityId;

    public TeachingCenterAdded(TeachingCenterID entityId, Auditorium auditorium, Agenda agenda, Activity activity) {
        super("SherMaestre.Director.TeachingCenterAdded");
        this.entityId = entityId;
        this.auditorium = auditorium;
        this.agenda = agenda;
        this.activity = activity;
    }

    public TeachingCenterID getEntityId() {
        return entityId;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public Activity getActivity() {
        return activity;
    }
}
