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
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterRecycler extends RecyclerView.Adapter<AdapterRecycler.ViewHolder> {

    ArrayList<ItemModel> dataItem;
    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nama;
        TextView negara;
        ImageView foto;
        LinearLayout parentLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nama = itemView.findViewById(R.id.text_judul);
            negara = itemView.findViewById(R.id.text_asal);
            foto = itemView.findViewById(R.id.image);
            parentLayout = itemView.findViewById(R.id.parentLayout);
        }
    }

    AdapterRecycler(Context context,ArrayList<ItemModel> data){
        this.context = context;
        this.dataItem = data;
    }

    @NonNull
    @Override
    public AdapterRecycler.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecycler.ViewHolder holder, int position) {

        TextView text_name = holder.nama;
        TextView text_asal = holder.negara;
        ImageView image = holder.foto;

        text_name.setText(dataItem.get(position).getName());
        text_asal.setText(dataItem.get(position).getNation());
        image.setImageResource(dataItem.get(position).getImage());

        holder.parentLayout.setOnClickListener(v -> {
            Toast.makeText(context, dataItem.get(position).getName(), Toast.LENGTH_SHORT).show();

            if(dataItem.get(position).getName().equals("Kue Cubit")){
                Intent intent = new Intent(context, Default.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.kue_cubit);
                intent.putExtra("TEKS_DEFAULT", "Kue Cubit :");
                intent.putExtra("DESC_DEFAULT","   Jajanan tradisional yang ini selalu menjadi idola. Membuatnya mudah, hanya perlu membuat adonan dari tepung terigu, gula, mentega, dan telur, lalu dituang ke cetakan khusus. Biasanya, kue cubit disajikan dengan topping cokelat atau keju. Kue cubit kekinian biasanya menggunakan campuran red velvet atau green tea.\n\n");
                context.startActivity(intent);
            }
            if(dataItem.get(position).getName().equals("Dadar Gulung")){
                Intent intent = new Intent(context, Default.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.dadar_gulung);
                intent.putExtra("TEKS_DEFAULT", "Dadar Gulung :");
                intent.putExtra("DESC_DEFAULT","   Dadar gulung biasanya berwarna hijau karena mengandung air daun pandan. Namun, air daun pandan diganti dengan pewarna makanan hijau yang lebih mudah didapat. Isiannya menggunakan campuran kelapa parut dan gula merah. Banyak juga yang mengkreasikan kulit dadar gulung menjadi aneka warna atau bahkan motif polkadot.\n\n");
                context.startActivity(intent);
            }
            if(dataItem.get(position).getName().equals("Klepon")){
                Intent intent = new Intent(context, Default.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.klepon);
                intent.putExtra("TEKS_DEFAULT", "Klepon :");
                intent.putExtra("DESC_DEFAULT","   Makanan yang satu ini dibalut dengan parutan kelapa. Saat digigit, akan terasa seperti dikejutkan dengan rasa manis legit dari gula merah sebagai isiannya. Ingin mengabadikan kenikmatannya, sekarang ini banyak kafe yang menjual aneka cake dengan citarasa klepon juga.\n\n");
                context.startActivity(intent);
            }
            if(dataItem.get(position).getName().equals("Lemper")){
                Intent intent = new Intent(context, Default.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.lemper);
                intent.putExtra("TEKS_DEFAULT", "Lemper :");
                intent.putExtra("DESC_DEFAULT","   Jajanan ini selalu digemari hingga kini. Beras ketan yang dimasak, lalu diisi daging ayam, dan dibalut dengan daun pisang ini memiliki rasa gurih yang nikmat. Beberapa buah lemper bisa bikin perut terasa kenyang.\n\n");
                context.startActivity(intent);
            }
            if(dataItem.get(position).getName().equals("Serabi")){
                Intent intent = new Intent(context, Default.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.serabi);
                intent.putExtra("TEKS_DEFAULT", "Serabi :");
                intent.putExtra("DESC_DEFAULT","   Serabi yang terbuat dari campuran tepung beras dan santan memiliki rasa gurih yang sangat unik. Jika kamu menyukai manis, serabi bisa disajikan dengan kinca. Sementara jika menyukai rasa asin, serabi bisa diberi taburan oncom. Namun, sekarang ini banyak juga yang menjual serabi dengan topping cokelat, keju, atau daging.\n\n");
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }


}
