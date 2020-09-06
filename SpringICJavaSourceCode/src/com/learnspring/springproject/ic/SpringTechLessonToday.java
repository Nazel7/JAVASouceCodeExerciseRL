package com.learnspring.springproject.ic;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public final class SpringTechLessonToday implements LessonsProvider {
    private static List<String> listString;
    private Random rand;
    public static final String LOC_PATH= "C:\\Users\\lanus\\Desktop\\SpringProgramme\\SpringProjects\\" +
            "JAVASouceCodeExercises\\SpringICJavaSourceCode\\src\\randSpringFile.txt";
    private int index;

    @Override
    public String getTopic() {
        Path locFile = FileSystems.getDefault().getPath(LOC_PATH);
        try{
            Scanner scanner= new Scanner(new BufferedReader(Files.newBufferedReader(locFile)));
            listString = new ArrayList<>();
            while(scanner.hasNext()){
                String result= scanner.nextLine();
                listString.add(result);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        rand = new Random();
        index = rand.nextInt(listString.size());
        return listString.get(index);
    }

    @Override
    public String setTodayTest() {
        switch(index){
            case 1:
                return "Describe with fact the  " + listString.get(index).substring(7);
            case 2:
                return "What is your " + listString.get(index).substring(7);
            case 3:
                return "Explain with 3 instance the " + listString.get(index).substring(7);
            default:
                return "Briefly describe " + listString.get(index).substring(7);
        }

    }
}
