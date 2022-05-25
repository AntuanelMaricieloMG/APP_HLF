package com.example.app_hlf;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    ImageView piezaP;
    ImageView piezaM;
    Button recogePiezaA1,recogePiezaB1,recogePiezaC1 ,recogePiezaD1 ,recogePiezaE1 ,recogePiezaF1, recogePiezaG1;
    Button recogePiezaA2,recogePiezaB2,recogePiezaC2 ,recogePiezaD2 ,recogePiezaE2 ,recogePiezaF2, recogePiezaG2;
    Button recogePiezaA3,recogePiezaB3,recogePiezaC3 ,recogePiezaD3 ,recogePiezaE3 ,recogePiezaF3, recogePiezaG3;
    Button recogePiezaA4,recogePiezaB4,recogePiezaC4 ,recogePiezaD4 ,recogePiezaE4 ,recogePiezaF4, recogePiezaG4;
    Button recogePiezaA5,recogePiezaB5,recogePiezaC5 ,recogePiezaD5 ,recogePiezaE5 ,recogePiezaF5, recogePiezaG5;
    Button recogePiezaA6,recogePiezaB6,recogePiezaC6 ,recogePiezaD6 ,recogePiezaE6 ,recogePiezaF6, recogePiezaG6;
    Button recogePiezaA7,recogePiezaB7,recogePiezaC7 ,recogePiezaD7 ,recogePiezaE7 ,recogePiezaF7, recogePiezaG7;
    TableLayout campo;
    float x,y;
    float dx, dy;
    boolean A1,B1,C1,D1,E1,F1,G1 ,A2,B2,C2,D2,E2,F2,G2, A3,B3,C3,D3,E3,F3,G3, A4,B4,C4,D4,E4,F4,G4, A5,B5,C5,D5,E5,F5,G5, A6,B6,C6,D6,E6,F6,G6, A7,B7,C7,D7,E7,F7,G7 = false;
    int contA1;
    int contElegirPieza = 0;
    boolean barcoElegido = false;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campo = (TableLayout)findViewById(R.id.Campo);
        piezaP = (ImageView)findViewById(R.id.piezaBarcoPequeño);
        piezaM = (ImageView)findViewById(R.id.piezaBarco);

        //1
        recogePiezaA1 = (Button)findViewById(R.id.A1);
        recogePiezaB1 = (Button)findViewById(R.id.B1);
        recogePiezaC1 = (Button)findViewById(R.id.C1);
        recogePiezaD1 = (Button)findViewById(R.id.D1);
        recogePiezaE1 = (Button)findViewById(R.id.E1);
        recogePiezaF1 = (Button)findViewById(R.id.F1);
        recogePiezaG1 = (Button)findViewById(R.id.G1);
        //2
        recogePiezaA2 = (Button)findViewById(R.id.A2);
        recogePiezaB2 = (Button)findViewById(R.id.B2);
        recogePiezaC2 = (Button)findViewById(R.id.C2);
        recogePiezaD2 = (Button)findViewById(R.id.D2);
        recogePiezaE2 = (Button)findViewById(R.id.E2);
        recogePiezaF2= (Button)findViewById(R.id.F2);
        recogePiezaG2 = (Button)findViewById(R.id.G2);
        //3
        recogePiezaA3 = (Button)findViewById(R.id.A3);
        recogePiezaB3 = (Button)findViewById(R.id.B3);
        recogePiezaC3 = (Button)findViewById(R.id.C3);
        recogePiezaD3 = (Button)findViewById(R.id.D3);
        recogePiezaE3 = (Button)findViewById(R.id.E3);
        recogePiezaF3= (Button)findViewById(R.id.F3);
        recogePiezaG3 = (Button)findViewById(R.id.G3);
        //4
        recogePiezaA4 = (Button)findViewById(R.id.A4);
        recogePiezaB4 = (Button)findViewById(R.id.B4);
        recogePiezaC4 = (Button)findViewById(R.id.C4);
        recogePiezaD4 = (Button)findViewById(R.id.D4);
        recogePiezaE4 = (Button)findViewById(R.id.E4);
        recogePiezaF4= (Button)findViewById(R.id.F4);
        recogePiezaG4 = (Button)findViewById(R.id.G4);
        //5
        recogePiezaA5 = (Button)findViewById(R.id.A5);
        recogePiezaB5 = (Button)findViewById(R.id.B5);
        recogePiezaC5 = (Button)findViewById(R.id.C5);
        recogePiezaD5 = (Button)findViewById(R.id.D5);
        recogePiezaE5 = (Button)findViewById(R.id.E5);
        recogePiezaF5= (Button)findViewById(R.id.F5);
        recogePiezaG5 = (Button)findViewById(R.id.G5);
        //6
        recogePiezaA6 = (Button)findViewById(R.id.A6);
        recogePiezaB6 = (Button)findViewById(R.id.B6);
        recogePiezaC6 = (Button)findViewById(R.id.C6);
        recogePiezaD6 = (Button)findViewById(R.id.D6);
        recogePiezaE6 = (Button)findViewById(R.id.E6);
        recogePiezaF6= (Button)findViewById(R.id.F6);
        recogePiezaG6 = (Button)findViewById(R.id.G6);
        //7
        recogePiezaA7 = (Button)findViewById(R.id.A7);
        recogePiezaB7 = (Button)findViewById(R.id.B7);
        recogePiezaC7 = (Button)findViewById(R.id.C7);
        recogePiezaD7 = (Button)findViewById(R.id.D7);
        recogePiezaE7 = (Button)findViewById(R.id.E7);
        recogePiezaF7= (Button)findViewById(R.id.F7);
        recogePiezaG7 = (Button)findViewById(R.id.G7);


        //MÉTODOS PARA RECOGER BARCO PEQUEÑO
        recogePiezaA1.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            A1 = true;
                        }
                        else
                        {
                            A1 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(A1 && barcoElegido) {
                            recogePiezaA1.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaB1.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            B1 = true;
                        }
                        else
                        {
                            B1 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(B1 && barcoElegido) {
                            recogePiezaB1.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaC1.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            C1 = true;
                        }
                        else
                        {
                            C1 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(C1 && barcoElegido) {
                            recogePiezaC1.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaD1.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            D1 = true;
                        }
                        else
                        {
                            D1 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(D1 && barcoElegido) {
                            recogePiezaD1.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaE1.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            E1 = true;
                        }
                        else
                        {
                            E1 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(E1 && barcoElegido) {
                            recogePiezaE1.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaF1.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            F1 = true;
                        }
                        else
                        {
                            F1 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(F1 && barcoElegido) {
                            recogePiezaF1.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaG1.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            G1 = true;
                        }
                        else
                        {
                            G1 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(G1 && barcoElegido) {
                            recogePiezaG1.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaA2.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            A2 = true;
                        }
                        else
                        {
                            A2 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(A2 && barcoElegido) {
                            recogePiezaA2.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaB2.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            B2 = true;
                        }
                        else
                        {
                            B2 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(B2 && barcoElegido) {
                            recogePiezaB2.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaC2.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            C2 = true;
                        }
                        else
                        {
                            C2 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(C2 && barcoElegido) {
                            recogePiezaC2.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaD2.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            D2 = true;
                        }
                        else
                        {
                            D2 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(D2 && barcoElegido) {
                            recogePiezaD2.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaE2.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            E2 = true;
                        }
                        else
                        {
                            E2 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(E2 && barcoElegido) {
                            recogePiezaE2.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaF2.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            F2 = true;
                        }
                        else
                        {
                            F2 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(F2 && barcoElegido) {
                            recogePiezaF2.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaG2.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            G2 = true;
                        }
                        else
                        {
                            G2 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(G2 && barcoElegido) {
                            recogePiezaG2.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaA3.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            A3 = true;
                        }
                        else
                        {
                            A3 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(A3 && barcoElegido) {
                            recogePiezaA3.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaB3.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            B3 = true;
                        }
                        else
                        {
                            B3 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(B3 && barcoElegido) {
                            recogePiezaB3.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaC3.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            C3 = true;
                        }
                        else
                        {
                            C3 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(C3 && barcoElegido) {
                            recogePiezaC3.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaD3.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            D3 = true;
                        }
                        else
                        {
                            D3 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(D3 && barcoElegido) {
                            recogePiezaD3.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaE3.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            E3 = true;
                        }
                        else
                        {
                            E3 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(E3 && barcoElegido) {
                            recogePiezaE3.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaF3.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            F3 = true;
                        }
                        else
                        {
                            F3 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(F3 && barcoElegido) {
                            recogePiezaF3.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaG3.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            G3 = true;
                        }
                        else
                        {
                            G3 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(G3 && barcoElegido) {
                            recogePiezaG3.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaA4.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            A4 = true;
                        }
                        else
                        {
                            A4 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(A4 && barcoElegido) {
                            recogePiezaA4.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaB4.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            B4 = true;
                        }
                        else
                        {
                            B4 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(B4 && barcoElegido) {
                            recogePiezaB4.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaC4.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            C4 = true;
                        }
                        else
                        {
                            C4 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(C4 && barcoElegido) {
                            recogePiezaC4.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaD4.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            D4 = true;
                        }
                        else
                        {
                            D4 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(D4 && barcoElegido) {
                            recogePiezaD4.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaE4.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            E4 = true;
                        }
                        else
                        {
                            E4 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(E4 && barcoElegido) {
                            recogePiezaE4.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaF4.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            F4 = true;
                        }
                        else
                        {
                            F4 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(F4 && barcoElegido) {
                            recogePiezaF4.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaG4.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            G4 = true;
                        }
                        else
                        {
                            G4 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(G4 && barcoElegido) {
                            recogePiezaG4.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaA5.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            A5 = true;
                        }
                        else
                        {
                            A5 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(A5 && barcoElegido) {
                            recogePiezaA5.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaB5.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            B5 = true;
                        }
                        else
                        {
                            B5 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(B5 && barcoElegido) {
                            recogePiezaB5.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaC5.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            C5 = true;
                        }
                        else
                        {
                            C5 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(C5 && barcoElegido) {
                            recogePiezaC5.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaD5.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            D5 = true;
                        }
                        else
                        {
                            D5 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(D5 && barcoElegido) {
                            recogePiezaD5.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaE5.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            E5 = true;
                        }
                        else
                        {
                            E5 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(E5 && barcoElegido) {
                            recogePiezaE5.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaF5.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            F5 = true;
                        }
                        else
                        {
                            F5 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(F5 && barcoElegido) {
                            recogePiezaF5.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaG5.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            G5 = true;
                        }
                        else
                        {
                            G5 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(G5 && barcoElegido) {
                            recogePiezaG5.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaA6.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            A6 = true;
                        }
                        else
                        {
                            A6 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(A6 && barcoElegido) {
                            recogePiezaA6.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaB6.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            B6 = true;
                        }
                        else
                        {
                            B6 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(B6 && barcoElegido) {
                            recogePiezaB6.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaC6.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            C6 = true;
                        }
                        else
                        {
                            C6 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(C6 && barcoElegido) {
                            recogePiezaC6.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaD6.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            D6 = true;
                        }
                        else
                        {
                            D6 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(D6 && barcoElegido) {
                            recogePiezaD6.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaE6.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            E6 = true;
                        }
                        else
                        {
                            E6 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(E6 && barcoElegido) {
                            recogePiezaE6.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaF6.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            F6 = true;
                        }
                        else
                        {
                            F6 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(F6 && barcoElegido) {
                            recogePiezaF6.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaG6.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            G6 = true;
                        }
                        else
                        {
                            G6 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(G6 && barcoElegido) {
                            recogePiezaG6.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaA7.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            A7 = true;
                        }
                        else
                        {
                            A7 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(A7 && barcoElegido) {
                            recogePiezaA7.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaB7.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            B7 = true;
                        }
                        else
                        {
                            B7 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(B7 && barcoElegido) {
                            recogePiezaB7.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaC7.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            C7 = true;
                        }
                        else
                        {
                            C7 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(C7 && barcoElegido) {
                            recogePiezaC7.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaD7.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            D7 = true;
                        }
                        else
                        {
                            D7 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(D7 && barcoElegido) {
                            recogePiezaD7.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaE7.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            E7 = true;
                        }
                        else
                        {
                            E7 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(E7 && barcoElegido) {
                            recogePiezaE7.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaF7.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            F7 = true;
                        }
                        else
                        {
                            F7 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(F7 && barcoElegido) {
                            recogePiezaF7.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        recogePiezaG7.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                final int action = event.getAction();
                switch (action) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        if(barcoElegido)
                        {
                            G7 = true;
                        }
                        else
                        {
                            G7 = false;
                        }
                        break;
                    case DragEvent.ACTION_DROP:
                        if(G7 && barcoElegido) {
                            recogePiezaG7.setBackgroundResource(R.drawable.imageview_pieza);
                        }
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        piezaP.setOnTouchListener(new View.OnTouchListener() {

            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                barcoElegido = true;
                ClipData dato = ClipData.newPlainText("","");
                View.DragShadowBuilder shadow = new View.DragShadowBuilder(piezaP);
                v.startDrag(dato,shadow,null,0);
                if(contElegirPieza > 3){
                    piezaP.setImageDrawable(null);
                }
                contElegirPieza++;
                return true;
            }
        });


        piezaM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {}
        });
        piezaM.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                barcoElegido = false;
                ClipData datos = ClipData.newPlainText("", "");
                View.DragShadowBuilder shadow = new View.DragShadowBuilder(piezaM);
                v.startDrag(datos, shadow, null, 0);
                shadow.getView();
                final int X;
                final int Y;
                int _xDelta = 0;
                int _yDelta = 0;
                int xDelta = 0;
                int yDelta = 0;
                int xmio = 0;

                /*if(event.getAction() != MotionEvent.ACTION_UP){
                    X = (int) event.getRawX();
                    Y = (int) event.getRawY();
                    Log.i("TAG", "fin: (" + X + ", " + Y + ")");
                }*/


                /*switch (event.getActionMasked()) {
                   case MotionEvent.ACTION_DOWN:
                        //activado evento

                   case MotionEvent.ACTION_UP:

                        Log.i("TAG", "touched up" );

                   case MotionEvent.ACTION_MOVE:
                       int coord= X - v.getWidth()/2;
                       int coord2= X - v.getWidth()/2;
                       Log.i("TAG", "fin: (" + coord + ", " + coord2 + ")");
                   case MotionEvent.ACTION_CANCEL:}*/

                return true;
            }
        });
    }
    }