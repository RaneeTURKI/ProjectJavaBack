/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package shared;

import java.io.Serializable;

/**
 *
 * @author ranee
 */
public interface Data  extends Serializable{
    
    
    Double sendtemp();
    
        Double sendpluv();

    Double sendvent();
    
    String sendReg();
    
    
}
