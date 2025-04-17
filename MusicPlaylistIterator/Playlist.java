import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public SongIterator iterator() {
        return new PlaylistIterator();
    }

    public SongIterator reverseIterator() {
        return new ReversePlaylistIterator();
    }
    private class PlaylistIterator implements SongIterator {
        private int position = 0;

        @Override
        public boolean hasNext() {
            return position < songs.size();
        }

        @Override
        public Song next() {
            return songs.get(position++);
        }
    }
    private class ReversePlaylistIterator implements SongIterator {
        private int position = songs.size() - 1;

        @Override
        public boolean hasNext() {
            return position >= 0;
        }
        @Override
        public Song next() {
            return songs.get(position--);
        }
    }
}
