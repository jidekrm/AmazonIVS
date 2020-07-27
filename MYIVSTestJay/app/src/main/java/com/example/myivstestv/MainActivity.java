package com.example.myivstestv;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.amazonaws.ivs.player.Cue;
import com.amazonaws.ivs.player.Player;
import com.amazonaws.ivs.player.PlayerException;
import com.amazonaws.ivs.player.PlayerView;
import com.amazonaws.ivs.player.Quality;
import com.example.myivstestv.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding binding =  ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        PlayerView playerView = binding.playerView;
        Player player = playerView.getPlayer();

        player.load();
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