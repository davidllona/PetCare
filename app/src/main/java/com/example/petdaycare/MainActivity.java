package com.example.petdaycare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import com.example.petdaycare.Data.PetConcract.PetEntry;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<Animal> animal=new ArrayList<Animal>();
        setContentView(R.layout.activity_main);
        ListView lista_animal=(ListView)findViewById(R.id.lista_animales);
        Animal uno=new Animal("Thor","Pitbull");
        animal.add(uno);
        Animal dos=new Animal("Rocco","Pitbull");
        animal.add(dos);
        Animal tres=new Animal("Lua","Bull Dog");
        animal.add(tres);
        Animal cuatro=new Animal("Nina","Labrador");
        animal.add(dos);
        Animal cinco=new Animal("Peter","Bull Dog");
        animal.add(cinco);
        Animal seis=new Animal("Estrella","Labrador");
        animal.add(seis);

        Adapter adaptadorLista=new Adapter(this,0,animal);
        lista_animal.setAdapter(adaptadorLista);
        lista_animal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent i =new Intent(getApplicationContext(), Datos.class);
                startActivity(i);

            }
        });


    }
}