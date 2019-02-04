package com.endava.pico.main;

import java.lang.reflect.Field;

public class PicoStarter {

    public void doBinding(Object victim, Class classToBind, Object value) throws IllegalAccessException {
        Field[] fields = victim.getClass().getDeclaredFields();

        for (Field field : fields){
             if (field.getAnnotation(classToBind) != null){
                 System.out.println("found annotation");
                 field.setAccessible(true);
                 field.set(victim, value);
                 field.setAccessible(false);
                 System.out.println("made update");
             }

        }



    }


}
