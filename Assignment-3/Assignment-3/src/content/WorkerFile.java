/* Name: Gursimratpreet Kaur
Student ID: 991845418
Assignment-3
Date Completed: March 22, 2026 */
package content;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class WorkerFile {
    private static final String FILENAME = "Worker.dat";
    public static ArrayList<Worker> getWorkers() throws IOException ,FileNotFoundException{
        FileReader fr = new FileReader(FILENAME);
        BufferedReader br = new BufferedReader(fr);

        ArrayList <Worker> WorkerList = new ArrayList<Worker>();
        String line = br.readLine();
        while(line!=null){
            String [] list = line.split(",");
            Worker one = new Worker(list[0]);
            one.setName(list[1]);
            one.setCity(list[2]);
            one.setHours(Double.parseDouble(list[3]));
            one.setRate(Double.parseDouble(list[4]));
            WorkerList.add(one);
            line = br.readLine();
        }
        br.close();
        fr.close();
        return WorkerList;
    }

    public static void setWorkers(ArrayList <Worker> workers) throws IOException{
        FileWriter fw = new FileWriter(FILENAME);
        BufferedWriter bw = new BufferedWriter(fw);

        for(Worker w : workers){
            String record = w.getID() + "," + w.getName() + "," + w.getCity() + "," +
            w.getHours() + "," + w.getRate();
            bw.write(record);
            bw.newLine();
        }
        bw.close();
        fw.close();
    }
}
//Manager.dat contains: ID, Days Worked
//Employee.dat contains: ID, Name, City, Pay