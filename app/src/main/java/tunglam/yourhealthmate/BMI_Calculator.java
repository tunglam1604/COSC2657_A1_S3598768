package tunglam.yourhealthmate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BMI_Calculator extends AppCompatActivity {
    private EditText height;
    private EditText weight;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("BMI Calculator tag", "now running onCreate");
        setContentView(R.layout.activity_bmi__calculator);
        height = (EditText) findViewById(R.id.Height);
        weight = (EditText) findViewById(R.id.Weight);
        result = (TextView) findViewById(R.id.result);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("BMI Calculator", "now running onStart");

    }

    protected void onPause() {
        super.onPause();
        Log.i("BMI Calculator tag", "now running onPause");

    }

    protected void onRestart() {
        super.onRestart();
        Log.i("BMI Calculator tag", "now running onRestart");

    }

    protected void onResume() {
        super.onResume();
        Log.i("BMI Calculator tag", "now running onResume");

    }

    protected void onStop() {
        super.onStop();
        Log.i("BMI Calculator tag", "now running onStop");

    }



    ////////////

    public void calculateBMI(View v) {
        String heightStr = height.getText().toString();
        String weightStr = weight.getText().toString();

        if (heightStr != null && !"".equals(heightStr)
                && weightStr != null  &&  !"".equals(weightStr)) {
            float heightValue = Float.parseFloat(heightStr) / 100;
            float weightValue = Float.parseFloat(weightStr);

            float bmi = weightValue / (heightValue * heightValue);

            displayBMI(bmi);
        }
    }

    private void displayBMI(float bmi) {
        String bmiLabel = "";

        if (Float.compare(bmi, 15f) <= 0) {
            bmiLabel ="Very Severely UnderWeight";
        } else if (Float.compare(bmi, 15f) > 0  &&  Float.compare(bmi, 16f) <= 0) {
            bmiLabel = "Severely UnderWeight";
        } else if (Float.compare(bmi, 16f) > 0  &&  Float.compare(bmi, 18.5f) <= 0) {
            bmiLabel = "UnderWeight";
        } else if (Float.compare(bmi, 18.5f) > 0  &&  Float.compare(bmi, 25f) <= 0) {
            bmiLabel = "Normal";
        } else if (Float.compare(bmi, 25f) > 0  &&  Float.compare(bmi, 30f) <= 0) {
            bmiLabel = "OverWeight";
        } else if (Float.compare(bmi, 30f) > 0  &&  Float.compare(bmi, 35f) <= 0) {
            bmiLabel = "Obese Class I";
        } else if (Float.compare(bmi, 35f) > 0  &&  Float.compare(bmi, 40f) <= 0) {
            bmiLabel = "Obese Class II";
        } else {
            bmiLabel = "Obese Class III";
        }

        bmiLabel ="Your BML Result:" +"\n"+ bmi + " - " + bmiLabel;
        result.setText(bmiLabel);
    }
}
