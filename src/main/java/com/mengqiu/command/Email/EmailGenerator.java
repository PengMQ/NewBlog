package com.mengqiu.command.Email;


import com.mengqiu.domain.User;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
public class EmailGenerator {

    private FreeMarkerConfigurer freeMarkerConfig;

    @Required
    @Autowired
    public void setFreeMarkerConfig(FreeMarkerConfigurer freeMarkerConfig) {
        this.freeMarkerConfig = freeMarkerConfig;

    }



    public String generateSubject(User user) throws IOException, TemplateException {

        return generateTemplate(user, "emailTemplate/emailSubject.ftl");
    }



    private String generateTemplate(User user, String templateFile) throws IOException, TemplateException {
        String emailContent;
        Template emailContentTemplate = freeMarkerConfig.getConfiguration().getTemplate(templateFile);
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", user.getName());
        emailContent = FreeMarkerTemplateUtils.processTemplateIntoString(emailContentTemplate, map);
        return emailContent;
    }
    public String generateContent(User user) throws IOException, TemplateException {

        return  generateTemplate(user,"emailTemplate/emailTemplate.ftl");
    }


}
