package task16.task162;

import java.io.File;

/**
 * @author Horoshko Maryna
 * @version 1.1
 * Добавление значений через ArrayList
 */

public class CheckBase {

    public static boolean isBaseExists(){
        String filePath = Constants.DB_BASE_URL + Constants.DB_NAME;
        File dbFile = new File(filePath);
        return dbFile.exists();
    }
}
