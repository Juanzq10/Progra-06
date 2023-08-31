package tasks;

import main.MusicService;
import main.TaskExecuter;

public class GetAlbumsTask implements TaskExecuter {
    private MusicService musicService;

    public GetAlbumsTask(MusicService musicService) {
        this.musicService = musicService; 
    }

    @Override
    public String executeTask() {
        return musicService.getAlbums(); 
    }
    
}
