package com.example.app_hlf;

import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Control extends AppCompatActivity {

    ImageView pieza;
    Button recogePieza;
    ImageButton A1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pieza = (ImageView)findViewById(R.id.piezaBarco);
        recogePieza = (Button)findViewById(R.id.A1);

        recogePieza.setOnDragListener((v, event) -> {
            final int action = event.getAction();
            switch (action) {

                case DragEvent.ACTION_DRAG_STARTED:
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    break;
            }



            return false;
        });
        //A1 = (ImageButton) findViewById(R.id.A1);
        //A1.setBackground(getDrawable(R.drawable.imageview_borde));
    }

    float x,y;
    float dx, dy;

    //método para mover la pieza
    @Override
    public boolean onTouchEvent(MotionEvent event) {

        if(event.getAction() == MotionEvent.ACTION_DOWN) {
            x = event.getX();
            y = event.getY();
        }

        if(event.getAction() == MotionEvent.ACTION_MOVE) {
            dx = event.getX() - x;
            dy = event.getY() - y;

            pieza.setX(pieza.getX() + dx);
            pieza.setY(pieza.getY() + dy);

            x = event.getX();
            y = event.getY();
        }
        return super.onTouchEvent(event);
    }
}
