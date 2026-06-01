package org.example.simplefactory;

import java.time.LocalDate;

public class NewPost extends Post{
    private String headLine;

    private LocalDate newTime;

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public LocalDate getNewTime() {
        return newTime;
    }

    public void setNewTime(LocalDate newTime) {
        this.newTime = newTime;
    }
}
