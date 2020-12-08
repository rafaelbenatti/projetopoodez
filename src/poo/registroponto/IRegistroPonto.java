package poo.registroponto;

import poo.funcionario.Funcionario;
import java.time.LocalDate;
import java.time.LocalDateTime;

public interface IRegistroPonto {
    long getIdRegPonto();
    void setIdRegPonto(long idRegPonto);
    Funcionario getFunc();
    void setFunc(Funcionario func);
    LocalDate getData();
    void setDataRegistro(LocalDate dataRegistro);
    LocalDateTime getHoraEntrada();
    void setHoraEntrada(LocalDateTime horaEntrada);
    LocalDateTime getHoraSaida();
    void setHoraSaida(LocalDateTime horaSaida);
    void apresentarRegistroPonto();

}
