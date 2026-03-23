package com.music.streaming.platform.controller;

import com.music.streaming.platform.dto.TrackRequest;
import com.music.streaming.platform.model.Track;
import com.music.streaming.platform.service.TrackService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TrackController {
    private TrackService tservice;

    public TrackController(TrackService tservice) {
        this.tservice = tservice;
    }
@PostMapping("/music/platform/v1/tracks")
public Track createTrack(TrackRequest trackRequest){
        return tservice.createTrack(trackRequest);
}

@GetMapping("/music/platform/v1/tracks")
public List<Track> getAllTracks(){
        return tservice.getAllTracks();
}

@GetMapping("/music/platform/v1/tracks/{trackId}")
public Track getTrackById(Long trackId){
        return tservice.getTrackById(trackId);
}

@PutMapping("/music/platform/v1/tracks/{trackId}")
public Track updateTrack(Long trackId, TrackRequest trackRequest){
        return tservice.updateTrack(trackId,trackRequest);
}

@DeleteMapping("/music/platform/v1/tracks/{trackId}")
@ResponseStatus(HttpStatus.NO_CONTENT)
public void deleteTrack(Long trackId){
        tservice.deleteTrack(trackId);
}

}
