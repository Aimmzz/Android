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

public class AdapterRecyclerView2 extends RecyclerView.Adapter<AdapterRecyclerView2.ViewHolder2> {

    private ArrayList<ItemModel2> dataItem2;
    private Context context2;

    public  static class ViewHolder2 extends RecyclerView.ViewHolder{
        public TextView textHead2;
        public TextView textSubhead2;
        LinearLayoutCompat parentLayout2;

        public ViewHolder2(@NonNull View itemView2){
            super(itemView2);

            textHead2 = itemView2.findViewById(R.id.text_title2);
            textSubhead2 = itemView2.findViewById(R.id.text_subtitle2);
            parentLayout2 = itemView2.findViewById(R.id.parentLayout2);
        }
    }
    AdapterRecyclerView2(Context context2,ArrayList<ItemModel2> dataItem2){
        this.context2 = context2;
        this.dataItem2 = dataItem2;

    }

    @NonNull
    @Override
    public AdapterRecyclerView2.ViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item2,parent,false);

        return new ViewHolder2(view2);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView2.ViewHolder2 holder, int position) {

        TextView textHead2 = holder.textHead2;
        TextView textSubHead2 = holder.textSubhead2;

        textHead2.setText(dataItem2.get(position).getName2());
        textSubHead2.setText(dataItem2.get(position).getType2());

        holder.parentLayout2.setOnClickListener(v -> {
            Toast.makeText(context2,"Beliau Adalah "+dataItem2.get(position).getName2(), Toast.LENGTH_SHORT).show();
            if (dataItem2.get(position).getName2().equals("Imam Malik bin Anas")){
                Intent intent = new Intent(context2, DefaultActivity2.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.maliki1);
                intent.putExtra("NAMA_DEFAULT","Imam Malik bin Anas");
                intent.putExtra("DESKRIPSI_TOKOH","Beliau bernama Malik bin Anas bin Malik. Berkunyah Abu Abdillah dan berlaqab Imam Darul Hijrah. Digelari dengan imam Darul Hijrah adalah karena beliau tidak pernah keluar dari kota Madinah.\n" +
                        "\n" +
                        "Imam Malik lahir di Madinah pada tahun 93 H -demikian mayaritas ulama berpandangan- berjarak 79 tahun dari wafatnya Rasulullah. Beliau lahir bertepatan pada tahun dimana Anas, pelayan Rasulullah shollallahu ‘alaihi wasallam wafat.\n" +
                        "\n" +
                        "Kehidupan imam Malik erat kaitannya dengan berbagai hal yang menakjubkan. Bahkan, hal-hal mengangumkan tersebut sudah dimulai sejak beliau belum lahir di dunia ini. Dimana imam Malik berada dalam kendungan selama 3 tahun, padahal lazimnya para ibu mengandung selama 9 bulan.\n" +
                        "\n" +
                        "Beliau rahimahullah meninggal pada usia 85 tahun tepat pada 14 Rabi’ul Awwal 179 H di Madinah dan dikuburkan di Baqi’. Semoga Allah merahmati beliau dengan rahmat yang luas, amin.\n" +
                        "\n" +
                        "Berbeda dengan imam abu Hanifah, imam Malik adalah orang Arab asli. Ayah dan ibunya adalah orang arab asli yang berasal dari Yaman. Yaitu dari kabilah dzu ashaby. Ibu beliau bernama ‘Aliyah binti Syarik al-Azdiyah.\n" +
                        "\n" +
                        "Imam An-Nawawi mengatakan bahwa Imam malik belajar dari 900 ulama. 300 dari kalangan tabi’in sedangkan 600 lagi dari kalangan tabi’ tabi’in yang beliau pilih dan ridhai agamanya. Diantara guru beliau adalah Nafi’, az-Zuhri, Ayyub as-Sikhtiyani, dan lain-lain dari ulama negeri Madinah. Beliau jarang meriwayatkan ilmu dari ulama negeri lain.\n" +
                        "\n" +
                        "Kemudian, murid beliau juga banyak jumlahnya. Dan diantara guru beliau yang juga meriwayatkan Ilmu dari imam malik adalah az-Zuhri, Rabi’ah, Yahya bin sa’id dan selainnya. Sedangkan dari sejawat beliau adalah imam al-Auza’I, ats-Tsauri, al-Laits bin Sa’id dan masih banyak lagi. Disamping mereka murid beliau juga adalah ibnu Mubarak, Muhammad bin hasan, Sa’id al-Qaththan dan lain sebagainya.\n" +
                        "\n" +
                        "Dan diantara kitab beliau yang paling fenomenal adalah “al-Muwattha’”. Kita ini adalah sebuah kitab yang pada masa Amirul mu’minin Harun ar-Rasyid ingin beliau gantungkan di Ka’bah dan menganjurkan manusia untuk mengamalkannya. Namun, usul itu ditolak oleh Imam Malik sendiri.");
                context2.startActivity(intent);
            }
            if (dataItem2.get(position).getName2().equals("Imam Abu Hanifah")){
                Intent intent = new Intent(context2, DefaultActivity2.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.hanafi);
                intent.putExtra("NAMA_DEFAULT","Imam Abu Hanifah");
                intent.putExtra("DESKRIPSI_TOKOH"," Beliau rahimahullah bernama An-Nu’man bin Tsabit bin zawatha at-Taimi al-Kufi. Lahir pada tahun 80 H di Kufah pada masa pemerintahan Abdul Malik bin Marwan. Dan wafat pada tahun 150 H dalam usia 70 tahun. Dengan meninggalkan seorang putra bernama, Hammad.\n" +
                        "\n" +
                        "Terkait sebab kematiannya, imam Adz-Zhahabi mengatakan dalam kitabnya al-ibar bahwa beliau meninggal diracun. Diriwayatkan bahwa al-Mansur memberi minuman racun kepada beliau, lalu beliau wafat. Semoga Allah merahmati beliau dengan rahmat yang luas, amin.\n" +
                        "\n" +
                        "Abu Hanifah adalah orang Persia asli (Non-Arab). Beliau diberi nama Nu’man adalah sebagai harapan kelak menjadi orang besar, sebagaimana Nu’man salah satu raja Persia.\n\n Abu Hanifah memiliki banyak guru dan murid. Diantara guru beliau adalah Atha’ bin Abi Rabah, Hammad bin abi Sulaiman, dll. Adapun murid beliau, diantaranya adalah abu Yusuf al-Qadhi, Waqi’, Muhammad bin Hasan Asy-Syaibani dan masih banyak lagi.\n" +
                        "\n" +
                        "Dan diantara karya beliau yang paling terkenal dan fenomenal adalah “Fiqhul Akbar”\n" +
                        "\n"+
                        "Barangkali, kita lebih mengenal beliau dengan sebutan “Abu Hanifah” dengan mazhab Hanafinya. Namun perlu diketahui bahwa, “Abu Hanifah” ialah kun-yah bagi beliau, bukan nama asli. Kunyah adalah setiap nama panggilan yang diawali dengan kata “Abu”.\n" +
                        "\n" +
                        "Dan budaya Islam ini telah lama dipraktekkan oleh kita masyarakat Aceh dengan kearifan lokal tentunya. Seperti “ayah si fulan/mak si fulen” dimana biasanya menggunakan nama anak pertama jika di Aceh.\n" +
                        "\n" +
                        "Ada yang mengatakan bahwa sebab pemberian kunyah untuk beliau dengan “Abu Hanifah” adalah kerena beliau terus berobat dengan obat yang bernama Hanifah. Wallahu a’lam.\n" +
                        "\n" +
                        "Adapun laqab/gelar beliau, diantaranya adalah ahlul ra’yi (ahli akal). Sebab beliau diberkahi kemampuan berfikir yang cemerlang, ahli logika dan pakar Qiyas.\n" +
                        "\n" +
                        "Pernah suatu ketika seorang pria datang menemui Abu Hanifah dan bertanya, “semalam aku minum khamar dan aku tak tau apakah aku telah menceraikan istriku atau tidak, apa yang harus aku lakukan?”\n" +
                        "\n" +
                        "Abu Hanifah menjawab, “dia tetap istrimu sampai kau benar-benar yakin bahwa telah menceraikannya”.\n" +
                        "\n" +
                        "Lalu di laki-laki tadi mendatangi Sufyan ats-Tsauri dan menanyakan hal yang sama. Beliau menjawab, “pergi dan rujuklah ia, jika kau telah menceraikannya maka kau telah merujuknya, namun jika belum, maka rujuk itu tidak beresiko apapun”.\n" +
                        "\n" +
                        "Kemudian laki-laki tadi kembali mendatangi Syuraik bin Abdullah dan bertanya hal serupa. Beliau menjawab, “pergi dan ceraikan istrimu lalu rujuklah ia”\n" +
                        "\n" +
                        "Dan untuk kesekian kalinya, laki-laki itu mendatangi orang lain, yaitu Zufar bin bin Huzhail dan bertanya hal yang sama. Lalu beliau bertanya, “sudahkah kau menanyakan hal ini kepada orang lain?” laki-laki tadi menjawab sudah sembari menceritakan semua jawaban yang telah ia peroleh.\n" +
                        "\n" +
                        "Lalu Zufar bin Huzhail membenarkan jawaban Abu Hanifah dengan memberi perumpamaan. Bahwa permisalan masalahmu dan jawaban mereka adalah seperti ini:\n" +
                        "\n" +
                        "Kamu melintasi sebuah selokan yang ada airnya lalu pakaianmu basah. Lalu kamu menanyakan hukum pakaianmu itu.\n" +
                        "\n" +
                        "Abu Hanifah menjawab, “Pakaianmu tetap suci sampai kau benar-benar menyakini kenajisan air tersebut”\n" +
                        "\n" +
                        "Sufyan ats-Tsauri menjawab, “Cuci pakaianmu, jika ia bernajis maka telah suci kembali. Dan jika tidak maka akan lebih bersih”\n" +
                        "\n" +
                        "Adapun Syuraik berkata, “pergi dan kencingi pakaianmu, lalu cucilah ia”.\n\n");
                context2.startActivity(intent);
            }
            if (dataItem2.get(position).getName2().equals("Imam Asyafi'i")){
                Intent intent = new Intent(context2, DefaultActivity2.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.syafii1);
                intent.putExtra("NAMA_DEFAULT","Imam Asyafi'i");
                intent.putExtra("DESKRIPSI_TOKOH"," Imam asy-Syafii dilahirkan pada tahun 150 H di Gaza, bertepatan dengan tahun imam Abu Hanifah meninggal dunia. Bahkan Sebagian ahli sejarah ada yang mengatakan bahwa beliau lahir pada malam meninggalnya Abu Hanifah.\n" +
                        "\n" +
                        "Beliau rahimahullah bernama lengkap Muhammad bin Idris bin Abbas bin utsman bin syafi’, dan bertemu dengan nasab Rasulullah di Abdu Manaf. Artinya, imam asy-syafii berasal dari suku Quraisy dan bertemu nasapnya dengan baginda nabi, meski bukan keturunan beliau shollallahu ‘alaihi wa sallam.\n" +
                        "\n" +
                        "Imam Asy-Syafi’I berkunyah Abu Abdillah dan berlaqab nashirus sunnah (pembela sunnah). Kendati beliau mampu memperoleh ilmu dan kedudukan yang tinggi, beliau adalah seorang ulama yang hidup dengan asuhan sang ibu saja, sebab ayah beliau wafat saat imam masih belia.\n" +
                        "\n" +
                        "Sang imam tumbuh kembang di mekkah meski lahir di Gaza. Sebab, pada umur 2 tahun sang ibu membawa beliau untuk menetap di mekkah.\n" +
                        "\n" +
                        "Diantara hal yang pertama beliau pelajari adalah kefasihan berbahsa arab, yaitu dengan keluar dari mekkah dan menetap di pedalaman bersama suku Huzhail (sebuah suku arab yang paling fasih Bahasanya).\n" +
                        "\n" +
                        "Baru setelah itu beliau belajar fiqih dari dua kutup keilmuan. Dari imam Malik dan dari murid senior imam Abu Hanifah, Yaitu Abu Yusuf dan Muhammad bin Hasan Asy-Syaibani.\n" +
                        "\n" +
                        "Kepakaran imam syafii tidak lagi diragukan, terlebih dalam bidang fiqih. Dimana beliau mampu menggabungkan dua jenis fiqih pada saat itu. Madrasah hadistnya imam Malik dan Madrasah ra’yi (akal/logika) imam abu Hanifah.\n" +
                        "\n" +
                        "Lebih jauh, beliau pulalah yang awal mudah menggagas dan membukukan ilmu ushul fiqh dengan kitabnya “Ar-Risalah”.\n" +
                        "\n" +
                        "Beliau berguru pada banyak syeikh, diantaranya adalah imam malik bin anas, ibnu Uyainah, Muhammad bin Hasan, Abu Yusuf dan masih banyak lagi.\n" +
                        "\n\n" +
                        "WAFAT\n" +
                        "Adapun diantara murid beliau adalah al-Humaidi, Abu Tsaur, Ahmad bin Hanbal, Yusuf bin Yahya al-Buwaithi dan masih banyak lagi.\n" +
                        "\n" +
                        "Beliau juga termasuk ulama yang cukup banyak mengarang kitab, diantaranya yang paling terkenal adalah al-Umm dan ar-Risalah.\n" +
                        "\n" +
                        "Rabi’ bin Sulaiman mengatakan bahwa imam Asy-Syafi’I meninggal pada malam jumat setelah magrib. Dan dimakamkan hari jum’at setelah ashar, hari terakhir dari bulan rajab. Ketika kami pulang dari mengantar jenazahnya, kami menyaksikan hilal bulan Sya’ban 204 H, dalam usia 54 tahun.\n" +
                        "\n" +
                        "Semoga Allah merahmati beliau dengan rahmat yang luas, amin.\n\n");
                context2.startActivity(intent);
            }
            if (dataItem2.get(position).getName2().equals("Imam Ahmad bin Hanbal")){
                Intent intent = new Intent(context2, DefaultActivity2.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.hanbali);
                intent.putExtra("NAMA_DEFAULT","Imam Ahmad bin Hanbal");
                intent.putExtra("DESKRIPSI_TOKOH"," Beliau adalah Abu Abdillah, Ahmad bin Ahmad bin Muhammad bin Hanbal asy-Syaibani. Imam Ibnu al-Atsir mengatakan, “Tidak ada di kalangan Arab rumah yang lebih terhormat, yang ramah terhadap tetangganya, dan berakhlak yang mulia, daripada keluarga Syaiban.”  Banyak orang besar yang terlahir dari kabilah Syaiban ini, di antara mereka ada yang menjadi panglima perang, ulama, dan sastrawan. Beliau adalah seorang Arab Adnaniyah, nasabnya bertemu denga Nabi shallallahu ‘alaihi wa sallam pada Nizar bin Ma’ad bin Adnan.\n" +
                        "\n" +
                        "Imam Ahmad dilahirkan di ibu kota kekhalifahan Abbasiyah di Baghdad, Irak, pada tahun 164 H/780 M. Saat itu, Baghdad menjadi pusat peradaban dunia dimana para ahli dalam bidangnya masing-masing berkumpul untuk belajar ataupun mengajarkan ilmu. Dengan lingkungan keluarga yang memiliki tradisi menjadi orang besar, lalu tinggal di lingkungan pusat peradaban dunia, tentu saja menjadikan Imam Ahmad memiliki lingkungan yang sangat kondusif dan kesempatan yang besar untuk menjadi seorang yang besar pula.\n" +
                        "\n" +
                        "Imam Ahmad berhasil menghafalkan Alquran secara sempurna saat berumur 10 tahun. Setelah itu ia baru memulai mempelajari hadits. Sama halnya seperti Imam Syafii, Imam Ahmad pun berasal dari keluarga yang kurang mampu dan ayahnya wafat saat Ahmad masih belia. Di usia remajanya, Imam Ahmad bekerja sebagai tukang pos untuk membantu perekonomian keluarga. Hal itu ia lakukan sambil membagi waktunya mempelajari ilmu dari tokoh-tokoh ulama hadits di Baghdad.\n" +
                        "\n" +
                        "Guru pertama Ahmad bin Hanbal muda adalah murid senior dari Imam Abu Hanifah yakni Abu Yusuf al-Qadhi. Ia belajar dasar-dasar ilmu fikih, kaidah-kaidah ijtihad, dan metodologi kias dari Abu Yusuf. Setelah memahami prinsip-prinsip Madzhab Hanafi, Imam Ahmad mempelajari hadits dari seorang ahli hadits Baghdad, Haitsam bin Bishr.\n" +
                        "\n" +
                        "Tidak cukup menimba ilmu dari ulama-ulama Baghdad, Imam Ahmad juga menempuh safar dalam mempelajari ilmu. Ia juga pergi mengunjungi kota-kota ilmu lainnya seperti Mekah, Madinah, Suriah, dan Yaman. Dalam perjalanan tersebut ia bertemu dengan Imam Syafii di Mekah, lalu ia manfaatkan kesempatan berharga tersebut untuk menimba ilmu dari beliau selama empat tahun. Imam Syafii mengajarkan pemuda Baghdad ini tidak hanya sekedar mengahfal hadits dan ilmu fikih, akan tetapi memahami hal-hal yang lebih mendalam dari hadits dan fikih tersebut.\n" +
                        "\n" +
                        "Walaupun sangat menghormati dan menuntut ilmu kepada ulama-ulama Madzhab Hanafi dan Imam Syafii, namun Imam Ahmad memiliki arah pemikiran fikih tersendiri. Ini menunjukkan bahwa beliau adalah seorang yang tidak fanatik dan membuka diri.\n" +
                        "\n" +
                        "Setelah belajar dengan Imam Syafii, Imam Ahmad mampu secara mandiri merumuskan pendapat sendiri dalam fikih. Imam Ahmad menjadi seorang ahli hadits sekaligus ahli fikih yang banyak dikunjungi oleh murid-murid dari berebagai penjuru negeri Islam. Terutama setelah Imam Syafii wafat di tahun 820, Imam Ahmad seolah-olah menjadi satu-satunya sumber rujukan utama bagi para penuntut ilmu yang senior maupun junior.\n" +
                        "\n" +
                        "Dengan ketenarannya, Imam Ahmad tetap hidup sederhana dan menolak untuk masuk dalam kehidupan yang mewah. Beliau tetap rendah hati, menghindari hadiah-hadia terutama dari para tokoh politik. Beliau khawatir dengan menerima hadiah-hadiah tersebut menghalanginya untuk bebas dalam berpendapat dan berdakwah.\n" +
                        "\n" +
                        "Abu Dawud mengatakan, “Majelis Imam Ahmad adalah majelis akhirat. Tidak pernah sedikit pun disebutkan perkara dunia di dalamnya. Dan aku sama sekali tidak pernah melihat Ahmad bin Hanbal menyebut perkara dunia.”\n" +
                        "\n" +
                        "Pada tahun 813-833, dunia Islam dipimpin oleh Khalifah al-Makmun, seorang khalifah yang terpengaruh pemikiran Mu’tazilah. Filsafat Mu’tazilah memperjuangkan peran rasionalisme dalam semua aspek kehidupan, termasuk teologi. Dengan demikian, umat Islam tidak boleh hanya mengandalkan Alquran dan sunnah untuk memahami Allah, mereka diharuskan mengandalkan cara filosofis yang pertama kali dikembangkan oleh orang Yunani Kuno. Di antara pokok keyakinan Mu’tazilah ini adalah bahwa meyakini bahwa Alquran adalah sebuah buku dibuat, artinya Alquran itu adalah makhluk bukan kalamullah.\n" +
                        "\n" +
                        "Al-Makmun percaya pada garis utama pemikiran Mu’tazilah ini, dan ia berusaha memaksakan keyakinan baru dan berbahaya tersebut kepada semua orang di kerajaannya –termasuk para ulama. Banyak ulama berpura-pura untuk menerima ide-ide Mu’tazilah demi menghindari penganiayaan, berbeda halnya dengan Imam Ahmad, beliau dengan tegas menolak untuk berkompromi dengan keyakinan sesat tersebut.\n" +
                        "\n" +
                        "Al-Makmun melembagakan sebuah inkuisisi (lembaga penyiksaan) dikenal sebagai Mihna. Setiap ulama yang menolak untuk menerima ide-ide Muktazilah dianiaya dan dihukum dengan keras. Imam Ahmad, sebagai ulama paling terkenal di Baghdad, dibawa ke hadapan al-Makmun dan diperintahkan untuk meninggalkan keyakinan Islam fundamentalnya mengenai teologi. Ketika ia menolak, ia disiksa dan dipenjarakan. Penyiksaan yang dilakukan pihak pemerintah saat itu sangatlah parah. Orang-orang yang menyaksikan penyiksaan berkomentar bahwa bahkan gajah pun tidak akab bisa bertahan jika disiksa sebagaimana Imam Ahmad disiksa. Diriwayatkan karena keras siksaannya, beberapa kali mengalami pingsan.\n" +
                        "\n" +
                        "Meskipun demikian, Imam Ahmad tetap memegang teguh keyakinannya, memperjuangkan akidah yang benar, yang demikian benar-benar menginspirasi umat Islam lainnya di seluruh wilayah Daulah Abbasiah. Apa yang dilakukan Imam Ahmad menunjukkan bahwa umat Islam tidak akan mengorbankan akidah mereka demi menyenangkan otoritas politik yang berkuasa. Pada akhirnya, Imam Ahmad hidup lebih lama dari al-Makmun dan Khalifah al-Mutawakkil  mengakhiri Mihna pada tahun 847 M. Imam Ahmad dibebaskan, beliau pun kembali diperkenankan mengajar dan berceramah di Kota Baghdad. Saat itulah kitab Musnad Ahmad bin Hanbal yang terkenal itu ditulis.\n" +
                        "\n" +
                        "Imam Ahmad wafat di Baghdad pada tahun 855 M. Banan bin Ahmad al-Qashbani yang menghadiri pemakaman Imam Ahmad bercerita, “Jumlah laki-laki yang mengantarkan jenazah Imam Ahmad berjumlah 800.000 orang dan 60.000 orang wanita .”\n" +
                        "\n" +
                        "Warisan Imam Ahmad yang tidak hanya terbatas pada permasalahn fikih yang ia hasilkan, atau hanya sejumlah hadits yang telah ia susun, namun beliau juga memiliki peran penting dalam melestarikan kesucian keyakinan Islam dalam menghadapi penganiayaan politik yang sangat intens. Kiranya inilah yang membedakan Imam Ahmad dari ketiga imam lainnya.\n" +
                        "\n" +
                        "Semoga Allah Ta’ala menerima amalan Imam Ahmad bin Hanbal dan menempatkannya di surga yang penuh kenikmatan.\n\n");
                context2.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataItem2.size();
    }

    void setFilter2(ArrayList<ItemModel2> filterModel2){
        dataItem2 = new ArrayList<>();
        dataItem2.addAll(filterModel2);
        notifyDataSetChanged();
    }
}
