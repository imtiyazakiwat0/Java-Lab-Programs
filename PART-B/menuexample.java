import java.awt.*;  
class menuexample  
{  
 menuexample(){  
         Frame f= new Frame("Menu and MenuItem Example");  
         MenuBar mb=new MenuBar();  
         Menu menu=new Menu("Degree Courses");  
         Menu submenu=new Menu("Science");  
         MenuItem i1=new MenuItem("BCA");  
         MenuItem i2=new MenuItem("BBA");  
         MenuItem i3=new MenuItem("BCom");  
         MenuItem i4=new MenuItem("BSc");  
         MenuItem i5=new MenuItem("Msc");  
         menu.add(i1);  
         menu.add(i2);  
         menu.add(i3);  
         submenu.add(i4);  
         submenu.add(i5);  
         menu.add(submenu);  
         mb.add(menu);  
         f.setMenuBar(mb);  
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true);  
}  

public static void main(String args[])  
{  
new menuexample();  
}  
}  

