import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*; 

import javax.naming.InitialContext;
import javax.swing.InputMap;

import model.Employee;
import model.Item;
import model.Payment;
import model.ReceivingItem;
import model.Supplier;

public class Receiving 
{public static ArrayList <Employee> initEmployees(ArrayList <Employee> employees)
    {   Employee emp1 = new Employee("P1", "Brian", " Jalan pertempuran no 62 ");
        employees.add(emp1);
        Employee emp2 = new Employee("P2", "Billy", " komplek griya blok a1 no 5 ");
        employees.add(emp2);
        Employee emp3 = new Employee("P3", "Riandy", " Jalan semangka no 25 ");
        employees.add(emp3);
        Employee emp4 = new Employee("P4", "Ariq", " Jalan Babi nomor 00 ");
        employees.add(emp4);
        Employee emp5 = new Employee("P5", "Angel", " Jalan mamakau nomor 62 ");
        employees.add(emp5);
        Employee emp6 = new Employee("P6", "Angelina", " Jalan papikaya nomor 69 ");
        employees.add(emp6);
        Employee emp7 = new Employee("P7", "Itto", " Jalan ipadmahal nomor 420 ");
        employees.add(emp7);
        Employee emp8 = new Employee("P8", "Thomas", " Jalan nuryani nomor 72 ");
        employees.add(emp8);
        Employee emp9 = new Employee("P9", "Yelan", " Jalan pahlawan nomor 54 ");
        employees.add(emp9);
        Employee emp10 = new Employee("P10", "Hutao", " Jalan telat nomor 62 ");
        employees.add(emp10);
        return employees;}
    public static ArrayList <Item> initItems(ArrayList <Item> item)
    {   Item itm1 = new Item("I1", "rice-cooker", "Alat rumah tangga", 1000);
        item.add(itm1);
        Item itm2 = new Item("I2", "panci", "Alat rumah tangga", 2000);
        item.add(itm2);
        Item itm3 = new Item("I3", "sepeda", "Kendaraan", 100);
        item.add(itm3);
        Item itm4 = new Item("I4", "mobil", "Kendaraan", 50);
        item.add(itm4);
        Item itm5 = new Item("I5", "antangin", "Obat-obatan", 10000);
        item.add(itm5);
        Item itm6 = new Item("I6", "PS5", "Elektronik", 300);
        item.add(itm6);
        Item itm7 = new Item("I7", "sendok", "Alat rumah tangga", 1000);
        item.add(itm7);
        Item itm8 = new Item("I8", "Telepon_rumah", "Elektronik", 400);
        item.add(itm8);
        Item itm9 = new Item("I9", "Drum", "Alat musik", 70);
        item.add(itm9);
        Item itm10 = new Item("I10", "Violin", "Alat musik", 100);
        item.add(itm10);
        return item;}
    public static ArrayList <Payment> initPayments(ArrayList <Payment> payment)
    {   Payment pmt1 = new Payment(1, 5000, "sendok", "00100S"); //
        payment.add(pmt1);
        Payment pmt2 = new Payment(2, 10000, "panci", "00100P");
        payment.add(pmt2);
        Payment pmt3 = new Payment(3, 5000, "sendok", "00100S");
        payment.add(pmt3);
        Payment pmt4 = new Payment(4, 10000, "panci", "00100P");
        payment.add(pmt4);
        Payment pmt5 = new Payment(5, 5000, "sendok", "00100S");
        payment.add(pmt5);
        Payment pmt6 = new Payment(6, 10000, "panci", "00100P");
        payment.add(pmt6);
        Payment pmt7 = new Payment(7, 5000, "sendok", "00100S");
        payment.add(pmt7);
        Payment pmt8 = new Payment(8, 10000, "panci", "00100P");
        payment.add(pmt8);
        Payment pmt9 = new Payment(9, 5000, "sendok", "00100S");
        payment.add(pmt9);
        Payment pmt10 = new Payment(10, 10000, "panci", "00100P");
        payment.add(pmt10);
        return payment;}
    public static ArrayList <ReceivingItem> initReceivingItems(ArrayList <ReceivingItem> receivingItems)
    {   ReceivingItem rcv1 = new ReceivingItem("001", 100000, 15000, 101000);
        receivingItems.add(rcv1);
        ReceivingItem rcv2 = new ReceivingItem("002", 150000, 15000, 152000);
        receivingItems.add(rcv2);
        ReceivingItem rcv3 = new ReceivingItem("003", 10000, 250000000, 10100);
        receivingItems.add(rcv3);
        ReceivingItem rcv4 = new ReceivingItem("004", 10000, 15000, 10050);
        receivingItems.add(rcv4);
        ReceivingItem rcv5 = new ReceivingItem("005", 5000000, 15000, 5010000);
        receivingItems.add(rcv5);
        ReceivingItem rcv6 = new ReceivingItem("006", 10000, 15000, 10300);
        receivingItems.add(rcv6);
        ReceivingItem rcv7 = new ReceivingItem("007", 10000, 15000, 11000);
        receivingItems.add(rcv7);
        ReceivingItem rcv8 = new ReceivingItem("008", 10000, 15000, 10400);
        receivingItems.add(rcv8);
        ReceivingItem rcv9 = new ReceivingItem("009", 70, 15000, 140);
        receivingItems.add(rcv9);
        ReceivingItem rcv10 = new ReceivingItem("010", 1000, 1500000, 1100);
        receivingItems.add(rcv10);
        
        return receivingItems;}
    public static ArrayList <Supplier> initSuppliers(ArrayList <Supplier> supplier)
    {   Supplier spl1 = new Supplier (" SPL01 ", " mitra_mulia ", " Jalan harimau 001 ", " 08126009875 ");
        supplier.add(spl1);
        Supplier spl2 = new Supplier(" SPL02 ", " diana_agung ", " Jalan Tikus 23 ", "0852669872");
        supplier.add(spl2);
        Supplier spl3 = new Supplier (" SPL03 ", " sauvage ", " Jalan Hantu 111 ", " 0811627947 ");
        supplier.add(spl3);
        Supplier spl4 = new Supplier (" SPL04 ", " mitra_jaya ", " Jalan Harimau 45 ", " 08182770913 ");
        supplier.add(spl4);
        Supplier spl5 = new Supplier (" SPL05 ", " Golden ", " Jalan Pokemon 99 ", " 08147892004 ");
        supplier.add(spl5);
        Supplier spl6 = new Supplier (" SPL06 ", " surya ", " Jalan Wibu 1112 ", " 08109128337");
        supplier.add(spl6);
        Supplier spl7 = new Supplier (" SPL07 ", " sonameta ", " Jalan Kodok 6 ", " 08146537228 ");
        supplier.add(spl7);
        Supplier spl8 = new Supplier (" SPL08 ", " kartena ", " Jalan Jerapah 190 ", " 08110936445 ");
        supplier.add(spl8);
        Supplier spl9 = new Supplier (" SPL09 ", " Ray4C ", " Jalan Jones 75 ", " 08128914887 ");
        supplier.add(spl9);
        Supplier spl10 = new Supplier (" SPL10 ", " FFrody ", " Jalan Kenyang 61 ", " 081280143322 ");
        supplier.add(spl10);
        return supplier;}    

    public static void main(String[] args) throws Exception 
    {   ArrayList <Employee> employees = new ArrayList <Employee>();
        ArrayList <ReceivingItem> receivingItems = new ArrayList <ReceivingItem>();
        ArrayList <Supplier> supplier = new ArrayList <Supplier>();
        ArrayList <Item> item = new ArrayList <Item>();
        ArrayList <Payment> payment = new ArrayList <Payment>();
        initEmployees(employees);
        initItems(item);
        initPayments(payment);
        initReceivingItems(receivingItems);
        initSuppliers(supplier);
        Scanner input = new Scanner(System.in);
        String yn="y";
        do{menu();
            int pilihan = 0;
            pilihan = input.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.flush();
                if(pilihan==1)
            {    String yn1="y";
                do{
                menuPegawai();
    
                int pilihanpgw = 0;
                pilihanpgw = input.nextInt();
    
                if(pilihanpgw==1)//tambah data pegawai
                 {      String kode_pegawai;
                        String nama_pegawai;
                        String alamat;
                        System.out.print("Kode pegawai \t:\t");
                        kode_pegawai=input.next();
                        System.out.print("Nama pegawai \t:\t");
                        nama_pegawai=input.next();
                        System.out.print("alamat \t\t:\t");
                        alamat=input.next();
                        employees.add(new Employee(kode_pegawai, nama_pegawai, alamat));
                        System.out.println("Data Berhasil Ditambahkan");}
                        else if(pilihanpgw==2)//tampilkan data pegawai
                        {cetakDataPegawai(employees);;}
                    else if(pilihanpgw==3)//keluar
                    {break;}
                    else{continue;}
                    System.out.print("kembali ke menu Data Pegawai? (y/n): ");
                    yn1=input.next();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();}
             while(yn1.equalsIgnoreCase("y"));}
            else if(pilihan==2)
            { String yn2="y";
                do{menuBarangyangDiterima();;
                    int pilihanprm = 0;
                    pilihanprm = input.nextInt();
                    if(pilihanprm==1)
                    {   String kodeReceiving;
                        int kuantitiTerima;
                        long hargaSatuan;
                        long total;
                        System.out.print("Kode penerimaan \t:\t");
                        kodeReceiving=input.next();
                        System.out.print("Kuantitas Terima \t:\t");
                        kuantitiTerima=input.nextInt();
                        System.out.print("Harga Satuan\t\t:\t");
                        hargaSatuan=input.nextLong();
                        System.out.print("Total Pembayaran \t:\t");
                        total=input.nextLong();
                        receivingItems.add(new ReceivingItem(kodeReceiving, kuantitiTerima, hargaSatuan, total));
                        System.out.println("Data sukses ditambahkan");}
                    else if(pilihanprm==2)
                    {cetakBuktiTerimaBarang(receivingItems);}    
                    else if (pilihanprm==3)
                    {historipenerimaanbrg(receivingItems);}
                    else if(pilihanprm==4)
                    {
                        break;
                    }
                    else{
                        continue;
                    }
                    System.out.print("kembali ke menu Penerimaan? (y/n): ");
                    yn2=input.next();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
                while(yn2.equalsIgnoreCase("y"));
            }
    
            else if(pilihan==3)//barang
            {
                String yn3="y";
                do{
                    menuBarang();
    
                    int pilihanmnbrg = 0;
                    pilihanmnbrg = input.nextInt();
    
                    if(pilihanmnbrg==1)//tambah data barang
                    {
                        String kodeItem;
                        String namaItem;
                        String Kategori;
                        int stock;

                        System.out.print("Kode barang \t\t:\t");
                        kodeItem=input.next();
                        System.out.print("Nama barang \t\t:\t");
                        namaItem =input.next();
                        System.out.print("kategori barang \t:\t");
                        Kategori=input.next();
                        System.out.print("Stok \t\t\t:\t");
                        stock=input.nextInt();
    
                        item.add(new Item(kodeItem, namaItem, Kategori, stock));
                        System.out.println("Data sukses ditambahkan");
                    }
                    else if(pilihanmnbrg==2)//tampilkan data barang
                    {
                        cetakDataBarang(item);
                    }
                    else if (pilihanmnbrg==3)//Data barang yang paling sering diterima
                    {
                        penerimaanbarangterbanyak(item);
                    }
                    else if(pilihanmnbrg==4)//keluar
                    {
                        break;
                    }
                    else{
                        continue;
                    }
                    System.out.print("kembali ke menu Barang? (y/n): ");
                    yn3=input.next();
    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
    
                }while(yn3.equalsIgnoreCase("y"));
            }
    
            else if(pilihan==4)//supplier
            {
                String yn5="y";
                do{
                    menuSupplier();
    
                    int pilihanspl = 0;
                    pilihanspl = input.nextInt();
    
                    if(pilihanspl==1)//tambah data supplier
                    {
                        String kodeSupplier;
                        String nama;
                        String Alamat;
                        String noTelp;
    
                        System.out.print("Kode supplier \t\t:\t");
                        kodeSupplier=input.next();
                        System.out.print("Nama supplier \t\t:\t");
                        nama=input.next();
                        System.out.print("Alamat supplier \t:\t");
                        Alamat=input.next();
                        System.out.print("Nomor telepon \t\t:\t");
                        noTelp=input.next();
    
                        supplier.add(new Supplier(kodeSupplier, nama, Alamat, noTelp));
                        System.out.println("Data Berhasil Ditambahkan");
                    }
                    else if(pilihanspl==2)//tampilkan data supplier
                    {
                        cetakDataSupplier(supplier);
                    }
    
                    else if(pilihanspl==3)//keluar
                    {
                        break;
                    }
    
                    else{
                        continue;
                    }
    
                    System.out.print("kembali ke menu Supplier? (y/n): ");
                    yn5=input.next();
    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
    
                }while(yn5.equalsIgnoreCase("y"));
            }
    
            else if(pilihan==5)//pembayaran
            {
                String yn6="y";
                do{
                    menuPembayaran();
    
                    int pilihanpby = 0;
                    pilihanpby = input.nextInt();
    
                    if(pilihanpby==1)//tambah data pembayaran
                    {
                        int kodePembayaran;
                        long Harga;
                        String itemName;
                        String kodeTransaksi;
    
                        System.out.print("Kode Pembayaran \t:\t");
                        kodePembayaran=input.nextInt();
                        System.out.print("Harga Barang \t\t:\t");
                        Harga=input.nextLong();
                        System.out.print("Nama Barang \t\t:\t");
                        itemName=input.next();
                        System.out.print("Kode Transaksi \t\t:\t");
                        kodeTransaksi=input.next();
                        payment.add(new Payment(kodePembayaran, Harga, itemName, kodeTransaksi));
                        System.out.println("Data sukses ditambahkan");
                    }
    
                    else if(pilihanpby==2)//tampilkan data pembayaran
                    {
                        cetakDataPembayaran(payment);
                    }    

                    else if(pilihanpby==3)//keluar
                    {
                        menu();
                    }
    
                    else{
                        continue;
                    }
    
                    System.out.print("kembali ke Menu Pembayaran? (y/n): ");
                    yn6=input.next();
    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
    
                }while(yn6.equalsIgnoreCase("y"));
            }
    
            else if(pilihan==6)//keluar
            {
                break;
            }
    
            else{
                continue;
            }
    
            System.out.print("kembali ke Menu Utama? (y/n): ");
            yn=input.next();
    
            System.out.print("\033[H\033[2J");
            System.out.flush();
    
        }
        while(yn.equalsIgnoreCase("y"));
    }
            

    public static void menu()
    {System.out.println("Penerimaan Barang");
    System.out.println("1. Data pegawai");
    System.out.println("2. Data penerimaan");
    System.out.println("3. Data barang");
    System.out.println("4. Data supplier");
    System.out.println("5. Data pembayaran");
    System.out.println("6. Keluar");
    System.out.print("Masukkan Pilihan Anda: ");}
    public static void menuPegawai()
    { System.out.println("Data Pegawai");
    System.out.println("1. Tambah data pegawai");
    System.out.println("2. Tampilkan data pegawai");
    System.out.println("3. Keluar");
    System.out.print("Masukkan Pilihan Anda: "); }
    public static void menuBarang()
    {System.out.println("Data Barang");
    System.out.println("1. Tambah data barang");
    System.out.println("2. Tampilkan data barang");
    System.out.println("3. Barang yang paling sering di terima");
    System.out.println("4. Keluar");
    System.out.print("Masukkan Pilihan Anda: ");}

    public static void menuBarangyangDiterima()
    {System.out.println("Data Barang yang diterima");
    System.out.println("1. Tambah data barang yang diterima");
    System.out.println("2. Tampilkan data barang yang diterima");
    System.out.println("3. Histori pemasukan barang yang diterima");
    System.out.println("4. Keluar");
    System.out.print("Masukkan Pilihan Anda: ");}
    public static void menuSupplier()
    {System.out.println("Data supplier");
    System.out.println("1. Tambah data supplier");
    System.out.println("2. Tampilkan data supplier");
    System.out.println("3. Keluar");
    System.out.print("Masukkan Pilihan Anda: ");}

    public static void menuPembayaran()
    {System.out.println("Data pembayaran");
    System.out.println("1. Tambah data pembayaran");
    System.out.println("2. Tampilkan data pembayaran");
    System.out.println("3. Keluar");
    System.out.print("Masukkan Pilihan Anda: ");}

    public static void cetakDataPegawai (ArrayList <Employee> employees){
        System.out.println ("------------------------------------------------");
        for (Employee employee : employees) 
        {
            System.out.println(employee);
        }
        System.out.println("-------------------------------------------------");
    }

    public static void cetakBuktiTerimaBarang (ArrayList <ReceivingItem> receivingItems){
        System.out.println ("------------------------------------------------");
        for (ReceivingItem receivingItem : receivingItems) 
        {
            System.out.println(receivingItem);
        }
        System.out.println("-------------------------------------------------");
    }

    public static void cetakDataBarang (ArrayList <Item> items){
        System.out.println ("------------------------------------------------");
        for (Item item : items) 
        {
            System.out.println(item);
        }
        System.out.println("-------------------------------------------------");
    }
    public static void cetakDataSupplier (ArrayList <Supplier> supplier){
        System.out.println ("------------------------------------------------");
        for (Supplier supplier2 : supplier) 
        {
            System.out.println(supplier2);    
        }     
        System.out.println("-------------------------------------------------");
    }
    public static void cetakDataPembayaran (ArrayList <Payment> payment){
        System.out.println ("------------------------------------------------");
        for (Payment payment2 : payment)
        {
            System.out.println(payment2);  
        }
        System.out.println("-------------------------------------------------");
    }
    public static void historipenerimaanbrg (ArrayList <ReceivingItem> receivingItems)
    {
        System.out.print("Masukkan Kode Penerimaan Barang : ");
        Scanner input = new Scanner(System.in);
        String Kdrcv;
        Kdrcv = input.next();
        for (ReceivingItem rcv : receivingItems) {
            if (rcv.getKodeReceiving().equals(Kdrcv))
            System.out.println("Histori Berdasarkan Inputan : \n" + "Kode Receiving\t\t: \t" + rcv.getKodeReceiving() + "\nKuantitas \t\t:\t" + rcv.getKuantitiTerima() + "\nHarga Satuan \t\t:\t" + rcv.getHargaSatuan() + "\nTotal Pembelanjaan\t:\t" + rcv.getTotal());
        }
    }


    public static void penerimaanbarangterbanyak (ArrayList <Item> item)
    {
        int terbanyak=0;
        for (Item rcv1 : item) {
            if(rcv1.getStock() > terbanyak)
            {
                terbanyak = rcv1.getStock();
            }
        }
        String nilai = Integer.toString(terbanyak);
        //System.out.println(nilai);
        for (Item rcv : item) 
        {
            if(rcv.getStock()==terbanyak){
                System.out.println("Barang paling banyak diterima : \n" + "Kode Item\t\t: \t" + rcv.getKodeItem() + "\nNama Item \t\t:\t" + rcv.getNamaItem() + "\nKategori \t\t:\t" + rcv.getKategori() + "\nStock\t\t\t:\t" + rcv.getStock());
            }
        }
        
    }
}