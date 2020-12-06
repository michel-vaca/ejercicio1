package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.ejercicio1.modelo.Alumno;

public class MainActivity extends AppCompatActivity {

    Alumno alumno;
    EditText etNombre, etApellidos, etNumCuenta;
    Spinner spnFechaNaciDia, spnFechaNaciMes,spnFechaNaciAn,spnCarrera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNombre=findViewById(R.id.etNombre);
        etApellidos=findViewById(R.id.etApellidos);
        etNumCuenta=findViewById(R.id.etNumCuenta);
        spnFechaNaciDia= findViewById(R.id.spnFechaNaciDia);
        spnFechaNaciMes= findViewById(R.id.spnFechaNaciMes);
        spnFechaNaciAn= findViewById(R.id.spnFechaNaciAn);
        spnCarrera= findViewById(R.id.spnCarrera);
        String [] carreras = {getResources().getString(R.string.stCadenaVacia),getResources().getString(R.string.stIngAeroesp),getResources().getString(R.string.stIngAmb),
                getResources().getString(R.string.stIngCiv),getResources().getString(R.string.stIngSistBio),getResources().getString(R.string.stIngTeleCom),
                getResources().getString(R.string.stIngPetro),getResources().getString(R.string.stIngMinYMet),getResources().getString(R.string.stIngMecatro),
                getResources().getString(R.string.stIngMecani),getResources().getString(R.string.stIngIndus),getResources().getString(R.string.stIngGeom),
                getResources().getString(R.string.stIngGeol),getResources().getString(R.string.stIngGeof),getResources().getString(R.string.stIngEleEle),
                getResources().getString(R.string.stIngComp)};
        String [] dias = {getResources().getString(R.string.stCadenaVacia),getResources().getString(R.string.st01),getResources().getString(R.string.st02),getResources().getString(R.string.st03),
                getResources().getString(R.string.st04),getResources().getString(R.string.st05),getResources().getString(R.string.st06),
                getResources().getString(R.string.st07),getResources().getString(R.string.st08),getResources().getString(R.string.st09),
                getResources().getString(R.string.st10),getResources().getString(R.string.st11),getResources().getString(R.string.st12),
                getResources().getString(R.string.st13),getResources().getString(R.string.st14),getResources().getString(R.string.st15),
                getResources().getString(R.string.st16),getResources().getString(R.string.st17),getResources().getString(R.string.st18),
                getResources().getString(R.string.st19),getResources().getString(R.string.st20),getResources().getString(R.string.st21),
                getResources().getString(R.string.st22),getResources().getString(R.string.st23),getResources().getString(R.string.st24),
                getResources().getString(R.string.st25),getResources().getString(R.string.st26),getResources().getString(R.string.st27),
                getResources().getString(R.string.st28),getResources().getString(R.string.st29),getResources().getString(R.string.st30),
                getResources().getString(R.string.st31)};


        String [] meses = {getResources().getString(R.string.stCadenaVacia),getResources().getString(R.string.st01),getResources().getString(R.string.st02),getResources().getString(R.string.st03),
                getResources().getString(R.string.st04),getResources().getString(R.string.st05),getResources().getString(R.string.st06),
                getResources().getString(R.string.st07),getResources().getString(R.string.st08),getResources().getString(R.string.st09),
                getResources().getString(R.string.st10),getResources().getString(R.string.st11),getResources().getString(R.string.st12)
        };


        String [] anos = {getResources().getString(R.string.stCadenaVacia),getResources().getString(R.string.st1990),getResources().getString(R.string.st1991),getResources().getString(R.string.st1992),
                getResources().getString(R.string.st1993),getResources().getString(R.string.st1994),getResources().getString(R.string.st1995),
                getResources().getString(R.string.st1996),getResources().getString(R.string.st1997),getResources().getString(R.string.st1998),
                getResources().getString(R.string.st1999),getResources().getString(R.string.st2000),getResources().getString(R.string.st2001),
                getResources().getString(R.string.st2002),getResources().getString(R.string.st2003),getResources().getString(R.string.st2004),
                getResources().getString(R.string.st2005),getResources().getString(R.string.st2006),getResources().getString(R.string.st2007),
                getResources().getString(R.string.st2008),getResources().getString(R.string.st2009),getResources().getString(R.string.st2010),};


        ArrayAdapter <String> adaptercarrera = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,carreras);
        spnCarrera.setAdapter(adaptercarrera);
        ArrayAdapter <String> adapterFechaNaciDia = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,dias);
        spnFechaNaciDia.setAdapter(adapterFechaNaciDia);
        ArrayAdapter <String> adapterFechaNaciMes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,meses);
        spnFechaNaciMes.setAdapter(adapterFechaNaciMes);
        ArrayAdapter <String> adapterFechaNaciAno = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,anos);
        spnFechaNaciAn.setAdapter(adapterFechaNaciAno);
        //https://www.youtube.com/watch?v=dp_ruQOP1sU  //viedo de referencia spiinner minuto 15.43
    }

    public void clic(View view) {
        if(validacion()){
       alumno = new Alumno(etNombre.getText().toString(),etApellidos.getText().toString(),etNumCuenta.getText().toString(),spnFechaNaciDia.getSelectedItem().toString(),
               spnFechaNaciMes.getSelectedItem().toString(),spnFechaNaciAn.getSelectedItem().toString(),spnCarrera.getSelectedItem().toString());
           Intent intent   = new Intent(this,MainActivity2.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("alumno", alumno);
            intent.putExtras(bundle);
            startActivity(intent);


        }

    }

    public boolean validacion(){
    if(etNombre.getText().toString().equals(""))
    {
        etNombre.setError(getResources().getString(R.string.stErrorNombre));
        return false;
    }
        if(etApellidos.getText().toString().equals(""))
        {
            etApellidos.setError(getResources().getString(R.string.stErrorApellidos));
            return false;
        }
    if(etNumCuenta.getText().toString().equals("")||etNumCuenta.getText().toString().length()<9){
        etNumCuenta.setError(getResources().getString(R.string.stErrorNumCuenta));
        return false;
    }

        if(spnFechaNaciDia.getSelectedItem().toString().equals("")){
            Toast.makeText(this, getResources().getString(R.string.stErrorFechaNaciDia), Toast.LENGTH_LONG).show();
            return false;
        }
        if(spnFechaNaciMes.getSelectedItem().toString().equals("")){
            Toast.makeText(this, getResources().getString(R.string.stErrorFechaNaciMes), Toast.LENGTH_LONG).show();
            return false;
        }
        if(spnFechaNaciAn.getSelectedItem().toString().equals("")){
            Toast.makeText(this, getResources().getString(R.string.stErrorFechaNaciAno), Toast.LENGTH_LONG).show();
            return false;
        }

        if(spnCarrera.getSelectedItem().toString().equals("")){
            Toast.makeText(this, getResources().getString(R.string.stErrorCarrera), Toast.LENGTH_LONG).show();
            return false;
        }

    return true;
    }
}