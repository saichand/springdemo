package com.saishankarc.springdemo;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.saishankarc.springdemo.model.CableChannel;
import com.saishankarc.springdemo.model.ProgramSchedule;
import com.saishankarc.springdemo.model.RealityShow;
import com.saishankarc.springdemo.model.ShowParticipant;
import com.saishankarc.springdemo.model.TelevisionProgram;

@Controller
@RequestMapping("/rest")
public class SpringDemoRestController {
    
    @RequestMapping(value="/getChannels/{cableNetworkName}", 
            method = RequestMethod.GET)
    public @ResponseBody List<CableChannel> getChannelsInJSON(@PathVariable String cableNetworkName) {

        CableChannel channel = new CableChannel();
        channel.setChannelCode("ESPN");
        channel.setChannelNumber(140);
        
        ShowParticipant participant = new ShowParticipant();
        participant.setName("Participant 1");
        participant.setParticipantId("D0005");
        
        List<ShowParticipant> participants = new ArrayList<ShowParticipant>();
        participants.add(participant);

        ProgramSchedule schedule = new ProgramSchedule();
        DateTime startDate = new DateTime(2012, 4, 20, 20, 5, DateTimeZone.forID("America/Los_Angeles"));
        DateTime endDate = new DateTime(2012, 4, 20, 21, 10, DateTimeZone.forID("America/Los_Angeles"));
        schedule.setStartTime(startDate);
        schedule.setEndTime(endDate);
        
        List<ProgramSchedule> schedules = new ArrayList<ProgramSchedule>();
        schedules.add(schedule);
        
        RealityShow americanIdol = new RealityShow();
        americanIdol.setProgramName("American Idol");
        americanIdol.setParticipants(participants);
        americanIdol.setSchedule(schedules);
        
        List<TelevisionProgram> programs = new ArrayList<TelevisionProgram>();
        programs.add(americanIdol);
        channel.setPrograms(programs);
        List<CableChannel> channels = new ArrayList<CableChannel>();
        channels.add(channel);
        return channels;
    }
}
