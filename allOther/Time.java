package allOther;

public class Time implements Describable {
    private WhatTime time;

    public Time(WhatTime time) {
        this.time = time;
    }

    public WhatTime getTime() {
        return time;
    }

    public boolean setTime(WhatTime time) {
        this.time = time;
        return true;
    }

    @Override
    public String describe() {
        return "Время: " + this.time;
    }
}
