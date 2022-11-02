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

public class AdapterRecyclerView4 extends RecyclerView.Adapter<AdapterRecyclerView4.ViewHolder4> {

    private ArrayList<ItemModel4> dataItem4;
    private Context context4;

    public static class ViewHolder4 extends RecyclerView.ViewHolder{
        public TextView textHead4;
        public TextView textSubHead4;
        LinearLayoutCompat parentLayout4;

        public ViewHolder4(@NonNull View itemView4){
            super(itemView4);

            textHead4 = itemView4.findViewById(R.id.text_title4);
            textSubHead4 = itemView4.findViewById(R.id.text_subtitle4);
            parentLayout4 = itemView4.findViewById(R.id.parentLayout4);
        }
    }

    AdapterRecyclerView4(Context context4,ArrayList<ItemModel4> dataItem4){
        this.context4 = context4;
        this.dataItem4 = dataItem4;
    }

    @NonNull
    @Override
    public AdapterRecyclerView4.ViewHolder4 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view4 = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item4,parent, false);

        return new ViewHolder4(view4);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView4.ViewHolder4 holder, int position) {

        TextView textHead4 = holder.textHead4;
        TextView textSubHead4 = holder.textSubHead4;

        textHead4.setText(dataItem4.get(position).getName4());
        textSubHead4.setText(dataItem4.get(position).getType4());

        holder.parentLayout4.setOnClickListener(v -> {
            Toast.makeText(context4, "Beliau Adalah "+dataItem4.get(position).getName4(), Toast.LENGTH_SHORT).show();
            if (dataItem4.get(position).getName4().equals("Sayyidina Abu Bakar")){
                Intent intent = new Intent(context4, DefaultActivity4.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.bakar);
                intent.putExtra("NAMA_DEFAULT","Sayyidina Abu Bakar");
                intent.putExtra("DESKRIPSI_TOKOH"," Salah satu sahabat Nabi Muhammad SAW yang paling banyak disebut adalah Abu Bakar Ash Shiddiq. Da begitu menonjol karena memiliki persahabatan dengan nabi, serta kemampuan, dan kepribadiannya.\n" +
                        "\n" +
                        "Menjadi khalifah atau pemimpin pertama setelah Rasulullah SAW, Repository UIN Antasari mencatat, Abu Bakar memimpin dengan menerapkan kedisiplinan, kepercayaan dan ketaatan yang tinggi dari rakyat terhadap integritas kepribadian dan kepemimpinannya.\n" +
                        "\n" +
                        "Menurut pendapat yang shahih, nama asli Abu Bakar Ash Shiddiq adalah Abdullah bin ‘Utsman bin ‘Amir bin ‘Amr bin Ka’ab bin Sa’ad bin Taiym bin Murrah bin Ka’ab bin Lu’ay Al Qurasyi At Taimi.\n" +
                        "\n" +
                        "Dirinya kemudian dijuluki dengan ‘Atiq (عتيق) dan Ash Shiddiq (الصدِّيق). Sebagian ulama berpendapat bahwa alasan julukan ‘Atiq karena dia tampan. Sebagian mengatakan karena dirinya berwajah cerah.\n" +
                        "\n" +
                        "Abu Bakar Ash Shiddiq lahir pada 573 M dan meninggal dunia 23 Agustus 634 M. Dia merupakan sahabat dan penasihat terdekat Nabi Muhammad SAW.\n" +
                        "\n" +
                        "Saat Rasulullah SAW meninggal dunia, dirinya hadir menggantikan fungsi politik dan administratif dari beliu, dan memulai jabatan menjadi seorang khalifah atau pemimpin.\n" +
                        "\n" +
                        "Berasal dari klan kecil suku pedagang Quraisy yang berkuasa di Mekah, Abu Bakar Ash Shiddiq merupakan laki-laki pertama yang masuk Islam.\n" +
                        "\n" +
                        "Banyak sekali hal yang menunjukkan kedekatannya dengan Nabi Muhammad SAW. Misalnya saat dirinya menikahkan anaknya, Aisyah dengan Nabi Muhammad SAW.\n" +
                        "\n" +
                        "Kemudian saat Nabi Muhammad SAW memilih Abu Bakar Ash Shiddiq sebagai pendampingnya dalam perjalanan ke Madinah saat Hijrah.\n" +
                        "\n" +
                        "Di Madinah, dia adalah kepala penasihat Nabi Muhammad SAW. Selain itu, dia juga melakukan ziarah ke Mekah, hingga menjadi pengganti Rasulullah SAW menjadi imam selama Nabi Muhammad SAW sakit.\n" +
                        "\n" +
                        "Saat Rasulullah SAW wafat, umat Islam Madinah menyelesaikan krisis kepemimpinan dengan menerima Abu Bakar Ash Shiddiq sebagai khalifah atau pemimpn pertama umat Islam.\n" +
                        "\n" +
                        "Sebagai Khalifah, Abu Bakar memiliki fungsi ganda, yaitu sebagai pemimpin agama sekaligus merangkap kepala negara.\n" +
                        "\n" +
                        "Selama pemerintahannya, dia menekan pemberontakan politik dan agama suku yang disebut Riddah atau ‘pemberontakan politik’ atau ‘kemurtadan’, sehingga membawa Arab tengah di bawah kendali Muslim.\n" +
                        "\n" +
                        "Di bawah pemerintahannya, penaklukan Muslim atas Irak dan Suriah dimulai. Selain itu, kompilasi tertulis pertama dari Alquran dikatakan telah terjadi selama kekhalifahan Abu Bakar.\n" +
                        "\n" +
                        "Ini karena adanya kematian dari beberapa hafidz Alquran dalam Pertempuran Yamama, yang meningkatkan kemungkinan bagian dari teks Alquran bisa saja hilang.\n" +
                        "\n" +
                        "Oleh karena itu, Umar Bin Khatab mendesak Abu Bakar Ash Shiddiq agar Alquran segera ditulis gar tidak Alquran tetap utuh meski para hafidz telah berjihad di medan perang.\n" +
                        "\n" +
                        "Selama sakit, Abu Bakar Ash Shiddiq dirawat oleh Ishah. Sesuai permintaannya, dia dimakamkan dekat dengan tempat Nabi Muhammad.\n\n");
                context4.startActivity(intent);
            }
            if (dataItem4.get(position).getName4().equals("Sayyidina Umar bin Khatab")){
                Intent intent = new Intent(context4, DefaultActivity4.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.umar);
                intent.putExtra("NAMA_DEFAULT","Sayyidina Umar bin Khatab");
                intent.putExtra("DESKRIPSI_TOKOH","Umar bin Khattab termasuk salah satu sahabat Nabi Muhammad SAW yang juga menjadi khalifah. Ada banyak teladan dan hikmah yang bisa diambil dari sosok Umar bin Khattab.\n" +
                        "\n" +
                        "Mulai dari perjalanannya memeluk agama Islam yang pernah menentang Nabi Muhammad SAW hingga akhirnya menjadi khalifah untuk menggantikan Abu Bakar ash-Shiddiq RA.\n" +
                        "\n" +
                        "Berikut kisah Umar bin Khattab yang bisa Moms dan Dads pelajari, lalu ceritakanlah pada Si Kecil sebagai pengetahuan agama Islam.\n" +
                        "\n" +
                        "Umar bin Khattab mempunyai nama lengkap Umar bin Khattab Ibn Nufail Ibn Abd al-'Uzza Ibn Riyah Ibn Qurth Ibn Razah Ibn 'Adiy Ibn Lu'aiy al-Qurasyiy al-'adawiy.\n" +
                        "\n" +
                        "Usia Umar RA lebih muda tiga belas tahun dari Nabi Muhammad Shalaullah Alaihi Wa sallam karena Umar lahir tiga belas tahun setelah tahun Gajah (tahun Kelahiran Nabi Muhammad).\n" +
                        "\n" +
                        "Sebelum masuk Islam, Umar bin Khattab dikenal sebagai salah satu tokoh yang paling menentang seruan Nabi Muhammad SAW.\n" +
                        "\n" +
                        "Pada masa jahiliyyah, Umar RA juga dikenal memiliki sifat yang kejam, bengis, dan suka minum minuman keras. Selain itu, Umar bin Khattab menikahi banyak wanita, dan memiliki anak yang banyak.\n" +
                        "\n" +
                        "Akan tetapi, sebagian besar istrinya tersebut meninggal dunia. Di antara anak-anaknya yang menonjol adalah Abdullah bin Umar dan Ummul Mukminin Hafshah.\n" +
                        "\n" +
                        "Anak-anaknya yang lain adalah Fathimah, ‘Ashim, Abdurrahman al-Akbar, Abdurrahman al-Ausath, dan Abdurrahman al-Ashghar.\n" +
                        "\n" +
                        "Setelah menjadi khalifah, Umar bin Khattab juga menikah dengan Ummu Kultsum putri Ali bin Abi Thalib, dan Fatimah az-Zahra saudara Hasan dan Husain, cucu Nabi Muhammad SAW.\n" +
                        "\n" +
                        "Meski demikian, Umar RA memiliki kecerdasan yang luar biasa, bahkan dikatakan mampu memprakirakan hal-hal yang akan terjadi pada masa yang akan datang.\n" +
                        "\n" +
                        "Umar bin Khattab menjadi orang yang dipilih sebagai duta dari kabilahnya pada masa Jahiliyyah. Jika terjadi perselisihan di antara para kabilah, maka Umar RA lah orang yang diutus untuk melerai dan mendamaikan.\n" +
                        "\n" +
                        "Hal ini menandakan bahwa Umar bin Khattab memiliki kecerdasan, keadilan, serta kebijaksanaan.\n" +
                        "\n" +
                        "Diketahui Umar bin Khattab baru masuk Islam pada tahun ke-enam kenabian. Pada saat itu, Umar RA berusia dua puluh tujuh tahun. Di antara banyak riwayat mengenai kisah Umar RA memeluk agama Islam, riwayat yang paling terkenal berasal dari Anas bin Malik.\n" +
                        "\n" +
                        "Pada suatu hari, Umar RA mendapat berita bahwa adiknya, Fatimah beserta suaminya telah masuk Islam. Seketika itu juga, Umar bin Khattab menjadi sangat marah dan geram.\n" +
                        "\n" +
                        "Umar RA pun segera bertandang ke rumah adiknya. Sesampainya di sana, Umar bin Khattab meluapkan amarah pada adiknya, Umar pun menampar Fatimah dan suaminya.\n" +
                        "\n" +
                        "Namun di puncak kemarahannya, Umar RA lalu melihat sebuah lembaran yang bertuliskan ayat Alquran. Menurut sebagian riwayat, ayat itu adalah permulaan surat Taha.\n" +
                        "\n" +
                        "Umar bin Khattab kemudian mengambil lembaran tersebut dan membaca ayat tersebut. Setelah membacanya, Umar RA pun merasakan damai dan tenang di hatinya.\n" +
                        "\n" +
                        "Lantas Umar RA ingin menemui Nabi Muhammad SAW di rumah Al-Arqam. Ketika itu, Nabi Muhammad SAW sedang melaksanakan dakwah secara sembunyi-sembunyi di rumah Al-Arqam.\n" +
                        "\n" +
                        "Sesampainya di sana, para sahabat yang berada di dalam rumah Al-Arqam menjadi ketakutan, kecuali Hamzah bin Abdul Muttalib, paman Nabi Muhammad SAW.\n" +
                        "\n" +
                        "Dengan sikap tenang dan berwibawa, Nabi Muhammad SAW menerima kedatangan Umar RA dan dengan sikap yang ditunjukkan oleh Nabi tersebutlah Umar RA menjadi lunak dan takut.\n" +
                        "\n" +
                        "Nabi Muhammad SAW kemudian memerintahkan Umar RA untuk masuk Islam dan seketika itu juga Umar RA kemudian menyatakan masuk Islam dan mengucapkan dua kalimat syahadat.\n" +
                        "\n" +
                        "Kisah Umar bin Khattab yang memeluk agama Islam membawa kekuatan yang cukup besar bagi perjalanan dakwah Islam.\n" +
                        "\n" +
                        "Pasalnya, Umar RA memberikan masukan kepada Nabi Muhammad SAW untuk melakukan syi’ar Islam secara terang-terangan, bukan secara diam-diam seperti yang selama ini dilakukan.\n" +
                        "\n" +
                        "Hingga sejak itulah, agama Islam disebarkan secara terang-terangan.\n" +
                        "\n" +
                        "Semenjak Umar RA masuk Islam, Nabi Muhammad SAW memberikan sebutan kepada Umar RA dengan julukan “al-Faaruq” yang artinya pembeda karena dengan Umarlah Allah SWT membedakan antara yang haq dan yang bathil.\n" +
                        "\n" +
                        "Umar bin Khattab juga menjadi penasihat terdekat Nabi Muhammad SAW hingga sepanjang umur Nabi Muhammad SAW.\n" +
                        "\n" +
                        "Usai Khilafah Abu Bakar ash-Shiddiq RA memerintah dan memimpin Islam selama dua tahun lamanya, Abu Bakar RA jatuh sakit.\n" +
                        "\n" +
                        "Kondisi Abu Bakar RA yang sakit membuat Umar bin Khattab merasa khawatir bila tidak menemukan pengganti Abu Bakar RA secepatnya.\n" +
                        "\n" +
                        "Akhirnya, Umar RA bermusyawarah dengan para sahabat guna mempertimbangkan siapa yang pantas menggantikan Abu Bakar RA menjadi khalifah.\n" +
                        "\n" +
                        "Abu Bakar RA mengungkapkan beberapa kriteria yang harus dimiliki oleh seorang khalifah. Berdasarkan masukan-masukan yang diterima, Abu Bakar RA kemudian memilih Umar bin Khattab untuk menggantikannya menjadi khalifah.\n" +
                        "\n" +
                        "Abu Bakar RA pun lalu membuat bai'at yang berisi penunjukan Umar bin Khattab sebagai penggantinya dan dengan demikian, orang-orang mukmin harus patuh terhadapnya.\n" +
                        "\n" +
                        "Umar RA dijadikan khalifah dengan dibai'at pada bulan Jumada al-Akhirah tahun 13 Hijriyah, tetapi Az-Zuhri mengatakan bahwa Umar bin Khattab diangkat menjadi khalifah pada hari kematian Abu Bakar, tepatnya delapan hari sebelum bulan Jumada al-Akhirah.\n" +
                        "\n" +
                        "Selama masa Umar bin Khattab menjadi khalifah menggantikan Abu Bakar ash-Shiddiq, Umar RA menghadapi banyak sekali persoalan yang menantinya.\n" +
                        "\n" +
                        "Misalnya, perang dan perdamaian, banyak masyarakat yang tidak mau membayar zakat, dan masalah sosial lainnya.\n" +
                        "\n" +
                        "Permasalahan- permasalahan yang muncul pada masa itu berkaitan dengan keberagaman bangsa Arab dan perluasan wilayah kekuasaan Islam.\n" +
                        "\n" +
                        "Meski demikian, masa pemerintahan Umar bin Khattab merupakan masa yang gemilang bagi perkembangan dan kemajuan agama Islam.\n" +
                        "\n" +
                        "Ada banyak sekali prestasi yang telah diraih pada masa itu, seperti dalam bidang perluasan wilayah, penataan administrasi negara, bidang perekonomian, keamanan dan ketertiban masyarakat, dan sebagainya.\n" +
                        "\n" +
                        "Bahkan ada yang mengatakan bahwa Umar bin Khattab adalah sebagai pendiri Negara Islam.\n" +
                        "\n" +
                        "Penyebutan Umar bin Khattab sebagai pendiri negara Islam tidak dikaitkan antara pendirian sebuah negara dengan kekhalifahan. Akan tetapi, tujuan utama dari pendirian Islam adalah untuk memperkuat akidah, bukan memperluas wilayah semata.\n" +
                        "\n" +
                        "Umar bin Khattab menjadi khalifah selama sepuluh tahun, yaitu pada tahun 634-644 Masehi. Umar bin Khattab dibunuh oleh Abu Lukluk (Fairuz), seorang budak pada saat ia akan memimpin sholat Subuh.\n" +
                        "\n" +
                        "Fairuz adalah salah seorang warga Persia yang masuk Islam setelah Persia ditaklukkan Umar bin Khattab.\n" +
                        "\n" +
                        "Pembunuhan ini konon dilatarbelakangi oleh dendam pribadi Abu Lukluk (Fairuz) terhadap Umar RA. Fairuz merasa sakit hati atas kekalahan Persia, yang saat itu merupakan negara digdaya. Peristiwa ini terjadi pada hari Rabu, 25 Dzulhijjah 23 H/644 Masehi.\n\n");
                context4.startActivity(intent);
            }
            if (dataItem4.get(position).getName4().equals("Sayyidina Utsman bin Affan")){
                Intent intent = new Intent(context4, DefaultActivity4.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.utsman);
                intent.putExtra("NAMA_DEFAULT","Sayyidina Utsman bin Affan");
                intent.putExtra("DESKRIPSI_TOKOH"," Terlihat familiar, tapi masih banyak muslimah dan muslimin yang mungkin tak kenal dengan sosok Utsman bin Affan. Siapakah beliau?\n" +
                        "\n" +
                        "Utsman bin Affan mudahnya kita kenal sebagai sahabat terdekat Nabi Muhammad SAW.\n" +
                        "\n" +
                        "Arti dibalik nama yang beliau miliki adalah pemilik dua cahaya atau disebut Dzun Nurain.\n" +
                        "\n" +
                        "Tak hanya sebagai sahabat Nabi Muhammad, Utsman juga memiliki ragam kisah yang menarik untuk kita ketahui.\n" +
                        "\n" +
                        "Yuk, Moms ajarkan Si Kecil terkait kisah Ustman bin Affan untuk bekal ilmu pengetahuan sebagai seorang Muslim!\n" +
                        "\n" +
                        "Sebelum mengenal kisah dari sahabat terdekat Nabi Muhammad SAW ini, kita kenali dulu profil pribadi Utsman bin Affan.\n" +
                        "\n" +
                        "Mengutip dalam Islamic Finder, beliau memiliki nama lengkap Utsman bin Affan bin Al-Aas bin Umayyah bin Abdul Syams bin Abd Manaf.\n" +
                        "\n" +
                        "Lahir di Makkah pada tahun keenam Amul-Fil (tahun Gajah).\n" +
                        "\n" +
                        "Jika dibandingkan dengan Nabi Muhammas SAW, umurnya 5 tahun lebih muda.\n" +
                        "\n" +
                        "Saat Nabi Muhammad mulai berdakwah dan menyebarkan agama Islam, Utsman termasuk orang pertama yang mempercayainya.\n" +
                        "\n" +
                        "Sahabat dari Nabi ini tergolong dalam kelompok Assabiqunal Awwalun atau orang-orang yang pertama masuk Islam.\n" +
                        "\n" +
                        "Nama ibunya adalah Arwa binti Kurayz dan meninggal dunia saat kekhalifahan dirinya.\n" +
                        "\n" +
                        "Utsman menjadi seorang Muslim saat bermigrasi ke Abyssinia (Ethiopia) dan Madinah.\n" +
                        "\n" +
                        "Lahir dalam keluarga mampu dan dari saudagar kaya raya, tak membuat kepribadiannya berubah.\n" +
                        "\n" +
                        "Justru ia dikenal sebagai seorang yang dermawan dan suka menolong.\n" +
                        "\n" +
                        "Beliau wafat pada usia 82 tahun saat tahun ke 35 Hijriah.\n" +
                        "\n" +
                        "Semasa hidupnya, Utsman menjabat sebagai khalifah ketiga selama 12 tahun, yakni 24 sampai 36 Hijiah (644–656 M).\n" +
                        "\n" +
                        "Diketahui dari biografinya, ia meninggal dunia dalam keadaan mati syahid.\n" +
                        "\n" +
                        "Menghembuskan napas terakhirnya usai para pemberontak (kaum Khawarij) mengepung kediamannya.\n" +
                        "\n" +
                        "Melansir dalam Britannica, kemudian ia dibunuh oleh kaum pemberontak tersebut.\n" +
                        "\n" +
                        "Tentu hal ini membuat proses pemakaman jenazah pada saat itu terjadi perseteruan.\n" +
                        "\n" +
                        "Sempat dikuburkan dalam pemakaman Yahudi yang akhirnya dipindahkan ke tempat pemakaman Muslim.\n\n");
                context4.startActivity(intent);
            }
            if (dataItem4.get(position).getName4().equals("Sayyidina Ali bin Abi thalib")){
                Intent intent = new Intent(context4, DefaultActivity4.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.ali);
                intent.putExtra("NAMA_DEFAULT","Sayyidina Ali bin Abi thalib");
                intent.putExtra("DESKRIPSI_TOKOH"," Ali bin Abi Thalib adalah khalifah keempat dalam periode Khulafaur Rasydin. Khalifah Ali menggantikan posisi Sayyidina Utsman bin Affan. Sayyidina Ali merupakan putra dari paman Nabi SAW, Abi Thalib bin Abdul Muthalib bin Hasyim bin Abdu Manaf. Sedangkan Ibundanya bernama Fathimah binti Asad bin Hasyim bin Qushay bin Kilab.\n" +
                        "\n" +
                        "Ali memiliki beberapa orang saudara laki-laki yang lebih tua darinya, mereka adalah: Thalib, Aqil, dan Ja’far. Dan dua orang saudara perempuan Ummu Hani’ dan Jumanah. Beberapa kalangan ulama berpendapat bahwa Ali bin Abi Thalib lahir pada tahun ke 10 sebelum Nabi Muhammad SAW memulai kenabiannya atau pada sekitar tahun 599 atau 600 Masehi . Pada saat lahir, sebenarnya Ali bin Abi Thalib bernama Haydar bin Abu Thalib yang artinya singa dari keluarga Abu Thalib, namun Rasulullah SAW tidak begitu menyukai nama tersebut dan beliau SAW memanggilnya dengan nama Ali yang memiliki arti “yang tinggi derajatnya disisi Allah”.\n" +
                        "\n" +
                        "Sayyidina Ali merupakan pemuda pertama dari kalangan kaum Quraisy yang masuk Islam. Ali juga yang menggantikan posisi Rasulullah SAW di tempat tidurnya saat Nabi SAW hijrah.  Sayyidina Ali juga sekaligus menantu Rasulullah SAW karena dinikahkan dengan putri kesayangan Bagina Nabi SAW yakni, Fatimah yang sangat sederhana kehidupannya. Ali bin Abi Thalib adalah laki-laki berkulit sawo matang, bola mata beliau besar dan agak kemerah-merahan. Untuk ukuran orang Arab, beliau termasuk pendek, tidak tinggi dan berjanggut lebat. Dada dan kedua pundaknya putih. Rambut di dada dan pundaknya cukup lebat, berwajah tampan, memiliki gigi yang rapi, dan ringan langkahnya (ath-Thabaqat al-Kubra, 3: 25). Setelah Rasullulah SAW wafat, kepemimpinan umat islam dipegang oleh Khulafair Rasyidin. Setelah peristiwa terbunuhnya khalifah Utsman bin Affan, masyarakat Arab kemudian meminta dan membaiat Ali bin Abi Thalib untuk menjadi pemimpin bagi mereka.\n" +
                        "\n" +
                        "Kepemimpinan Ali adalah layaknya kepemimpinan Umar bin Khatab yang keras dan disiplin. Ada beberapa hal yang dilakukan Ali saat masa pemerintahannya yang berlangsung selama lima tahun yakni dari tahun 656 – 661 M, antara lain menghapus nepotisme dan memperluas pengaruh Islam ke dunia luar. Ali bin Abi Thalib wafat saat usianya menginjak 63 tahun dan diketahui bahwa beliau meninggal karena dibunuh oleh Abdurrahman Bin Muljam yang merupakan anggota dari Khawarijmi atau kaum pembangkang pada tanggal 19 ramadhan, dan akhirnya Ali bin Abi Thalib RA menghembuskan nafas terakhirnya pada tanggal 21 Ramadhan pada tahun ke 40 hijriyah. Ali Bin Abi Thalib adalah sahabat Rasul yang memiliki kedudukan di sisi Allah SWT karena kebaikan akhlak dan budi pekertinya.\n" +
                        "\n" +
                        "Ali bin Abi Tholib dikenal sebagai sosok pemberani. Saat Perang Khaibar, Rasulullah hendak memberikan bendera komando perang kepada seseorang. Diriwayatkan dari Sahl bin Sa’adi, Rasulullah shallallahu ‘alaihi wa sallam bersabda: “Demi Allah, akan aku serahkan bendera ini esok hari kepada orang yang mencintai Allah dan Rasul-Nya dan dia dicintai Allah dan Rasul-Nya. Semoga Allah memberikan kemenangan melalui dirinya.”  Maka semalam suntuk orang-orang (para sahabat) membicarakan tentang siapakah di antara mereka yang akan diberikan bendera tersebut. Keesokan harinya, para sahabat mendatangi Rasulullah, lalu beliau bersabda, “Di manakah Ali bin Abi Thalib?” Dijawab, “Kedua matanya sedang sakit.” Rasulullah memerintahkan, “Panggil dan bawa dia kemari.” Dibawalah Ali ke hadapan Rasulullah, lalu beliau meludahi kedua matanya yang sakit seraya berdoa untuknya. Seketika Ali sembuh total seolah-olah tidak tertimpa sakit sebelumnya. Kemudian Rasulullah shallallahu ‘alaihi wa sallam menyerahkan bendera kepadanya. Lalu Ali berkata, “Wahai Rasulullah, aku memerangi mereka sampai mereka menjadi seperti kita.” Rasululah bersabda, “Majulah dengan tenang, sampai engkau tiba di tempat mereka. Kemudian ajaklah mereka kepada Islam dan sampaikanlah hak-hak Allah yang wajib mereka tunaikan. Demi Allah, sekiranya Allah member petunjuk kepada seseorang melalui dirimu, sungguh lebih berharga bagimu daripada memiliki onta-onta merah.” (HR. Muslim no. 4205).\n" +
                        "\n" +
                        "Saat perang khandaq, Ali bin Abi Tholib juga tak gentar berduel satu lawan satu dengan musuh. Saat itu, Amr ibnu Abdu Wadd Al-Amiri,  pendekar penunggang kuda yang terkenal sejak zaman Jahiliah bersama sejumlah pasukan berkuda meloncati parit itu hingga sampai di bagian posisi pasukan kaum muslim. Maka Rasulullah SAW menyerukan kepada pasukan berkuda kaum muslim untuk menghadapinya. Tetapi dilaporkan kepada Nabi SAW bahwa tiada seorang pun dari pasukan kaum muslim yang berani menandinginya. Maka Rasulullah SAW memerintahkan kepada sahabat Ali ra untuk menghadapinya.  Lalu Ali ibn Abi Thalib keluar menandinginya, keduanya terlibat dalam pertempuran selama sesaat, dan pada akhirnya sahabat Ali ra berhasil membunuhnya. Peristiwa ini merupakan pertanda akan datangnya pertolongan dari Allah dan kemenangan. Bergelar Karramallahu Wajhah Sayidina Ali digelari atau didoakan dengan karromallahu wajhah karena dua alasan: 1. Wajahnya tidak pernah bersujud kepada selain Allah SWT sejak sebelum memeluk Islam 2. Mata Sayidina Ali tidak pernah melihat kemaluan sendiri, lebih-lebih milik orang lain. Walupun beliau istinja', beliau berusaha memalingkan wajahnya untuk tidak sampai melihat kemaluannya.\n");
                context4.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataItem4.size();
    }

    void setDataItem4(ArrayList<ItemModel4> filterModel4){
        dataItem4 = new ArrayList<>();
        dataItem4.addAll(filterModel4);
        notifyDataSetChanged();
    }
}
