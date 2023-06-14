package MyTime;

import java.io.*;

public class Main {
//    public static void main(String[] args) {
//        MyTime.MyTime timer = new MyTime.MyTime();
//
//        timer.increase();
//        timer.increase();
//        timer.increase();
//
//        timer.saveTimes();
//
//        timer.increase();
//
//        System.out.println("MyTimer: " + timer.getTime());
//
//        saveTimer(timer);
//    }

    public static void main(String[] args) {
        MyTime loaded = loadTimer();

        System.out.println("MyTimer: " + loaded);

        loaded.increase();
        loaded.saveTimes();

        saveTimer(loaded);
    }

    public static MyTime loadTimer() {
        try (FileInputStream f_in = new FileInputStream("mytime.ser");
             ObjectInputStream obj_in = new ObjectInputStream(f_in)) {
            Object obj = obj_in.readObject();
            if (obj instanceof MyTime) {
                MyTime timer = (MyTime) obj;
                System.out.println("loaded MyTime.MyTime: " + timer);
                return timer;
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void saveTimer(MyTime myTime) {
        try {
            FileOutputStream f_out = new FileOutputStream("mytime.ser");
            ObjectOutputStream obj_out = new ObjectOutputStream(f_out);
            obj_out.writeObject(myTime);
            System.out.println("MyTime.MyTime er gemt:" + myTime);
            obj_out.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
    }
}