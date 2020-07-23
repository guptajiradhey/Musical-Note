package com.example.feelyou;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

import com.example.musicalnote.R;

public class MainActivity extends AppCompatActivity {

    private SoundPool soundPool;
    private  int asound;
    private  int bsound;
    private  int csound;
    private  int dsound;
    private  int esound;
    private  int fsound;
    private  int gsound;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        soundPool= new SoundPool(7, AudioManager.STREAM_MUSIC,0);
        asound = soundPool.load(getApplicationContext(), R.raw.note1_c,1);
        bsound = soundPool.load(getApplicationContext(),R.raw.note2_d,1);
        csound = soundPool.load(getApplicationContext(),R.raw.note3_e,1);
        dsound = soundPool.load(getApplicationContext(),R.raw.note4_f,1);
        esound = soundPool.load(getApplicationContext(),R.raw.note5_g,1);
        fsound = soundPool.load(getApplicationContext(),R.raw.note6_a,1);
        gsound = soundPool.load(getApplicationContext(),R.raw.note7_b,1);



    }

    public void akey(View view)
    {
       soundPool.play(asound,1.0f,1.0f,0,0,1.0f);
    }

    public void bkey(View view)
    {
        soundPool.play(bsound,1.0f,1.0f,0,0,1.0f);
    }

    public void ckey(View view)
    {
        soundPool.play(csound,1.0f,1.0f,0,0,1.0f);
    }

    public void dkey(View view)
    {
        soundPool.play(dsound,1.0f,1.0f,0,0,1.0f);
    }
    public void ekey(View view)
    {
        soundPool.play(esound,1.0f,1.0f,0,0,1.0f);
    }
    public void fkey(View view)
    {
        soundPool.play(fsound,1.0f,1.0f,0,0,1.0f);
    }
    public void gkey(View view)
    {
        soundPool.play(gsound,1.0f,1.0f,0,0,1.0f);
    }


}
