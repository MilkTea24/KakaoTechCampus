package neccessary.week01.sec14;

class Subway extends Transit {
    private String lineColor;


    Subway(String lineColor) {
        this.lineColor = lineColor;
        this.earn = 0;
        transitFare = new TransitFare[7];

        transitFare[0] = new TransitFare(SpecialFare.DISABLED, 0);
        transitFare[1] = new TransitFare(SpecialFare.MERITS, 0);
        transitFare[2] = new TransitFare(SpecialFare.NONE, 0, 0, 6);
        transitFare[3] = new TransitFare(SpecialFare.NONE, 450, 6, 13);
        transitFare[4] = new TransitFare(SpecialFare.NONE, 720, 13, 19);
        transitFare[5] = new TransitFare(SpecialFare.NONE, 1250, 19, 65);
        transitFare[6] = new TransitFare(SpecialFare.NONE, 0, 65, Integer.MAX_VALUE);
    }

    @Override
    public String toString() {
        return lineColor + " Subway";
    }

}
