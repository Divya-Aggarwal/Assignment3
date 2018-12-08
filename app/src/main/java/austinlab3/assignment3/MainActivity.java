package austinlab3.assignment3;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;
import android.content.res.Configuration;
import android.app.Activity;
import android.widget.MediaController;


public class MainActivity extends AppCompatActivity {

    Button play;
    VideoView videovw;   //Video u want to use for this code should be either mp4 or 3gp format video.
    MediaController media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);     //set the main layout of the actvity

        play = (Button)findViewById(R.id.start);    //set the start button to start video
        videovw = (VideoView)findViewById(R.id.video);   //initialize the VideoView
        media = new MediaController(this);     // set the media controller buttons
    }

    public void videoPlay(View v){

        String video_path = "android.resource://"+getPackageName()+"/"+R.raw.funnyvideo;
        //Uri.parse excepts string value only, that's why we first take string variable video_path and store our whole path to video in it.

        videovw.setVideoURI(Uri.parse(video_path));  //set the uri(uniform resource identifier) of the video to be played
        videovw.setMediaController(media);      //set the media controller(buttons to control the video; i.e., button to go backward and another button to go forward) in the VideoView
        videovw.start();    //Set the position 0 to start the video from very beginning every time code is compiled and run.
    }

}
