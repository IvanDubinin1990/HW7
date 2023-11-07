import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )
        boolean isCanMake = false;

        System.out.println("Введите количество жибьих глаз: ");
        toadEyesCount = sc.nextInt();
        System.out.println("Введите количество слёз вурдалака: ");
        ghoulTearsCount = sc.nextInt();
        System.out.println("Введите количество костей ворона: ");
        ravenBonesCount = sc.nextInt();
        System.out.println("Введите количество пельменей: ");
        dumplingsCount = sc.nextInt();

        //todo реализовать ввод пользователем кол-ва ингредиентов.

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
            System.out.println("Вы можете приготовить элексир зоркости");
            isCanMake = true;
        }
        if (ravenBonesCount >= 2 && dumplingsCount >= 4) {
            System.out.println("Вы можете приготовить элексир стойкости");
            isCanMake = true;
        }
        if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
            System.out.println("Вы можете приготовить элексир скрытности");
            isCanMake = true;
        }
        if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3) {
            System.out.println("Вы можете приготовить запретный элексир");
            isCanMake = true;
        }
        if (isCanMake == false) {
            System.out.println("Вам не хватает ингридиентов ни на один элексир");
        }

        //todo дописать логику программы сюда
    }
}
