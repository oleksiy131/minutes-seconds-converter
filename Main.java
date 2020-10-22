public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        //input the methods here
    }

    public static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = (int) minutes / 60;
        long remainderMins = minutes % 60;

        return hours + "h " + remainderMins + "m " + seconds + "s";
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long mins = seconds / 60;
        long remainderSeconds = seconds % 60;

        return getDurationString(mins, remainderSeconds);
    }
}
