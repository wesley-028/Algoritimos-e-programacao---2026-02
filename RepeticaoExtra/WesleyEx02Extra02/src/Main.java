void main(){
    for(int i=1; i<=100; i++){
        if(i % 2!=0){
            System.out.printf("\nNúmero: %d --- Seu quadrado: %d",i, i*i);
        }else{
            System.out.printf("\nNúmero: %d --- Seu cubo: %d",i, i*i*i);
        }
    }
}