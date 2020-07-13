package org.launchcode.codingevents.models.dto;

import com.sun.istack.NotNull;
import org.aspectj.apache.bcel.generic.Tag;
import org.launchcode.codingevents.models.Event;

public class EventTagDTO {

    @NotNull
    private Event event;

    @NotNull
    private Tag tag;

    public EventTagDTO() {}

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
