package com.controller;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class WelcomeTag extends SimpleTagSupport {

    private String name;

    public void setName(String name){
        this.name=name;
    }

    public void doTag() throws JspException, IOException{
        JspWriter out = getJspContext().getOut();
        out.println("<h2>Welcome, " + name + "!</h2>");



    }
}
