package com.mytags;

import javax.servlet.jsp.tagext.TagSupport;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import java.io.IOException;

public class MyTag extends TagSupport {

    private String name;
    private String age;

    public void setName(String name) { this.name = name; }
    public void setAge(String age) { this.age = age; }

    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out = pageContext.getOut();
            out.println("<h3>Name: " + name + "</h3>");
            out.println("<h3>Age: " + age + "</h3>");
        } catch (IOException e) {
            throw new JspException(e);
        }
        return SKIP_BODY;
    }
}