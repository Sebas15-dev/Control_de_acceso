package com.example.ControAcceso.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jssc.SerialPort;
import jssc.SerialPortException;
import org.springframework.stereotype.Service;

@Service
public class ArduinoService {

    private SerialPort puerto;

    @PostConstruct
    public void conectar() {
        try {
            puerto = new SerialPort("COM6");
            puerto.openPort();
            puerto.setParams(
                SerialPort.BAUDRATE_9600,
                SerialPort.DATABITS_8,
                SerialPort.STOPBITS_1,
                SerialPort.PARITY_NONE
            );
            System.out.println("Arduino conectado en COM6");
        } catch (SerialPortException e) {
            System.err.println("Error conectando Arduino: " + e.getMessage());
        }
    }

    public String enviarComando(String comando) {
        try {
            if (puerto == null || !puerto.isOpened()) return "Puerto no disponible";
            puerto.writeString(comando + "\n");
            return "Comando enviado: " + comando;
        } catch (SerialPortException e) {
            return "Error: " + e.getMessage();
        }
    }

    @PreDestroy
    public void desconectar() {
        try {
            if (puerto != null && puerto.isOpened()) puerto.closePort();
        } catch (SerialPortException e) {
            System.err.println("Error cerrando puerto: " + e.getMessage());
        }
    }
}