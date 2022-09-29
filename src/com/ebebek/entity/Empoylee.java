package com.ebebek.entity;

public class Empoylee {

    private String name;
    private double salary;//
    private double workHours;
    private int hireYear;

    /**
     * Maaştan vergiyi kesip kesilen vergi miktarını geriye döner
     */
    public double tax(){
        if (this.salary > 1000){
            double tax = this.salary*3 / 100;
            this.salary = this.salary - tax;
            return tax;
        }
        return 0;
    }

    /**
     * Fazladan çalışılan her saat maaşa eklenir. Maaşa eklenen bonus geriye döndürülür.
     */
    public double bonus(){
        if(this.workHours > 40){
            double bonus = (this.workHours-40) * 30;
            this.salary += bonus;
            return bonus;
        }
        return 0;
    }

    /**
     * Yapılan zamlar maaşa eklenir. Yapılan zam değeri geriye döndürülür.
     */
    public double raiseSalary(){
     int workedYear = 2021 - this.hireYear;
     double extra = 0;


     if(workedYear < 10){
          extra = this.salary*5/100;
     }else if(9 <  workedYear && workedYear < 20){
         extra = this.salary*10/100;
     }else if(workedYear > 19){
         extra = this.salary*15/100;
     }

     this.salary += extra;

     return extra;
    }


    /**
     * Sizden konsol çıktısı halinde Adı, maaşı, çalışma saati, başlangıç yılı, vergi, bonus, maaş artışı, vergi ve bonuslarla birlikte maaş, toplam maaş değerlerini konsola yazdırmanızı bekliyoruz.
     *
     *
     * Konsol çıktısı olarak istenildiği için tax-bonus-raiseSalary metotlarını toString içerisinde çalıştırdım.
     * toString metodu çalıştığı zaman önce vergi kesilecek sonra bonus eklenecek ondan sonra da maaş yükseltme yapılıp
     * maaşın son durumu (final salary) konsola çıktı olarak verilecek.
     * @return
     */
    @Override
    public String toString() {
        return "Empoylee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                ", tax=" + tax() +
                ", bonus=" + bonus() +
                ", raise salary=" + raiseSalary() +
                ", final salary=" + salary +
                '}';
    }

    public Empoylee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
}
