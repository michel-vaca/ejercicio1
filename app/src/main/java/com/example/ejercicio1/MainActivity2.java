package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.Time;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ejercicio1.modelo.Alumno;

public class MainActivity2 extends AppCompatActivity {
TextView tvNombre;
TextView tvNumCuenta;
TextView tvEdad;
TextView tvCarrera;
ImageView ivImagen;
    int edad;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       Bundle bundle = getIntent().getExtras();
        tvNombre=findViewById(R.id.tvNombre);
        tvNumCuenta=findViewById(R.id.tvNumCuenta);
        tvEdad=findViewById((R.id.tvEdad));
        tvCarrera=findViewById(R.id.tvCarrera);
        ivImagen=findViewById(R.id.ivImagen);

        Alumno alumno;

        if(bundle != null){

            alumno = (Alumno) bundle.getSerializable("alumno" );
            //Toast.makeText( this, "el nombre " + alumno.getNombre() +" "+ alumno.getApellidos()+" numcuenta " +alumno.getNumCuenta(),Toast.LENGTH_SHORT ).show();
            // linea de arriba para probar que llega bien el nombre, los apellidos y ek num de cuenta
            //Toast.makeText( this, "la fecha de nacimiento es: " + alumno.getFechaNaciDia() + "-" + alumno.getFechaNaciMes() + "-"+ alumno.getFechaNaciAno() +" y su carrera es :" + alumno.getCarrera(),Toast.LENGTH_SHORT ).show();
            // linea de arriba para probar que llega bien la fecha de nacimiento y la carrera
            tvNombre.setText(alumno.getNombre() + " "+ alumno.getApellidos());
            tvNumCuenta.setText(alumno.getNumCuenta());
            tvCarrera.setText(alumno.getCarrera());
            switch (alumno.getCarrera().toString()){
                case "Ingeniería Aeroespacial":
                    ivImagen.setImageResource(R.drawable.aeroespacial);
                    break;
                case "Ingeniería Civil":
                    ivImagen.setImageResource(R.drawable.civil);
                    break;
                case"Ingeniería Geomática":
                    ivImagen.setImageResource(R.drawable.geomatica);
                    break;
                case"Ingeniería Ambiental":
                    ivImagen.setImageResource(R.drawable.ambiental);
                    break;
                case"Ingeniería Geofísica":
                    ivImagen.setImageResource(R.drawable.geofisica);
                    break;
                case"Ingeniería Geológica":
                    ivImagen.setImageResource(R.drawable.geologica);
                    break;
                case"Ingeniería Petrolera":
                    ivImagen.setImageResource(R.drawable.petrolera);
                    break;
                case"Ingeniería de Minas y Metalurgia":
                    ivImagen.setImageResource(R.drawable.minas);
                    break;
                case"Ingeniería en Computación":
                    ivImagen.setImageResource(R.drawable.computacion);
                    break;
                case"Ingeniería Eléctrica Electrónica":
                    ivImagen.setImageResource(R.drawable.electrica);
                    break;
                case"Ingeniería en Telecomunicaciones":
                    ivImagen.setImageResource(R.drawable.telecom);
                    break;
                case"Ingeniería Mecánica":
                    ivImagen.setImageResource(R.drawable.mecanica);
                    break;
                case"Ingeniería Industrial":
                    ivImagen.setImageResource(R.drawable.industrial);
                    break;
                case"Ingeniería Mecatrónica":
                    ivImagen.setImageResource(R.drawable.mecatronica);
                    break;
                case"Ingeniería en Sistemas Biomédicos":
                    ivImagen.setImageResource(R.drawable.biomedicos);
                    break;
                default:
                    break;

            }
            int diaFechaNaci =Integer.parseInt(alumno.getFechaNaciDia());
            int mesFechaNaci=Integer.parseInt(alumno.getFechaNaciMes());
            int anoFechaNaci=Integer.parseInt(alumno.getFechaNaciAno());

            Time  today= new Time (Time.getCurrentTimezone());
            today.setToNow();
            int diaFechaAct = today.monthDay;
            int mesfechaAct= today.month;
            int anofechanaAct= today.year;

            /*if(mesFechaNaci<mesfechaAct){

                edad= anofechanaAct-anoFechaNaci-1;



            }
            else if(mesFechaNaci==mesfechaAct){
                if(diaFechaNaci<diaFechaAct)
                    edad= anofechanaAct-anoFechaNaci-1;;
            }

            else{
                edad=anoFechaNaci-anofechanaAct;
            }*/
            edad=anoFechaNaci-anofechanaAct;
            //
            //
            tvEdad.setText(getResources().getString(R.string.stEdad)+ edad);
            //ivImagen.setImageResource(R.drawable.aeroespacial); //metodo comprobado para mostrar imagen

            
            
        }

    }
}