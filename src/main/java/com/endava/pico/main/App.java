package com.endava.pico.main;

import com.endava.pico.ann.MyInject;
import com.endava.pico.sample.DumbClass;
import com.endava.pico.sample.DumbImpl;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        DumbClass mainObj = new DumbClass();

        PicoStarter starter = new PicoStarter();
        try {
            starter.doBinding(mainObj, MyInject.class, new DumbImpl());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        mainObj.action();

    }
}