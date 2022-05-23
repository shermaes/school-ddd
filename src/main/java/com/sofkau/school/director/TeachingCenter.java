package com.sofkau.school.director;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.school.director.values.Activity;
import com.sofkau.school.director.values.Agenda;
import com.sofkau.school.director.values.Auditorium;
import com.sofkau.school.director.values.TeachingCenterID;
import com.sofkau.school.supervisor.values.YearsApproved;

import java.util.Objects;

public class TeachingCenter extends Entity<TeachingCenterID> {
    private Auditorium auditorium;
    private Agenda agenda;
    private Activity activity;

    public TeachingCenter(TeachingCenterID entityId, Auditorium auditorium, Agenda agenda, Activity activity) {
        super(entityId);
        this.auditorium = auditorium;
        this.agenda = agenda;
        this.activity = activity;
    }
    //behaviors
    public void changeAuditorium(Auditorium auditorium){
        this.auditorium = Objects.requireNonNull(auditorium);
    }

    public void changeAgenda(Agenda agenda){
        this.agenda = agenda;
    }

    //getters

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
