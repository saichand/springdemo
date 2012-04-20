package com.saishankarc.springdemo.model;

import java.util.List;

public class RealityShow extends TelevisionProgram {
    private List<ShowParticipant> participants;

    public List<ShowParticipant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<ShowParticipant> participants) {
        this.participants = participants;
    }

}
