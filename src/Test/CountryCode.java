package sample;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class CountryCode {

    public static void main(String[] args) {
        Map<String, String> locationToCountryCodeMap = createLocationToCountryCodeMap();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the location:");
        String inputLocation = scanner.nextLine().toLowerCase();

        String countryCode = locationToCountryCodeMap.get(inputLocation);

        if (countryCode == null) {
            System.out.println("No results were found for " + inputLocation);
        } else {
            System.out.println("Country code for " + inputLocation + " is " + countryCode);
        }

        scanner.close();
    }

    private static Map<String, String> createLocationToCountryCodeMap() {
        Map<String, String> map = new HashMap<>();
        map.put("texas", "US");
        map.put("london", "UK");
        map.put("hyderabad", "IN");
        map.put("delhi", "IN");
        map.put("berlin", "GE");
        map.put("tokyo", "JAPAN");
        return map;
    }
}




