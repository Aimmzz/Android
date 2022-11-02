package com.bsi.ac.id.projekuas;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

    private ArrayList<ItemModel> dataItem;

    private Context context;


    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textHead;
        TextView textSubHead;
        LinearLayoutCompat parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textHead = itemView.findViewById(R.id.text_title);
            textSubHead = itemView.findViewById(R.id.text_subtitle);
            parentLayout = itemView.findViewById(R.id.parentLayout);
        }
    }

    AdapterRecyclerView(Context context,ArrayList<ItemModel> dataItem){
        this.context = context;
        this.dataItem = dataItem;
    }

    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolder holder, int position) {

        TextView textHead = holder.textHead;
        TextView textSubhead = holder.textSubHead;

        textHead.setText(dataItem.get(position).getName());
        textSubhead.setText(dataItem.get(position).getType());

        holder.parentLayout.setOnClickListener(v -> {
            Toast.makeText(context, "Beliau Adalah "+dataItem.get(position).getName(),Toast.LENGTH_SHORT).show();

            if (dataItem.get(position).getName().equals("Sunan Gresik")){
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT",R.drawable.gresik);
                intent.putExtra("TEKS_DEFAULT","Sunan Gresik");
                intent.putExtra("DESKRIPSI_TEXT",
                        "   Maulana Malik Ibrahim atau Makdum Ibrahim, sering pula namanya disebut Maulana Maghribi adalah orang pertama yang menyebarkan agama Islam di Pulau Jawa. Maulana Malik Ibrahim berasal dari Persia. Namun, ada juga yang menyebutkan bahwa beliau berasal dari Turki, Arab, dan Gujarat. Tetapi pendapat yang lebih kuat ia berasal dari Maroko.\n\n" +
                                "   Pada tahun 1329 M, ia hijrah ke Pulau Jawa. Sebelumnya ia singgah di Campa, Kamboja. Daerah pertama yang dituju adalah Desa Sembalo, daerah yang masih berada di bawah kekuasaan Kerajaan Majapahit. Selain mengajarkan tentang ajaran keislaman, Maulana Malik Ibrahim juga memperkenalkan budi pekerti Islam dengan tutur kata yang sopan dan lemah lembut sehingga banyak penduduk Jawa yang tertarik memeluk agama Islam. Beliau tinggal di daerah Gresik, sehingga diberi gelar Sunan Gresik. Sunan Gresik diyakini sebagai pelopor penyebaran agama Islam di Jawa. la berdakwah secara intensif dan bijaksana. Sunan Gresik bukan orang Jawa, namun ia mampu mengantisipasi keadaan masyarakat yang dihadapinya dan menerapkan metode dakwah yang tepat untuk menarik simpati masyarakat terhadap Islam. Upaya menghilangkan sistem kasta dalam masyarakat pada masa itu menjadi objek dakwah Sunan Gresik. Maulana Malik Ibrahim ini wafat pada tanggal 12 Rabiul Awal 822 Hijriah atau 9 April 1419 M dan dimakamkam di Gresik.\n\n");
                context.startActivity(intent);
            }
            if (dataItem.get(position).getName().equals("Sunan Ampel")){
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT",R.drawable.ampel);
                intent.putExtra("TEKS_DEFAULT","Sunan Ampel");
                intent.putExtra("DESKRIPSI_TEXT",
                        "   Sunan Ampel mempunyai nama aslinya Raden Rakhmat. Ia seorang kemenakan dari raja Majapahit yang bernama Kertawijaya. Menurut cerita rakyat, Raden Rakhmat ini berasal dari Campa. Disebutkan ia adalah anak dari Raja Campa Ibrahim Asmarakandi atau Maulana Malik Ibrahim yang di utus ke Majapahit (Jawa) bersama adiknya yang bernama Sayid Ali Murtadha pada tahun 1443.\n\n" +
                                "   Setelah beberapa lama tinggal di Jawa, pada tahun 1450 Raden Rahmat ini menikah dengan Nyi Ageng Manila, putri Bupati Tuban yang sudah memeluk agama Islam. Selanjutnya Raden Rakhmat tinggal di daerah Ampeldenta, daerah pemberian dari raja Majapahit. Di Ampeldenta Raden Rahmat mendirikan mesjid dan membuka pondok pesantren. Sesuai dengan tempat kegiatan dakwahnya, Raden Rakhmat ini dikenal dengan Sunan Ampel.\n\n" +
                                "   Sunan Ampel memulai aktivitasnya dengan mendirikan pesantren di Ampel Denta (dekat Surabaya). Dengan kegiatan itu ia dikenal sebagai pembina pondok pesantren pertama di Jawa Timur. Sunan Ampel adalah seorang wali yang tidak setuju terhadap adat istiadat masyarakat Jawa pada masa itu, seperti kebiasaan mengadakan sesaji dan selamatan.\n\n" +
                                "   Sunan Ampel terkenal dengan ajaran Mo Limo yang berarti tidak melakukan lima perkara yang terlarang, yaitu:\n" +
                                "   1. Emoh Main(Tidak Judi)\n" +
                                "   2. Emoh Ngumbih (tidak mau minum-minuman yang memabukan)\n" +
                                "   3. Emoh Madat (tidak mau minum/menghisap candu/ganja)\n" +
                                "   4. Emoh Maling (tidak mau mencuri)\n" +
                                "   5. Emoh Madon (tidak mau berzina)\n\n" +
                                "   Hasil dari pendidikan pesantren Ampeldenta ini muncul tokoh wali lainnya, yaitu Sunan Giri dan Sunan Kalijaga. Begitu juga dengan putranya yang bernama Sunan Drajat dan Sunan Bonang telah mengikuti jejak ayahnya sebagai wali. Keberhasilan yang lain dari Sunan Ampel, ia menjadi perencana kerajaan Demak. Dialah yang melantik Raden Patah sebagai Sultan Demak yang pertama tahun 1481. Pada tahun 900 Hijriyah (1494 M), Sunan Ampel wafat. Jenazahnya dimakamkan di Ampeldenta, Surabaya.\n\n");
                context.startActivity(intent);
            }
            if (dataItem.get(position).getName().equals("Sunan Bonang")){
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT",R.drawable.bonang);
                intent.putExtra("TEKS_DEFAULT","Sunan Bonang");
                intent.putExtra("DESKRIPSI_TEXT",
                        "   Sunan Bonang atau Makhdum Ibrahim adalah putra Sunan Ampel dari istrinya yang bernama Nyi Ageng Manila, putri seorang adipati di Tuban. Ia belajar agama dari pesantren ayahnya di Ampeldenta. Setelah cukup ilmu ia berkelana dan menetap di Bonang (daerah Tuban, Jawa Tengah). Di Bonang itulah pusat dakwah Islamnya. Di sana ia mendirikan pesantren yang dikenal dengan sebutan Watu Layar.\n\n" +
                                "   Sunan Bonang menggunakan kesenian bonang sebagai media untuk berdakwah. Ia menabuh bonang diiringi dengan lagu-lagu berupa pantun yang bernafaskan keislaman. Sunan Bonang berhasil menggubah lagu gending sekaten dan tembang mocopat yang sampai sekarang tembang itu populer di kalangan masyarakat Jawa. Sunan Bonang dalam menyebarkan agama Islam selalu menyesuaikan diri dengan corak kebudayaan masyarakat Jawa yang menggemari wayang dan musik gamelan. Untuk itu ia menciptakan gending-gending yang memiliki nilai keislaman. Setiap bait lagu diselingi dengan ucapan dua kalimat syahadat (syahadatain), sehingga musik gamelan yang mengiringinya kini dikenal dengan istilah ‘sekaten’. Pada tahun 1525 M, Sunan Bonang wafat. Ia dimakamkan di daerah Tuban, Jawa Tengah.\n\n");
                context.startActivity(intent);
            }
            if (dataItem.get(position).getName().equals("Sunan Drajat")){
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT",R.drawable.drajat);
                intent.putExtra("TEKS_DEFAULT","Sunan Drajat");
                intent.putExtra("DESKRIPSI_TEXT",
                        "   Nama asli Sunan Drajat adalah Raden Qasim Syarifuddin atau didata lain menyatakan bahwa namanya adalah Masih Munat. la adalah putra Sunan Ampel dan saudara Sunan Bonang. Hal yang paling menonjol dalam dakwah Sunan Drajat adalah perhatiannya yang sangat serius pada masalah sosial. Ia banyak membantu yatim piatu, fakir miskin, orang sakit, dan orang sengsara. Sunan Drajat juga menggunakan media kesenian dalam berdakwah. Untuk itu ia menciptakan tembang Jawa (tembang pangkur) yang hingga kini masih digemari.\n\n" +
                                "   Pusat kegiatan Sunan Drajat di daerah Sedayu, Jawa Timur. Seperti halnya ayah dan saudaranya, Sunan Drajat dalam berdakwah menggunakan alat gamelan. Jika Sunan Bonang berhasil mengubah lagu gending sekaten, maka Sunan Drajat berhasil menciptakan lagu gending pangkur yang sampai sekarang lagu itu masih banyak digemari oleh masyarakat Jawa. Sunan Drajat terkenal juga dengan kegiatan sosialnya. Dialah wali yang memelopori penyantunan anak-anak yatim dan orang sakit.\n\n");
                context.startActivity(intent);
            }
            if (dataItem.get(position).getName().equals("Sunan Giri")){
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT",R.drawable.giri);
                intent.putExtra("TEKS_DEFAULT","Sunan Giri");
                intent.putExtra("DESKRIPSI_TEXT",
                        "   Sunan Giri atau Raden Paku adalah putra dari Maulana Ishak dari Blambangan, sahabat Sunan Ampel. Raden Paku ini bersahabat dengan Sunan Bonang. Keduanya kemudian disuruh pergi haji ke Mekah sambil menuntut ilmu oleh Sunan Ampel.\n\n" +
                                "   Selain menjadi murid Sunan Ampel, ia juga memperdalam ilmu agama di Pasai yang ketika itu menjadi tempat perkembangan ilmu ketuhanan, keimanan, dan tasawuf. Raden Paku memperoleh ilmu agama di Pasai sehingga dianugerahi gelar ‘ain al-yaqiin (keyakinan yang nyata). Karena itulah ia dikenal masyarakat dengan sebutan Raden Ainul Yakin. Sunan Giri mendirikan pesantren di daerah Giri. Pada perkembangan selanjutnya, pesantren itu menjadi pesantren yang terkenal ke seluruh nusantara. Santri yang belajar di pesantren Sunan Giri banyak berasal dari luar Jawa, seperti Madura, Kalimantan, Makasar, dan Lombok. Selain menerima santri dari berbagai daerah, Sunan Giri ternyata mengirimkan banyak mubalignya ke Nusa Tenggara, Sulawesi, dan Maluku. Setelah wafat, Sunan Giri dimakamkan di Bukit Giri dekat Gresik.\n\n");
                context.startActivity(intent);
            }
            if (dataItem.get(position).getName().equals("Sunan Kalijaga")){
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT",R.drawable.jaka);
                intent.putExtra("TEKS_DEFAULT","Sunan Kalijaga");
                intent.putExtra("DESKRIPSI_TEXT",
                        "   Sunan Kalijaga adalah putera seorang Adipati Tuban. Nama asli Sunan Kalijaga adalah Raden Jaka Said di sumber lain namanya adalah Raden Mas Syahid. Ayahnya bernama Raden Sahur Tumenggung Wilatika (bupati Tuban). Nama Kalijaga berasal dari bahasa Arab qadi zaka yang berarti pemimpin atau pelaksana yang menegakkan kesucian. Sejak kecil ia sudah menampakan ketaatan kepada agama Islam dan berbakti kepada orang tua.\n\n" +
                                "   Sunan Kalijaga merupakan mubalig keliling dan tidak memiliki pusat dakwah yang tetap. Sunan Kalijaga menggunakan kesenian wayang kulit sebagai media dakwahnya. Sunan Kalijaga memadukan kisah yang dilakonkan dengan ajaran Islam sehingga Islam mudah dipahami. Pada masa itu, masyarakat sangat menggemari kesenian wayang. Peninggalan lainnya dari Sunan Kalijaga yang sekarang masih dipakai dalam kehidupan masyarakat Indonesia, antara lain: perancang pertama baju taqwa, penciptakan lagu Dandang Gula dan Semarangan, mencipakan seni ukir bermotif dedaunan, menciptakan bedug di mesjid, menciptakan Gong Sekaten, dan memprakarsai Gerebeg Maulud. Sunan Kalijaga di makamkan di daerah Kadilangu dekat Demak.\n\n");
                context.startActivity(intent);
            }
            if (dataItem.get(position).getName().equals("Sunan Kudus")){
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT",R.drawable.kudus);
                intent.putExtra("TEKS_DEFAULT","Sunan Kudus");
                intent.putExtra("DESKRIPSI_TEXT",
                        "   Sunan Kudus atau Jafar Sadiq. Ia adalah salah seorang panglima tentara Demak.  Sepulangnya dari Mekah ia mendirikan pusat dakwah dengan nama Kudus, diambil dari nama al-quds (Palestina). Mesjid yang terkenal dibangun adalah Mesjid Kudus yang terkenal dengan menara mesjidnya. Semasa hidupnya, ia mengajarkan agama Islam di sekitar pesisir utara Jawa Tengah di daerah Kudus Dari sinilah ia lebih dikenal sebagai Sunan Kudus. Sunan Kudus ini seorang yang ahli dalam bidang tauhid, hadist, fiqih, dan lainnya. Ia juga terkenal sebagai pujangga yang mengarang cerita pendek yang bernafaskan keislaman. Dalam bidang kesenian ia dikenal sebagai pencipta Gending Asmarandana.\n\n" +
                                "   Jafar Sadiq adalah wali yang tinggal di Kudus. la adalah putra Raden Usman Haji yang menyiarkan Islam di daerah Jirang Panolan, Blora. Sunan Kudus memiliki keahlian khusus dalam ilmu agama. Sunan Kudus banyak didatangi oleh para penuntut ilmu dari berbagai wilayah karena keahlian yang dimilikinya. la juga dipercaya untuk mengendalikan pemerintahan di daerah Kudus. Karena itu, ia menjadi pemimpin agama sekaligus pemimpin pemerintahan di wilayah itu.\n\n");
                context.startActivity(intent);
            }
            if (dataItem.get(position).getName().equals("Sunan Muria")){
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT",R.drawable.muria);
                intent.putExtra("TEKS_DEFAULT","Sunan Muria");
                intent.putExtra("DESKRIPSI_TEXT",
                        "   Sunan Muria atau Raden Prawoto atau Raden Umar Said, adalah putra Sunan Kalijaga. Karena ibunya adalah adik Sunan Giri maka Sunan Muria ini keponakan Sunan Giri. Pusat kegiatan dakwah Sunan Muria terletak di lereng Gunung Muria (Jawa Tengah) Ia banyak bergaul dengan rakyat jelata. Sambil bercocok tanam, berladang, dan berdagang, ia mengajarkan ajaran Islam. Cara lainnya dalam berdakwah dengan menggunakan alat kesenian rakyat berupa gamelan. Ia menciptakan gending sinom dan kinanti. Sunan Muria wafat pada tahun 1560 M dan dimakamkan di atas Gunung Muria.\n\n");
                context.startActivity(intent);
            }
            if (dataItem.get(position).getName().equals("Sunan Gunung Jati")){
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT",R.drawable.jati);
                intent.putExtra("TEKS_DEFAULT","Sunan Gunung Jati");
                intent.putExtra("DESKRIPSI_TEXT",
                        "   Sunan Gunung Jati nama aslinya Falatehan atau Fatahilah, ada juga yang menyebut Syarif Hidayattullah berasal dari Pasai (Aceh). Sunan Gunung Jati ini adalah wali satu-satunya wali yang banyak berjasa dalam menyebarkan agama Islam di Jawa Barat. Pusat kegiatan dakwahnya di daerah Gunung Jati, Cirebon, Jawa Barat sehingga dikenal dengan sebutan Sunan Gunung Jati. Pada tahun 1570 M, Sunan Gunung Jati wafat dan dimakamkan di Gunung Jati, Cirebon Jawa Barat.\n\n");
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }

    void  setFilter(ArrayList<ItemModel> filterModel){
        dataItem = new ArrayList<>();
        dataItem.addAll(filterModel);
        notifyDataSetChanged();
    }

}
