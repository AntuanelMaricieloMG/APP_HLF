package com.example.app_hlf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView pieza;
    Button recogePiezaA1;
    Button recogePiezaB1;
    Button recogePiezaC1;
    Button recogePiezaD1;
    float x,y;
    float dx, dy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pieza = (ImageView)findViewById(R.id.piezaBarco);
        recogePiezaA1 = (Button)findViewById(R.id.A1);
        recogePiezaB1 = (Button)findViewById(R.id.B1);
        recogePiezaC1 = (Button)findViewById(R.id.C1);
        recogePiezaD1 = (Button)findViewById(R.id.D1);

        recogePiezaA1.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_STARTED:
                        recogePiezaA1.setText("1");
                        break;
                    case DragEvent.ACTION_DRAG_ENTERED:
                        //asi queda
                        recogePiezaA1.setText("2");
                        break;
                    case DragEvent.ACTION_DRAG_EXITED:
                        //pasas por encima
                        recogePiezaA1.setText("3");
                        recogePiezaC1.setText("3");
                        break;
                    case DragEvent.ACTION_DRAG_ENDED:{
                        recogePiezaA1.setBackgroundColor(0x943DCD);
                        recogePiezaA1.setBackgroundResource(R.drawable.imageview_pieza);
                        recogePiezaB1.setBackgroundResource(R.drawable.imageview_pieza);
                        return(true);
                    }
                    default:
                        break;
                }
                return true;
            }
        });

        /*recogePiezaC1 = (Button)findViewById(R.id.C1);
        recogePiezaD1 = (Button)findViewById(R.id.D1);
        recogePiezaC1.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_STARTED:
                        break;
                    case DragEvent.ACTION_DRAG_ENTERED:
                        break;
                    case DragEvent.ACTION_DRAG_EXITED:
                        break;
                    case DragEvent.ACTION_DRAG_ENDED:{
                        recogePiezaC1.setBackgroundColor(0x943DCD);
                        recogePiezaC1.setBackgroundResource(R.drawable.imageview_pieza);
                        recogePiezaD1.setBackgroundResource(R.drawable.imageview_pieza);
                        return(true);
                    }
                    default:
                        break;
                }
                return true;
            }
        });
        */




        pieza.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                ClipData dato = ClipData.newPlainText("","");
                View.DragShadowBuilder shadow = new View.DragShadowBuilder(pieza);
                v.startDrag(dato,shadow,null,0);
                return false;
            }
        });

    }



    //método para mover la pieza
    /*@Override
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
        */
    }
