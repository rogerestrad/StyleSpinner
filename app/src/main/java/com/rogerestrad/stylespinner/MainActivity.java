package com.rogerestrad.stylespinner;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView txt;
    private Spinner myspinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt =(TextView)findViewById(R.id.txt);
        myspinner=(Spinner)findViewById(R.id.MySpinner);


        String opciones [] ={"Negritas","Cursivas","Las dos"};
        ArrayAdapter<String> adapter= new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, opciones);
        myspinner.setAdapter(adapter);
        myspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String opcion=myspinner.getSelectedItem().toString();
                if (opcion.equals("Negritas"))
                    txt.setTypeface(null, Typeface.BOLD);
                if (opcion.equals("Cursivas"))
                    txt.setTypeface(null,Typeface.ITALIC);
                if (opcion.equals("Las dos"))
                    txt.setTypeface(null,Typeface.ITALIC +Typeface.BOLD);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
