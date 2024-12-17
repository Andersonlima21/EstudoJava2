package br.alura.aula.objeto;

public class Obj2 extends Heranca{
    String obj2;
    int intTesteObj2;
    double doubleValorTesteObj2;

    public String getObj2() {
        return obj2;
    }

    public void setObj2(String obj2) {
        this.obj2 = obj2;
    }

    public int getIntTesteObj2() {
        return intTesteObj2;
    }

    public void setIntTesteObj2(int intTesteObj2) {
        this.intTesteObj2 = intTesteObj2;
    }

    public double getDoubleValorTesteObj2() {
        return doubleValorTesteObj2;
    }

    public void setDoubleValorTesteObj2(double doubleValorTesteObj2) {
        this.doubleValorTesteObj2 = doubleValorTesteObj2;
    }

    @Override
    public int getTotalDeValoresEnviados() {
        return (int) (intTesteObj2 * doubleValorTesteObj2);
    }
}
