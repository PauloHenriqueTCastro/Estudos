public class Atividade {
    public static void main(String[] args) {
        complicatedPrint();
    }
    public static void simplePrint(){
        for(int i = 0; i <=100; i+=2){
            System.out.println(i);
        }
    }

    public static void complicatedPrint() {
        int count = 0;
        do{
            count ++;
            if(count % 2 == 0 ){
                System.out.println(count);
            }

        } while(count <=100);
    }

}
