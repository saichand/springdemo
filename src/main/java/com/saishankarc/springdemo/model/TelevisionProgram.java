package com.saishankarc.springdemo.model;

import java.util.List;

public class TelevisionProgram {
    private String programName;

    private List<ProgramSchedule> schedule;

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public List<ProgramSchedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<ProgramSchedule> schedule) {
        this.schedule = schedule;
    }

}
