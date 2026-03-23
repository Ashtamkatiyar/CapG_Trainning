package com.music.streaming.platform.controller;

import com.music.streaming.platform.dto.PlayListRequest;
import com.music.streaming.platform.model.PlayList;
import com.music.streaming.platform.service.PlayListService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlayListController {

    private PlayListService pservice;

    public PlayListController(PlayListService pservice) {
        this.pservice = pservice;
    }

    @PostMapping("/music/platform/v1/playlists")

    public PlayList createPlayList(@RequestBody PlayListRequest playListRequest){
       return pservice.createPlayList(playListRequest);
    }

    @GetMapping("/music/platform/v1/playlists/{playListId}")
    @ResponseStatus(HttpStatus.OK)
    public PlayList getPlayListById(@PathVariable Long playListId){
        return pservice.getPlayListById(playListId);
    }

    @DeleteMapping("/music/platform/v1/playlists/{playListId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePlayList(@PathVariable Long playListId){
    pservice.deletePlayList(playListId);
    }
}
