package co.edu.uninpahu.calculadora;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.estudiantes.calculadora.R;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private TextView screen;
    private Context mContext;
    private Integer numA , numB = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


}
