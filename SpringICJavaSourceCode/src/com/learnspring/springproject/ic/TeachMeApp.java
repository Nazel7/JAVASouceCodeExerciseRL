package com.learnspring.springproject.ic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TeachMeApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext javaContext=
                new AnnotationConfigApplicationContext(LessonProviderConfig.class);
        Teachers bioTeacher= javaContext.getBean("biologyTeacher", Teachers.class);
        Teachers codeTutor= javaContext.getBean("codeTutor", Teachers.class);
        System.out.println(bioTeacher.getInstitution());
        System.out.println(bioTeacher.getEmail());
        System.out.println("Lesson\n=================================");
        System.out.println(bioTeacher.getTeachLesson());
        System.out.println("Test Question:\n"+ bioTeacher.setTodayTest());
        System.out.println("\nSpring Class\n============================");
        System.out.println(codeTutor.getInstitution());
        System.out.println(codeTutor.getEmail());
        System.out.println(codeTutor.getTeachLesson());
        System.out.println(codeTutor.setTodayTest());
    }


}
