package sandeco.aula;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText input;
    private TextView saida;
    private Pessoa p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        input = (EditText) findViewById(R.id.input);
        saida = (TextView) findViewById(R.id.output);
        p = new Pessoa();
    }

    public void gravar(View v){
        String nome =  input.getText().toString();
        p.setNome(nome);
    }

    public void mostrar(View v){
        saida.setText(p.getNome());
    }



}
