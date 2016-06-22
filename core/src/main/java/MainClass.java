public class MainClass {
    public static void main(String[] args) {
        System.out.println(getNumberOfHoursForStage("1.8/m"));
        double time = 45.599999999993;
        time = time * 1000;
        System.out.println((double)Math.round(time)/1000);
//        System.out.println(new Date(java.lang.System.currentTimeMillis() + 128 * 60 * 60 * 1000));
    }

    private static double getNumberOfHoursForStage(String timeStage) {
        String time = timeStage.split("/")[0];
        String timeType = timeStage.split("/")[1];
        if ("m".equals(timeType)) {
            return (double)Math.round(Double.parseDouble(time) * 30 * 24 * 1000)/1000;
        } else if ("d".equals(timeType)) {
            return (double)Math.round(Double.parseDouble(time) * 24 * 1000)/1000;
        } else {
            return Double.parseDouble(time);
        }
    }
}
