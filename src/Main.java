public class Main {
        public static void main(String[] args) {
            float costOfPaintPerLitre = 1;
            float coverageOfPaintPerLiterInMetersSquared = 23;
            float totalWidthOfAllWalls = 5;
            float totalLengthOfAllWalls = 25;
            float totalAreaOfWall = totalWidthOfAllWalls * totalLengthOfAllWalls;
            float totalAmountOfPaint = totalAreaOfWall / coverageOfPaintPerLiterInMetersSquared;

            float totalCost = totalAmountOfPaint * costOfPaintPerLitre;

            System.out.println(totalCost);
            System.out.println("hello " + String.format("%.2f", totalCost));
            System.out.println(Math.ceil(totalCost));


        }

}

