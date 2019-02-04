package com.endava.pico.sample;

import com.endava.pico.ann.MyInject;

public class DumbClass {

    @MyInject
    private DumbInterface operator;


    public void action(){

        operator.doSomethingSpecial();
    }

}
