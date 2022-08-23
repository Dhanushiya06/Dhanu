package com.nseit.springExercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringExerciseApplication {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(SpringExerciseApplication.class);

        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

        int result = binarySearch.binarySearch(new int[]{11, 4, 7, 8},4);

        System.out.println(result);


    }

}
