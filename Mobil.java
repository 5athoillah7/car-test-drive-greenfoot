// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Mobil here.
 * @author (your name) @version (a version number or a date)
 */
public class Mobil extends Actor
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the Mobil wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(9);
        if (Greenfoot.isKeyDown("up")) {
            turn(9);
        }
        if (Greenfoot.isKeyDown("down")) {
            turn(-9);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-9);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(9);
        }
    }
}
