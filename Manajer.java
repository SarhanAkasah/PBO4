
public class Manajer 
{
    protected String nama;
    protected String gaji;
   
    public Manajer (String name, int gaji)
    {
        this.nama = nama;
        this.gaji = gaji;
    }
    
    public void naikkanGaji()
    {
        gaji+= 1000000;
    }
    public void cetakStatus()
    {
        System.out.println("name: " + nama);
        System.out.println("gaji: " + gaji);
    }
            }


