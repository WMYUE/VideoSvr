package cwh.utils.console;

import cwh.utils.log.VSLog;

import java.io.IOException;

/**
 * Created by cwh on 16-1-5
 */

public class ConsoleUtils {
    public static String TAG = "ConsoleUtils";
    public static void waitE() {
        VSLog.d(TAG, "press e to abort");
        char c;
        try {
            c = (char) System.in.read();
            while (c != 'e') {
                c = (char) System.in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void waitE(Process process) {
        VSLog.d(TAG, "press e to abort");
        char c;
        try {
            c = (char) System.in.read();
            while (c != 'e') {
                c = (char) System.in.read();
            }
            process.destroy();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
