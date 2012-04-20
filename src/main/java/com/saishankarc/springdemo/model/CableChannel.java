package com.saishankarc.springdemo.model;

import java.util.List;

public class CableChannel {
    private int channelNumber;

    private String channelCode;

    private List<TelevisionProgram> programs;

    public int getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(int channelNumber) {
        this.channelNumber = channelNumber;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public List<TelevisionProgram> getPrograms() {
        return programs;
    }

    public void setPrograms(List<TelevisionProgram> programs) {
        this.programs = programs;
    }

}
