package com.veetouine.classiccarbonwatchface;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class CompanionActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_companion);


        Button wearButton = (Button)findViewById(R.id.wearButton);
        wearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int notificationId = 001;

                NotificationCompat.Builder notificationBuilder =
                        new NotificationCompat.Builder(CompanionActivity.this, "01")
                                .setSmallIcon(R.mipmap.ic_launcher)
                                .setContentTitle("Title")
                                .setContentText("Android Wear Notification");

                NotificationManagerCompat notificationManager =
                        NotificationManagerCompat.from(CompanionActivity.this);

                notificationManager.notify(notificationId, notificationBuilder.build());
            }
        });
    }



    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_pirates:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.radio_ninjas:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }


}
