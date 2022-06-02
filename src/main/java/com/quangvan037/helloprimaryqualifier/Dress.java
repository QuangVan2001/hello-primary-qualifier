package com.quangvan037.helloprimaryqualifier;

import org.springframework.stereotype.Component;

@Component("dress")
public class Dress implements Outfit{
    @Override
    public void wear(){
        System.out.println("wear dress");
    }
}
