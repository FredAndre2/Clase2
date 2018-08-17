package com.holamundo.clase1;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declaro las variables con las que se van a trabajar
    private EditText n1,n2;
private TextView res;
private Resources recursos;
private Spinner operaciones;
private String op[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Capturo los objetos que estan en el layout principal
        n1 = findViewById(R.id.Txt_Numero1);
        n2 = findViewById(R.id.Txt_Numero2);
        res = findViewById(R.id.Txt_Resultado);
        res.setText("0");
        operaciones = findViewById(R.id.Cmb_Opciones);
        //En una variable almaceno la referencia a los recursos de la app
        recursos = this.getResources();
//Se captura el array de las opciones
        op = recursos.getStringArray(R.array.opciones);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,op);
        operaciones.setAdapter(adapter);
    }

    public void Calcular(View vista){
        int opcion;
        double num, num2;
        double resultado=0;
        opcion = operaciones.getSelectedItemPosition();
        num = Double.parseDouble(n1.getText().toString());
        num2 = Double.parseDouble(n2.getText().toString());
        switch (opcion){
            case 0:
                resultado= Metodos.suma(num,num2);
                break;
            case 1:
                resultado= Metodos.resta(num,num2);
                break;
            case 2:
                resultado= Metodos.multiplicacion(num,num2);
                break;
            case 3:
                resultado= Metodos.division(num,num2);
                break;
        }
        res.setText(""+resultado);
    }
    public void Limpiar(View vista){
        n1.setText("");
        n2.setText("");
        operaciones.setSelection(0);
        n1.requestFocus();
        res.setText("0");
    }
}
