package com.example.smk7.Adapter;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.smk7.Model.BankTugasModel;
import com.example.smk7.R;
import java.util.List;

public class BankTugasAdapter extends RecyclerView.Adapter<BankTugasAdapter.BanktugasViewHolder> {

    private List<BankTugasModel> banktugasList;
    private ViewPager2 viewPager;
    private MateriAdapter.OnItemClickListener listener;

    // Constructor
    public BankTugasAdapter(List<BankTugasModel> tugasList, ViewPager2 viewPager) {
        this.banktugasList = tugasList;
        this.viewPager = viewPager;
    }


    @NonNull
    @Override
    public BanktugasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.carditem_bank_tugas, parent, false);
        return new BanktugasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BanktugasViewHolder holder, int position) {
        BankTugasModel tugas = banktugasList.get(position);
        holder.tvNama.setText(tugas.getNama());
        holder.tvStatus.setText(tugas.getStatus());

        // Handle item click
        holder.itemView.setOnClickListener(v -> {
            viewPager.setUserInputEnabled(false);
            new Handler().postDelayed(() -> viewPager.setUserInputEnabled(true), 300);
            if (viewPager != null ) {
                viewPager.setCurrentItem(14, false);  // false berarti tanpa animasi

                // Aktifkan kembali swipe setelah perpindahan selesai
            }
        });
    }

    @Override
    public int getItemCount() {
        return banktugasList.size();
    }

    public static class BanktugasViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama, tvStatus;

        public BanktugasViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.txtnama);
            tvStatus = itemView.findViewById(R.id.txtstatus);
        }
    }
}
