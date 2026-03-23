package com.music.streaming.platform.controller;

import com.music.streaming.platform.dto.ArtistRequest;
import com.music.streaming.platform.model.Artist;
import com.music.streaming.platform.service.ArtistService;
import com.music.streaming.platform.service.impl.ArtistServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArtistController {

   private ArtistService arservice;

    public ArtistController(ArtistService arservice) {
        this.arservice = arservice;
    }

    @PostMapping("/music/platform/v1/artists")
    public ResponseEntity<Artist> createArtist(@RequestBody ArtistRequest artistRequest){
        Artist created= arservice.createArtist(artistRequest);
        return ResponseEntity.status(HttpStatus.OK).body(created);
    }

    @GetMapping("/music/platform/v1/artists")
    public ResponseEntity<List<Artist>> getAllArtists(){
       List<Artist> artists=arservice.getAllArtists();
       return ResponseEntity.ok(artists);
    }

    @GetMapping("/music/platform/v1/artists/{artistId}")
    public ResponseEntity<Artist> getArtistById(@PathVariable Long artistId){
        Artist arti= arservice.getArtistById(artistId);
        return ResponseEntity.ok(arti);
    }

    @PutMapping("/music/platform/v1/artists/{artistId}")
    public Artist updateArtist(Long artistId, ArtistRequest artistRequest){
       return  arservice.getArtistById(artistId);
    }

    @DeleteMapping("/music/platform/v1/artists/{artistId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteArtist(Long artistId){
        arservice.deleteArtist(artistId);
    }

}
