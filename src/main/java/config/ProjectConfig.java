/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import com.mycompany.mavenproject1.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author earltstephens
 */
@Configuration
public class ProjectConfig {
    
    @Bean
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }
    
    @Bean
    String hello() {
        return "Hello";
    }
    
    @Bean
    Integer ten() {
        return 10;
    }
    
    @Bean
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }
    
    @Bean
    @Primary
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("Riki");
        return p;
    }
    
    @Bean(name = "Toucan Sam")
    Parrot parrot4() {
        var p = new Parrot();
        p.setName("Froot Loops");
        return p;
    }
    
    @Bean(value = "Big Bird")
    Parrot parrot5() {
        var p = new Parrot();
        p.setName("Yellow");
        return p;
    }
    
    @Bean("Tweety")
    Parrot parrot6() {
        var p = new Parrot();
        p.setName("Woodstock");
        return p;
    }
}
