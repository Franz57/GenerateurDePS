package com.example.generateurdeps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button btn_convert;
    //Button btn_trad;
    EditText input_non_ps;
//    EditText input_ps;
//    //Spinner dropdown;
//    int nblines ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this.btn_trad.findViewById();
        //this.input_non_ps.findViewById(R.id.editText2);
        //this.input_ps.findViewById();
        //this.dropdown.findViewById();
    }

    public void change_diviseurs(View view){
        Editable text = this.input_non_ps.getText();
        int a = text.length();
    }

//    public void convert (View view){
//
//    }
//
//    public void put_ps (View view, String text){
//
//    }
//
//    public void trad (View view){
//
//    }
//
//    public void diviseurs (View view, int n){
//
//    }
}
