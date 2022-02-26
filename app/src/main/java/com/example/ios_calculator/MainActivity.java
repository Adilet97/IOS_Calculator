package com.example.ios_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_result;
    Integer firstSum,secondSum;
    private String Operation;
    private Boolean isClickOperation = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_result = findViewById(R.id.tv_res);
    }

    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_1:
                if(tv_result.getText().toString().equals("0")){
                tv_result.setText("1");}
                else if (isClickOperation){
                    tv_result.setText("1");}
                else {tv_result.append("1");}
                break;
                case R.id.btn_2:
                    if(tv_result.getText().toString().equals("0")){
                        tv_result.setText("2");}
                    else if (isClickOperation){
                        tv_result.setText("2");}
                    else {tv_result.append("2");}
                    break;
                    case R.id.btn_3:
                        if(tv_result.getText().toString().equals("0")){
                            tv_result.setText("3");}
                        else if (isClickOperation){
                            tv_result.setText("3");}
                        else {tv_result.append("3");}
                        break;
                        case R.id.btn_4:
                            if(tv_result.getText().toString().equals("0")){
                                tv_result.setText("4");}
                            else if (isClickOperation){
                                tv_result.setText("4");}
                            else {tv_result.append("4");}
                            break;
                            case R.id.btn_5:
                                if(tv_result.getText().toString().equals("0")){
                                    tv_result.setText("5");}
                                else if (isClickOperation){
                                    tv_result.setText("5");}
                                else {tv_result.append("5");}
                                break;
                                case R.id.btn_6:
                                    if(tv_result.getText().toString().equals("0")){
                                        tv_result.setText("6");}
                                    else if (isClickOperation){
                                        tv_result.setText("6");}
                                    else {tv_result.append("6");}
                                    break;
                                    case R.id.btn_7:
                                        if(tv_result.getText().toString().equals("0")){
                                            tv_result.setText("7");}
                                        else if (isClickOperation){
                                            tv_result.setText("7");}
                                        else {tv_result.append("7");}
                                        break;
                                        case R.id.btn_8:
                                            if(tv_result.getText().toString().equals("0")){
                                                tv_result.setText("8");}
                                            else if (isClickOperation){
                                                tv_result.setText("8");}
                                            else {tv_result.append("8");}
                                            break;
                                            case R.id.btn_9:
                                                if(tv_result.getText().toString().equals("0")){
                                                    tv_result.setText("9");}
                                                else if (isClickOperation){
                                                    tv_result.setText("9");}
                                                else {tv_result.append("9");}
                                                break;
                                                case R.id.btn_clear:
                                                    tv_result.setText("0");
                                                    firstSum = 0;
                                                    secondSum = 0;
                                                    isClickOperation = false;
                                                    break;
        }
    }


    public void onOperationClick(View view) {
        switch (view.getId()){
            case R.id.plus:
                firstSum = Integer.parseInt(tv_result.getText().toString());
                isClickOperation = true;
                Operation = "+";
                break;
            case R.id.subtraction:
                firstSum = Integer.parseInt(tv_result.getText().toString());
                isClickOperation = true;
                Operation = "-";
                break;
            case R.id.multiplication:
                firstSum = Integer.parseInt(tv_result.getText().toString());
                isClickOperation = true;
                Operation = "*";
                break;
            case R.id.division:
                firstSum = Integer.parseInt(tv_result.getText().toString());
                isClickOperation = true;
                Operation = "/";
                break;
            case R.id.equal:
                secondSum = Integer.parseInt(tv_result.getText().toString());
                Integer result = 0;
                switch (Operation){
                    case "+":
                        result = firstSum+secondSum;
                        break;
                    case "-":
                        result = firstSum-secondSum;
                        break;
                    case "*":
                        result = firstSum*secondSum;
                        break;
                    case "/":
                        result = firstSum/secondSum;
                        break;
                    }
                tv_result.setText(result.toString());
                isClickOperation = true;
                break;

        }



        }
    }
