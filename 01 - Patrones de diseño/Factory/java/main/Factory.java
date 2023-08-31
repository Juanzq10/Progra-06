package main;

import tasks.ChatTask;
import tasks.GetAlbumsTask;
import tasks.ReproduceMusicTask;

public class Factory {
    public TaskExecuter createTaskExecuter(String type) {
        switch (type) {
            case "Reproduce music":
                return new ReproduceMusicTask(new MusicService());        
            case "Get albums":
                return new GetAlbumsTask(new MusicService());
            default:
                return new ChatTask();
        }
    }
}