package com.learnspring.springproject.ic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:personalPropertyFile.txt")
public class LessonProviderConfig {

    @Bean
    public LessonsProvider lessonToday(){
        return new LessonToday();
    }

    @Bean
    public LessonsProvider springTechLessonToday(){
        return new SpringTechLessonToday();
    }
    @Bean
    public Teachers biologyTeacher(){
       return new BiologyTeacher(lessonToday());
    }
    @Bean
    public Teachers codeTutor(){
        return new CodeTutor(springTechLessonToday());
    }


}
