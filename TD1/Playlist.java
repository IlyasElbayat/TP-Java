import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist {
    private String name;
    private List<String> tracks;

    public Playlist(String name) {
        this.name = name;
        this.tracks = new ArrayList<>();
    }

    public void addTrack(String track) {
        tracks.add(track);
    }

    public int size() {
        return tracks.size();
    }

    public List<String> getTracks() {
        return List.copyOf(tracks); 
    }
}
