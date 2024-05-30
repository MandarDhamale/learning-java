package corejava.staticinnerclass;

public class Audi {

    Features features = new Features();

    public Features getFeatures() {
        return features;
    }

    //static inner class - these cannot change hence they are static
    public static class Brand{
        private static String brandName = "Audi";
        private static String tagLine = "Vorsprung durch Technik";

        public static void brandInfo(){
            System.out.println("Brand Name: " + brandName);
            System.out.println("Tagline: " + tagLine);
        }

    }

    //non-static inner class - these features can change hence they are non-static
    public class Features{

        private boolean abs = true;
        private boolean esc = true;

        public boolean isAbs() {
            return abs;
        }

        public void setAbs(boolean abs) {
            this.abs = abs;
        }

        public boolean isEsc() {
            return esc;
        }

        public void setEsc(boolean esc) {
            this.esc = esc;
        }

        public void safetyFeatures(){
            System.out.println("ABS: " + abs);
            System.out.println("ESC: " + esc);
        }

        @Override
        public String toString() {
            return "Features{" +
                    "abs=" + abs +
                    ", esc=" + esc +
                    '}';
        }
    }

}
