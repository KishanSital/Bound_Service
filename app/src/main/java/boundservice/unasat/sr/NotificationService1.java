package boundservice.unasat.sr;


import android.app.IntentService;
import android.content.Intent;

import androidx.annotation.Nullable;

import static java.lang.Thread.sleep;


public class NotificationService1 extends IntentService {

    public NotificationService1(String name) {
        super(name);
    }
    @Nullable
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        int count = 0;
        while (count < 5) {
            //  Toast.makeText(this,"DING DING", Toast.LENGTH_LONG).show();
            // doe research en laat een noticifaction
            // zien het mag ook aan de top zijn van het scherm

        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    }
}