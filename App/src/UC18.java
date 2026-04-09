public class UC18 {

    public static boolean linearSearch(String[] bogieIds, String key) {
        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        System.out.println(linearSearch(bogies, "BG309"));
        System.out.println(linearSearch(bogies, "BG999"));
        System.out.println(linearSearch(bogies, "BG101"));
        System.out.println(linearSearch(bogies, "BG550"));

        String[] single = {"BG101"};
        System.out.println(linearSearch(single, "BG101"));
    }
}
