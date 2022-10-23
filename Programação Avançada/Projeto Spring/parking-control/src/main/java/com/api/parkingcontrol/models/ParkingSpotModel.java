package com.api.parkingcontrol.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity //entidade
@Table(name = "TB_PARKING_SPOT") //tabela do bano de dados
public class ParkingSpotModel implements Serializable { //seriazable que
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id; //id

    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber; //número da vaga

    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar; //placa do carro

    @Column(nullable = false, unique = true, length = 70)
    private String brandCar; //marca do carro

    @Column(nullable = false, unique = true, length = 70)
    private String modelCar; //modelo do carro

    @Column(nullable = false, unique = true, length = 70)
    private String colorCar; //cor do carro

    @Column(nullable = false)
    private LocalDateTime registrationDate; //data de registro

    @Column(nullable = false, length = 130)
    private String responsibleName; //nome do responsável

    @Column(nullable = false, length = 30)
    private String apartment; //apartamento do responsável

    @Column(nullable = false, length = 30)
    private String block; //bloco do apartamento

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
