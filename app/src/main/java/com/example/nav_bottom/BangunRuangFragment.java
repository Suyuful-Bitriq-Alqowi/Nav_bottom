package com.example.nav_bottom;

import android.content.Context;
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

        modelBangunRuang.add(new BangunModel("Kubus", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fcommons.wikimedia.org%2Fwiki%2FFile%3ASimpele_kubus.svg&psig=AOvVaw02JsxfoI-oCGCoYzGsVksN&ust=1711575653366000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCKjIlqnykoUDFQAAAAAdAAAAABAE"));
        modelBangunRuang.add(new BangunModel("Balok", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fid.wikipedia.org%2Fwiki%2FBalok&psig=AOvVaw39e-U5eyoM2KmKLNeGhd0n&ust=1711575703868000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCMj6p73ykoUDFQAAAAAdAAAAABAE"));
        modelBangunRuang.add(new BangunModel("Tabung", "https://www.google.com/url?sa=i&url=https%3A%2F%2Froboguru.ruangguru.com%2Fquestion%2Fperhatikan-gambar-tabung-berikut-b-tunjukan-sisi-sisi-yang-sejajar_QU-TLMY7P8N&psig=AOvVaw02UcbhJYEWnTQML6H9Rxvm&ust=1711575730940000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCNCJicrykoUDFQAAAAAdAAAAABAE"));
        modelBangunRuang.add(new BangunModel("Kerucut", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fid.pngtree.com%2Ffreepng%2Fcone-of-white-color-linear-sketch_7764410.html&psig=AOvVaw2O4LIdSWfzVkA6ok9CRgTz&ust=1711575759747000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCID1s9jykoUDFQAAAAAdAAAAABAE"));

        rvBangunRuang.setLayoutManager(new LinearLayoutManager(getActivity()));
        BangunRuangAdapter adapter = new BangunRuangAdapter(getContext(), modelBangunRuang);
        rvBangunRuang.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onItemClick(View view, int position) {
        // handle item click if needed
    }
}
