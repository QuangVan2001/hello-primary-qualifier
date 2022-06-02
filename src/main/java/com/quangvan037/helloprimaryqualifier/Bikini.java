package com.quangvan037.helloprimaryqualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bikini")
public class Bikini implements Outfit{
    @Override
    public void wear(){
        System.out.println("wear bikini");
    }
}
