package org.example.design_patterns.structural.proxy;

import java.util.HashMap;

public class YoutubeCacheProxy implements ThirdPartyYoutubeLib{
    private ThirdPartyYoutubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    public YoutubeCacheProxy(){
        this.youtubeService = new ThirdPartyYouTubeClass();
    }
    @Override
    public HashMap<String, Video> popularVideos() {
        if(cachePopular.isEmpty())
            cachePopular = youtubeService.popularVideos();
        else{
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String id) {
        Video video = cacheAll.get(id);
        if(video == null){
            video = youtubeService.getVideo(id);
            cacheAll.put(video.id(), video);
        }
        else{
            System.out.println("Retrieved list from cache.");
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
