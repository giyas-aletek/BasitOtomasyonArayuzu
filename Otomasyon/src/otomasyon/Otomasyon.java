package otomasyon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Otomasyon {
    
}
class Kisi{
    String ad,soyad,eposta,telefon;
    public Kisi(String ad, String soyad, String eposta, String telefon) {
        this.ad = ad;
        this.soyad = soyad;
        this.eposta = eposta;
        this.telefon = telefon;
    }
}
class Akademsiyen extends Kisi{
    int sicilno;
    String anabilim,unvan;

    public Akademsiyen(int sicilno, String anabilim, String unvan, String ad, String soyad, String eposta, String telefon) {
        super(ad, soyad, eposta, telefon);
        this.sicilno = sicilno;
        this.anabilim = anabilim;
        this.unvan = unvan;
    }
    public void rendevularim(){
        int sNo=this.sicilno;
        File file = new File(getClass().getClassLoader().getResource("veriTaban/rendevu.txt").getFile());
        File f = new File("/veriTaban/rendevu.txt");
        try {
            Scanner k = new Scanner(file);
            while(k.hasNext()){
                String x = k.nextLine();
                Scanner z = new Scanner(x);
                String x1=z.next();
                String x2=z.next();
                int no=Integer.parseInt(x2);
                if (no==sNo) {
                    System.out.println(x);
                }
            }
        } catch (FileNotFoundException | NumberFormatException e) {
            }   
    }
    @Override
    public String toString(){
        return unvan+" "+ad+" "+soyad+" "+anabilim+" "+eposta+" "+telefon;
    }
}
class Ogrenci extends Kisi{
 String bolum;
 int kayityili,numara;

    public Ogrenci(String bolum, int kayityili, int numara, String ad, String soyad, String eposta, String telefon) {
        super(ad, soyad, eposta, telefon);
        this.bolum = bolum;
        this.kayityili = kayityili;
        this.numara = numara;
    }

    
    public String[][] Getrendevulistesi(){
        String tarihlar[][]=new String[10][4];
        try {
            int i=0;
            File file = new File(getClass().getClassLoader().getResource("veriTaban/rendevu.txt").getFile());
            File F = new File("/veriTaban/rendevu.txt");
            Scanner kk = new Scanner(file);
            while(kk.hasNext()){
             String oNo=kk.next();
             String pNo=kk.next();
             tarihlar[i][0]=pNo;
             String tar=kk.next();
             tarihlar[i][1]=tar;
            String time=kk.next();
            tarihlar[i][2]=time;
            String time2=kk.next();
            tarihlar[i][3]=time2;
            i++;
         }
            
        } catch (FileNotFoundException e) {System.out.println(e.getMessage());
        }
        
        return tarihlar;
    }
    
    public void rendevual(Akademsiyen a,Date tarih,String bassaat,String bitissaat) throws Exception{
        String rendevular[][]=Getrendevulistesi();

        
        boolean musaitmi=true;
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd.mm.yyyy");  
        String strDate = formatter.format(tarih);
        
        SimpleDateFormat formatter1=new SimpleDateFormat("hh:mm");  
        Date time1=formatter1.parse(bassaat);
        
        SimpleDateFormat formatter2=new SimpleDateFormat("hh:mm");  
        Date time2=formatter1.parse(bitissaat);
        
        for (int i = 0; i < 10; i++) {
            if (rendevular[i][0]==null) {
                break;
            }
            String xx=String.valueOf(a.sicilno);
            if (rendevular[i][0].equals(xx)) {
                if (rendevular[i][1].equals(strDate)) {
                    SimpleDateFormat f1=new SimpleDateFormat("hh:mm");  
                    Date t1=formatter1.parse(rendevular[i][2]);
                    SimpleDateFormat f2=new SimpleDateFormat("hh:mm");  
                    Date t2=formatter1.parse(rendevular[i][3]);
                    if (!(time1.after(t1) || time1.before(t2))||(time2.after(t1) || time2.before(t2))) {
                        musaitmi=false;
                        System.out.println("Uzur Dileriz Musait Degil");
                        break;
                    }
                }
            }
        }
        if (musaitmi) {
            File file = new File(getClass().getClassLoader().getResource("veriTaban/rendevu.txt").getFile());
            File f = new File("/veriTaban/rendevu.txt");
            try (PrintWriter p = new PrintWriter(new FileOutputStream(file,true))) {
                p.println(numara+" "+a.sicilno+" "+strDate+" "+bassaat+" "+bitissaat);
            }
        System.out.println("Basariyla olusturuldu");
        }
        
    }
        
        
        public void rendevulistele(){
         
        try {
            int i=0;
            File file = new File(getClass().getClassLoader().getResource("veriTaban/rendevu.txt").getFile());
            File F = new File("/veriTaban/rendevu.txt");
            Scanner kk = new Scanner(file);
            while(kk.hasNext()){
                
             String x=kk.next();x=kk.next();
             String tar=kk.next();
             System.out.print(tar+" ");
             String time=kk.next();
             System.out.print(time+" ");
            String time2=kk.next();
            System.out.println(time2+" ");
            
            i++;
         }
            
        } catch (FileNotFoundException e) {System.out.println(e.getMessage());
        }
    }
 @Override
    public String toString(){
        return this.ad+" "+this.soyad+" "+bolum+" "+numara+" "+kayityili+" "+this.eposta+" "+this.telefon;
    }
 
}
class Odev{
    
    public void listele(Kisi k) throws FileNotFoundException{
        if (k.getClass().getSimpleName().equals("Ogrenci")) {
            File file = new File(getClass().getClassLoader().getResource("veriTaban/ogrenci.txt").getFile());
            File f = new File("/veriTaban/ogrenci.txt");
            Scanner oku = new Scanner(file);
            while (oku.hasNext()) {
                String next = oku.nextLine();
                System.out.println(next);
                
            }
        }
        else if (k.getClass().getSimpleName().equals("Akademsiyen")) {
            File file = new File(getClass().getClassLoader().getResource("veriTaban/akademisyen.txt").getFile());
            File f = new File("/veriTaban/akademisyen.txt");
            Scanner oku = new Scanner(file);
            while (oku.hasNext()) {
                String next = oku.nextLine();
                System.out.println(next);
                
            }
        }
        
        
    }
    public Akademsiyen[] akoku() throws FileNotFoundException{
        Akademsiyen[] x=new Akademsiyen[10];
        int i=0;
        File file = new File(getClass().getClassLoader().getResource("veriTaban/akademisyen.txt").getFile());
        File f =new File("/veriTaban/akademisyen.txt");
        Scanner k = new Scanner(file);
        while (k.hasNext()) {
            int sicilNo = Integer.parseInt(k.next());
            String anaBilim=k.next();
            String unvan=k.next();
            String ad=k.next();
            String soyad=k.next(); 
            String eposta=k.next(); 
            String telefon=k.next();
            x[i]=new Akademsiyen(sicilNo, anaBilim, unvan, ad, soyad, eposta, telefon);
            i++;
        }
        return x;
    }
    public Ogrenci[] ogroku() throws FileNotFoundException{
        Ogrenci[] x=new Ogrenci[10];
        int i=0;
        File file = new File(getClass().getClassLoader().getResource("veriTaban/ogrenci.txt").getFile());
        File f =new File("/veriTaban/ogrenci.txt");
        Scanner k = new Scanner(file);
        while (k.hasNext()) {
            int numara = Integer.parseInt(k.next());
            String ad=k.next();
            String soyad=k.next();
            String bolum=k.next();
            int kayityili = Integer.parseInt(k.next());
            String eposta=k.next();
            String telefon=k.next();
            x[i]= new Ogrenci(bolum, kayityili, numara, ad, soyad, eposta, telefon);
            i++;
        }
        return x;
    }
    public static void main(String[] args) throws FileNotFoundException, Exception {
        GirisSayfasi g = new GirisSayfasi();
        g.setVisible(true);
//        Odev odev = new Odev();
//        Ogrenci[] ogrenciler =odev.ogroku();
//        Akademsiyen[] akademisyenler=odev.akoku();
//        Scanner k = new Scanner(System.in);
//        
//        int i=0;
//        boolean devam = true;
//        while(devam){
//        System.out.println("yapilacak islem sec \t0)ren list \t 1) ogrenci ekle \t 2) akademsiyen ekle \t 3)rendevu Ekle \t 4)og lis \t 5)ak list \t 6)cik");
//        int x = k.nextInt();
//        if (x==0) {
//           ogrenciler[0].rendevulistele();
//            System.out.println("");
//        }
//        else if (x==1) {
//            Scanner m =new Scanner(System.in);
//            //File file = new File(getClass().getClassLoader().getResource("veriTaban/ogrenci.txt").getFile());
//            File f = new File("E:\\ogrenci.txt");
//            System.out.println("numara, ad, soyad, bölüm, kayıt yılı, e-posta, telefon gir");
//            String og=m.nextLine();
//            try {
//                PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
//                pw.println(og);
//                pw.close();
//            } catch (FileNotFoundException e) {
//            }
//            
//            System.out.println("");
//        }
//        else if (x==2) {
//            Scanner m =new Scanner(System.in);
//            //File file = new File(getClass().getClassLoader().getResource("veriTaban/akademisyen.txt").getFile());
//            File f = new File("E:\\akademisyen.txt");
//            System.out.println("sicil numarasi, ad, soyad, anabilim dalı, e-posta, telefon, ünvan gir");
//            String og=m.nextLine();
//            try {
//                PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
//                pw.println(og);
//                pw.close();
//            } catch (FileNotFoundException e) {
//            }
//            System.out.println("");
//        }
//        else if (x==3) {
//            System.out.println("Hangi ogr icin");
//            
//                for (int j = 0; j < 10; j++) {
//                    if (ogrenciler[j]==null) {
//                        break;
//                    }
//                    System.out.println(j +" "+ ogrenciler[j].toString());
//                }
//                
//                int s1=k.nextInt();
//            System.out.println("Hangi ogretmen");
//                for (int j = 0; j < 10; j++) {
//                    if (akademisyenler[j]==null) {
//                        break;
//                    }
//                    System.out.println(j + " "+akademisyenler[j].toString());
//            }
//                
//                int s2= k.nextInt();
//                System.out.println("Tarih Yaz ornek 01.01.2020");
//                String t1=k.next();
//                SimpleDateFormat formatter1=new SimpleDateFormat("dd.mm.yyyy");  
//                Date date1=formatter1.parse(t1);
//                System.out.println("bas Saat yaz ornek 11:22");
//                String t2=k.next();
//                System.out.println("Bit Saay yaz ornek 22:11");
//                String t3=k.next();
//                ogrenciler[s1].rendevual(akademisyenler[s2], date1, t2, t3);
//            }
//        else if (x==4) {
//            odev.listele(new Ogrenci(null, 0, 0, null, null, null, null));
//            System.out.println("");
//        }
//        else if (x==5) {
//            odev.listele(new Akademsiyen(0, null, null, null, null, null, null));
//            System.out.println("");
//        }
//        else if (x==6) {
//            devam = false;
//        }
//        else {
//            System.out.println("Yanlis secim");
//            System.out.println("");
//        }
//        
//        }
    }
    
}

