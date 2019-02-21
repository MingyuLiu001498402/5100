/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;

/**
 *
 * @author dell
 */
public class Log {
    private String curableAnimal;
    private String AnimalDisease;
    private Date arriveDate;
    private Date curableDate;
    private boolean curableState;

    public Log(String curableAnimal, String AnimalDisease, Date arriveDate, Date curableDate, boolean curableState) {
        this.curableAnimal = curableAnimal;
        this.AnimalDisease = AnimalDisease;
        this.arriveDate = arriveDate;
        this.curableDate = curableDate;
        this.curableState = curableState;
    }

    public String getCurableAnimal() {
        return curableAnimal;
    }

    public void setCurableAnimal(String curableAnimal) {
        this.curableAnimal = curableAnimal;
    }

    public String getAnimalDisease() {
        return AnimalDisease;
    }

    public void setAnimalDisease(String AnimalDisease) {
        this.AnimalDisease = AnimalDisease;
    }

    public Date getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    public Date getCurableDate() {
        return curableDate;
    }

    public void setCurableDate(Date curableDate) {
        this.curableDate = curableDate;
    }

    public boolean isCurableState() {
        return curableState;
    }

    public void setCurableState(boolean curableState) {
        this.curableState = curableState;
    }
}
