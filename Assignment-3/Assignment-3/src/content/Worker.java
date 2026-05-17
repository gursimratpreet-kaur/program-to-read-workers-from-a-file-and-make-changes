/* Name: Gursimratpreet Kaur
Student ID: 991845418
Assignment-3
Date Completed: March 22, 2026 */

package content;

public class Worker {
    private String id = "";
    public Worker(String id){
        this.id=id;
    }
    public String getID(){
        return this.id;
    }
    private String name="";
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    private String city ="";
    public String getCity(){
        return this.city;
    }
    public void setCity(String city){
        this.city = city;
    }

    private double hours= 0;
    public double getHours(){
        return this.hours;
    }
    public void setHours(double hours){
        this.hours = hours;
    }
    private double rate = 0;
    public double getRate(){
        return this.rate;
    }
    public void setRate(double rate){
        this.rate = rate;
    }

    private double pay =0;
    public double getPay(){
        calculatePay();
        return this.pay;
    }

    private void calculatePay(){
        this.pay = this.hours * this.rate;
    }

}
