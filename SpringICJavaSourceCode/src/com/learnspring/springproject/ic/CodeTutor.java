package com.learnspring.springproject.ic;

import org.springframework.beans.factory.annotation.Value;

public final class CodeTutor implements Teachers {
    private final LessonsProvider lessonsProvider;
    @Value("${springT.institution}")
    private String institution;

    @Value("${springT.email}")
    private String email;

    public CodeTutor(LessonsProvider lessonsProvider) {
        this.lessonsProvider= lessonsProvider;
    }

    @Override
    public String getInstitution() {
        return this.institution;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public String getTeachLesson() {
        return lessonsProvider.getTopic();
    }

    @Override
    public String setTodayTest() {
        return lessonsProvider.setTodayTest();
    }
}
