package boundservice.unasat.sr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //button objects
    private Button buttonStart;
    private Button buttonStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting buttons from xml
        buttonStart = (Button) findViewById(R.id.buttonStart);
        buttonStop = (Button) findViewById(R.id.buttonStop);

        //attaching onclicklistener to buttons
        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == buttonStart) {
            //start the service here
            startService(new Intent(this, MediaPlayerService.class));
        } else if (view == buttonStop) {
            //stop the service here
            stopService(new Intent(this, MediaPlayerService.class));
        }
    }

    @Override
    protected void onStop () {
        super .onStop() ;
        startService( new Intent( this, NotificationService. class )) ;
    }
    public void closeApp (View view) {
        finish() ;
    }
    protected void onEnd (View view) {
        stopService( new Intent( this, NotificationService. class )) ;
    }
}
