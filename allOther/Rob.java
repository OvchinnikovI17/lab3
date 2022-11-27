package allOther;

public class Rob implements Start{

    private Boolean status = false;
    private String result = null;

    public Rob(Boolean status) {
        this.status = status;
    }

    public Boolean getStatus() {
        return status;
    }

    public String getResult() {
        start();
        return result;
    }

    @Override
    public void start() {
        if (this.status) {
            this.result = "Ограбление началось";
        }else{
            this.result = "Ограбление не происходит";
        }
    }
}