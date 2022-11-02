package com.bsi.ac.id.uasmp1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterRecycler2 extends RecyclerView.Adapter<AdapterRecycler2.Viewholder2> {

    private final ArrayList<ItemModel2> dataItem2;
    private Context context2;

    public static class Viewholder2 extends RecyclerView.ViewHolder {

        TextView nama2;
        TextView negara2;
        ImageView foto2;
        LinearLayout parentLayout2;

        public Viewholder2(@NonNull View itemView) {
            super(itemView);

            nama2 = itemView.findViewById(R.id.text_judul2);
            negara2 = itemView.findViewById(R.id.text_asal2);
            foto2 = itemView.findViewById(R.id.image2);
            parentLayout2 = itemView.findViewById(R.id.parentLayout2);
        }
    }

    AdapterRecycler2(Context context2,ArrayList<ItemModel2> data2){
        this.context2 = context2;
        this.dataItem2 = data2;
    }

    @NonNull
    @Override
    public AdapterRecycler2.Viewholder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gride_item2, parent, false);
        return new Viewholder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecycler2.Viewholder2 holder, int position) {
        TextView text_name2 = holder.nama2;
        TextView text_asal2 = holder.negara2;
        ImageView image2 = holder.foto2;

        text_name2.setText(dataItem2.get(position).getName2());
        text_asal2.setText(dataItem2.get(position).getNation2());
        image2.setImageResource(dataItem2.get(position).getImage2());

        holder.parentLayout2.setOnClickListener(v -> {
            Toast.makeText(context2, dataItem2.get(position).getName2(), Toast.LENGTH_SHORT).show();

            if(dataItem2.get(position).getName2().equals("Turkish Delight")){
                Intent intent = new Intent(context2, Default2.class);
                intent.putExtra("GAMBAR_DEFAULT2", R.drawable.turkish_delight);
                intent.putExtra("TEXT_DEFAULT2", "Turkish Delight :");
                intent.putExtra("DESC_DEFAULT2","    Kenyal, warna-warni, dan berselimut putih. Dialah Turkish delight yang datang dari negeri kebab. Belum banyak gerai yang menjual camilan manis dan enak ini.\n\n");
                context2.startActivity(intent);
            }
            if(dataItem2.get(position).getName2().equals("Churros")){
                Intent intent = new Intent(context2, Default2.class);
                intent.putExtra("GAMBAR_DEFAULT2", R.drawable.churros);
                intent.putExtra("TEXT_DEFAULT2", "Churros :");
                intent.putExtra("DESC_DEFAULT2","   Donat ala Spanyol ini sama sekali berbeda dengan kebanyakan donat lainnya. Dari segi bentuk, rasa, dan saus pelengkap benar-benar bukan donat. Namun, adonannya memang mirip dengan donat.\n" +
                        "\n" +
                        "Bentuk churros panjang dengan bagian pinggir bergerigi. Rasa churros yang gurih akan semakin nikmat jika dicampur dengan saus cokelat atau saus lainnya. Di negara asalnya, churros adalah camilan yang disantap saat senggang.\n\n");
                context2.startActivity(intent);
            }
            if(dataItem2.get(position).getName2().equals("Ice Cream Singapore")){
                Intent intent = new Intent(context2, Default2.class);
                intent.putExtra("GAMBAR_DEFAULT2", R.drawable.es_sg);
                intent.putExtra("TEXT_DEFAULT2", "Ice Cream Singapore :");
                intent.putExtra("DESC_DEFAULT2","    Es krim biasa disajikan di atas cone, cup, atau gelas tinggi. Lalu, bagaimana dengan es krim di atas selembar roti tawar? Pasti terasa berbeda sensasi makannya ya?\n" +
                        "\n" +
                        "Es krim Singapura terkenal dengan es krim dengan penyajian di atas roti tawar. Membuatnya juga tergolong mudah dan murah. Bahkan hanya dengan modal dua ratus ribu rupiah saja, Anda sudah bisa memulai bisnis yang menggiurkan ini.\n" +
                        "\n" +
                        "Salah satu keunikan es krim Singapura adalah es krimnya yang tidak mudah mencair. Hal ini bisa terjadi karena es krim menggunakan bahan tepung pengeras yang membuat es krim tetap padat hingga suapan terakhir. Bagaimana, Anda tertarik untuk berbisnis es krim unik ini?\n\n");
                context2.startActivity(intent);
            }
            if(dataItem2.get(position).getName2().equals("Tteokbokki")){
                Intent intent = new Intent(context2, Default2.class);
                intent.putExtra("GAMBAR_DEFAULT2", R.drawable.tteokbokki);
                intent.putExtra("TEXT_DEFAULT2", "Tteokbokki :");
                intent.putExtra("DESC_DEFAULT2","    Kalau sering nonton drama Korea, Anda pasti tahu makanan satu ini. Tteokbokki atau yang sering disebut kue beras akhir-akhir ini sedang hits di Indonesia. Makanan kenyal dengan siraman kuah pedas kental ini banyak dijajakan di kafe, restoran, dan bahkan pinggir jalan di sini. Membuatnya juga terbilang mudah.\n\n");
                context2.startActivity(intent);
            }
            if(dataItem2.get(position).getName2().equals("Singkong Thailand")){
                Intent intent = new Intent(context2, Default2.class);
                intent.putExtra("GAMBAR_DEFAULT2", R.drawable.sampe_th);
                intent.putExtra("TEXT_DEFAULT2", "Singkong Thailand :");
                intent.putExtra("DESC_DEFAULT2","    Makanan yang terbuat dari singkong memang akrab di lidah orang Indonesia. Direbus, digoreng, atau dibuat keripik camilan singkong selalu laku terjual. Camilan ala Thailand ini pasti juga bisa mencuri perhatian para penikmat kuliner di sini.\n" +
                        "\n" +
                        "Singkong Thailand dibuat dengan cara direbus bersama garam dan potongan daun pandan. Setelah matang dan terasa empuk, singkong lalu ditaburi gula dan diaduk hingga mengental di atas api sedang. Singkong pun siap disajikan.\n" +
                        "\n" +
                        "Singkong tidak dimakan begitu saja. Dalam penyajiannya, singkong Thailand dimakan bersama saus santan kental yang telah dimasak bersama larutan  tepung sagu, garam, dan daun pandan. Saus kental ini lalu dituangkan ke atas singkong dalam piring saji.\n\n");
                context2.startActivity(intent);
            }

        });

    }

    @Override
    public int getItemCount() {
        return dataItem2.size();
    }

}
