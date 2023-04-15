package week1_neccessary.sec14;

import java.util.HashMap;

class Transit {
    protected TransitFare[] transitFare;
    protected int earn;
    boolean isValidFare() {
        for (int i = 0; i < transitFare.length; i++) {
            if (!transitFare[i].isValidFare()) return false;
        }
        return true;
    }
    int getFare(SpecialFare specialFare, int old) {
        for (int i = 0; i < transitFare.length; i++) {
            if (transitFare[i].isRightFare(specialFare, old)) {
                return transitFare[i].getFare();
            }
        }
        return -1;
    }

    void earnFare(int fare) {
        earn += fare;
    }
}
