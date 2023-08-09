public class Motor {

    private TipoCombustivel tipoMotor;
    private int consumo; // em quilometros por unidade. Ex: Km/Lt
    private int quilometragem;
    private int consumoInicial;

    public Motor(TipoCombustivel tipoMotor, int consumo) {
        this.tipoMotor = tipoMotor;
        this.consumo = consumo;
    }

    public Motor(TipoCombustivel tipoMotor, int consumo, int consumoInicial) {
        this.consumoInicial = consumoInicial;
        this.tipoMotor = tipoMotor;
        this.consumo = consumo;
    }

    public int getConsumo() {
        return this.consumo;
    }

    public TipoCombustivel getTipoMotor() {
        return this.tipoMotor;
    }

    public int getQuilometragem() {
        return this.quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public int combustivelNecessario(int distancia) {
        return distancia / consumo;
    }

    public void percorre(int distancia) {
        quilometragem += distancia;
    }

    public void checaEco(){
        if(this.getQuilometragem() >= 5000){
            int consumoDelta = this.getQuilometragem() / 5000;
            if(consumoDelta < 10){
                int aux = consumoInicial - consumoDelta;
                this.setQuilometragem(aux);
            }
        }
    }

    @Override
    public String toString() {
        return "Motor [consumo=" + consumo + ", quilometragem=" + quilometragem + ", tipoMotor=" + tipoMotor + "]";
    }
}