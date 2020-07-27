package com.example.myivstestv;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.amazonaws.ivs.player.Cue;
import com.amazonaws.ivs.player.Player;
import com.amazonaws.ivs.player.PlayerException;
import com.amazonaws.ivs.player.PlayerView;
import com.amazonaws.ivs.player.Quality;
import com.example.myivstestv.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public static final String PLAYBACK_URL = "https://ef6df588c19d.us-east-1.playback.live-video.net/api/video/v1/us-east-1.180097409336.channel.ifLQ2wfNWrWY.m3u8";

    Player player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding binding =  ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        PlayerView playerView = binding.playerView;
         player = playerView.getPlayer();

        player.load(Uri.parse(PLAYBACK_URL));
        player.addListener(new Player.Listener() {
            @Override
            public void onCue(@NonNull Cue cue) {

            }

            @Override
            public void onDurationChanged(long l) {

            }

            @Override
            public void onStateChanged(@NonNull Player.State state) {
                //add state changes

                switch (state) {
                    case BUFFERING:
                        // player is buffering
                        break;
                    case READY:
                        player.play();
                        break;
                    case IDLE:
                        break;
                    case PLAYING:
                        // playback started
                        break;
                }


            }

            @Override
            public void onError(@NonNull PlayerException e) {

            }

            @Override
            public void onRebuffering() {

            }

            @Override
            public void onSeekCompleted(long l) {

            }

            @Override
            public void onVideoSizeChanged(int i, int i1) {

            }

            @Override
            public void onQualityChanged(@NonNull Quality quality) {

            }
        });

    }
}