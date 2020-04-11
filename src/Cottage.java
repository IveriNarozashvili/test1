import java.util.Objects;

public class Cottage {

    private String var1;
    private  String var2;

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public String getVar2() {
        return var2;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cottage cottage = (Cottage) o;
        return Objects.equals(var1, cottage.var1) &&
                Objects.equals(var2, cottage.var2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(var1, var2);
    }

    @Override
    public String toString() {
        return "Cottage{" +
                "var1='" + var1 + '\'' +
                ", var2='" + var2 + '\'' +
                '}';
    }



}
