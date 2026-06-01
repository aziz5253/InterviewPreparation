package com.tags;

import java.io.IOException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;

public class HelloTag extends SimpleTagSupport {

    private String name;   // attribute

    // setter method for attribute
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doTag() throws JspException, IOException {

        JspWriter out = getJspContext().getOut();

        if (name != null) {
            out.println("Hello, " + name + "! Welcome to Custom Tags.");
        } else {
            out.println("Hello Guest!");
        }
    }
}