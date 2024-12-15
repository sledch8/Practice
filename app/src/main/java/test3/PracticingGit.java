package test3;

public class PracticingGit {
    private Boolean even_or_odd;

    public PracticingGit(){
        this.even_or_odd = true;
    }
    public Boolean foobar(int[] data){
        int sum = 0;
        for (int i=0; i< data.length; i++){
            sum = sum +data[i];
        }
        if (sum%2==0){
            return this.even_or_odd;
        }
        this.even_or_odd = false;
        return even_or_odd;
    }
    
}
