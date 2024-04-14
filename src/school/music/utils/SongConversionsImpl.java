package school.music.utils;

import com.mpatric.mp3agic.Mp3File;

public class SongConversionsImpl extends SongConversions {

    public String convertToSongLengthFormat(Mp3File mp3File) {
        long minutes = mp3File.getLengthInSeconds() / 60;
        long seconds = mp3File.getLengthInSeconds() % 60;
        String formattedTime = String.format("%02d:%02d", minutes, seconds);

        return formattedTime;
    }
}
