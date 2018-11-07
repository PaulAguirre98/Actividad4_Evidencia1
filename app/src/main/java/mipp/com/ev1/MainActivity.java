package mipp.com.ev1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity  {
    public static final String NOMBRE ="EV12.NOMBRE";
    public static final String APELLIDO1 ="EV12.APELLIDO1";
    public static final String APELLIDO2 ="EV12.APELLIDO2";
    public static final String ENTIDAD ="EV12.ENTIDAD";
    public static final String FECHA ="EV12.FECHA";
    Spinner entidades ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entidades=(Spinner) findViewById(R.id.spn);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.entidades, android.R.layout.simple_spinner_item);
   entidades.setAdapter(adapter);

        Button bot1=(Button)  findViewById(R.id.bot1);
        bot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OAct2();

            }
        });
    }
    public void OAct2(){
        EditText PA = (EditText) findViewById(R.id.PA);
        String AP = PA.getText().toString();
        EditText SA = (EditText) findViewById(R.id.SA);
        String AS = SA.getText().toString();
        EditText Nom = (EditText) findViewById(R.id.Nom);
        String Name = Nom.getText().toString();
        Spinner spn = (Spinner) findViewById(R.id.spn);
        String Ent = spn.getSelectedItem().toString();
        EditText fecha = (EditText) findViewById(R.id.fecha);
        int fecha2 = Integer.parseInt(fecha.getText().toString());

        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(APELLIDO1, AP);
        intent.putExtra(APELLIDO2, AS);
        intent.putExtra(NOMBRE, Name);
        intent.putExtra(ENTIDAD, Ent);
        intent.putExtra(FECHA, fecha2);



startActivity(intent);



    }
}
