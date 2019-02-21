/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TravelAgency;

/**
 *
 * @author liumingyu
 */
public class Seat {
    private int row;
    private int column;
    private int remainSeat;
    private String seatPosition;
    private int seatState;

//    public Seat(){
//        
//        //arrSeat = new int[25][6];
//        //seatPosition = String.valueOf(column) + String.valueOf(row);
//    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRemainSeat() {
        return remainSeat;
    }

    public void setRemainSeat(int remainSeat) {
        this.remainSeat = remainSeat;
    }

    public String getSeatPosition() {
        return seatPosition;
    }

    public void setSeatPosition(String seatPosition) {
        this.seatPosition = seatPosition;
    }

    public int getSeatState() {
        return seatState;
    }

    public void setSeatState(int seatState) {
        this.seatState = seatState;
    }

    @Override
    public String toString() {
        return seatPosition;
    }
}
