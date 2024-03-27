package com.example.nav_bottom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class BangunRuangAdapter extends RecyclerView.Adapter<BangunRuangAdapter.MyViewHolder> {
    Context context;
    ArrayList<BangunModel> modelBangunRuang = new ArrayList<>();

    ItemClickListener mClickListener;

    public BangunRuangAdapter(Context context, ArrayList<BangunModel> modelBangunRuang) {
        this.context = context;
        this.modelBangunRuang = modelBangunRuang;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_layout1, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvNameBangunRuang.setText(modelBangunRuang.get(position).getName());
        Glide.with(context).load(modelBangunRuang.get(position).getImg()).into(holder.imageBangunRuang);
    }

    @Override
    public int getItemCount() {
        return modelBangunRuang.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageBangunRuang;
        TextView tvNameBangunRuang;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageBangunRuang = itemView.findViewById(R.id.imageBangunRuang);
            tvNameBangunRuang = itemView.findViewById(R.id.tvNameBangunRuang);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (mClickListener != null) mClickListener.onItemClick(v, getAdapterPosition());
        }
    }

    BangunModel getItem(int id) {
        return modelBangunRuang.get(id);
    }

    void setClickListener(ItemClickListener itemClickListener){
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener{
        void onItemClick(View view,int position);
    }
}
