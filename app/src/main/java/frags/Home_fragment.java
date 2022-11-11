package frags;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.maid.uttarakhandtourismboosterapp.R;

import java.util.ArrayList;

import Models.HomeModel;
import adapters.CloudEndCallback;
import adapters.HomeRecyclerAdapter;


public class Home_fragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        int[] images={
                R.drawable.cloudend,
                R.drawable.dalihills,
                R.drawable.george,
                R.drawable.inbetweenmountain


        };
        String[] place={
                "Cloud End",
                "Dali Hills",
                "George Everest",
                "Nanital"
        };
        String[] rating={
                "4.7/5",
                "4.8/5",
                "4.5/5",
                "4.3/5"
        };
        String[] details={
                "Mussoorie, cloud end",
                "Charleville, Mussoorie",
                "George Everest, Mussoorie",
                "Nainital"
        };
        ArrayList<HomeModel> array = new ArrayList();
        for (int i = 0; i < 4; i++) {
            array.add(new HomeModel(images[i],place[i],rating[i],details[i]));
            Log.d("lol",place[i]);
            Log.d("lol",rating[i]);
            Log.d("lol",details[i]);
            Log.d("lol",String.valueOf(images[i]));
        }
        Log.d("lol",array.toString());
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        HomeRecyclerAdapter homeRecyclerAdapter = new HomeRecyclerAdapter(array,getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(recyclerView.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(homeRecyclerAdapter);
    }
}