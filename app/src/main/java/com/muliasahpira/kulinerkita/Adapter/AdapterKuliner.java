package com.muliasahpira.kulinerkita.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.muliasahpira.kulinerkita.Model.ModelKuliner;
import com.muliasahpira.kulinerkita.R;

import java.util.List;

public class AdapterKuliner extends RecyclerView.Adapter<AdapterKuliner.VHKuliner> {
    private Context ctx;
    private List<ModelKuliner> listKuliner;

    public AdapterKuliner(Context ctx, List<ModelKuliner> listKuliner) {
        this.ctx = ctx;
        this.listKuliner = listKuliner;
    }

    @NonNull
    @Override
    public VHKuliner onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View varView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_kuliner, parent, false);
        return new VHKuliner(varView);
    }

    @Override
    public void onBindViewHolder(@NonNull VHKuliner holder, int position) {
        ModelKuliner MK = listKuliner.get(position);
        holder.tvId.setText(MK.getId());
        holder.tvNama.setText(MK.getNama());
        holder.tvAsal.setText(MK.getAsal());
        holder.tvDeskripsiSingkat.setText(MK.getDeskripsi_singkat());
        holder.tvDeskripsiLengkap.setText(MK.getDeskripsi_lengkap());
    }

    @Override
    public int getItemCount() {
        return listKuliner.size();
    }

    public class VHKuliner extends RecyclerView.ViewHolder{
        TextView tvId, tvNama, tvAsal, tvDeskripsiSingkat, tvDeskripsiLengkap;
        public VHKuliner(@NonNull View itemView) {
            super(itemView);

            tvId = itemView.findViewById(R.id.tv_id);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvAsal = itemView.findViewById(R.id.tv_asal);
            tvDeskripsiSingkat = itemView.findViewById(R.id.tv_deskripsi_singkat);
            tvDeskripsiLengkap = itemView.findViewById(R.id.tv_deskripsi_lengkap);
        }
    }
}
