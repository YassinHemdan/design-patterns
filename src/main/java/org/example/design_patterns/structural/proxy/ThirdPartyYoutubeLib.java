package org.example.design_patterns.structural.proxy;


import java.util.HashMap;


// the example provided is from guru
// https://refactoring.guru/design-patterns/proxy/java/example#example-0--some_cool_media_library-ThirdPartyYouTubeClass-java
public interface ThirdPartyYoutubeLib {
    HashMap<String, Video> popularVideos();
    Video getVideo(String id);
}
