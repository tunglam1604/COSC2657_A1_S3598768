package tunglam.yourhealthmate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity tag", "now running onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity tag", "now running onStart");

    }

    protected void onPause() {
        super.onPause();
        Log.i("MainActivity tag", "now running onPause");

    }

    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity tag", "now running onRestart");

    }

    protected void onResume() {
        super.onResume();
        Log.i("MainActivity tag", "now running onResume");

    }

    protected void onStop() {
        super.onStop();
        Log.i("MainActivity tag", "now running onStop");

    }


    /////
    ///CLICK ON BMI LINK
    public void onClickBMI(View view){
        Intent intent = new Intent(this, BMI_Calculator.class);
        startActivity(intent);
    }

    ///CLICK ON DIET LINK
    public void onClickDIET(View view){
        Intent intent = new Intent(this, Diet.class);
        startActivity(intent);
    }

    ///CLICK ON STOPWATCH LINK
    public void onClickWATCH(View view){
        Intent intent = new Intent(this, Exercises.class);
        startActivity(intent);
    }

    ///CLICK ON GYM PLANNER LINK
    public void onClickGYM(View view){
        Intent intent = new Intent(this, GymPlanner.class);
        startActivity(intent);
    }

    ///CLICK ON SLEEP LINK
    public void onClickSLEEP(View view){
        Intent intent = new Intent(this, Sleep.class);
        startActivity(intent);
    }
}
