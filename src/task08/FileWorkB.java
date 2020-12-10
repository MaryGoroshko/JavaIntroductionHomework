package task08;

/**
 * @author Horoshko Maryna
 * @version 1.0
 */

import java.io.FileOutputStream;

public class FileWorkB {

    public static void main(String[] args) {

        try {
            String path = "C:\\Users\\User\\1stProjects\\New Folder\\MyFolder\\";

            String name = "employee.txt";

            FileOutputStream fout = new FileOutputStream(path + name);

            String s = "Должностные обязанности сотрудника ВЭД:\n\n" +
                    "1.Обеспечение международной логистики (работа с экспедиторскими компаниями)\n" +
                    "2.Поиск самого оптимального варианта перевозки по принципу цена/качество/сроки;\n" +
                    "3.Документооборот (Invoice, Packing List, Экспортные декларации, доверенности);\n" +
                    "4.Работа с компенсациями;\n" +
                    "5.Поиск новых перевозчиков для увеличения рабочей базы экспедиторов (Авиа, Море, ЖД);\n" +
                    "6.Сертификация товара";

            byte[] b = s.getBytes();

            fout.write(b);

            fout.close();

            System.out.println("Юхуу! Файл создан!");

        } catch(Exception e) {

            System.out.println("Упс! Что-то пошло не так!");
            System.out.println(e.getMessage());
        }
    }
}
