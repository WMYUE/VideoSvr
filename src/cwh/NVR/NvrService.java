package cwh.NVR;

/**
 * Created by cwh on 15-11-28
 */

import cwh.NVR.play.PlayCallback;

/**
 * Nvr相关操作都放在这里调用
 * 对native层方法的封装与组合，简化上层操作
 * 全局多线程单例
 */
public class NvrService {

    private static class Holder {
        public static final NvrService instance = new NvrService();
    }

    public static NvrService getInstance() {
        return Holder.instance;
    }

    public void init() {
        NVRNative.init();
    }

    public void login() {
        NVRNative.login();
    }

    public void logout() {
        NVRNative.logout();
    }

    public void cleanUp() {
        NVRNative.cleanUp();
    }

    public void start() {
        init();
        login();
    }

    public void finish() {
        logout();
        cleanUp();
    }

    public void time2VideoPath(int channel,
                                             int startYear, int startMon, int startDay,
                                             int startHour, int startMin, int startSec,
                                             int endYear, int endMon, int endDay,
                                             int endHour, int endMin, int endSec,
                                             PlayCallback playCallback) {
        NVRNative.time2VideoPath(channel,
                startYear, startMon, startDay,
                startHour, startMin, startSec,
                endYear, endMon, endDay,
                endHour, endMin, endSec,
                playCallback);
    }

    public void realPlay(String ipStr) {
        
    }
}