/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import shared.Data;

/**
 *
 * @author ranee
 */
public class MyData implements Data {
    
    
    Double p ;
    Double t;
    Double v;
   String r;
    
    public MyData(Double p, Double t, Double v, String r) {
        this.p = p;
        this.t = t;
        this.v = v;
        this.r = r;
    }



    @Override
    public Double sendtemp() {
        return t ;

    }

    @Override
    public Double sendpluv() {
        return p ;

    }

    @Override
    public Double sendvent() {
        return v ;

    }

    @Override
    public String sendReg() {
        return r ;

    }

    
    
}
