/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceilingfan;

import java.awt.BorderLayout;
import java.util.Scanner;
import javax.xml.transform.OutputKeys;

/**
 *
 * @author kalal
 */
public class CeilingFan {
   private int speed=0;
   private boolean AntiClock=true;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        
        this.speed = speed;
    }

    public boolean isAntiClock() {
        return AntiClock;
    }

    public void setAntiClock(boolean AntiClock) {
        this.AntiClock = AntiClock;
    }
   public void pullchordone(){
       if(speed==3){
           speed=0;
           
       }
       else{
           speed++;
       }
       
   }
   public void pullchordtwo(){
       if(speed!=0){
           if(AntiClock==true)
           {
               this.AntiClock=false;
           }
           else{
               this.AntiClock=true;
           }
           
       }
       
   }
    public static void main(String[] args) {
        CeilingFan cf=new CeilingFan();
        int op=0;
        while(true){
            System.out.println("press 1 for pulling chord 1");
            System.out.println("press 2 for pulling chord 2");
            System.out.println("enter your choice :");
            Scanner sc=new Scanner(System.in);
            op=sc.nextInt();
            switch(op){
                case 1:
                    cf.pullchordone();
                    break;
                case 2:
                    cf.pullchordtwo();
                    break;
                default:
                    System.out.println("Wrong option selected");
                    
                            
                            
                    
            }
            System.out.println("Speed is : "+cf.getSpeed());
            if(cf.isAntiClock()==true){
                System.out.println("Direction is AntiClock");
            }
            else{
                System.out.println("Direction is Clockwise");
            }
            

        }
        
    }
   
}
