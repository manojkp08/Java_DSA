package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ItineraryFromTickets {
    public static List<String> findItinerary(List<List<String>> tickets) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (List<String> ticket : tickets) {
            String source = ticket.get(0);
            String destination = ticket.get(1);
            if (!map.containsKey(source)) {
                map.put(source, new ArrayList<>());
            }
            map.get(source).add(destination);
        }
        List<String> itinerary = new ArrayList<>();
        visit("JFK", map, itinerary);
        return itinerary;
    }

    private static void visit(String airport, HashMap<String, List<String>> map, List<String> itinerary) {
        List<String> destinations = map.get(airport);
        while (destinations != null && !destinations.isEmpty()) {
            String nextAirport = destinations.remove(0);
            visit(nextAirport, map, itinerary);
        }
        itinerary.add(0, airport);
    }

    public static void main(String[] args) {
        List<List<String>> tickets = new ArrayList<>();
        tickets.add(List.of("JFK", "SFO"));
        tickets.add(List.of("SFO", "LAX"));
        tickets.add(List.of("LAX", "HKG"));
        tickets.add(List.of("HKG", "NRT"));
        tickets.add(List.of("NRT", "JFK"));

        List<String> itinerary = findItinerary(tickets);
        System.out.println("Itinerary: " + itinerary);
    }
}
// Time Complexity: O(n) - where n is the number of tickets
// Best Case Time Complexity: O(n) - when the tickets are arranged in a straight
// path
