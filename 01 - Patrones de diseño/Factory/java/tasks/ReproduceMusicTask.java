package tasks;

import main.MusicService;
import main.TaskExecuter;

public class ReproduceMusicTask implements TaskExecuter {
    private MusicService musicService; 

    public ReproduceMusicTask(MusicService musicService) {
        this.musicService = musicService; 
    }

    @Override
    public String executeTask() {
        return musicService.reproduceMusic();
    }
    
}
