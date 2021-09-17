package diverse;

//  Created by Bogdan Trif on 03-11-2018 , 9:55 PM.


import org.omg.CORBA.ExceptionList;

import javax.management.RuntimeErrorException;
import java.rmi.server.ExportException;

public class TaskBase {
    int getStatusCode(Object obj) throws NullPointerException {
        if (obj != null ) {
            return 1;
        } else {
            return 0;
        }
    }

}

class ParallelTask extends TaskBase {
    int getStatusCode(Object obj) throws InterruptedException {
        if (obj != null ) {
            System.out.println(1);
            return 1;
        } else {
            return 0;
        }
    }


    public static void main(String[] args){
        TaskBase TB = new TaskBase();
        TB.getStatusCode(1);
        ParallelTask PT = new ParallelTask();
        PT.getStatusCode("1");




    }

}
