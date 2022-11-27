package allOther;

public class StockExchange implements Describable{
    private int amount = 10;
    private int money = 50;

    public int getAmount() {
        return this.amount;
    }

    public Integer getMoney() {
        return this.money;
    }

    public String sell(int howMany, Alone aln) {
        int num = howMany;
        String forReturn = "";
        if (this.amount >= num){
            this.amount = this.amount - num;
            this.money = this.money + num;
            forReturn = "Продано " + String.valueOf(num) + " акций Получено " + String.valueOf(num) + " денег. Текущее биржевая ликивдность: " +  this.amount + " - кол-во акций, " + this.money + " кол-во денежных активов";
            return forReturn;
        }else{
            forReturn = "Ошибка, акций меньше, чем вы хотите продать";
            return forReturn;
        }
    }

    public String buy(int howMany, Alone aln) {
        int num = howMany;
        String forReturn = "";
        if (this.money >= num){
            this.amount = this.amount + num;
            this.money = this.money - num;
            forReturn = aln.getName() + " купил " + String.valueOf(num) + " акций, потрачено " + String.valueOf(num) + " денег. Текущее биржевая ликивдность: " +  this.amount + " - кол-во акций, " + this.money + " кол-во денежных активов";
            return forReturn;
        }else{
            forReturn = "Ошибка, денег меньше, чем вы хотите купить";
            return forReturn;
        }
    }

    @Override
    public String describe() {
        String forReturn = "";
        forReturn = "Имеется " + String.valueOf(this.amount) + " акций и" + String.valueOf(this.money) + " денег";
        return forReturn;
    }

}
