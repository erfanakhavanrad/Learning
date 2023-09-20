package broCode;


public class HashMap {
    public static void main(String[] args) {

        java.util.HashMap<String, String> countries = new java.util.HashMap<String, String>();
        countries.put("USA", "Washington DC");
        countries.put("India", "New Delhi");
        countries.put("Russia", "Moscow");
        countries.put("China", "Beijing");
        for (String o : countries.keySet()) {
            System.out.println(o);
            System.out.println(countries.size());
            System.out.println(countries.get(o));
        }
        System.out.println("*************");
        countries.replace("USA", "New York");
        for (String o : countries.keySet()) {
            System.out.println(o);
            System.out.println(countries.size());
            System.out.println(countries.get(o));
        }
        System.out.println("*************");
        countries.clear();
        for (String o : countries.keySet()) {
            System.out.println(o);
            System.out.println(countries.size());
            System.out.println(countries.get(o));
        }
        System.out.println("*************");
        countries.remove("China");
    }


}
