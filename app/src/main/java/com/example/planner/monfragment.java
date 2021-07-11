package com.example.planner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.zip.Inflater;

public class monfragment extends Fragment {

    RecyclerView recyclerView;
    Button btn_save;
    EditText info_et;
    private infoadapter infoadapter;
    public monfragment(){


    }

    @Nullable

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable  Bundle savedInstanceState) {
        ViewGroup rootView= (ViewGroup)inflater.inflate(R.layout.monfragment,container,false);

       /* btn_save=rootView.findViewById(R.id.btn_save);
        info_et=rootView.findViewById(R.id.info_et);

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info= info_et.getText().toString();
                info info1= new info();
                info1.setInfo(info);
                infoadapter.additem(info1);
                infoadapter.notifyDataSetChanged();

                info_et.setText("");


            }
        });

        recyclerView=(RecyclerView)rootView.findViewById(R.id.rv);
        infoadapter=new infoadapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(infoadapter);
*/


        return inflater.inflate(R.layout.monfragment,container,false);
    }
}
