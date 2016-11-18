package com.bijendra.materialdesignstyle.materialdesignstyle;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyTileFragment extends Fragment {


    public MyTileFragment() {
        // Required empty public constructor
    }
    // TODO: Rename and change types and number of parameters
    public static MyTileFragment newInstance() {
        MyTileFragment fragment = new MyTileFragment();

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        RecyclerView  recyclerView= (RecyclerView) inflater.inflate(R.layout.recycler_view,container,false);
        ContentAdapter adapter=new ContentAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        // Set padding for Tiles (not needed for Cards/Lists!)
        int tilePadding=getResources().getDimensionPixelSize(R.dimen.tile_padding);
        recyclerView.setPadding(tilePadding,tilePadding,tilePadding,tilePadding);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),DetailActivity.class));
            }
        });


        return recyclerView;
    }

}
