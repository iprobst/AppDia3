package TT;

import java.time.LocalDateTime;

public class Time {
    static long star;
    static long end;

    public static void start(){
        setStar(System.currentTimeMillis());
    }

    public static void end(){
        setEnd(System.currentTimeMillis());
    }

    public static long elapsedTime(){
        return getEnd()-getStar();
    }

    public static long getStar() {
        return star;
    }

    public static void setStar(long star) {
        Time.star = star;
    }

    public static long getEnd() {
        return end;
    }

    public static void setEnd(long end) {
        Time.end = end;
    }
}
