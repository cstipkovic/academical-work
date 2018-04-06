package services;

public interface IBanco {
    
    void deposito(Integer conta, Float valor);
    void saque(Integer conta, Float valor);
    void transferencia(Integer conta_origem, Integer conta_dest, Float valor);
    Float saldo(Integer conta);
    
}
