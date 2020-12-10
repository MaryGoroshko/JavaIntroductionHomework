package task08;

/**
 * @author Horoshko Maryna
 * @version 1.0
 */

import java.io.File;

public class FileWorkA {

    public static void main(String[] args) {

        String path = "C:\\Users\\User\\1stProjects\\New Folder\\MyFolder";

        File folder = new File(path);
        boolean created = folder.mkdir();
        if(created) {
            System.out.println("Папка создана");
        } else {
            System.out.println("Упс! Что-то пошло не так!");
        }
    }
}
