import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Random;

public class BurritoMaker {
    public static void main(String[] args) {
        for (int i=1; i<=25; i++)
            System.out.println("Burrito " + i + ": "+ burritoMaker());

    }

    public static String burritoMaker() {
        String rice = ricePicker();
        String meat = meatPicker();
        String beans = beanPicker();
        String salsa = salsaPicker();
        String veggies = veggiePicker();
        String cheese = cheesePicker();
        String guac = guacPicker();
        String queso = quesoPicker();
        String sourCream = sourCreamPicker();
        double price = 3.0;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String burrito = rice + ", " + meat + ", " + beans + ", " + salsa + ", " + veggies + ", "
//                + cheese + ", " + guac + ", " + queso + ", " + sourCream + "\tPrice: " + currency.format(price);


        // price controller
        if (rice.equals("white rice") || rice.equals("brown rice")) {
            price += .5;
        }
        if (rice.equals("white & brown rice")) {
            price += 1.0;
        }
        if (meat.equals("chicken") || meat.equals("steak") || meat.equals("carnitas") || meat.equals("chorizo")
        || meat.equals("sofritas") || meat.equals("veggies")){
            price += .5;
        }
        if (meat.equals("chk, stk, crn, chz, sfr, vggs")) {
            price += 3.0;
        }
        if (beans.equals("pinto beans") || beans.equals("black beans")) {
            price += .5;
        }
        if (salsa.equals("mild salsa") || salsa.equals("medium salsa") || salsa.equals("hot salsa")){
            price += .5;
        }
        if (salsa.equals("mild, medium and hot salsa")) {
            price += 1.5;
        }
        if (veggies.equals("lettuce") || veggies.equals("fajita veggies")) {
            price += .5;
        }
        if (veggies.equals("lettuce and f.veggies")) {
            price += 1.0;
        }
        if (cheese.equals("cheese")) {price += .5;}
        if (guac.equals("guac")) {price += .5;}
        if (queso.equals("queso")) {price += .5;}
        if (sourCream.equals("sour cream")) {price += .5;}




        String burrito = rice + ", " + meat + ", " + beans + ", " + salsa + ", " + veggies + ", "
                + cheese + ", " + guac + ", " + queso + ", " + sourCream + "\tPrice: " + currency.format(price);

        // polishing the output so the yes or no options are not displayed for "no"
        if (burrito.contains("no cheese,")) {
            burrito = burrito.replace(" no cheese,", "");
        }
        if (burrito.contains("no guac,")) {
            burrito = burrito.replace(" no guac,", "");
        }
        if (burrito.contains("sin queso,")) {
            burrito = burrito.replace(" sin queso,", "");
        } if (burrito.contains("no sour cream")) {
            burrito = burrito.replace(", no sour cream", "");
        }



        return burrito ;
    }

    public static String ricePicker () {
        Random r = new Random();
        ArrayList<String> riceOptions = new ArrayList<>();
        riceOptions.add("white rice");
        riceOptions.add("brown rice");
        riceOptions.add("no rice");
        riceOptions.add("white & brown rice");
        return riceOptions.get(r.nextInt(riceOptions.size()));
    }

    public static String meatPicker () {
        Random r = new Random();
        ArrayList<String> meatOptions = new ArrayList<>();
        meatOptions.add("chicken");
        meatOptions.add("steak");
        meatOptions.add("carnitas");
        meatOptions.add("chorizo");
        meatOptions.add("sofritas");
        meatOptions.add("veggies");
        meatOptions.add("no meat");
        meatOptions.add("chk, stk, crn, chz, sfr, vggs");
        return meatOptions.get(r.nextInt(meatOptions.size()));
    }

    public static String beanPicker () {
        Random r = new Random();
        ArrayList<String> beanOptions = new ArrayList<>();
        beanOptions.add("pinto beans");
        beanOptions.add("black beans");
        beanOptions.add("no beans");
        return beanOptions.get(r.nextInt(beanOptions.size()));
    }

    public static String salsaPicker () {
        Random r = new Random();
        ArrayList<String> salsaOptions = new ArrayList<>();
        salsaOptions.add("mild salsa");
        salsaOptions.add("medium salsa");
        salsaOptions.add("hot salsa");
        salsaOptions.add("no salsa");
        salsaOptions.add("mild, medium and hot salsa");
        return salsaOptions.get(r.nextInt(salsaOptions.size()));
    }

    public static String veggiePicker () {
        Random r = new Random();
        ArrayList<String> veggieOptions = new ArrayList<>();
        veggieOptions.add("lettuce");
        veggieOptions.add("fajita veggies");
        veggieOptions.add("no veggies");
        veggieOptions.add("lettuce and f.veggies");
        return veggieOptions.get(r.nextInt(veggieOptions.size()));
    }

    public static String cheesePicker () {
        Random r = new Random();
        String [] cheese = new String[2];
        cheese[0] = "cheese";
        cheese[1] = "no cheese";
        return cheese[r.nextInt(2)];
    }

    public static String guacPicker () {
        Random r = new Random();
        String [] guac = new String[2];
        guac[0] = "guac";
        guac[1] = "no guac";
        return guac[r.nextInt(2)];
    }

    public static String quesoPicker () {
        Random r = new Random();
        String [] queso = new String[2];
        queso[0] = "queso";
        queso[1] = "sin queso";
        return queso[r.nextInt(2)];
    }

    public static String sourCreamPicker () {
        Random r = new Random();
        String [] sourCream = new String[2];
        sourCream[0] = "sour cream";
        sourCream[1] = "no sour cream";
        return sourCream[r.nextInt(2)];
    }
}
