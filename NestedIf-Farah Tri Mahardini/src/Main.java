public class Main {
    public static void main(String[] args) {
        // buat object CPU
        CPU myKomputer = new CPU(15000000, "Lenovo");

        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");

        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");

        CPU.Harddisk hdd1TB = myKomputer.new Harddisk(1000,"Seagate","HDD");

        CPU.VGACard gtx1050ti = myKomputer.new VGACard("NVIDIA","GTX 1050 Ti",4);

        CPU.Motherboard asusPrimerB360M = myKomputer.new Motherboard("ASUS","Prime B360M");

        CPU.PowerSupply corsairRM650 = myKomputer.new PowerSupply(650, "Corsair");

        myKomputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getInfoRAM();
        hdd1TB.getInfoHarddisk();
        gtx1050ti.getInfoVGACard();
        asusPrimerB360M.getInfoMotherboard();
        corsairRM650.getInfoPowerSupply();
    }
}