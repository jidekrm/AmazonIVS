package com.example.myivstestv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.amazonaws.ivs.player.Player;
import com.amazonaws.ivs.player.PlayerView;
import com.example.myivstestv.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding binding =  ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        PlayerView playerView = binding.playerView;
        Player player = 

    }
}