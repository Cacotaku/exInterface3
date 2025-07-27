public class Triangulo implements Area
{
    int base;
    int altura;

    public int getBase()
    {
        return base;
    }

    public void setBase(int base)
    {
        this.base = base;
    }

    public int getAltura()
    {
        return altura;
    }

    public void setAltura(int altura)
    {
        this.altura = altura;
    }


    public float valorArea()
    {
        return (float) (0.5 * base * altura);

    }

}
