/* Name: Gursimratpreet Kaur
Student ID: 991845418
Assignment-3
Date Completed: March 22, 2026 */

package content;

import java.util.ArrayList;
public class ChangeWorker {
    public static boolean checkID(String id , ArrayList <Worker> WorkerList){
        for (Worker w : WorkerList){
            if(id.equals(w.getID())){
                return true;
            }
        }
        return false;
    }

    public static boolean deleteWorker(String id, ArrayList <Worker> WorkerList){
        for(Worker w : WorkerList){
            if(id.equals(w.getID())){
                WorkerList.remove(w);
                return true;
            }
        }
        return false;
    }
}
