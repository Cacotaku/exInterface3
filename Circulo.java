import java.lang.Math;

public  class Circulo implements Area
{
    int raio;


    public int getRaio()
    {
        return raio;
    }

    public void setRaio(int raio)
    {
        this.raio = raio;
    }

    public float valorArea()
    {
        return (float) Math.PI * (raio * raio);

    }

}