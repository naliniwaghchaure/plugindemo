package com.atlassian.tutorial.jira.webwork;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.atlassian.jira.web.action.JiraWebActionSupport;

public class CreatedRecentlyAction extends JiraWebActionSupport
{
    private static final Logger log = LoggerFactory.getLogger(CreatedRecentlyAction.class);

    @Override
    public String execute() throws Exception {

        return super.execute(); //returns SUCCESS
    }
}
