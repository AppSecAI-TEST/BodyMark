package com.example.user.bodymanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends BodygraphActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this, SplashActivity.class));
        //InitiateBodygraphColors();
    }

    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.main_btnBody:
                Toast.makeText(this, "몸입니다", Toast.LENGTH_SHORT).show();
                //setBodygraphColor(R.id.main_bodygraph_chest, "bodygraph_" + R.id.main_bodygraph_chest, R.drawable.chest_yellow);
                startActivity(new Intent(MainActivity.this, ExerciseActivity.class));
                break;
            case R.id.main_btnLeftarm:
                Toast.makeText(this, "팔입니다", Toast.LENGTH_SHORT).show();
                //setBodygraphColor(R.id.main_bodygraph_biceps, "bodygraph_" + R.id.main_bodygraph_biceps, R.drawable.biceps_yellow);
                startActivity(new Intent(MainActivity.this, ExerciseActivity.class));
                break;
            case R.id.main_btnRightarm:
                Toast.makeText(this, "팔입니다", Toast.LENGTH_SHORT).show();
                //setBodygraphColor(R.id.main_bodygraph_triceps, "bodygraph_" + R.id.main_bodygraph_triceps, R.drawable.triceps_yellow);
                startActivity(new Intent(MainActivity.this, ExerciseActivity.class));
                break;
            case R.id.main_btnLowerbody:
                Toast.makeText(this, "다리입니다", Toast.LENGTH_SHORT).show();
                //setBodygraphColor(R.id.main_bodygraph_shoulders, "bodygraph_" + R.id.main_bodygraph_shoulders, R.drawable.shoulders_yellow);
                startActivity(new Intent(MainActivity.this, ExerciseActivity.class));
                break;
            case R.id.main_btnCalendar:
                Toast.makeText(this, "운동 계획표", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, CalenderActivity.class));
                break;
            case R.id.main_btnCustom:
                Toast.makeText(this, "나만의 운동", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, CustomActivity.class));
                break;
            case R.id.main_btnSettings:
                Toast.makeText(this, "설정", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, SettingsActivity.class));
                break;
            case R.id.main_btnReverse:
                changeVisibility();;
                break;
        }
    }

    public void onClickExercise(View view) {
        int id = view.getId();
        Toast.makeText(this, "운동!", Toast.LENGTH_SHORT).show();

    }

}

