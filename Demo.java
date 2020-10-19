public class Demo{
  public static void main(String[]args){
    int num = 0;
    String abba="";
    if (args.length==0){
      num=5;
    }
    else{
    num = Integer.parseInt(args[0]);
  }
      Demo.printLoop(num);
    }
  public static void printLoop(int x){
    for (int y=1;y<=x;y++){
      for (int i=0;i<=x-y;i++){
        System.out.print(y);
        }
        System.out.println();
      }
    }
  }
