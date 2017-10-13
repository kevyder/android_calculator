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


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView screen;
    private Context mContext;
    private Integer numA , numB = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn0).setOnClickListener(this);
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);
        findViewById(R.id.btn5).setOnClickListener(this);
        findViewById(R.id.btn6).setOnClickListener(this);
        findViewById(R.id.btn7).setOnClickListener(this);
        findViewById(R.id.btn8).setOnClickListener(this);
        findViewById(R.id.btn9).setOnClickListener(this);
        findViewById(R.id.btn_cls).setOnClickListener(this);
    }

    @Override
    public void onClick(View button_var) {
        int button = button_var.getId();
        TextView result = (TextView)findViewById(R.id.resultView);
        switch (button){
            case R.id.btn0:
                result.append("0");
                break;
            case R.id.btn1:
                result.append("1");
                break;
            case R.id.btn2:
                result.append("2");
                break;
            case R.id.btn3:
                result.append("3");
                break;
            case R.id.btn4:
                result.append("4");
                break;
            case R.id.btn5:
                result.append("5");
                break;
            case R.id.btn6:
                result.append("6");
                break;
            case R.id.btn7:
                result.append("7");
                break;
            case R.id.btn8:
                result.append("8");
                break;
            case R.id.btn9:
                result.append("9");
                break;
            case R.id.btn_cls:
                result.setText(null);
            default:
                break;
        }
    }
}
