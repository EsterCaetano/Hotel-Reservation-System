/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author ester
 */
public class vquartos {
    private int idquartos;
    private String number;
    private String walk;
    private String descrition;
    private String characteristics;
    private Double dailyValue;
    private String state;
    private String roomType;

    
  //Construtor
    public vquartos(int idquartos, String number, String walk, String descrition, String characteristics, Double dailyValue, String state, String roomType) {
        this.idquartos = idquartos;
        this.number = number;
        this.walk = walk;
        this.descrition = descrition;
        this.characteristics = characteristics;
        this.dailyValue = dailyValue;
        this.state = state;
        this.roomType = roomType;
    }

    public vquartos() {
    }
    
//Metodos
    public int getIdquartos() {
        return idquartos;
    }

    public void setIdquartos(int idquartos) {
        this.idquartos = idquartos;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getWalk() {
        return walk;
    }

    public void setWalk(String walk) {
        this.walk = walk;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public String getcharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public Double getDailyValue() {
        return dailyValue;
    }

    public void setDailyValue(Double dailyValue) {
        this.dailyValue = dailyValue;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

   
   
}