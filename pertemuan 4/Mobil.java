class Mobil {
    private Engine mesin;
    public int status;

    public Mobil() {
        mesin = new Engine();
    }

    public void Start() {
        mesin.On();
    }

    public void Run() {
        System.out.println("Run..!");
    }

    public void Stop() {
        mesin.Off();
    }
}