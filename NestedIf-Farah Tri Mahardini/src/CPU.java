import java.text.NumberFormat;
import java.util.Locale;
public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }
    public class Processor {
        int cores;
        String manufacturer;
        String name;

        Processor(int cores, String manufacturer, String name) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name);
        }
    }

    public class RAM {
        int jumlahRAM;
        String manufacturer;

        RAM(int jumlahRAM, String manufacturer) {
            this.jumlahRAM = jumlahRAM;
            this.manufacturer = manufacturer;
        }

        public void getInfoRAM() {
            System.out.println("Jumlah RAM: " + this.jumlahRAM);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public class Harddisk {
        int kapasitas;
        String manufacturer;
        String type;

        Harddisk(int kapasitas, String manufacturer, String type) {
            this.kapasitas = kapasitas;
            this.manufacturer = manufacturer;
            this.type = type;
        }

        public void getInfoHarddisk() {
            System.out.println("Kapasitas:" + this.kapasitas + "GB");
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Tipe: " + this.type);
        }
    }

    public class Motherboard{
        String manufacturer;
        String chipset;

        Motherboard(String manufacturer, String chipset){
            this.manufacturer = manufacturer;
            this.chipset = chipset;
        }

        public void getInfoMotherboard(){
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Chipset: " + this.chipset);
        }
    }

    public class PowerSupply{
        int wattage;
        String manufacturer;

        PowerSupply(int wattage, String manufacturer){
            this.wattage = wattage;
            this.manufacturer = manufacturer;
        }
        public void getInfoPowerSupply(){
            System.out.println("Wattage: " + this.wattage + "W");
            System.out.println("Pabrik: " +this.manufacturer);
        }
    }

    public class VGACard{
        String manufacturer;
        String model;
        int memorySize;

        VGACard(String manufacturer, String model, int memorySize) {
            this.manufacturer = manufacturer;
            this.model = model;
            this.memorySize = memorySize;
        }

        public void getInfoVGACard(){
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Model: " + this.model);
            System.out.println("Memori: " + this.memorySize + "GB");
        }
    }
    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("Komputer Merek: " + this.merek);

        // menuliskan harga yang double ke dalam format rupiah
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }
}