/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_3;

/**
 *
 * @author WIN-10
 */
public class Modelo {

    private float salario;
    private float nomina;
    private float seguroSocial;
    private float retencion;
    private float total;
    private int horasExtras;
    private int horasTrabajadas;
    private int valorHoras;

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * @return the nomina
     */
    public float getNomina() {
        return nomina;
    }

    /**
     * @param nomina the nomina to set
     */
    public void setNomina(float nomina) {
        this.nomina = nomina;
    }

    /**
     * @return the seguroSocial
     */
    public float getSeguroSocial() {
        return seguroSocial;
    }

    /**
     * @param seguroSocial the seguroSocial to set
     */
    public void setSeguroSocial(float seguroSocial) {
        this.seguroSocial = seguroSocial;
    }

    /**
     * @return the retencion
     */
    public float getRetencion() {
        return retencion;
    }

    /**
     * @param retencion the retencion to set
     */
    public void setRetencion(float retencion) {
        this.retencion = retencion;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }

    /**
     * @return the horasTrabajadas
     */
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    /**
     * @param horasTrabajadas the horasTrabajadas to set
     */
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * @return the valorHoras
     */
    public int getValorHoras() {
        return valorHoras;
    }

    /**
     * @param valorHoras the valorHoras to set
     */
    public void setValorHoras(int valorHoras) {
        this.valorHoras = valorHoras;
    }

    /**
     * @return the horasExtras
     */
    public int getHorasExtras() {
        return horasExtras;
    }

    /**
     * @param horasExtras the horasExtras to set
     */
    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;

    }

    public float calcularSueldo() {

        salario = valorHoras * horasTrabajadas;

        if (salario < 1000000 && horasTrabajadas > 48) {

            horasExtras = (horasTrabajadas - 48) * (2 * (valorHoras));
            seguroSocial = salario * 5 / 100;

            nomina = salario + horasExtras - seguroSocial;

        } else if (salario > 1000000 && salario < 2000000 && horasTrabajadas > 48) {

            horasExtras = (horasTrabajadas - 48) * (2 * (valorHoras));
            seguroSocial = (salario * 7) / 100;

            nomina = salario + horasExtras - seguroSocial;

        } else if (salario > 2000000 && salario < 10000000 && horasTrabajadas > 48) {

            horasExtras = horasTrabajadas - 48 * 2 * horasExtras;
            seguroSocial = salario * 8 / 100;

            nomina = salario + horasExtras - seguroSocial;

        } else if (salario > 10000000 && horasTrabajadas > 48) {

            retencion = salario * 10 / 100;

            horasExtras = horasTrabajadas - 48 * 2 * valorHoras;

            seguroSocial = salario * 8 / 100;

            nomina = salario + horasExtras - seguroSocial - retencion;

        } else if (salario < 1000000 && horasTrabajadas < 48) {

            seguroSocial = salario * 5 / 100;

            nomina = salario - seguroSocial;

        } else if (salario < 2000000 && salario > 1000000 && horasTrabajadas < 48) {

            seguroSocial = salario * 7 / 100;

            nomina = salario - seguroSocial;

        } else if (salario > 2000000 && horasTrabajadas < 48) {

            seguroSocial = salario * 8 / 100;

            nomina = seguroSocial - salario;

            return nomina;

        } else if (salario > 10000000 && horasTrabajadas < 48) {

            retencion = salario * 10 / 100;

            seguroSocial = salario * 8 / 100;

            nomina = salario - retencion;

        }
        return nomina;

    }
}
