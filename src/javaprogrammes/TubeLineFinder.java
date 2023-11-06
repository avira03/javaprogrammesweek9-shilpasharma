package javaprogrammes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TubeLineFinder {
    // Map representing the London Underground lines and their stations in Zone 1
    private static final Map<String, String[]> tubeLines = new HashMap<>();

    static {
        tubeLines.put("Bakerloo", new String[]{"Paddington", "Edgware Road", "Baker Street", "Regent's Park", "Oxford Circus", "Piccadilly Circus", "Charing Cross", "Waterloo"});
        tubeLines.put("Central", new String[]{"Notting Hill Gate", "Queensway", "Lancaster Gate", "Marble Arch", "Bond Street", "Oxford Circus", "Tottenham Court Road", "Holborn"});
        tubeLines.put("Circle", new String[]{"Paddington", "Baker Street", "Edgware Road", "Victoria", "Embankment", "Blackfriars", "Cannon Street", "Monument"});
        tubeLines.put("District", new String[]{"South Kensington", "Sloane Square", "Victoria", "St. James's Park", "Westminster", "Embankment", "Blackfriars", "Cannon Street"});
        tubeLines.put("Hammersmith & City", new String[]{"Paddington", "Baker Street", "Edgware Road", "Great Portland Street", "Euston Square", "King's Cross St Pancras", "Farringdon", "Barbican"});
        tubeLines.put("Jubilee", new String[]{"Baker Street", "Bond Street", "Green Park", "Westminster", "Waterloo", "Southwark", "London Bridge"});
        tubeLines.put("Metropolitan", new String[]{"Paddington", "Baker Street", "Great Portland Street", "Euston Square", "King's Cross St Pancras", "Farringdon", "Barbican", "Liverpool Street"});
        tubeLines.put("Northern", new String[]{"Paddington", "Edgware Road", "Baker Street", "Camden Town", "King's Cross St Pancras", "Moorgate", "Bank", "London Bridge"});
        tubeLines.put("Piccadilly", new String[]{"South Kensington", "Knightsbridge", "Green Park", "Piccadilly Circus", "Leicester Square", "Covent Garden", "Holborn"});
        tubeLines.put("Victoria", new String[]{"Victoria", "Green Park", "Oxford Circus", "Warren Street", "Euston"});
        tubeLines.put("Waterloo & City", new String[]{"Waterloo", "Bank"});
    }

    public static String findLineBetweenStations(String station1, String station2) {
        for (Map.Entry<String, String[]> entry : tubeLines.entrySet()) {
            String line = entry.getKey();
            String[] stations = entry.getValue();
            if (containsStation(stations, station1) && containsStation(stations, station2)) {
                return line;
            }
        }
        return null;
    }

    private static boolean containsStation(String[] stations, String station) {
        for (String s : stations) {
            if (s.equalsIgnoreCase(station)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first station: ");
        String station1 = scanner.nextLine();

        System.out.print("Enter the second station: ");
        String station2 = scanner.nextLine();
        // close scanner
        scanner.close();

        // Find the line connecting the two stations
        String line = findLineBetweenStations(station1, station2);

        // Output the result
        if (line != null) {
            System.out.println("The " + line + " line connects " + station1 + " and " + station2 + ".");
        } else {
            System.out.println("There is no direct connection between " + station1 + " and " + station2 + " on any Tube line.");
        }


    }
}








