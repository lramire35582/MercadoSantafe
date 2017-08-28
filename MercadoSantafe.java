import java.util.*;

public class MercadoSantafe
{
    private int x;
    
    public static void main(String[] args){
      int cant;
      double comision1=0 , comision2=0, comision3=0, tcomision=0;
      int vcont=0;
      int vcred=0;
      int vcuot=0;
      int total = 0;
      int tip1=0, tip2=0, tip3=0;
      Scanner teclado = new Scanner(System.in);
    
      System.out.println(" Número de ventas al día");
      cant = teclado.nextInt();
      //System.out.println("\n");
      
      for(int i=1; i<=cant; i++){
        System.out.println(" Ingrese el valor de la Venta N° (" +(i)+ ")");
        int valor = teclado.nextInt();
        System.out.println("\n");
        System.out.println(" Ingrese tipo de pago");
        System.out.println(" (1) Si es contado");
        System.out.println(" (2) Si es tarjeta crédito");
        System.out.println(" (3) Si es por cuotas");
        int tipo = teclado.nextInt();
        System.out.println("\n");
        
        if(tipo==1){
        vcont = vcont + valor;
        total = valor + total;
        comision1 = comision1 + valor * 0.05;
        tip1++;
        }
        if(tipo==2){
        vcred = vcred + valor;
        total = valor + total;
        comision2 = comision2 + valor * 0.03;
        tip2++;
        }
        if(tipo==3){
        vcuot = vcuot + valor;
        total = valor + total;
        comision3 = comision3 + valor * 0.02;
        tip3++;
        }
        while(tipo==0||tipo>3){
        System.out.println(" El tipo no es valido, ingrese uno valido");
        System.out.println("\n");
        System.out.println(" Ingrese tipo de pago");
        System.out.println(" (1) Si es contado");
        System.out.println(" (2) Si es tarjeta crédito");
        System.out.println(" (3) Si es por cuotas");
        tipo = teclado.nextInt();
        System.out.println("\n");
        }
        }
        System.out.println("\n");
        System.out.println(" Monto de ventas de contado : "+vcont);
        System.out.println(" Monto de ventas a credito : "+vcred);
        System.out.println(" Monto de ventas a cuotas   : "+vcuot);
        System.out.println(" Cantidad de ventas de contado : "+tip1);
        System.out.println(" Cantidad de ventas a crédito  : "+tip2);
        System.out.println(" Cantidad de ventas a cuotas   : "+tip3);
        System.out.println(" Comisión de ventas a contado  : "+comision1);
        System.out.println(" Comisión de ventas a crédito  : "+comision2);
        System.out.println(" Comisión de ventas a cuotas   : "+comision3);
        System.out.println(" Total comisiones   : "+(comision1+comision2+comision3)+"");
        System.out.println(" Total monto de ventas   : "+total);
    }
}
