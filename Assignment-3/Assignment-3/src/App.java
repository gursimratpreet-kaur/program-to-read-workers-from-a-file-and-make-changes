/* Name: Gursimratpreet Kaur
Student ID: 991845418
Assignment-3
Date Completed: March 22, 2026 */

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import content.ChangeWorker;
import content.Worker;
import content.WorkerFile;

public class App {
    public static void main(String[] args)  throws IOException{
        //Creating ArrayList
        ArrayList <Worker> WorkerList = WorkerFile.getWorkers();

        System.out.println("1. Display Workers");
        System.out.println("2. Add Worker");
        System.out.println("3. Delete Worker");
        System.out.println("4. End Program");
        Scanner k = new Scanner(System.in);
        Scanner l = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        String choice = k.nextLine();
        while(!choice.equals("4")){
            
            //Anything except 1,2,3 will be invalid and prompt the user to make a choice again.
            if (choice.equals("1")){
                if(WorkerList.isEmpty()){
                    System.out.println("No Worker data found");
                }
                //Creating table
                else{
                    System.out.printf("%-8s %-12s %-12s %-12s %-12s %-12s" , "ID" ,"Name" , "City" , "Hours" , "Rate" , "Pay");
                    System.out.println();
                    for(Worker w : WorkerList){
                        System.out.printf("%-8s %-12s %-12s %-12s %-12s %-12s",w.getID(), w.getName(), w.getCity(), w.getHours(),w.getRate() ,w.getPay());
                        System.out.println();
                    }
                }
            }
            else if (choice.equals("2")){
                System.out.print("Enter ID: ");
                String id = k.nextLine();
                while(ChangeWorker.checkID(id, WorkerList)){
                    System.out.print("Enter unique ID: ");
                    id = k.nextLine();
                }
              
                
                System.out.print("Enter Name: ");
                String name = k.nextLine();
                
                System.out.print("Enter City: ");
                String city = k.nextLine();
                
                System.out.print("Enter hours worked: ");
                Double hours = l.nextDouble();
                

                //To validate the input for hours and rate
                while(hours < 0){
                    System.out.print("Hours cannot be negative. Enter hours worked: ");
                    hours = l.nextDouble();
                }
                System.out.print("Enter rate: ");
                Double rate = l.nextDouble();
                while(rate < 0){
                    System.out.print("Rate cannot be negative. Enter rate: ");
                    rate = l.nextDouble();
                }        
                Worker one = new Worker(id);
                one.setName(name);
                one.setCity(city);
                one.setHours(hours);
                one.setRate(rate);
                WorkerList.add(one);
            }
            
            else if (choice.equals("3")){
                System.out.print("Enter ID of worker to be deleted: ");
                String delID = k.nextLine();
                //ChangeWorker.deleteWorker(delID, WorkerList);
                if (ChangeWorker.deleteWorker(delID, WorkerList) == true){
                    System.out.println("Worker has been deleted");
                }
                else{
                    System.out.println("Worker has not been deleted");
                }
            }
            else{
                System.out.println("Invalid Input!");
            }
            System.out.println("1. Display Workers");
            System.out.println("2. Add Worker");
            System.out.println("3. Delete Worker");
            System.out.println("4. End Program");
            System.out.print("Enter your choice: ");
            choice = k.nextLine();
        }
        //To write the contents of arraylist into worker.dat file.
        WorkerFile.setWorkers(WorkerList);
        System.out.println("Student Name: Gursimratpreet Kaur");
        System.out.println("Student ID: 991845418");
        l.close();
        k.close();
    }
}