public class dogAlarm {

    public static boolean shouldWakeUp (boolean barking, int hourOfTheDay){
        if ((barking) && (hourOfTheDay >= 0) && (hourOfTheDay < 25) && ((hourOfTheDay < 8) || (hourOfTheDay > 22))) {
            return true;
        }
        else return false;
    }

}
