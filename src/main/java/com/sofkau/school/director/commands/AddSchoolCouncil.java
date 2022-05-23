package com.sofkau.school.director.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.school.director.values.Agenda;
import com.sofkau.school.director.values.Delegate;
import com.sofkau.school.director.values.DirectorID;
import com.sofkau.school.director.values.Topic;

public class AddSchoolCouncil extends Command {
    private final DirectorID directorID;
    private final Delegate delegate;
    private final Topic topic;
    private final Agenda agenda;

    public AddSchoolCouncil(DirectorID directorID, Delegate delegate, Topic topic, Agenda agenda) {
        this.directorID = directorID;
        this.delegate = delegate;
        this.topic = topic;
        this.agenda = agenda;
    }

    public DirectorID getDirectorID() {
        return directorID;
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
