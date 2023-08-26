package com.workintech.employeeApp.main;

import com.workintech.employeeApp.enums.Plan;
import com.workintech.employeeApp.model.Company;
import com.workintech.employeeApp.model.Employee;
import com.workintech.employeeApp.model.HealthPlan;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        HealthPlan plan1=new HealthPlan(1,"X sigorta", Plan.ADVANCED);
        HealthPlan plan2=new HealthPlan(2,"Y sigorta", Plan.NORMAL);

        String[] healthplans=new String[3];
        //[healthplans,null,null]
        healthplans[0]=plan1.getName();
        healthplans[1]=plan2.getName();

        Employee developer=new Employee(1,"Ali Veli","ali@veli.com","12345",healthplans);
        developer.addHealthplan(3,"X Sigorta ");
        System.out.println(developer );

        String[] developerNames=new String[5];
        developerNames[0]=developer.getFullName();

        Company company=new Company(1,"Workintech",10000000,developerNames);
        System.out.println(company);
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {

        workWithData();
    }
}
