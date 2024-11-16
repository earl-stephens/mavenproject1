/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

import com.mycompany.mavenproject1.Parrot;
import config.ProjectConfig;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 *
 * @author earltstephens
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { ProjectConfig.class})
public class AppTests {
    
    @Autowired
    private ApplicationContext context;
    
    @Test
    @DisplayName("test that a Parrot instance with the name attribute"
            + "Koko has been added to the context.")
    public void testKokoIsInTheSpringContext() {
        Parrot p = context.getBean("parrot1", Parrot.class);
        assertEquals("Koko", p.getName());
    }
    
    @Test
    public void testForStringHello() {
        String s = context.getBean(String.class);
        assertEquals("Hello", s);
    }
    
    @Test
    public void testForInteger10() {
        Integer i = context.getBean(Integer.class);
        assertEquals(10, i);
    }
    
        
    @Test
    public void testForSecondParrot() {
        Parrot p = context.getBean("parrot2", Parrot.class);
        
        assertEquals("Miki", p.getName());
    }
    
    @Test
    public void testForThirdParrot() {
        Parrot p = context.getBean("parrot3", Parrot.class);
        
        assertEquals("Riki", p.getName());
    }
    
    @Test
    public void testForPrimaryParrot() {
        Parrot p = context.getBean(Parrot.class);
        
        assertEquals("Riki", p.getName());
    }
    
    @Test
    public void testForBeanName() {
        Parrot p = context.getBean("Toucan Sam", Parrot.class);
        
        assertEquals("Froot Loops", p.getName());
    }
    
    @Test
    public void testForBeanValue() {
        Parrot p = context.getBean("Big Bird", Parrot.class);
        
        assertEquals("Yellow", p.getName());
    }
    
    @Test
    public void testForSetBeanNameDirectly() {
        Parrot p = context.getBean("Tweety", Parrot.class);
        
        assertEquals("Woodstock", p.getName());
    }
}
