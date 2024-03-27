package com.example.nav_bottom;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class BangunDatarFragment extends Fragment implements BangunDatarAdapter.ItemClickListener {

    ArrayList<BangunModel> modelbangundatar = new ArrayList<>();
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_bangun_datar, container, false);
        RecyclerView rvBangunDatar = rootview.findViewById(R.id.rvdatar);

        modelbangundatar.add(new BangunModel("Persegi", "https://i.pinimg.com/564x/ee/f9/d3/eef9d3b8ec583ae7e531075122eae862.jpg"));
        modelbangundatar.add(new BangunModel("Persegi Panjang", "https://imgix2.ruangguru.com/assets/miscellaneous/png_nvhfe6_5811.png"));
        modelbangundatar.add(new BangunModel("Segitiga", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRikurWFgrxEqXqDwOYJRLgYpAcuKyg0l7gEml8ZBIwwg&s"));
        modelbangundatar.add(new BangunModel("Jajar Genjang", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Geometri_parallellogram.svg/200px-Geometri_parallellogram.svg.png"));

        rvBangunDatar.setLayoutManager(new LinearLayoutManager(getActivity()));
        BangunDatarAdapter adapter = new BangunDatarAdapter(getContext(), modelbangundatar);
        adapter.setClickListener(this); // Set click listener ke fragment
        rvBangunDatar.setAdapter(adapter);

        return rootview;
    }

    @Override
    public void onItemClick(View view, int position) {
        String pilihan = modelbangundatar.get(position).getName();
        if ("Persegi".equals(pilihan)) {
            Intent intent = new Intent(getActivity(), Persegi.class);
            startActivity(intent);
        } else if ("Persegi Panjang".equals(pilihan)) {
            startActivity(new Intent(getActivity(), PersegiPanjang.class));
        }else if ("Segitiga".equals(pilihan)) {
            startActivity(new Intent(getActivity(), Segitiga.class));
        }else if ("Jajar Genjang".equals(pilihan)) {
            startActivity(new Intent(getActivity(), Janjang.class));
        }
        else {}
    }
}


