public class Board_path_2d {
    public static void Path(int cc,int cr,int dc,int dr,String ans){
        if (cc>dr||cr>dr){
            return;
        }if(cc==dr && cr==dr){
            System.out.println(ans);;
            return;
        }
        Path(cc+1,cr,dc,dr,ans+"v");
        Path(cc,cr+1,dc,dr,ans+"h");
    }
    public static void main(String args[]){
        int dc=2;
        int dr=2;
        Path(0,0,2,2,"");
    }
}
