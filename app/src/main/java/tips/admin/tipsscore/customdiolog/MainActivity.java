package tips.admin.tipsscore.customdiolog;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Dialog epicDialog;
    ImageView image;
    Button show;
    TextView messag,tittl;
    Button accep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        epicDialog= new Dialog ( this );
        show=(Button)findViewById ( R.id.show );
        show.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                positiveButton();
            }
        } );
    }
    public void positiveButton(){
        epicDialog.setContentView ( R.layout.button );
        image=(ImageView) epicDialog.findViewById ( R.id.close );
        accep=(Button) epicDialog.findViewById ( R.id.accept );
        tittl=(TextView) epicDialog.findViewById ( R.id.tittle );
        messag=(TextView) epicDialog.findViewById ( R.id.message );
        image.setOnClickListener ( new View.OnClickListener (){
            @Override
            public void onClick (  View v){
                epicDialog.cancel ();
            }

        });
        epicDialog.getWindow ().setBackgroundDrawable ( new ColorDrawable ( Color.TRANSPARENT ) );

        epicDialog.show ();
    }
}
