import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = null;
        Conductor conductor = null;
        Envio envio = null;
        Entrega entrega = null;

        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Seleccione una opción:\n" +
                            "1. Registrar Vehículo\n" +
                            "2. Registrar Conductor\n" +
                            "3. Asignar Conductor a Vehículo\n" +
                            "4. Registrar Envío\n" +
                            "5. Registrar Entrega\n" +
                            "6. Actualizar Estado de Entrega\n" +
                            "7. Mostrar Información\n" +
                            "8. Salir\n\n" +
                            "Ingrese una opción: "));

            switch (opcion) {
                case 1:
                    String placa = JOptionPane.showInputDialog("Ingrese la placa:");
                    String modelo = JOptionPane.showInputDialog("Ingrese el modelo:");
                    double capacidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga:"));
                    vehiculo = new Vehiculo(placa, modelo, capacidad, null);
                    JOptionPane.showMessageDialog(null, "Vehículo registrado exitosamente.");
                    break;

                case 2:
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
                    String identificacion = JOptionPane.showInputDialog("Ingrese la identificación:");
                    int licencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de licencia:"));
                    conductor = new Conductor(nombre, identificacion, licencia);
                    JOptionPane.showMessageDialog(null, "Conductor registrado exitosamente.");
                    break;

                case 3:
                    if (vehiculo == null || conductor == null) {
                        JOptionPane.showMessageDialog(null, "Debe haber un vehículo y un conductor registrados.");
                    } else {
                        vehiculo.asignarConductor(conductor);
                        JOptionPane.showMessageDialog(null, "Conductor asignado al vehículo.");
                    }
                    break;

                case 4:
                    int codigoEnvio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de envío:"));
                    String destino = JOptionPane.showInputDialog("Ingrese el destino:");
                    double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del envío:"));
                    envio = new Envio(codigoEnvio, destino, peso);
                    JOptionPane.showMessageDialog(null, "Envío registrado exitosamente.");
                    break;

                case 5:
                    int numeroGuia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de guía:"));
                    entrega = new Entrega(numeroGuia);
                    JOptionPane.showMessageDialog(null, "Entrega registrada con estado 'Pendiente'.");
                    break;

                case 6:
                    if (entrega == null) {
                        JOptionPane.showMessageDialog(null, "No hay entrega registrada.");
                    } else {
                        entrega.actualizarEstado();
                        JOptionPane.showMessageDialog(null, "Estado de la entrega actualizado.");
                    }
                    break;

                case 7:
                    StringBuilder info = new StringBuilder("Información registrada:\n\n");

                    info.append(" Vehículo:\n");
                    if (vehiculo != null) {
                        info.append("Placa: ").append(vehiculo.getPlaca())
                                .append(", Modelo: ").append(vehiculo.getModelo())
                                .append(", Capacidad: ").append(vehiculo.getCapacidadCarga()).append("\n");
                        if (vehiculo.getConductor() != null) {
                            info.append("Conductor asignado: ").append(vehiculo.getConductor().getNombre()).append("\n");
                        } else {
                            info.append("Sin conductor asignado.\n");
                        }
                    } else {
                        info.append("No registrado.\n");
                    }

                    info.append("\n Conductor:\n");
                    if (conductor != null) {
                        info.append("Nombre: ").append(conductor.getNombre())
                                .append(", ID: ").append(conductor.getIdentificacion())
                                .append(", Licencia: ").append(conductor.getLicencia()).append("\n");
                    } else {
                        info.append("No registrado.\n");
                    }

                    info.append("\nEnvío:\n");
                    if (envio != null) {
                        info.append("Código: ").append(envio.getCodigoEnvio())
                                .append(", Destino: ").append(envio.getDestino())
                                .append(", Peso: ").append(envio.getPeso()).append("\n");
                    } else {
                        info.append("No registrado.\n");
                    }

                    info.append("\n Entrega:\n");
                    if (entrega != null) {
                        info.append("Número de guía: ").append(entrega.getNumeroGuia())
                                .append(", Estado: ").append(entrega.getEstado()).append("\n");
                    } else {
                        info.append("No registrada.\n");
                    }

                    JOptionPane.showMessageDialog(null, info.toString());
                    break;

                case 8:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, intente de nuevo.");
            }

        } while (opcion != 8);
    }
}
