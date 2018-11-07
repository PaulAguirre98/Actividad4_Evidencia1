package mipp.com.ev1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String AP = intent.getStringExtra(MainActivity.APELLIDO1);
        String AS = intent.getStringExtra(MainActivity.APELLIDO2);
        String Name=intent.getStringExtra(MainActivity.NOMBRE);
        String Ent=intent.getStringExtra(MainActivity.ENTIDAD);
        int fecha2 = intent.getIntExtra(MainActivity.FECHA,0);

        TextView Papellido=(TextView) findViewById(R.id.Papellido);
        TextView Sapellido=(TextView) findViewById(R.id.Sapellido);
        TextView Nombres=(TextView) findViewById(R.id.Nombres);
        TextView Fecha=(TextView) findViewById(R.id.Fecha);
        TextView EF=(TextView) findViewById(R.id.EF);
        TextView Cur = (TextView) findViewById(R.id.Cur);
        Nombres.setText(Name);
        Papellido.setText(AP);
        Sapellido.setText(AS);
        Fecha.setText( fecha2);
        EF.setText(Ent);

        String CN = Name;
        char nombre = CN.charAt(0);

        String CAP = AP;
        char papellidos = CAP.charAt(0);

        String CAS = AS;
        char sapellidos = CAS.charAt(0);

        String CENT = Ent;
        char entidades = CENT.charAt(0);

        String Curp = papellidos + "A" + sapellidos + nombre+ fecha2  + entidades;
        Cur.setText(Curp);

      ;



    }

}
