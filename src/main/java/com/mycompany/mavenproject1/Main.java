/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author earltstephens
 */
public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
        
        String hello = context.getBean(String.class);
        System.out.println(hello);
        
        Integer ten = context.getBean(Integer.class);
        System.out.println(ten);
    }
}
