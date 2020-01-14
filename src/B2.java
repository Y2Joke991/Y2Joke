public class B2 extends A2 {
    int total;

    void sum() {
        this.total = i2 + j2; //Ошибка: j недоступен в этом классе
    }
}
