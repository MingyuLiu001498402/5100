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
public class SeatList {
    private final int row= 25;
    private final int column = 6;
    private final int seatNum = 150;
    private int remainSeat=150;
    private int[][] arrSeat;
    //private Seat seat;
    //private ArrayList<Seat> seatList;
    
    
    public SeatList(){
       
        //remainSeat = seatNum;
        arrSeat = new int[row][column];
    }

    public int getRemainSeat() {
        return remainSeat;
    }

    public void setRemainSeat(int remainSeat) {
        this.remainSeat = remainSeat;
    }

    public int[][] getArrSeat() {
        return arrSeat;
    }

    public void setArrSeat(int[][] arrSeat) {
        this.arrSeat = arrSeat;
    }
    
    public int  getArrSeatValue(int row,int column) {
        int i = arrSeat[row][column];
        return i;
    }

    public void setArrSeatValue(int row,int column,int i) {
        arrSeat[row][column] = i;
    }
}
