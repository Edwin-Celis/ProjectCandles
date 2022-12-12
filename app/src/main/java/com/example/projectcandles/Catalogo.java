package com.example.projectcandles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.projectcandles.Adapters.ProductAdapter;
import com.example.projectcandles.Entities.Product;

import java.util.ArrayList;

public class Catalogo extends AppCompatActivity {
    private ListView listViewProducts;
    private ProductAdapter productAdapter;
    private ArrayList<Product> arrayProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

        arrayProducts = new ArrayList<>();
        //*******CREACIÓN DE PRODUCTOS
        Product agata = new Product("Agata","Hermosa vela elaborada en cera de soja con aroma floral",11000,R.drawable.agata);
        Product ambar = new Product("Ambar","Descripcion2",13000,R.drawable.ambar);
        Product cuarzo = new Product("Cuarzo","Descripcion3",11000,R.drawable.cuarzo);
        Product diamante = new Product("Diamante","Descripcion4",12000,R.drawable.diamante);
        Product perla = new Product("Perla","Descripcion5",13000,R.drawable.perla);
        Product zafiro = new Product("Zafiro","Descripcion6",13000,R.drawable.zafiro);

        arrayProducts.add(agata);
        arrayProducts.add(ambar);
        arrayProducts.add(cuarzo);
        arrayProducts.add(diamante);
        arrayProducts.add(perla);
        arrayProducts.add(zafiro);


        listViewProducts = (ListView) findViewById(R.id.listViewProducts);
        productAdapter = new ProductAdapter(this, arrayProducts);
        listViewProducts.setAdapter(productAdapter);
    }
}