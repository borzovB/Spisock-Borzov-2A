package spisock;

import java.util.ArrayList;
/*Привязывается класс к основной программе.*/

public class Spisock {
    private String name;
    /*Хранение объекта из класса.*/
    private ArrayList<ludi>ludis = new ArrayList();
    /*Подключаем класс ludi.*/
    private Spisock(String name) {
        this.name = name;
    }
    
    private String printspisock() {
       /*Ввод элементов списка.*/
      StringBuilder d = new StringBuilder(); 
      /*Создание строк состоящий из строк(текста).*/
      for(ludi t: ludis){
          /*Проходим по списку.*/
          d.append(t).append("\n");
      }
      return d.toString();
      /*Возвращает строковый тип.*/
    }
    private int dlina() {
      StringBuilder d = new StringBuilder(); 
      /*Вывод длины списка.*/
      int n=0;
      for(ludi t: ludis){
          n++;
      }
      return n;
    }
    
    public static void main(String[] args) {
       Spisock spicock1 = new Spisock("Rabotnick");
       /*Выделяем память под список.*/
       ludi r1 = new ludi(1,"Vlad","Borzov");
       /*Ввод данных в элемент списка.*/
       ludi r2 = new ludi(2,"Vlad","Borzov");
       ludi r3 = new ludi(3,"Vlad","Borzov");
       ludi r4 = new ludi(4,"Vlad","Borzov");
       ludi r5 = new ludi(5,"Vlad","Borzov");
       spicock1.ludis.add(r1);
       /*Ввод в класс элемента списка.*/
       spicock1.ludis.add(r2);
       spicock1.ludis.add(r3);
       spicock1.ludis.add(r4);
       spicock1.ludis.add(r5);
       System.out.println("Sposob1");
       /*Вывод списка на экран, каждый элемент отдельно.*/
       System.out.println(spicock1.ludis.get(0));
       System.out.println(spicock1.ludis.get(1));
       System.out.println(spicock1.ludis.get(2));
       System.out.println(spicock1.ludis.get(3));
       System.out.println(spicock1.ludis.get(4));
       System.out.println("\n");
       System.out.println("Sposob2");
       /*Вывод списка на экран, используя массив из элементов, как одимн объект.*/
       System.out.println(spicock1.printspisock());
       System.out.println("Dlina Spiscka");
       /*Вывод длины списка.*/
       System.out.println(spicock1.dlina());
       System.out.println("Sposob bez odnogo alement1");
       spicock1.ludis.remove(r3);
       /*Удаляем произвольный элемент массива, с указанием номера элемеента.*/
       System.out.println(spicock1.printspisock());
       System.out.println("Sposob bez odnogo alement2");
       spicock1.ludis.remove(r3);
       spicock1.ludis.remove(r1);
       System.out.println(spicock1.printspisock());
       ludi r01 = new ludi(14,"Vlad","Borzov");
       ludi r02 = new ludi(14,"Vlad","Borzov");
       ludi r03 = new ludi(14,"Vlad","Borzov");
       ludi r04 = new ludi(14,"Vlad","Borzov");
       ludi r05 = new ludi(14,"Vlad","Borzov");
       ludi r06 = new ludi(14,"Vlad","Borzov");
       ludi r07 = new ludi(14,"Vlad","Borzov");
       ludi r08 = new ludi(14,"Vlad","Borzov");
       spicock1.ludis.add(r01);
       spicock1.ludis.add(r02);
       spicock1.ludis.add(r03);
       spicock1.ludis.add(r04);
       spicock1.ludis.add(r05);
       spicock1.ludis.add(r06);
       spicock1.ludis.add(r07);
       spicock1.ludis.add(r08);
       System.out.println("Sposob 3");
       System.out.println(spicock1.printspisock());
       System.out.println("Dlina Spiscka");
       System.out.println(spicock1.dlina());
    }
    
}
