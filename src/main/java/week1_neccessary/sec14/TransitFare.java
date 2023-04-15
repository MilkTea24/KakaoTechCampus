package week1_neccessary.sec14;

import java.util.HashMap;

public class TransitFare {
    private SpecialFare specialFare;
    private int startOld;
    private int endOld;
    private int fare;

    TransitFare(SpecialFare specialFare, int fare, int ...olds) {
        if (specialFare != SpecialFare.NONE) {
            this.fare = fare;
            startOld = -1;
            endOld = -1;
            return;
        }
         if (olds.length == 2) {
             this.startOld = olds[0];
             this.endOld = olds[1];
             this.fare = fare;
         }
    }

    boolean isValidFare() {
        if (specialFare != SpecialFare.NONE) {
            if (fare == 0 && startOld == endOld) return true;
            else return false;
        }
        else if (startOld >= 0 && endOld > startOld && fare >= 0) return true;
        else return false;
    }

    boolean isRightFare(SpecialFare specialFare, int old) {
        if (specialFare != SpecialFare.NONE && this.specialFare == specialFare) return true;
        if (old >= startOld && old < endOld) return true;
        return false;
    }

    int getFare() {
        return fare;
    }
}
