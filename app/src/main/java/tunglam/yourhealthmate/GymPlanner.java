package tunglam.yourhealthmate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class GymPlanner extends AppCompatActivity {

    EditText calo1;
    EditText calo2;
    EditText calo3;
    EditText calo4;
    EditText calo5;
    EditText calo6;
    TextView sum;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        Log.i("Gym Planner tag", "now running onCreate");
        setContentView(R.layout.activity_gym_planner);

        calo1 = (EditText) findViewById(R.id.calo1);
        calo2 = (EditText) findViewById(R.id.calo2);
        calo3 = (EditText) findViewById(R.id.calo3);
        calo4 = (EditText) findViewById(R.id.calo4);
        calo5 = (EditText) findViewById(R.id.calo5);
        calo6 = (EditText) findViewById(R.id.calo6);
        sum = (TextView) findViewById(R.id.sum);

        calo1.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub
            }

            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
                sum.setText(addNumbers());
            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }
        });

        calo2.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }

            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
                sum.setText(addNumbers());

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }
        });


        calo3.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }

            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
                sum.setText(addNumbers());

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }
        });


        calo4.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }

            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
                sum.setText(addNumbers());

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }
        });


        calo5.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }

            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
                sum.setText(addNumbers());

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }
        });


        calo6.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }

            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
                sum.setText(addNumbers());

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Gym Planner tag", "now running onStart");

    }

    protected void onPause() {
        super.onPause();
        Log.i("Gym Planner tag", "now running onPause");

    }

    protected void onRestart() {
        super.onRestart();
        Log.i("Gym Planner tag", "now running onRestart");

    }

    protected void onResume() {
        super.onResume();
        Log.i("Gym Planner tag", "now running onResume");

    }

    protected void onStop() {
        super.onStop();
        Log.i("Gym Planner tag", "now running onStop");

    }


    /////

    private String addNumbers() {
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int number6;
        if(calo1.getText().toString() != "" && calo1.getText().length() > 0) {
            number1 = Integer.parseInt(calo1.getText().toString());
        } else {
            number1 = 0;
        }
        if(calo2.getText().toString() != "" && calo2.getText().length() > 0) {
            number2 = Integer.parseInt(calo2.getText().toString());
        } else {
            number2 = 0;
        }

        if(calo3.getText().toString() != "" && calo3.getText().length() > 0) {
            number3 = Integer.parseInt(calo3.getText().toString());
        } else {
            number3 = 0;
        }

        if(calo4.getText().toString() != "" && calo4.getText().length() > 0) {
            number4 = Integer.parseInt(calo4.getText().toString());
        } else {
            number4 = 0;
        }

        if(calo5.getText().toString() != "" && calo5.getText().length() > 0) {
            number5 = Integer.parseInt(calo5.getText().toString());
        } else {
            number5 = 0;
        }

        if(calo6.getText().toString() != "" && calo6.getText().length() > 0) {
            number6 = Integer.parseInt(calo6.getText().toString());
        } else {
            number6 = 0;
        }

        return Integer.toString(number1 + number2+ number3 + number4 + number5 + number6);
    }
}
