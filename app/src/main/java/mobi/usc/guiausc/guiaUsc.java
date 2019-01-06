package mobi.usc.guiausc;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.MenuItem;
        import android.view.View;

public class guiaUsc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guia_usc);
    }











    //------------------- METODOS PARA CAMBIAR DE ACTIVITY -----------------------//

    //Metodo que redirige al usuario dependiendo el boton oprimido
    public void intentHomeCalendario(View view){
        Intent acHomeCale = new Intent(this, calendario.class);
        startActivity(acHomeCale);
    }

    //------------------- PARTE GRAFICA -----------------------//


    /**public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.btCalendario){
            Intent i = new Intent(this, calendario.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
