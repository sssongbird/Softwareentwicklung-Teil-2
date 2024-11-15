package Tiere;
import Tiere.*;

public class TierFabrik {
    public static Tier erstelleTier(String tierart) {
        if (tierart.equals("Koala")) {
            return new Koala();
        } else if (tierart.equals("Clownfisch")) {
            return new Clownfisch();
        } else if (tierart.equals("Kolibri")) {
            return new Kolibri();
        }
        return null;
    }
}
