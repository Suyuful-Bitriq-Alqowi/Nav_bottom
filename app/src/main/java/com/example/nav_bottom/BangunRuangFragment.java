package com.example.nav_bottom;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BangunRuangFragment extends Fragment implements BangunRuangAdapter.ItemClickListener {

    ArrayList<BangunModel> modelBangunRuang = new ArrayList<>();
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_bangun_ruang, container, false);
        RecyclerView rvBangunRuang = rootView.findViewById(R.id.rvruang);

        modelBangunRuang.add(new BangunModel("Kubus", "https://i.pinimg.com/564x/ee/f9/d3/eef9d3b8ec583ae7e531075122eae862.jpg"));
        modelBangunRuang.add(new BangunModel("Balok", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Cuboid_simple.svg/240px-Cuboid_simple.svg.png"));
        modelBangunRuang.add(new BangunModel("Tabung", "https://www.duniailkom.com/wp-content/uploads/2022/12/Ilustrasi-gambar-tabung.png"));
        modelBangunRuang.add(new BangunModel("Kerucut", "https://core-ruangguru.s3.amazonaws.com/assets/ruang_belajar/questions/q_wbqnx96472.png"));

        rvBangunRuang.setLayoutManager(new LinearLayoutManager(getActivity()));
        BangunRuangAdapter adapter = new BangunRuangAdapter(getContext(), modelBangunRuang);
        adapter.setClickListener(this);
        rvBangunRuang.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onItemClick(View view, int position) {
        String pilihan1 = modelBangunRuang.get(position).getName();
        if ("Kubus".equals(pilihan1)){
            Intent intent = new Intent(getActivity(), Kubus.class);
            startActivity(intent);
        } else if ("Balok".equals(pilihan1)) {
            Intent intent = new Intent(getActivity(), Balok.class);
            startActivity(intent);
        } else if ("Tabung".equals(pilihan1)) {
            Intent intent = new Intent(getActivity(),Tabung.class);
            startActivity(intent);
        } else if ("Kerucut".equals(pilihan1)) {
            Intent intent = new Intent(getActivity(),Kerucut.class);
            startActivity(intent);
        }
    }
}
