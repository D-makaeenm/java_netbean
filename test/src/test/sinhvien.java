package test;

import java.util.Scanner;

public class sinhvien{
        private String masv;
        private String tensv;
        private String diachi;
        private String gioitinh;
        private String khoa;
        private float diem1,diem2,diem3;
        public float diemtb = diemtb();
    public sinhvien() {
        
    }
    
    public sinhvien(String masv, String tensv, String diachi, String gioitinh, String khoa, float diem1, float diem2, float diem3){
        this.masv = masv;
        this.tensv = tensv;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.khoa = khoa;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.diemtb = diemtb();
    }
    public static sinhvien/*void*/ inputsinhvien (/*sinhvien[] danhsachsv, Scanner sc*/){
        //for(int i = 0; i < danhsachsv.length; i++){
            //danhsachsv[i] = new sinhvien();
            Scanner sc = new Scanner(System.in); //
            //System.out.println("Nhap thong tin sinh vien thu " + i);
            System.out.print("|\tMa sinh vien:  ");
            String masv = sc.nextLine();
            System.out.print("|\tTen sinh vien: "); 
            String tensv = sc.nextLine();
            System.out.print("|\tDia chi:       ");
            String diachi = sc.nextLine();
            System.out.print("|\tGioi tinh:     ");
            String gioitinh = sc.nextLine();
            System.out.print("|\tKhoa:          ");
            String khoa = sc.nextLine();
            System.out.print("|\tDiem 1:        ");
            float diem1 = sc.nextFloat();
            System.out.print("|\tDiem 2:        ");
            float diem2 = sc.nextFloat();
            System.out.print("|\tDiem 3:        ");
            float diem3 = sc.nextFloat();
            System.err.println("------------------------------------");
            //danhsachsv[i] = new sinhvien();
            return new sinhvien(masv, tensv, diachi, gioitinh, khoa, diem1, diem2, diem3);
       // }
    }
    
    public void hienthitt(){
        System.out.println("--------------------NAME CARD--------------------");
        System.out.println("|Ma sinh vien:     " + masv+"                      ");
        System.out.println("|Ten sinh vien:    " + tensv+"                     ");
        System.out.println("|Dia chi:          " + diachi+"                    ");
        System.out.println("|Gioi tinh:        " + gioitinh+"                  ");
        System.out.println("|Khoa:             " + khoa+"                      ");
        System.out.println("|Diem 1:           " + diem1+"                     ");
        System.out.println("|Diem 2:           " + diem2+"                     ");
        System.out.println("|Diem 3:           " + diem3+"                     ");
        System.out.println("|Diem trung binh:  " + diemtb+"                    ");
        System.out.println("-------------------------------------------------");
    }
    
    public void hienthidtb(){
        System.out.println("\n------Diem trung binh------");
        System.out.println("|  Ten sinh vien: " + tensv);
        System.out.println("|  Diem trung binh: " + diemtb());
    }
    
    public void hienthidiem(String ten){
        ten = tensv;
        System.out.println("\n-----Thong tin-----");
        System.out.print("Ten sinh vien: " + ten +"\n" + "Diem1: " + diem1 +" ----- Diem2: " + diem2 + " ----- Diem3: "+diem3+"\n");
    }
    
    public void hienthisvnu(){
        System.out.println("\n----------Diem----------");
        System.out.println("|  Ten sinh vien: " + tensv);
        System.out.println("|  Diem trung binh: " + diemtb());
        System.out.println("|  Diem 1: " + diem1);
        System.out.println("------------------------");
    }
   
    public void hocbong(){
        if(diemtb() > 7.5 && (diem1 > 5 && diem2 > 5 && diem3 > 5)){
            System.out.println("---------------------------------------------------");
            System.out.println("            VINH DANH TINH THAN HAM HOC            ");
            System.out.println("\nTen sinh vien dat hoc bong: " + tensv);
            System.out.println("\nCo diem 1,2,3 lan luot la: " + diem1 +", "+ diem2 + " "+ diem3);
            System.out.println("\nCo diem tb la: " + diemtb());
            System.out.println("---------------------------------------------------");
        }  
    }
    
    public float diemtb(){
        return (diem1 + diem2 + diem3) /3;
    }
    
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap so sinh vien: ");
        n = sc.nextInt();
        sinhvien[] danhsachsv = new sinhvien[n];
        sinhvien sv = new sinhvien();
        //inputsinhvien(danhsachsv, sc);
        for(int i = 0; i < danhsachsv.length; i++){
            //danhsachsv[i].hienthitt();
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            danhsachsv[i] = sinhvien.inputsinhvien();
        }
        int lap = 1;
        while(lap == 1){
            System.out.println("--------------------------- MENU ---------------------------");
            System.out.println("| [1] Danh sach sinh vien dat hoc bong                     |");
            System.out.println("| [2] Sap xep danh sach sinh vien theo DTB tang dan        |");
            System.out.println("| [3] Danh sach nu sinh vien co diem TB > 7 va diem 1 > 6  |");
            System.out.println("| [4] Danh sach nu sinh vien dat hoc bong khoa Dien Tu     |");
            System.out.println("| [5] Hien thi thong tin sinh vien                         |");
            System.out.println("------------------------------------------------------------");
            System.out.print("Moi lua chon : ");
            int cauhoi = sc.nextInt();
            System.out.print("Ban da chon muc " + cauhoi + "\n");
            System.out.println("  ");
            switch(cauhoi){
                case 1 -> { //sinh vien dat hoc bong diem tb > 7 va diem 1,2,3 >= 5
                    System.out.println("----------Danh sach sinh vien dat hoc bong----------");
                    for(int i = 0; i < danhsachsv.length; i++){
                        if(danhsachsv[i].diemtb > 7){
                            if(danhsachsv[i].diem1 >= 5){
                                if(danhsachsv[i].diem2 >= 5){
                                    if(danhsachsv[i].diem3 >= 5){
                                        System.out.println(i+1 + ". "+danhsachsv[i].tensv);
                                    }
                                }
                            }
                        }
                    }
                    System.out.println(" ");
                    int stt;
                    System.out.println("Ban muon xem diem cua sinh vien co stt bao nhieu ?");
                    stt = sc.nextInt();
                    if(stt <= danhsachsv.length){
                        danhsachsv[stt-1].hocbong();
                    }
                    else{
                        System.out.println("Vi tri nay khong co sinh vien moi nhap lai");
                        System.out.print("Moi nhap stt: ");
                        stt = sc.nextInt();
                        danhsachsv[stt-1].hocbong();
                    }
                    break;
                }
                
                
                
                case 2 -> { // sap xep sinh vien theo diem trung binh tang dan
                    float tg;
                    String ten;
                    System.out.println("----------Danh sach sap xep theo DTB----------");
                    for(int i = 0; i < n - 1; i ++){
                        for(int j = 0; j < n - i - 1; j++){
                            if(danhsachsv[j].diemtb > danhsachsv[j+1].diemtb){
                                tg = danhsachsv[j].diemtb;
                                danhsachsv[j].diemtb = danhsachsv[j+1].diemtb;
                                danhsachsv[j+1].diemtb = tg;
                                ten = danhsachsv[j].tensv;
                                danhsachsv[j].tensv = danhsachsv[j+1].tensv;
                                danhsachsv[j+1].tensv = ten;
                            }
                        }
                    }
                    
                    for(int i =0; i < n ; i++){
                        System.out.println(i + 1 + ". "+ danhsachsv[i].tensv + " - Diem trung binh: " + danhsachsv[i].diemtb);
                    }
                    break;
                }

                case 3 -> { //In ra danh sach nu sinh vien dtb > 7 vs diem1 > 6
                    int stt;
                    String b1 = "nu";
                    String b2 = "Nu";
                    System.out.println("-----Danh sach nu sinh vien co dtb > 7 va diem 1 > 6-----");
                    for(int i =0; i < danhsachsv.length;i++){
                        if(danhsachsv[i].gioitinh.equals(b2) || danhsachsv[i].gioitinh.equals(b1)){
                            if(danhsachsv[i].diemtb > 7){
                                if(danhsachsv[i].diem1 > 6){
                                    System.out.println(i+1 + ". "+danhsachsv[i].tensv + " - Gioi tinh: " + danhsachsv[i].gioitinh);
                                }
                            }
                        }
                    }
                    System.out.println("\nBan muon xem diem TB va diem 1 cua sinh vien co stt bao nhieu ?");
                    stt = sc.nextInt();
                    if(stt <= danhsachsv.length){
                        danhsachsv[stt-1].hienthisvnu();
                    }
                    else{
                        System.out.println("Vi tri nay khong co sinh vien moi nhap lai");
                        System.out.print("Moi nhap stt: ");
                        stt = sc.nextInt();
                        danhsachsv[stt-1].hienthisvnu();
                    }
                }
                case 4 -> {
                    int stt;
                    String k1 = "dien tu";
                    String k2 = "Dien tu";
                    String k3 = "Dien Tu";
                    String k4 = "DT";
                    String k5 = "DIEN TU";
                    String b1 = "nu";
                    String b2 = "Nu";
                    System.out.println("-----Danh sach nu sinh vien dat hoc bong trong khoa Dien Tu-----");
                    for(int i =0; i < danhsachsv.length;i++){
                        if(danhsachsv[i].khoa.equals(k1)||danhsachsv[i].khoa.equals(k2)||danhsachsv[i].khoa.equals(k3)||danhsachsv[i].khoa.equals(k4)||danhsachsv[i].khoa.equals(k5))
                        {
                            if(danhsachsv[i].gioitinh.equals(b2) || danhsachsv[i].gioitinh.equals(b1)){
                                if(danhsachsv[i].diemtb > 7){
                                    if(danhsachsv[i].diem1 >= 5){
                                        if(danhsachsv[i].diem2 >= 5){
                                            if(danhsachsv[i].diem3 >= 5){
                                                System.out.println(i+1 + ". "+danhsachsv[i].tensv + " - Gioi tinh: " + danhsachsv[i].gioitinh);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    System.out.println("\nBan muon xem diem TB va diem 1 cua sinh vien co stt bao nhieu ?");
                    stt = sc.nextInt();
                    if(stt <= danhsachsv.length){
                        danhsachsv[stt-1].hienthisvnu();
                        System.out.println("|  Diem2: "+ danhsachsv[stt-1].diem2 + "\n|  Diem3: "+ danhsachsv[stt-1].diem3);
                        System.out.println("------------------------");
                    }
                    else{
                        System.out.println("Vi tri nay khong co sinh vien moi nhap lai");
                        System.out.print("Moi nhap stt: ");
                        stt = sc.nextInt();
                        danhsachsv[stt-1].hienthisvnu();
                        System.out.println("|  Diem2: "+ danhsachsv[stt-1].diem2 + "\n|  Diem3: "+ danhsachsv[stt-1].diem3);
                    }
                }
                case 5 -> {
                    int stt;
                    System.out.println("\nHien dang co " + danhsachsv.length + " sinhh vien");
                    System.out.println("-----Danh sach-----");
                    for(int i = 0; i < danhsachsv.length; i++){
                        System.out.println(i+1+". "+ danhsachsv[i].tensv);
                    }
                    System.out.println("\nBan muon xem thong tin chi tiet cua sinh vien co stt bao nhieu ?");
                    stt = sc.nextInt();
                    if(stt <= danhsachsv.length){
                        danhsachsv[stt-1].hienthitt();
                    }
                    else{
                        System.out.println("Vi tri nay khong co sinh vien moi nhap lai");
                        System.out.print("Moi nhap stt: ");
                        stt = sc.nextInt();
                        danhsachsv[stt-1].hienthitt();
                    }
                    //Case này ban đầu là hàm thêm sinh viên nhưng mà không làm được nên chuyển thành In thông tin sinh viên
                }
            }
            System.out.println("\nCo muon ve menu ?");
            System.out.println("Co = press 1, Khong = press 0");
            lap = sc.nextInt();
        }   
        
  
        //
    }
}

