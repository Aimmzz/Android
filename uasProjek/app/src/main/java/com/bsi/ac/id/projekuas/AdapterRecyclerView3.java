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

public class AdapterRecyclerView3 extends RecyclerView.Adapter<AdapterRecyclerView3.ViewHolder3> {

    private ArrayList<ItemModel3> dataItem3;
    private Context context3;

    public static class ViewHolder3 extends RecyclerView.ViewHolder{
        public TextView textHead3;
        public TextView textSubHead3;
        LinearLayoutCompat parentLayout3;

        public  ViewHolder3(@NonNull View itemView3){
            super(itemView3);

            textHead3 = itemView3.findViewById(R.id.text_title3);
            textSubHead3 = itemView3.findViewById(R.id.text_subtitle3);
            parentLayout3 = itemView3.findViewById(R.id.parentLayout3);
        }
    }

    AdapterRecyclerView3(Context context3,ArrayList<ItemModel3> dataItem3){
        this.context3 = context3;
        this.dataItem3 = dataItem3;
    }

    @NonNull
    @Override
    public AdapterRecyclerView3.ViewHolder3 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item3,parent,false);
        return new ViewHolder3(view3);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView3.ViewHolder3 holder, int position) {

        TextView textHead3 = holder.textHead3;
        TextView textSubHead3 = holder.textSubHead3;

        textHead3.setText(dataItem3.get(position).getName3());
        textSubHead3.setText(dataItem3.get(position).getType3());

        holder.parentLayout3.setOnClickListener(v -> {
            Toast.makeText(context3, "Beliau Adalah "+dataItem3.get(position).getName3(), Toast.LENGTH_SHORT).show();
            if (dataItem3.get(position).getName3().equals("Imam Bukhari")){
                Intent intent = new Intent(context3, DefaultActivity3.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.bukhari);
                intent.putExtra("NAMA_DEFAULT","Imam Bukhari");
                intent.putExtra("DESKRIPSI_TOKOH"," Beliau bernama Muhammad, putra dari Isma’il bin Ibrahim bin Al-Mughirah bin Bardizbah Al-Ju’fi, biasa dipanggil dengan sebutan Abu ‘Abdillah. Beliau dilahirkan pada hari Jum’at setelah shalat Jum’at 13 Syawwal 194 H di Bukhara (Bukarest). Ketika masih kecil, ayahnya yaitu Isma’il sudah meninggal sehingga dia pun diasuh oleh sang ibu. Ghinjar dan Al-Lalika’i menceritakan bahwa ketika kecil kedua mata Bukhari buta. Suatu ketika ibunya bermimpi melihat Nabi Ibrahim berkata kepadanya, “Wahai ibu, sesungguhnya Allah telah memulihkan penglihatan putramu karena banyaknya doa yang kamu panjatkan kepada-Nya.” Pagi harinya dia dapati penglihatan anaknya telah sembuh (lihat Hadyu Sari, hal. 640)\n" +
                        "\n" +
                        "Abu Mush’ab rahimahullah (di dalam cetakan tertulis Abu Mu’shab, sepertinya ini salah tulis karena dalam kalimat sesudahya ditulis Abu Mush’ab, pent) Ahmad bin Abi Bakr Az Zuhri mengatakan, “Muhammad bin Isma’il (Bukhari) lebih fakih dan lebih mengerti hadits dalam pandangan kami daripada Imam Ahmad bin Hambal.” Salah seorang teman duduknya berkata kepadanya, “Kamu terlalu berlebihan.” Kemudian Abu Mush’ab justru mengatakan, “Seandainya aku bertemu dengan Malik (lebih senior daripada Imam Ahmad, pent) dan aku pandang wajahnya dengan wajah Muhammad bin Isma’il niscaya aku akan mengatakan: Kedua orang ini sama dalam hal hadits dan fiqih.” (Hadyu Sari, hal. 646)\n" +
                        "\n" +
                        "Qutaibah bin Sa’id rahimahullah mengatakan, “Aku telah duduk bersama para ahli fikih, ahli zuhud, dan ahli ibadah. Aku belum pernah melihat semenjak aku bisa berpikir ada seorang manusia yang seperti Muhammad bin Isma’il. Dia di masanya seperti halnya Umar di kalangan para sahabat.” (Hadyu Sari, hal. 646)\n" +
                        "\n" +
                        "Muhammad bin Yusuf Al Hamdani rahimahullah menceritakan: Suatu saat Qutaibah ditanya tentang kasus “perceraian dalam keadaan mabuk”, lalu masuklah Muhammad bin Isma’il ke ruangan tersebut. Seketika itu pula Qutaibah mengatakan kepada si penanya, “Inilah Ahmad bin Hambal, Ishaq bin Rahawaih, dan Ali bin Madini yang telah dihadirkan oleh Allah untuk menjawab pertanyaanmu.” Seraya mengisyaratkan kepada Bukhari (Hadyu Sari, hal. 646)\n" +
                        "\n" +
                        "Ahmad bin Hambal rahimahullah mengatakan, “Negeri Khurasan belum pernah melahirkan orang yang seperti Muhammad bin Isma’il.” (Hadyu Sari, hal. 647)\n" +
                        "\n" +
                        "Bundar Muhammad bin Basyar rahimahullah mengatakan tentang Bukhari, “Dia adalah makhluk Allah yang paling fakih di zaman kami.” (Hadyu Sari, hal. 647)\n" +
                        "\n" +
                        "Hasyid bin Isma’il rahimahullah menceritakan: Ketika aku berada di Bashrah aku mendengar kedatangan Muhammad bin Isma’il. Ketika dia datang, Muhammad bin Basyar pun mengatakan, “Hari ini telah datang seorang pemimpin para fuqoha’.” (Hadyu Sari, hal. 647)\n" +
                        "\n" +
                        "Muslim bin Hajjaj rahimahullah -penulis Shahih Muslim, murid Imam Bukhari- mengatakan, “Aku bersaksi bahwa di dunia ini tidak ada orang yang seperti dirimu (yaitu seperti Bukhari).” (Hadyu Sari, hal. 650)\n" +
                        "\n" +
                        "Muhammad bin Abi Hatim Warraq Al Bukhari menceritakan: Aku mendengar Bukhari mengatakan, “Aku mendapatkan ilham untuk menghafal hadits ketika aku masih berada di sekolah baca tulis (kuttab).” Aku berkata kepadanya, “Berapakah umurmu ketika itu?” Dia menjawab, “Sepuluh tahun atau kurang dari itu. Kemudian setelah lulus dari Kuttab, aku pun bolak-balik menghadiri majelis haditsnya Ad-Dakhili dan ulama hadits lainnya. Suatu hari tatkala membacakan hadits di hadapan orang-orang dia (Ad-Dakhili) mengatakan, ‘Sufyan meriwayatkan dari Abu Zubair dari Ibrahim.’ Maka aku katakan kepadanya, ‘Sesungguhnya Abu Zubair tidak meriwayatkan dari Ibrahim.’ Maka dia pun menghardikku, lalu aku berkata kepadanya, ‘Rujuklah kepada sumber aslinya, jika kamu punya.’ Kemudian dia pun masuk dan melihat kitabnya lantas kembali dan berkata, ‘Bagaimana kamu bisa tahu wahai anak muda?’ Aku menjawab, ‘Dia adalah Az Zubair (bukan Abu Zubair, pen). Nama aslinya Ibnu Adi yang meriwayatkan hadits dari Ibrahim.’ Kemudian dia pun mengambil pena dan membenarkan catatannya. Dan dia pun berkata kepadaku, ‘Kamu benar’. Menanggapi cerita tersebut, Bukhari ini Warraq berkata, “Biasa, itulah sifat manusia. Ketika membantahnya umurmu berapa?” Bukhari menjawab, “Sebelas tahun.” (Hadyu Sari, hal. 640)\n" +
                        "Hasyid bin Isma’il menceritakan: Dahulu Bukhari biasa ikut bersama kami bolak-balik menghadiri pelajaran para masayikh (para ulama) di Bashrah, pada saat itu dia masih kecil. Dia tidak pernah mencatat, sampai-sampai berlalu beberapa hari lamanya. Setelah 6 hari berlalu kami pun mencela kelakuannya. Menanggapi hal itu dia mengatakan, “Kalian merasa memiliki lebih banyak hadits daripada aku. Cobalah kalian tunjukkan kepadaku hadits-hadits yang telah kalian tulis.” Maka kami pun mengeluarkan catatan-catatan hadits tersebut. Lalu ternyata dia menambahkan hadits yang lain lagi sebanyak lima belas ribu hadits. Dia membacakan hadits-hadits itu semua dengan ingatan (di luar kepala), sampai-sampai kami pun akhirnya harus membetulkan catatan-catatan kami yang salah dengan berpedoman kepada hafalannya (Hadyu Sari, hal. 641)\n" +
                        "Muhammad bin Al Azhar As Sijistani rahimahullah menceritakan: Dahulu aku ikut hadir dalam majelis Sulaiman bin Harb sedangkan Bukhari juga ikut bersama kami. Dia hanya mendengarkan dan tidak mencatat. Ada orang yang bertanya kepada sebagian orang yang hadir ketika itu, “Mengapa dia tidak mencatat?” Maka orang itu pun menjawab, “Dia akan kembali ke Bukhara dan menulisnya berdasarkan hafalannya.” (Hadyu Sari, hal. 641)\n" +
                        "\n" +
                        "Suatu ketika Bukhari rahimahullah datang ke Baghdad. Para ulama hadits yang ada di sana mendengar kedatangannya dan ingin menguji kekuatan hafalannya. Mereka pun mempersiapkan seratus buah hadits yang telah dibolak-balikkan isi hadits dan sanadnya, matan yang satu ditukar dengan matan yang lain, sanad yang satu ditukar dengan sanad yang lain. Kemudian seratus hadits ini dibagi kepada 10 orang yang masing-masing bertugas menanyakan 10 hadits yang berbeda kepada Bukhari. Setiap kali salah seorang di antara mereka menanyakan kepadanya tentang hadits yang mereka bawakan, maka Bukhari menjawab dengan jawaban yang sama, “Aku tidak mengetahuinya.” Setelah sepuluh orang ini selesai, maka gantian Bukhari yang berkata kepada 10 orang tersebut satu persatu, “Adapun hadits yang kamu bawakan bunyinya demikian. Namun hadits yang benar adalah demikian.” Hal itu beliau lakukan kepada sepuluh orang tersebut. Semua sanad dan matan hadits beliau kembalikan kepada tempatnya masing-masing dan beliau mampu mengulangi hadits yang telah dibolak-balikkan itu hanya dengan sekali dengar. Sehingga para ulama pun mengakui kehebatan hafalan Bukhari dan tingginya kedudukan beliau (lihat Hadyu Sari, hal. 652)\n" +
                        "\n" +
                        "Muhammad bin Hamdawaih rahimahullah menceritakan: Aku pernah mendengar Bukhari mengatakan, “Aku hafal seratus ribu hadits sahih.” (Hadyu Sari, hal. 654). Bukhari rahimahullah mengatakan, “Aku menyusun kitab Al-Jami’ (Shahih Bukhari, pent) ini dari enam ratus ribu hadits yang telah aku dapatkan dalam waktu enam belas tahun dan aku akan menjadikannya sebagai hujjah antara diriku dengan Allah.” (Hadyu Sari, hal. 656)\n" +
                        "Al-Hafizh Ibnu Hajar rahimahullah menuturkan bahwa apabila Bukhari membaca Al-Qur’an maka hati, pandangan, dan pendengarannya sibuk menikmati bacaannya, dia memikirkan perumpamaan-perumpamaan yang terdapat di dalamnya, dan mengetahui hukum halal dan haramnya (lihat Hadyu Sari, hal. 650)\n" +
                        "\n" +
                        "Semoga Allah subhanahu wa ta’ala membalas jasa-jasa beliau dengan sebaik-baik balasan dan memasukkannya ke dalam Surga Firdaus yang tinggi. Dan semoga Allah menjadikan kita termasuk orang-orang yang dapat melanjutkan perjuangannya dalam membela Sunnah Rasulullah shallallahu ‘alaihi wa sallam dan menyebarkannya kepada umat manusia.\n" +
                        "Itulah sedikit biografi Imam Bukhari. Semoga pembahasan biografi Imam Bukhari ini bisa bermanfaat untuk kita semua.\n" +
                        "\n");
                context3.startActivity(intent);
            }
            if (dataItem3.get(position).getName3().equals("Imam Muslim")){
                Intent intent = new Intent(context3, DefaultActivity3.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.muslim);
                intent.putExtra("NAMA_DEFAULT","Imam Muslim");
                intent.putExtra("DESKRIPSI_TOKOH"," Imam Muslim dikenal sebagai salah satu tokoh penting dalam peradaban Islam khususnya dalam bidang kajian Ilmu Agama. Untuk mengenal sosok Imam Muslim lebih dalam, mari kita simak pemaparannya dalam artikel yang mengulas tentang biografi singkat Imam Muslim lengkap dengan contoh hadits yang diriwayatkannya dalam artikel berikut ini." +
                        "\n" +
                        "Dalam Islam, kita mengenal sederet tokoh penting yang memiliki peran besar terhadap kemajuan peradaban Islam dan juga ilmu pengetahuan tentang Islam. Salah satu tokoh yang cukup terkenal di kalangan umat Islam adalah Imam Muslim. Beliau merupakan sosok perawi hadis yang telah belajar langsung dari Imam Bukhari yang dikenal dengan kesahihan hadits yang diriwayatkannya.\n" +
                        "Imam Muslim yang dilahirkan pada tahun 204 Hijriyah ini dikenal memiliki rasa ingin tahu dan juga keinginan belajar yang sangat tinggi. Beliau bahkan telah belajar hadits sejak kecil dari Imam Bukhari, guru dari Imam Bukhari dan juga sederet ulama-ulama pada saat itu." +
                        "\n" +
                        "Hal tersebut juga dipaparkan secara rinci dalam buku berjudul Studi Kitab Hadis: Dari Muwaththa' Imam Malik hingga Mustadrak Al Hakim yang dituliskan oleh Muhammad Misbah, dkk. (2020: 55) yang menyebutkan bahwa Imam Muslim memulai belajar hadits sejak usia 12 tahun." +
                        "\n" +
                        "Dalam buku ini juga dijelaskan bahwa sejak pertama kali Imam Muslim belajar hadits beliau sangat serius dalam mempelajari dan mencari hadits, ia mulai tekun mempelajari matan hadist dan melacak sanadnya dengan berguru kepada ulama-ulama ahli hadits di berbagai daerah, di antaranya daerah Hijaz, Irak, Syam, Mesir dan lain-lain.\n" +
                        "Selama hidupnya, Imam Muslim telah berhasil menghimpun hadis-hadis yang diterimanya dalam kitab Shahih Muslim. Berikut ini adalah dua contoh hadits yang diriwayatkan oleh Imam Muslim:" +
                        "Artinya: Dari Abu Hurairah r.a meriwayatkan bahwa Rasulullah SAW. bersabda. “Apabila anak cucu Adam telah meninggal dunia maka terputuslah (pahala) amalnya. Kecuali tiga perkara, yaitu sedekah jariyah, ilmu yang bermanfaat, dan anak shaleh yang mendoakannya.” (H.R. Muslim)" +
                        "\n" +
                        "Artinya: “Sesungguhnya setiap amalan tergantung pada niatnya. Setiap orang akan mendapatkan apa yang ia niatkan. Siapa yang hijrahnya karena Allah dan Rasul-Nya, maka hijrahnya untuk Allah dan Rasul-Nya. Siapa yang hijrahnya karena mencari dunia atau karena wanita yang dinikahinya, maka hijrahnya kepada yang ia tuju.” (HR. Bukhari dan Muslim) [HR. Bukhari, no. 1 dan Muslim, no. 1907]" +
                        "\n");
                context3.startActivity(intent);
            }
            if (dataItem3.get(position).getName3().equals("Abu Hurairah")){
                Intent intent = new Intent(context3, DefaultActivity3.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.hurairah);
                intent.putExtra("NAMA_DEFAULT","Abu Hurairah");
                intent.putExtra("DESKRIPSI_TOKOH"," Abu Hurairah dilahirkan tahun 19 sebelum Hijriyah. Nama Beliau sebelum memeluk Islam tidaklah diketahui dengan jelas, tetapi pendapat yang masyhur adalah Abdusy Syam. Sedangkan nama Islam nya yaitu Abdur-Rahman. Beliau berasal dari qabilah Al-dusi di Yaman. Beliau memeluk Islam pada tahun ke 7 Hijriyah ketika Rasulullah Berangkat menuju Khaibar. Ketika itu, ibunya belum menerima Islam bahkan menghina Rasulullah. Abu Hurairamenemui Rasulullah, meminta beliau berdo’a agar ibunya masuk Islam. Kemudian Abu Hurairah kembali menemui ibunya lalu mengajaknya masuk Islam. Ternyata ibunya telah berubah pikiran dan bersedia masuk Islam.\n" +
                        "\n" +
                        "Setelah pulang dari Perang Khaibar, Rasulullah ingin memperluas masjid Nabawi ke arah barat dengan menambah ruang sebanyak tiga tiang lagi. Ketika Rasulullah mengangkat batu untuk pondasi tiang, Abu hurairah langsung meminta agar beliau menyerahkan batu tersebut tetapi Rasulullah menolak dan berkata “Tiada kehidupan sebenarnya melainkan kehidupan akhirat”.\n" +
                        "\n" +
                        "Abu Hurairah sangat mencintai Rasulullah sehingga siapun yang Rasullah cintai, maka iapun ikut mencintainya. Misalnya, Abu Huraira suka menciumi Hasan dan Husein karena beliau melihat Rasulullah suka menciumi kedua cucunya. Beliau diberi gelar dengan nama “Abu Hurairah“ karena kegemarannya bermain dengan anak kucing. Diceritakan pada suatu hari ketika Abu Hurairah bertemu Rasulullah, beliau bertanya pada Abu Hurairah tentang apa yang ada di dalam lengan bajunya, lalu Abu Hurairah memperlihatkan bahwa di dalam lengan bajunya ada seekor anak kucing. Setelah itu beliau diberi gelar oleh Rasulullah` dengan nama “Abu Hurairah” dan semenjak itu beliau lebih suka di panggil nama gelar tersebut.\n" +
                        "\n" +
                        "Abu Hurairaha pindah ke Madinah untuk bekerja. Disana, beliau bekerja sebagai pekerja kasar atau kita lebih sering sebut dengan buruh. Beliau sering mengikatkan batu di perutnya untuk menahan rasa lapar, Diceritakan bahwa beliau berbaring menghampar di mimbar masjid sehingga orang-orang menyangka beliau sudah tidak waras lagi. Ketika Rasulullah` mendengar kabar tersebut, beliau langsung menemui Abu Hurairah dan menjelaskan kepada orang-orang bahwa Abu Hurairah berbuat seperti itu karena lapar. Lalu Rasulullah memberinya makanan.\n" +
                        "\n" +
                        "Abu Hurairaha adalah sahabat yang sangat dekat dengan Rasulullah. Beliau dikenal sebagai salah satu ahli shuffah, yaitu orang- orang miskin atau sedang menuntut ilmu yang tinggal di halaman masjid. Pada suatu hari beliau duduk di pinggir jalan dimana orang-orang berlalu-lalang. Waktu itu beliau melihat Abu Bakara berjalan, lalu beliau meminta agar dibacakan satu ayat Al-Qur’an. “Saya bertanya begitu supaya beliau mengajakku ikut dengannya dan memberiku pekerjaan”, kata Abu Hurairah. Akan tetapi Abu Bakara hanya membacakan ayat Al-Qur’an lalu kemudian pergi. Lalu melihat beliau melihat Umar ibn Khattaba dan berkata “ tolong ajari saya ayat Al-Qur’an”. Abu Hurairah kecewa lagi karena Umar melakukan hal yang sama dengan yang dilakukan oleh Abu Bakar. Tak lama kemudian datanglah Rasulullah. Nabi tersenyum, Abu Hurairaha berkata dalam hatinya, “beliau tahu apa isi hati saya dengan tepat, beliau bisa membaca raut muka saya dengan tepat,” Nabi memanggil “ya aba Hurairah!” Abu Hurairah menjawab “Labbaik, ya Rasulullah!”. Lalu Rasulullah berkata, “ikutilah aku!” beliau mengajak ke rumahnya. Didalam rumah didapati ada semangkuk susu “darimana datangnya susu ini?” tanya Rasulullah. Beliau telah bahwa seseorang telah memberikan susu itu. Rasullah memanggil, “ya Aba Hurairah!”Abu Hurairah pun menjawab “Labbaik, ya Rasulullah!””tolong panggilkan ahli suffah,” kata Rasulullah. Susu tadi dibagikan kepada ahli suffah, termasuk Abu Hurairah. Sejak itulah, Abu Hurairah mengabdi kepada Rasulullah, bergabung dengan ahli suffah di masjid.\n" +
                        "\n" +
                        "Abu Hurairah meriwayatkan banyak Hadits disebabkan karena beliau mendampingi Rasulullah selama tiga tahun, sejak Abu Hurairah memeluk Islam. Abu Hurairah berkata, “…….sesungguhnya saudara kami dari golongan muhajirin sibuk dengan urusan mereka dipasar dan orang-orang Anshar sibuk bekerja diladang mereka, sementara aku seorang yang miskin senantiasa bersama Rasulullah di mil’i batni. Aku hadir di majelis yang mereka tidak hadir dan aku hafal pada saat mereka lupa” (Hadits Riwayat Bukhari). Pada mulanya Abu Hurairah mempunyai ingatan yang lemah, lalu beliau mengadu kepada Rasulullah.  Rasulullah` lalu mendo’akan Abu Hurairah agar di beri dengan daya ingat yang kuat. Semenjak itu, Abu Hurairah memiliki daya ingat yang kuat sehingga Abu Hurairah mampu meriwayatkan banyak Hadits bahkan yang terbanyak di kalangan para sahabat.\n" +
                        "\n" +
                        "Kisah Abu Hurairah menjaga Gudang Zakat\n" +
                        "\n" +
                        "Abu Hurairah  pernah diberi tugas oleh Rasulullah untuk menjaga gudang hasil zakat. Pada suatu malam, Abu Hurairah melihat orang mengendap-ngendap akan mencuri, lalu ditangkapnya. Orang itupun akan dibawanya kepada Rasulullah, tetapi pencuri itu merayu minta dikasihani seraya menyatakan bahwa dia mencuri untuk memberi makan keluarganya yang kelaparan. Abu Hurairah merasa kasihan lalu melepas pencuri itu dengan syarat orang itu tidak mengulangi perbuatannya lagi. Keesokan harinya, peristiwa tersebut dilaporkan kepada Rasulullah` dan beliaupun tersenyum lalu menyatakan bahwa pencuri itu pasti akan kembali. Ternyata keesokan malamnya pencuri itu datang lagi. Sekali lagi Abu Hurairah menangkap pencuri itu lalu ingin diserahkannya kepada Rasullah`. Sekali lagi, pencuri tersebut merayu sehingga Abu Hurairah merasa kasihan lalu melepaskannya sekali lagi. Kesokan harinya beliau melaporkan kejadian tersebut kepada Rasulullah` dan Rasulullah` pun mengulagi sabda nya bahwa pencuri itu pasti kembali. Apabila pencuri itu ditangkap sekali lagi, Abu Hurairah mengancam akan membawanya kepada Rasulullah. Keesokan malamnya pencuri tersebut tertangkap lagi dan merayu agar dibebaskan sekali lagi. Ketika Abu Hurairah tidak mau membebaskan, pencuri tersebut menyatakan bahwa jika seseorang membaca ayat kursi sebelum tidur, syaitan tidak mengganggunya. Abu Hurairaha merasa tersentuh mendengar perkataan pencuri itu lalu melepaskannya. Keesokan harinya, beliau menceritakan peristiwa tersebut kepada Rasulullah` dan beliau bersabda “pencuri yang ditemuinya itu adalah pembohong besar, tetapi apa yang diajarkannya kepada Abu Hurairah itu adalah suatu perkara yang benar. Sebenarnya pencuri tersebut adalah Syaitan yang dilaknat.”\n" +
                        "\n" +
                        "Sikap Abu Hurairah terhadap fitnah yang terjadi pada masanya.\n" +
                        "\n" +
                        "Walaupun Abu Hurairah merupakan orang yang miskin, namun pada suatu hari beliau dipinang oleh salah seorang majikannya yang kaya untuk dinikahkan dengan putrinya, Bisrah binti Gazwan. Ini menunjukkan bahwa Islam tidak memandang status sosial seseorang tapi yang dipandang adalah ketaqwaannya. Abu Hurairah dipandang mulia karena ke’aliman dan kesalihannya. Sejak menikah, Abu Hurairah membagi malamnya kedalam tiga bagian yaitu membaca Al-qur’an, istirahat dan keluarga, dan untuk mengulang-ngulang hadits. Beliau dan keluarganya tetap hidup sederhana walaupun telah menjadi orang kaya. Abu Hurairah suka bersedekah, menjamu tamu, bahkan memberikan rumahnya di Madinah untuk pembantu-pembantunya.\n" +
                        "\n" +
                        "Rasulullah pernah mengutus Abu Hurairah berdakwah ke Bahrain bersama Al-‘Ala ibnu Abdillah Alhadrami. Beliau juga pernah diutus bersama Quddamah untuk mengambil jizyah di Bahrain dengan membawa surat kepada Amir Al-munzir ibnu Sawa At-Tamimi. Kemudian Abu Hurairaha diangkat sebagai gubernur Bahrain ketika Umara menjadi Amirul Mu’minin. Tetapi pada 23 Hijriyah, Umara memberhentikannya karena Abu Hurairah di tuduh menyimpan uang sebanyak 10.000 dinar. Ketika diperiksa Abu Hurairah banyak memberikan bukti bahwa harta itu diperolehnya dari beternak kuda dan pemberian orang. Khalifah Umara menerima penjelasan itu dan memaafkannya. Lalu Abu Huraiarah diminta menerima jabatan gubernur kembali, tetapi beliau menolak. Khalifah Umar ibnu Khattaba penah melarang Abu Hurairah menyampaikan Hadits dan hanya boleh menyampaikan ayat Al-Qur’an. Ini disebabkan tersebar kabar Abu Hurairah banyak meriwayatkan Hadits palsu. Larangan khalifah kemudian dibatalkan setelah Abu Hurairah menjelaskan Hadits mengenai bahayanya Hadits palsu. “Barang siapa yang berdusta atas padaku (Nabi Muhammad`) secara sengaja, hendaklah mempersiapkan tempat duduknya dalam api neraka.”(Hadits Riwayat Bukhari, Muslim, Abu Dawud, At-Tirmidzi, Ibnu Majah, Ad-Darimi, dan Ahmad).\n" +
                        "\n" +
                        "Pada masa Amirul Mu’minin Ali bin Abi Thaliba, Abu Hurairah menolak tawaran menjadi gubernur Madinah. Ketika Mu’awiyah berkuasa, Abu Hurairah diangkat menjadi gubernur Madinah dengan asran dari Marwan ibn Hakam. Di kota yang penuh dengan cahaya (Al-Madinah A-Munawwarah) ini pula beliau menghembuskan nafas terakhirnya pada tahun 57 atau 58 Hijriyah(676-678 Masehi) dengan usia 78 tahun. Abu Hurairah meninggalkan Hadits sebanyak 5.374 Hadits. Hadits Abu Hurairah yang di sepakati oleh Imam Bukhari dan Muslim berjumlah 325 Hadits. Oleh Bukhari sendiri sebanyak 93 hadits dan oleh Muslim sendiri sebanyak 189 hadits. Hadits yang diriwayatkan oleh Abu Hurairah juga banyak terdapat dalam kitab-kitab hadits lainnya." +
                        "\n");
                context3.startActivity(intent);
            }
            if (dataItem3.get(position).getName3().equals("Abu Dawud")){
                Intent intent = new Intent(context3, DefaultActivity3.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.dawud);
                intent.putExtra("NAMA_DEFAULT","Abu Dawud");
                intent.putExtra("DESKRIPSI_TOKOH"," Imam Abu Dawud sangat baik untuk diketahui kaum Muslimin. Beliau merupakan ulama ahli hadis yang tidak perlu diragukan lagi keilmuannya. Imam Abu Dawud termasuk ulama hadits yang sangat sederhana. Seperti dalam berpakaian, sebelah lengan baju Imam Abu Dawud lebih lebar dibanding satunya yang sempit. Menurut dia, lengan baju yang lebar untuk membawa kitab, sedangkan lengan yang sempit tidak perlu diperpanjang karena hanya memboroskan kain.\n" +
                        "\n" +
                        "Dikutip dari laman Suara Muhammadiyah, Kamis (27/1/2022), Ustadz Syaifullah yang juga mahasiswa pascasarjana UIN Sunan Kalijaga Yogyakarta mengisahkan bahwa Imam Abu Dawud dilahirkan di daerah Sijistani, termasuk wilayah Kota Basrah. Beliau memiliki nama lengkap Abu Dawud Sulaiman bin al-Asy’as bin Ishaq bin Basyir bin Syidad bin Imran al-Azdi al-Sijistani" +
                        "\n" +
                        "Dia berkembang dalam keluarga taat beragama. Sebagaimana tradisi ulama Islam lainnya, Imam Abu Dawud sejak dini telah belajar keilmuan Islam. Ia belajar Alquran, hadis, dan ilmu bahasa Arab.\n" +
                        "\n" +
                        "Pengetahuan dan penguasaannya tentang ilmu hadis dilatarbelakangi lingkungan keluarganya. Bapaknya Al-Asy’as adalah perawi hadis. Saudaranya Muhammad bin Al Asy’as merupakan seorang yang menekuni ilmu hadits. Dialah yang selalu menemani Abu Dawud dalam perjalanan mencari dan belajar ilmu hadis. Lingkungan inilah yang mendukung Imam Abu Dawud memperoleh ilmu hadis secara mendalam.\n" +
                        "\n" +
                        "Ketika masa muda, Imam Abu Dawud melakukan al-rihlah li thalabi al-hadits (perjalanan untuk belajar dan mencari hadis). Dia melakukan perjalanan ke berbagai daerah. Ia ke Khurasan, Baghdad, Hijaz, Mesir, Irak, Naisabur, dan tempat-tempat lain.\n" +
                        "\n" +
                        "Imam Abu Dawud menjadi ulama hadis tidak lepas dari manfaat dari rihlah yang dilakukan. Banyak ulama hadis yang ditemui. Ia berguru kepada mereka. Salah satu gurunya adalah Imam Ahmad bin Hanbal. Selain banyak berguru, Imam Abu Dawud juga mengajarkan dan meriwayatkan hadis kepada para muridnya seperti An-Nasa’i dan At-Tirmizi.\n" +
                        "\n" +
                        "Berkat ketenarannya sebagai ahli hadis, Amir di Baghdad yakni Abu Ahmad al-Muwaffaq memintanya tinggal di sana. Imam Abu dawud diminta mendirikan majelis ilmu guna mengundang orang-orang belajar hadis.\n" +
                        "\n" +
                        "Permintaan ini dianggap penting karena saat itu Kota Basrah dan Baghdad dilanda tragedi peperangan. Kehadiran majelis ilmu diharapkan menjadikan dua kota tersebut makmur serta ramai kembali dalam dunia keilmuan." +
                        "\n" +
                        "mam Abu Dawud pun menerimanya, sembari tetap melakukan pencarian hadis. Ia pun menetap di Kota Basrah hingga wafatnya pada 16 Syawal 275 Hijriah dalam usia 73 tahun.\n" +
                        "\n" +
                        "Selain kitab Sunan Abu Dawud, Imam Abu Dawud melahirkan beberapa karya lain. Di antaranya adalah Al-Marasil, Masail al-Imam Ahmad, Al-Nasikh wa al-Mansukh, Risalah fi Wasf Kitab Sunan, Al-Zuhud, Ijabat al-Salawat al-‘Ajjurri, Musnad Malik, Qaul Qadr, Al-Du’a, A’lam an-Nubuwwat, dan lain-lain." +
                        "\n" +
                        "Pengaruh dan perkembangan ilmu fikih pada saat Imam Abu Dawud hidup sangat kuat. Pada masa itu, beberapa ulama menulis kitab hadis mengikuti perkembangan itu. Penulisan kitab hadis menyesuaikan urutannya dengan urutan ilmu fikih. Sehingga, model ini pun dikenal dengan istilah kitab sunan.\n" +
                        "Demikian halnya dengan kitab Sunan Abu Dawud. Selain Imam Abu Dawud, beberapa ulama yang menulis kitab hadis dengan sistematika kitab fikih seperti Ibnu Majah, An-Nasa’i, dan At-Tirmizi. Kitab hadis yang disusun dengan metode sunan berbeda dengan kitab yang disusun dengan model jami’, yakni kitab hadis yang disusun dengan bab-bab tertentu dan tema yang bermacam-macam. Contoh kitab hadits model ini adalah Shahih Bukhari dan Shahih Muslim." +
                        "\n" +
                        "Selain itu, ada lagi model yang disebut dengan musnad, yakni kitab hadis yang disusun berdasarkan urutan huruf hijaiyah dengan mengacu kepada nama sahabat. Contoh kitab hadits model ini adalah Musnad Ahmad.\n" +
                        "\n" +
                        "Sunan Abu Dawud sendiri terdiri dari 4.800 hadis. Akan tetapi, beberapa ulama mengatakan ada 5.274 hadis. Pendapat ini karena didasarkan pada seringnya Imam Abu Dawud mengutip hadis di tempat berbeda untuk menguatkan atau menjelaskan dari sebuah hadits.\n" +
                        "\n" +
                        "Sunan Abu Dawud hanya memuat hadits marfu’ (hadis atau riwayat dari Nabi). Tidak ada riwayat mauquf (riwayat dari perkataan maupun perbuatan sahabat) atau riwayat maqtu’ (riwayat dari perkataan maupun perbuatan tabi’in). Menurut Imam Abu Dawud, hadis dapat dinamakan sunah hanya karena riwayatnya dari Nabi Muhammad Shallallahu alaihi wassallam.\n" +
                        "\n" +
                        "Dalam Sunan Abu Dawud ini tidak hanya berisi hadis yang berderajat shahih, tetapi juga memiliki kualitas lemah atau dha’if. Ada beberapa istilah dalam Sunan Abu Dawud untuk menilai sebuah hadis. Ada yang disebut dengan shahih, yakni hadis yang memenuhi syarat-syarat sebuah hadis (ketersambungan sanad, keadilan rawi, kedhabitan rawi, tidak ada cacat, maupun janggal)." +
                        "\n" +
                        "Selain shahih, ada ma yusybihu (menyerupai sahih). Hal ini mempunyai arti bahwa kualitas hadis itu di bawah sahih, tetapi ada riwayat atau pendapat yang menguatkannya. Istilah ini kemudian dikenal dengan shahih li ghairihi.\n" +
                        "\n" +
                        "Kriteria lainnya adalah yuqaribuhu (mendekati hadis sahih). Di kemudian hari, para ulama menyebut hadis ini dengan istilah hadis hasan. Istilah lain lagi adalah wahn syadid, yakni bahwa hadis dimaksud mempunyai kualitas sangat lemah." +
                        "\n" +
                        "Terakhir, istilah kualitas hadits dalam Sunan Abu Dawud adalah shalih. Istilah terakhir ini menjadi perdebatan para ulama setelah Imam Abu Dawud. Perdebatan muncul karena Imam Abu Dawud menempatkan istilah hadis shalih ini pada hadis sahih, hasan, maupun dhaif. Sehingga, istilah tersebut dianggap tidak jelas kepada hadis mana derajat shalih ini dialamatkan.\n" +
                        "\n" +
                        "Banyaknya istilah derajat hadis dalam Sunan Abu Dawud lebih disebabkan saat itu belum ada kesepakatan di antara ulama dalam menilai kualitas sebuah hadis. Kualitas hadis pada zaman Imam Abu Dawud hanya dibagi menjadi dua: sahih dan dhaif." +
                        "\n" +
                        "Baru setelah era Imam Abu Dawud, terutama Imam At-Tirmizi, membagi hadis menjadi beberapa istilah yang jelas seperti shahih li zatihi, shahih lighairihi, shahih gharib hasan lizatihi, hasan lighairihi, hasan gharib, dan lain-lain.\n\n");
                context3.startActivity(intent);
            }
            if (dataItem3.get(position).getName3().equals("Imam At-Tirmidzi")){
                Intent intent = new Intent(context3, DefaultActivity3.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.semua);
                intent.putExtra("NAMA_DEFAULT","Imam At-Tirmidzi");
                intent.putExtra("DESKRIPSI_TOKOH"," Imam At-Tirmidzi merupakan sosok orang pertama yang mengelompokan hadis kedalam kategori hasan. Beliau adalah salah satu ulama hadis yang terkenal. Imam At-Tirmidzi tinggal disebuah kota kecil dan nama lengkap beliau adalah Muhammad bin Isa bin Saurah bin Adh-Dhahak As-Salami Al-Bughi atau biasa dipanggil dengan sebutan Abu Isa.\n" +
                        "\n" +
                        "Imam At-Tirmidzi  dilahirkan pada bulan zulhijah tahun 2019 hijriah, diceritakan bahwa beliau dilahirkan dalam keadaan buta. Sedari kecil beliau memang sangat senang mempelajari berbagai ilmu keislaman, termasuk ilmu hadis. Kegemarannya terhadap ilmu hadis muncul setelah beliau membaca karangan imam syafi’i yang disitu menjelaskan cara mengambil dalil dari sebuah hadis.\n" +
                        "\n" +
                        "Hadis dari imam at-tirmidzi  kini sudah tidak asing lagi untuk diterapkan dikalangan anak usia dini, Beberapa kumpulan hadis pendek yang diriwayatkan oleh imam at-tirmidzi yang dapat orangtua atau guru ajarkan kepada anak usia dini diantaranya yaitu : Pertama, hadis senyum, “tabassumuka fii wajhii akhiika shadaqatu”, yang artinya senyum dihadapan saudaramu adalah shadaqoh (HR. Tirmidzi). Kedua, hadis keutamaan doa, “ Addu ‘au huwal ibaadah” yang artinya doa itu adalah ibadah (HR. Tirmidzi).\n" +
                        "\n" +
                        "Didalam mengenalkan hadis kepada anak usia dini Orangtua mempunyai peran yang tidak pernah lepas untuk membimbing anak-anaknya. Tugas orangtua tidak hanya merawat dan mengasuh, akan tetapi harus membimbing agar anak-anaknya selalu terkontrol dan tumbuh dengan baik. Tumbuh kembang anak sangat dipengaruhi oleh lingkungan keluarga terutama orangtua.\n" +
                        "\n" +
                        "Anak adalah investasi pahala untuk kedua orangtuanya dimasa yang akan mendatang. Oleh sebab itu, doa anak adalah salah satu amal yang tidak akan pernah terputus pahalanya. Diriwayatkan dalam sebuah hadis  yang berbunyi “ ketika seseorang telah meninggal, maka terputuslah amalannya kecuali 3 perkara diantaranya yaitu : sedekah jariyah, ilmu yang manfaat, dan doa anak yang sholeh.”\n" +
                        "\n" +
                        "Rosulullah Muhammad saw dalam sebuah riwayat berkata “ sesungguhnya, semua anak yang lahir kedunia itu dalam keaadaan suci dan karena didikan dari orangtuanya anak tersebut akan tumbuh menjadi orang yang beragama.” Dalam hal tersebut dapat dipertegas bahwasanya semua anak yang lahir didunia ini layaknya kertas putih yang masih polos dan bersih. Anak yang baru lahir tidak mempunyai dosa.\n" +
                        "\n" +
                        "Sebagai orangtua atau guru ketika mengenalkan hadis tirmidzi kepada anak-anak sebaiknya dimulai dari yang pendek dan mudah untuk dihafal. Dalam hal tersebut guru dan orangtua mempunyai peran yang sangat penting dalam mengajarkan hadis karena dengan belajar menghafal sejak dini dapat mengembangkan kecerdasan spiritual pada anak.\n" +
                        "\n" +
                        "Peran orangtua dan guru sangat dibutuhkan dalam mendampingi anak ketika menghafal hadis tirmidzi, ketika mengajarkan hadis kepada anak usia dini hendaknya menggunakan gerakan atau lagu. Dengan hal tersebut tentunya anak-anak akan mudah untuk mengingatnya. Pada saat kegiatan menghafal bisa juga dilakukan dengan metode yang menarik atau bisa juga dilagukan agar menjadi pusat perhatian untuk anak-anak.\n" +
                        "\n" +
                        "Orangtua dan guru harus mampu mengoptimalkan seluruh potensi yang dimiliki oleh anak. Potensi-potensi tersebut dapat berkembang ketika semua kegiatan yang anak lakukan mendapat arahan dan bimbingan dari orangtua atau gurunya. Mengajarkan dan mengenalkan anak terhadap hadis dapat dilakukan dengan berbagai macam cara, misalnya seperti :\n" +
                        "\n" +
                        "Pertama, memberikan keteladanan. Anak usia dini memiliki sifat suka meniru gaya orang dewasa, dengan sifat meniru dapat orangtua atau guru optimalkan dengan cara memberikan keteladanan kepada anak. Anak biasanya suka meniru apa yang sering dia dengar dan dia lihat, oleh sebab itu, orangtua atau guru mulai mengajarkannya kepada anak secara rutin. Dengan cara memberikan keteladanan ini, anak akan  mengikuti apa yang orangtua atau guru ucapkan atau lakukan setiap harinya.\n" +
                        "\n" +
                        "Kedua, Nasihat. Nasihat tersebut bisa diterapkan pada anak sesuai dengan karateristiknya, untuk anak usia dini nasihat sebaiknya dilakukan dengan cara bercerita-cerita atau melalui dongeng ketika mau tidur, ataupun diberikan nasihat secara langsung asalkan jangan memarahinya, karena ketika memberikan nasihat kepada anak dengan marah-marah malah akan membuat anak semakin takut bahkan trauma.\n" +
                        "\n" +
                        "Ketiga, memberikan perhatian. Sebagai orangtua dan guru Memberikan perhatian atau pemantauan bagi anak merupakan hal yang sangat penting. Memberikan perhatian kepada anak juga bisa berupa kata-kata pujian atau memberikannya hadiah agar anak merasa dihargai dan lebih semangat lagi untuk terus belajar menghafal hadis.\n\n");
                context3.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataItem3.size();
    }

    void setFilter3(ArrayList<ItemModel3> filterModel3){
        dataItem3 = new ArrayList<>();
        dataItem3.addAll(filterModel3);
        notifyDataSetChanged();
    }
}
