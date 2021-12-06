class Guru{
    protected String nama_guru;
        
    public Guru(String nama_guru){
        this.nama_guru = nama_guru;
    }

        public void infoGuru(){
        System.out.println("Saya adalah seorang Guru");
    }
}

class Mapel extends Guru{

    protected String nama_mapel;

    public Mapel (String nama_mapel, String nama_dosen){
        
        super(nama_dosen);
        this.nama_mapel = nama_mapel;
    }

    public void infoGuru(){
        System.out.println("Nama Guru : " + super.nama_guru);
        System.out.println("Mangajar Mata pelajaran : " + this.nama_mapel);
    }
    
}



class JamMengajar extends Guru{

    protected int jml_jam;

    public JamMengajar (int jml_jam, String nama_dosen){
        super(nama_dosen);
        this.jml_jam = jml_jam;
    }

    public void infoGuru(){
        System.out.println("Nama Guru : " + super.nama_guru);
        System.out.println("Jumlah jam mengajar : " + this.jml_jam + " Jam");
    }
}


public class Sekolah {
    public static void main(String[] args) {
        Guru guruku = null;

        Mapel mapel = new Mapel("Pemrograman Java", "Fatahilah");
        JamMengajar jml_jam = new JamMengajar(24, "Fatahilah");
        guruku = mapel;
        guruku.infoGuru();

        guruku = jml_jam;
        guruku.infoGuru();
    }
}




