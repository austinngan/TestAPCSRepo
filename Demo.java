public class Demo{
  public static void main(String[]args){
    int num = 0;
    int[][] a1={ {1,2,3}, {4,5,6}, {2} };
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
    public static String arrToString(int[] arr){
      String str="{";
      if (arr.length==0){
        return "{}";
      }
      for (int i=0;i<arr.length;i++){
        str=str+arr[i]+", ";
        if (i==arr.length-1){
          str=str+"}";
          str=str.substring(0,str.length()-3)+"}";
        }
      }
      return str;
    }
    public static String arrayDeepToString(int[][] arr){
      String newstring="";
      for (int r=0;r<arr.length;r++){
        newstring=newstring+Demo.arrToString(arr[r])+" \n";
      }
      return newstring;
    }
    public static int[][] create2DArray(int rows, int cols, int maxvalue){
      int[][] arr=new int[rows][cols];
      for (int i=0;i<arr.length;i++){
        for (int y=0;y<arr[i].length;y++){
          arr[i][y]=((int)(Math.random()*(maxvalue+1)));
        }
      }
      return arr;
    }
    public static int[][] create2DArrayRandomized(int rows, int cols, int maxvalue){
      int[][] arr=new int[rows][];
      for (int i=0;i<arr.length;i++){
        arr[i]=new int[cols];
        cols=(int)(Math.random()*cols);
        for (int y=0;y<arr[i].length;y++){
          arr[i][y]=((int)(Math.random()*maxvalue));
        }
      }
      return arr;
    }
  }
