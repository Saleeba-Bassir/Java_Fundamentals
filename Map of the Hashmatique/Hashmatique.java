import java.util.HashMap;

public class Hashmatique {
    public static void main(String[] args) {
        // Create a HashMap to store the song titles and their lyrics
        HashMap<String, String> trackList = new HashMap<>();

        // Add songs to the HashMap
        trackList.put("Bohemian Rhapsody", "Is this the real life? Is this just fantasy?");
        trackList.put("Stairway to Heaven", "There's a lady who's sure all that glitters is gold");
        trackList.put("Hotel California", "On a dark desert highway, cool wind in my hair");
        trackList.put("Sweet Child O' Mine", "She's got a smile that it seems to me, reminds me of childhood memories");

        // Get a song by its title
        String lyrics = trackList.get("Hotel California");
        System.out.println("Lyrics of Hotel California: " + lyrics);

        // Print out all the tracks and their lyrics
        for (String track : trackList.keySet()) {
            System.out.println("Track: " + track);
            System.out.println("Lyrics: " + trackList.get(track));
            System.out.println();
        }
    }
}
