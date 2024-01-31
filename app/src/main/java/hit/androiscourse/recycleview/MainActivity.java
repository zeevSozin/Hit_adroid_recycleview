package hit.androiscourse.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import hit.androiscourse.recycleview.dao.Character;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private ArrayList<Character> dataSet;
    private CustomAdapter adapter;
    private CharacterData data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.res);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        data = new CharacterData();
        dataSet = data.getCharacters();


        adapter = new CustomAdapter(dataSet);
        recyclerView.setAdapter(adapter);
    }
}