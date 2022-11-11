package adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.maid.uttarakhandtourismboosterapp.R;

import java.util.ArrayList;

import Models.HomeModel;

public class HomeRecyclerAdapter extends RecyclerView.Adapter<HomeRecyclerAdapter.viewHolder> {

    ArrayList<HomeModel>data;
    Context context;

    public HomeRecyclerAdapter(ArrayList data, Context context) {
        Log.d("lolp",data.toString());
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.homeitems,parent,false);
        return new viewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {


        HomeModel model =  data.get(position);
        holder.imageView.setImageResource(model.getImage());
        Log.d("lolp",String.valueOf(model.getImage()));

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        holder.places.setText(model.getPlaces());
        Log.d("lolp",String.valueOf(model.getPlaces()));

        holder.details.setText(model.getDetails());
        Log.d("lolp",String.valueOf(model.getDetails()));

        holder.rating.setText(model.getRating());
        Log.d("lolp",String.valueOf(model.getRating()));


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView places,details,rating;


        public viewHolder(@NonNull View itemView) {
            super(itemView);

           imageView=itemView.findViewById(R.id.placeimage);
           places=itemView.findViewById(R.id.place);
           details=itemView.findViewById(R.id.detail);
           rating=itemView.findViewById(R.id.rating);
        }
    }
}
