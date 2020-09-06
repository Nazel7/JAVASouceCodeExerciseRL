package com.learnspring.springproject.ic;

import org.springframework.beans.factory.annotation.Value;

public final class BiologyTeacher implements Teachers {

    private LessonsProvider lessonsProvider;
    @Value("${bioT.institution}")
    private String institution;

    @Value("${bioT.email}")
    private String email;


    public BiologyTeacher(LessonsProvider lessonsProvider){
        this.lessonsProvider= lessonsProvider;
    }

    @Override
    public String getTeachLesson() {
        return  lessonsProvider.getTopic();
    }

    @Override
    public String setTodayTest() {
        return lessonsProvider.setTodayTest();
    }

    public String getEmail() {
        return "Email Address: "+ email;
    }

    public String getInstitution() {
        return "Institution Name: "+ institution;
    }
}
