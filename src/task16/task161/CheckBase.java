package task16.task161;

import java.io.File;

/**
 * @author Horoshko Maryna
 * @version 1.0
 * Все как в примере, изменила только вывод данных в консоль, сделала похожим на таблицу.
 */

public class CheckBase {

    public static boolean isBaseExists(){
        String filePath = Constants.DB_BASE_URL + Constants.DB_NAME;
        File dbFile = new File(filePath);
        return dbFile.exists();
    }
}
