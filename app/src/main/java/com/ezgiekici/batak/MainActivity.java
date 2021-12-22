package com.ezgiekici.batak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    private ImageView[] kartlar = new ImageView[52];
    private ImageView[]  elKartları= new ImageView[13];
    private ImageView[]  ortaKartlar= new ImageView[4];
  /*  private Orta orta;
    private Deste deste;
    private El insan, bilgisayar1,bilgisayar2,bilgisayar3;
    private Kazanc insanKazanc, bilgisayarKazanc1,bilgisayarKazanc2,bilgisayarKazanc3;
    private int tur, hamle;*/
    private ImageView insanAnimasyonKart, bilgisayarAnimasyonKart;
    private int insanAnimasyonKartX, insanAnimasyonKartY;
    private int bilgisayarAnimasyonKartX, bilgisayarAnimasyonKartY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nex);
        elKartları[0] = (ImageView) findViewById(R.id.kart1);
        elKartları[1] = (ImageView) findViewById(R.id.kart2);
        elKartları[2] = (ImageView) findViewById(R.id.kart3);
        elKartları[3] = (ImageView) findViewById(R.id.kart4);
        elKartları[4] = (ImageView) findViewById(R.id.kart5);
        elKartları[5] = (ImageView) findViewById(R.id.kart6);
        elKartları[6] = (ImageView) findViewById(R.id.kart7);
        elKartları[7] = (ImageView) findViewById(R.id.kart8);
        elKartları[8] = (ImageView) findViewById(R.id.kart9);
        elKartları[9] = (ImageView) findViewById(R.id.kart10);
        elKartları[10] = (ImageView) findViewById(R.id.kart11);
        elKartları[11] = (ImageView) findViewById(R.id.kart12);
        elKartları[12] = (ImageView) findViewById(R.id.kart13);
        ortaKartlar[0]=(ImageView) findViewById(R.id.ortaKart1);
        ortaKartlar[1]=(ImageView) findViewById(R.id.ortaKart2);
        ortaKartlar[2]=(ImageView) findViewById(R.id.ortaKart3);
        ortaKartlar[3]=(ImageView) findViewById(R.id.kart13Orta);
        // orta kartlar atıldıktan sonra görünmeye başlayacak ilk olarak kapalı kalacakalar

      //  oyunaBasla();
        getSupportActionBar().hide();

    }

   /*

    }*/
    /*
    private void oyunaBasla(){
    tur=0;
    deste=new Deste();
    orta=new Orta();
    insanKazanc=new Kazanc();
    bilgisayarKazanc1=new Kazanc();
    bilgisayarKazanc2=new Kazanc();
    bilgisayarKazanc3=new Kazanc();
    deste.kagıtDagıt();
    turaBasla();
    ortayiGoster();
    }
    private void turaBasla(){
    insan=deste.elDagit();
    bilgisayar1=deste.elDagit();
    bilgisayar2=deste.elDagit();
    bilgisayar3=deste.elDagit();
    for (int i = 0; i < 13; i++){
            kartGoster(insan.kartGetir(i), kartlar[i]);
        }
      if (orta.bilgisayarKart1 != null){
            kartGoster(orta.bilgisayarKart1, ortaKartlar[0]);
        } else{
          ortaKartlar[0].setVisibility(View.INVISIBLE);
        }
         if (orta.bilgisayarKart2 != null){
            kartGoster(orta.bilgisayarKart1, ortaKartlar[1]);
        } else{
          ortaKartlar[1].setVisibility(View.INVISIBLE);
        }
         if (orta.bilgisayarKart3 != null){
            kartGoster(orta.bilgisayarKart1, ortaKartlar[2]);
        } else{
          ortaKartlar[2].setVisibility(View.INVISIBLE);
        }
          hamle = 0;
    }
   private void kartGoster(Kart kart,ImageView kartResim){
   AssetManager assets=getAssets(); //resimleri yönetir
   try{
   InputStream resim=assets.open(kart.toString()+"png");// assetsin içindeki klasöre open ile eriş,
   Drawable flag=Drawable.createFromStream(resim,karttoString());// ImageView nesnesidir resimleri göstermek için kullanılır setImageDraw.
   kartResim.setImageDrawable(flag);
   }
   catch
   }
    private void Oyna(El el,Win win,int aKart){
        Kart kart=el.oyna(aKart);
        orta.atılanKart(kart);
        if(orta.kazancVarmı()){
            orta.kazancaGonder(kazanc);

        }
        public void ortayiGoster(){
   // oyuncular tarafından atılan her kartın görünür yapılması bu metotda gerçekleşir
   }
    public void oyunuDevamEttir(){
        hamle++;
        if(hamle==4){
        hamle==0;
        tur++;
        if(tur<5){
        turaBasla();
        ortayıGoster();
        }else{
        oyunBitti();
        }
        }
    }

   public void turaBasla(){
   //  oyunu oynayan oyunculara kartlar dağıtırlır.
     asıl oyuncunun kartları ekranda gösterilir.

   };


   public void botZeka(){
   //kartların dağıtılması bu kısımda gerçekleşir .
   }
   public OnClickListener kartTikla =new OnClickListener(){
   // kartların tıklanarak onClick metodu ile oyuncu tarafından hangi karta tıklandıysa içinde v paremetresini ona atar , hangi kartın oynandığı anlaşılır.
   }
   public void oyuncuAnimasyon(){
   //oyununcunun seçtiği kart yere atılırken kullanılan animasyon metotdudur. Gerekli kordinatlar belirtilir.
   oyuncuAnimasyonKartX=oyuncuAnimasyonKart.getLeft();
   oyuncuAnimasyonKartY=oyuncuAnimasyonKart.getTop();
   .
   .
   .

   }
   public void botAnimasyon(){
   //bot tarafından atılan kartın kullandığı animasyon methodu.
   }
   public void kazancYazdir(){
   //skorların yazdırıldığı metot gibi düşündüm.
   toaster vs burada kullanılır.
   }
     */
}