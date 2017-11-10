package tunglam.yourhealthmate;


import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.ToggleButton;

import java.util.Calendar;

public class Sleep extends MainActivity {

    AlarmManager alarmManager;
    private PendingIntent pendingIntent;
    private TimePicker alarmTimePicker;
    private static Sleep inst;
    private TextView alarmTextView;

    public static Sleep instance() {
        return inst;
    }

    @Override
    public void onStart() {
        super.onStart();
        inst = this;
        Log.i("SleepActivity tag", "now running onStart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);
        alarmTimePicker = (TimePicker) findViewById(R.id.alarmTimePicker);
        alarmTextView = (TextView) findViewById(R.id.alarmText);
        ToggleButton alarmToggle = (ToggleButton) findViewById(R.id.alarmToggle);
        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        Log.i("SleepActivity tag", "now running onCreate");
    }


    protected void onPause() {
        super.onPause();
        Log.i("SleepActivity tag", "now running onPause");

    }

    protected void onRestart() {
        super.onRestart();
        Log.i("SleepActivity tag", "now running onRestart");

    }

    protected void onResume() {
        super.onResume();
        Log.i("SleepActivity tag", "now running onResume");

    }

    protected void onStop() {
        super.onStop();
        Log.i("SleepActivity tag", "now running onStop");

    }


    //////
    public void onToggleClicked(View view) {
        if (((ToggleButton) view).isChecked()) {
            setAlarmText("Alarm is Switch To ON");
            Log.d("Sleep Activity", "Alarm On");
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.HOUR_OF_DAY, alarmTimePicker.getCurrentHour());
            calendar.set(Calendar.MINUTE, alarmTimePicker.getCurrentMinute());
            Intent myIntent = new Intent(Sleep.this, AlarmReceiver.class);
            pendingIntent = PendingIntent.getBroadcast(Sleep.this, 0, myIntent, 0);
            alarmManager.set(AlarmManager.RTC, calendar.getTimeInMillis(), pendingIntent);
        } else {
            alarmManager.cancel(pendingIntent);
            setAlarmText("Alarm is Switch To OFF");
            Log.d("Sleep Activity", "Alarm Off");
        }
    }

    public void setAlarmText(String alarmText) {
        alarmTextView.setText(alarmText);
    }
}