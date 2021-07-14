package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.WisataViewHolder> {

    private ArrayList<Wisata> listWisata;

    public WisataAdapter(ArrayList<Wisata> listWisata) {
        this.listWisata = listWisata;
    }

    @NonNull

    @Override
    public WisataAdapter.WisataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_wisata,parent,false);
        return new WisataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WisataAdapter.WisataViewHolder holder, int position) {
        holder.tvNamawisata.setText(listWisata.get(position).getNama_wisata());
        holder.tvAlamatwisata.setText(listWisata.get(position).getAlamat_wisata());
        holder.tvNohpwisata.setText(listWisata.get(position).getNohp_wisata());
    }

    @Override
    public int getItemCount() {
        return (listWisata!=null) ? listWisata.size() : 0;
    }
    public class WisataViewHolder extends RecyclerView.ViewHolder{

        private TextView tvNamawisata, tvAlamatwisata, tvNohpwisata;

        public WisataViewHolder (View view){
            super(view);

            tvNamawisata        = view.findViewById(R.id.tvnama_wisata);
            tvAlamatwisata      = view.findViewById(R.id.tvalamat_wisata);
            tvNohpwisata        = view.findViewById(R.id.tvnohp_wisata);
        }
    }
}
