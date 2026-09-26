//País A: 80.000 habitantes, País B: 200.000 habitantes
//País A crescimento de 3%, País B crescimento de 1,5%
void main() throws InterruptedException{
    double populacaoPaisA, populacaoPaisB, anosNecessario;
    populacaoPaisA=80000;
    populacaoPaisB=200000;
    anosNecessario=0;
    do {
        populacaoPaisA*=1.03;
        populacaoPaisB*=1.015;
        anosNecessario++;
        System.out.printf("\rAno: %.0f | População país A: %.0f | População país B: %.0f",anosNecessario,populacaoPaisA, populacaoPaisB);

        Thread.sleep(100);
    }while (populacaoPaisB>populacaoPaisA);
    System.out.printf("\nForam necessários %.0f anos para população do País A ser maior do que a população do país B!", anosNecessario);
    System.out.printf("\nPopulação país A: %.0f\nPopulação país B: %.0f", populacaoPaisA,populacaoPaisB);
}