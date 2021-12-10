package Logica;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Collections;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.util.logging.Logger;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import java.text.SimpleDateFormat;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.RegionUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Reporte{
    private int ultimaFila;
    private final Date fechaActual = new Date();
    private final SimpleDateFormat formatoMes = new SimpleDateFormat("MM"),
            formatoAnio = new SimpleDateFormat("yyyy"),
            formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
    private final DecimalFormat formatoDecimal = new DecimalFormat("#0.00");
    private final ControladoraL unaControladora = new ControladoraL();
    private XSSFFont fuente1, fuente2, fuente3;
    private CellStyle estilo, estilo2, estilo3, estilo4, estilo5, estilo6, estilo7, estilo8, estilo9, estilo10, estilo11;
    
    public Reporte(){
    }
    
    public XSSFWorkbook crearLibro(){
        XSSFWorkbook libro = new XSSFWorkbook(); 
        DataFormat df = libro.createDataFormat();
        
        estilo5 = libro.createCellStyle();                                      // ESTILOS PARA TABLA ALQUILER
        estilo5.setBorderTop(BorderStyle.THIN);
        estilo5.setBorderLeft(BorderStyle.THIN);
        estilo5.setBorderBottom(BorderStyle.THIN);
        estilo5.setBorderRight(BorderStyle.THIN);
        
        estilo6 = libro.createCellStyle();
        estilo6.setBorderTop(BorderStyle.THIN);
        estilo6.setBorderLeft(BorderStyle.THIN);
        estilo6.setBorderBottom(BorderStyle.THIN);
        estilo6.setBorderRight(BorderStyle.THIN);
        estilo6.setAlignment(HorizontalAlignment.CENTER);
        
        estilo7 = libro.createCellStyle();
        fuente3 = libro.createFont();
        fuente3.setBold(true);
        estilo7.setBorderTop(BorderStyle.THIN);
        estilo7.setBorderLeft(BorderStyle.THIN);
        estilo7.setBorderBottom(BorderStyle.THIN);
        estilo7.setBorderRight(BorderStyle.THIN);
        estilo7.setAlignment(HorizontalAlignment.CENTER);
        estilo7.setVerticalAlignment(VerticalAlignment.CENTER);
        estilo7.setFont(fuente3);
        
        estilo8 = libro.createCellStyle();
        estilo8.setBorderTop(BorderStyle.THIN);
        estilo8.setBorderLeft(BorderStyle.THIN);
        estilo8.setBorderRight(BorderStyle.THIN);
               
        estilo9 = libro.createCellStyle();
        estilo9.setBorderLeft(BorderStyle.THIN);
        estilo9.setBorderRight(BorderStyle.THIN);
        
        estilo10 = libro.createCellStyle();
        estilo10.setAlignment(HorizontalAlignment.RIGHT);
        estilo10.setBorderTop(BorderStyle.THIN);
        estilo10.setBorderLeft(BorderStyle.THIN);
        estilo10.setBorderBottom(BorderStyle.THIN);
        estilo10.setBorderRight(BorderStyle.THIN);
        estilo10.setDataFormat(df.getFormat("$#,#0.00"));
        
        estilo11 = libro.createCellStyle();
        estilo11.setWrapText(true);
        estilo11.setAlignment(HorizontalAlignment.LEFT);
        estilo11.setVerticalAlignment(VerticalAlignment.CENTER);
        //
        estilo = libro.createCellStyle();                                       //ESTILOS TABLA EXPENSAS (GENERADOR DE HOJAS DENTRO DEL LIBRO)
        fuente1 = libro.createFont();
        fuente1.setBold(true);
        fuente1.setFontHeightInPoints((short)14);
        fuente1.setItalic(true);
        estilo.setFont(fuente1);
        
        estilo2 = libro.createCellStyle();                                      // Estilo 2: Columnas con valores.. Bold-Calibri-12
        fuente2 = libro.createFont();
        fuente2.setBold(true);
        fuente2.setFontHeightInPoints((short)12);
        estilo2.setFont(fuente2);
        
        estilo3 = libro.createCellStyle();                                      // Estilo 3: Encuadre de tabla. Nombre servicio y sus montos
        estilo3.setBorderTop(BorderStyle.THIN);
        estilo3.setBorderLeft(BorderStyle.THIN);
        estilo3.setBorderBottom(BorderStyle.THIN);
        estilo3.setBorderRight(BorderStyle.THIN);
        estilo3.setDataFormat(df.getFormat("$#,#0.00"));
        
        estilo4 = libro.createCellStyle();                                      // Estilo 4: Encuadre de fila y Negrita. Para col "CONCEPTO" y col "MONTO"
        estilo4.setFont(fuente2);
        estilo4.setBorderTop(BorderStyle.THIN);
        estilo4.setBorderLeft(BorderStyle.THIN);
        estilo4.setBorderBottom(BorderStyle.THIN);
        estilo4.setBorderRight(BorderStyle.THIN);
        estilo4.setDataFormat(df.getFormat("$#,#0.00"));
                
        return libro;
    }
    
    public boolean generarRepo(long idEdificio, int mesIngresado, int anioIngresado, List<Inquilino> inquilinos, String obsAlquiler, String obsExpensa, int opcion){   // Paso 1: Crear libro y generar los reportes deseados.
        boolean respuesta = false;
        Edificio unEdificio = unaControladora.obtenerEdificio(idEdificio);
        XSSFWorkbook libro = crearLibro();                                      // Devuelve el libro con los Estilos y Fuentes configurados para TABLA ALQUILER
        String titulo = "";
        
        switch(opcion){
            case 1:
                libro = generarAlquiler(libro, idEdificio, mesIngresado, anioIngresado, inquilinos, obsAlquiler);
                titulo = " Alquiler ";
                break;
            case 2:
                libro = generarExpensa(libro, idEdificio, mesIngresado, anioIngresado, inquilinos, obsExpensa);
                titulo = " Expensa ";
                break;
            case 3:
                libro = generarAlquilerExpensa(libro, idEdificio, mesIngresado, anioIngresado, inquilinos, obsAlquiler, obsExpensa);
                titulo = " Alquiler-Expensa ";
                break;
            default:
                libro = generarAlquilerExpensa(libro, idEdificio, mesIngresado, anioIngresado, inquilinos, obsAlquiler, obsExpensa);
                titulo = " Alquiler-Expensa ";
                break;
        }
        
        try{
            JFileChooser Reporte = new JFileChooser();
            String nombreArchivo = "Reporte"+titulo+"Edificio "+unEdificio.getNombre()+" "+formatoFecha.format(fechaActual);
            
            Reporte.setSelectedFile(new File(nombreArchivo));
            if (Reporte.showDialog(null, "Guardar Reporte") == JFileChooser.APPROVE_OPTION) {
                
                File archivoXLSX = Reporte.getSelectedFile();
                String nombre = archivoXLSX.getName();
                if (nombre.indexOf('.') == -1) {                         
                    nombre += ".xlsx";                                          // Si en el nombre no existe la extensión Excel se agrega.
                    archivoXLSX = new File(archivoXLSX.getParentFile(), nombre);
                    FileOutputStream fileOut = new FileOutputStream(archivoXLSX);
                    libro.write(fileOut);                                       // Se van pisando los reportes
                    libro.close();
                    respuesta = true;
                }else{
                    JOptionPane.showMessageDialog(null, "No se ha creado el documento. Debido a que no es posible agregar punto (.) en el nombre del archivo");
                }
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: "+ex);
        }
        
        return respuesta;
    }
    
    // Sólo generará un reporte de Alquiler/es
    public XSSFWorkbook generarAlquiler(XSSFWorkbook  libro, long idEdificio, int mesAbuscar, int anioAbuscar, List<Inquilino> inquilinos, String obsAlquiler){
        Edificio unEdificio = unaControladora.obtenerEdificio(idEdificio);
        int fi = 3;
        Sheet hojaAlquiler = libro.createSheet("RESUMEN A COB");                // Se genera la hoja de ALQUILER
        hojaAlquiler = configurarHojaCabeceraAlquiler(hojaAlquiler, unEdificio, mesAbuscar, anioAbuscar);
        short tamFilaDefault = 400;
        
        for(Inquilino unInqui : inquilinos){
            String ubicacionDepto = "";
            String fechaPago = "";
            Expensa unaExp = null;
            float saldoMesAnterior = 0, saldo = 0, precioCochera = 0, interesPorAtraso = 0, otrasFactura = 0, 
                  montoAlquilerPedido, montoExpensaAlquilerPedido = 0, otros = 0, totales = 0, efectivo = 0, banco = 0, tarjeta = 0;
            List<Alquiler> alquileresInquilino = unInqui.getAlquileres();
            Collections.sort(alquileresInquilino, (Alquiler a1, Alquiler a2) -> (a1.getFecha().compareTo(a2.getFecha())));
            Alquiler alquilerPedido = alquilerAbuscar(mesAbuscar, anioAbuscar, alquileresInquilino);
            
            if(alquilerPedido != null){ // Existe Alquiler pedido?
                if(alquilerPedido.getDepartamento() > 0){
                    ubicacionDepto = unaControladora.obtenerDepartamento(alquilerPedido.getDepartamento()).getUbicacion();
                    Expensa unaExpensa = unaControladora.obtenerExpensa(alquilerPedido.getDepartamento(), mesAbuscar, anioAbuscar);
                    if(unaExpensa != null){
                        montoExpensaAlquilerPedido = unaControladora.obtenerExpensa(unaExpensa.getId()).getMonto();
                    }
                }
                montoAlquilerPedido = alquilerPedido.getMonto();
                otrasFactura = alquilerPedido.getOtraFactura();
                precioCochera = alquilerPedido.getTotal() - alquilerPedido.getMonto();  // Obtiene el precio de la cochera en ese periodo del Alquiler
                
                if(alquilerPedido.getUnPago() != null){ // Si existe se guardan los datos para cargar directamente al Excel.
                    interesPorAtraso = alquilerPedido.getUnPago().getInteresPorAtraso();
                    saldoMesAnterior = unaControladora.obtenerSaldoMesAnterior(idEdificio, unInqui.getId(), mesAbuscar, anioAbuscar);
                    otros = alquilerPedido.getUnPago().getOtros();
                    totales = alquilerPedido.getUnPago().getMonto();
                    efectivo = alquilerPedido.getUnPago().getEfectivo();
                    banco = alquilerPedido.getUnPago().getBanco();
                    tarjeta = alquilerPedido.getUnPago().getTarjeta();
                    saldo = alquilerPedido.getUnPago().getMonto() - (alquilerPedido.getUnPago().getEfectivo()+alquilerPedido.getUnPago().getBanco()+alquilerPedido.getUnPago().getTarjeta());               
                    fechaPago = formatoFecha.format(alquilerPedido.getUnPago().getFecha());
                }else{ // Si no existe el pago del Alquiler pedido, se busca el último pago de los alquileres anteriores.
                    List<Alquiler> alquileresInpagos;
                    Pago ultimoPago = unaControladora.buscarUltimoPago(unInqui);
                    int i = 0;
                            
                    if(ultimoPago != null){ // Si existe un último alquiler pago (anteriores). Recorrer a partir del siguiente, hasta el Alquiler pedido guardando los datos.
                        Date fechaUltimoAlquilerPagado = unaControladora.obtenerAlquiler(ultimoPago.getIdAlquiler()).getFecha();
                        alquileresInpagos = obtenerCantAlquileresInpagos(alquileresInquilino, alquilerPedido.getFecha(), fechaUltimoAlquilerPagado);
                    }else{
                        alquileresInpagos = obtenerCantAlquiInpagos(alquileresInquilino, alquilerPedido.getFecha());
                    }
                    
                    Collections.sort(alquileresInpagos, (Alquiler a1, Alquiler a2) -> (a1.getFecha().compareTo(a2.getFecha())));
                    saldoMesAnterior = unaControladora.obtenerSaldoUltimoPago(unInqui.getId());
                    int ultimoIndiceAlquiler = alquileresInpagos.size()-1;
                    float totalAlquilerExpensa = 0;
                    totales += saldoMesAnterior;
                    for(Alquiler unAlq : alquileresInpagos){
                        interesPorAtraso = 0;
                        if(unAlq.getDepartamento() > 0){
                            unaExp = unaControladora.obtenerExpensa(unAlq.getDepartamento(), Integer.valueOf(formatoMes.format(unAlq.getFecha())), Integer.valueOf(formatoAnio.format(unAlq.getFecha())));
                            if(unaExp != null){
                                totalAlquilerExpensa += unaExp.getMonto();
                                totales += unaExp.getMonto();
                            }
                        }
                        totalAlquilerExpensa += unAlq.getTotal();
                        totales += unAlq.getTotal();
                        interesPorAtraso = unaControladora.interesesPorAtraso(fechaActual, unAlq.getFecha(), totalAlquilerExpensa);
                        totalAlquilerExpensa += interesPorAtraso;
                        totalAlquilerExpensa += saldoMesAnterior;
                        if(i != ultimoIndiceAlquiler){
                            saldoMesAnterior = totalAlquilerExpensa;
                        }
                        totalAlquilerExpensa = 0;
                        totales += interesPorAtraso;
                        saldo = totales;     
                        i++;
                    }
                }
                fi++;
                hojaAlquiler = cargarCuerpoHojaAlquiler(hojaAlquiler, fi, tamFilaDefault, ubicacionDepto, unInqui.getApellido(), unInqui.getNombre(), montoAlquilerPedido, otrasFactura, montoExpensaAlquilerPedido, precioCochera, interesPorAtraso, saldoMesAnterior, otros, totales, efectivo, tarjeta, banco, saldo, fechaPago, obsAlquiler);
                
            } //else = No existe alquiler para el mes y año ingresado para este Inquilino.
            
        }
        
        int ultimaFi = fi;
        hojaAlquiler = cargarPieHojaAlquiler(hojaAlquiler, obsAlquiler, ultimaFi);
        
        return libro;
    }
    
    public Sheet configurarHojaCabeceraAlquiler(Sheet hojaAlquiler, Edificio unEdificio, int mesActual, int anioActual2){
        int periodoExpensa[] = unaControladora.obtenerPeriodoExpensa(mesActual, anioActual2);
        
        CellRangeAddress rango = new CellRangeAddress(1, 1, 1, 15), rango2 = new CellRangeAddress(2, 2, 1, 15);
        hojaAlquiler.addMergedRegion(rango);                                    // Fusiona las columnas de los 2 últimos parametros
        hojaAlquiler.addMergedRegion(rango2);
        
        short tamFila3 = 600;                                                   // Se setea el tamaño de filas
        
        // Seteo de tamaños de columnas                                                                        
        hojaAlquiler.setColumnWidth(1, 1500);                                   // Columna n° 1 (B), tamaño [DPTO]
        hojaAlquiler.setColumnWidth(2, 7800);                                   // Columna n° 2 (B), tamaño [INQUILINO]
        hojaAlquiler.setColumnWidth(3, 3300);                                   // Columna n° 3 (C), tamaño [ALQUILER]
        hojaAlquiler.setColumnWidth(4, 3300);                                   // Columna n° 4 (C), tamaño [OTRAS F.]
        hojaAlquiler.setColumnWidth(5, 4100);                                   // Columna n° 5 (C), tamaño [EXPENSAS]
        hojaAlquiler.setColumnWidth(6, 2700);                                   // Columna n° 6 (C), tamaño [COCHERAS]
        hojaAlquiler.setColumnWidth(7, 4000);                                   // Columna n° 7 (C), tamaño [INTERESESxATRASOS]
        hojaAlquiler.setColumnWidth(8, 3500);                                   // Columna n° 8 (C), tamaño [SALDOmesANTERIOR]
        hojaAlquiler.setColumnWidth(9, 3200);                                   // Columna n° 9 (C), tamaño [OTROS]
        hojaAlquiler.setColumnWidth(10, 3300);                                   // Columna n° 10 (C), tamaño [TOTAL]
        hojaAlquiler.setColumnWidth(11, 4100);                                  // Columna n° 11 (C), tamaño [PAGOEFECTIVO]
        hojaAlquiler.setColumnWidth(12, 3700);                                  // Columna n° 12 (C), tamaño [PAGOTARJETA]
        hojaAlquiler.setColumnWidth(13, 3500);                                  // Columna n° 13 (C), tamaño [PAGOBANCO]
        hojaAlquiler.setColumnWidth(14, 3200);                                  // Columna n° 14 (C), tamaño [SALDO]
        hojaAlquiler.setColumnWidth(15, 3200);                                  // Columna n° 15 (C), tamaño [FECHAPAGO]
                
        Row fila = hojaAlquiler.createRow(0);                                   // FILA 0
        fila.createCell(0).setCellValue("");
        fila.createCell(1).setCellValue("");
        
        fila = hojaAlquiler.createRow(1);                                       // FILA 1
        fila.createCell(0).setCellValue("");
        fila.createCell(1).setCellValue("EDIFICIO: "+unEdificio.getNombre()+ " - "+unEdificio.getDireccion());
        
        RegionUtil.setBorderTop(BorderStyle.THIN, rango, hojaAlquiler);
        RegionUtil.setBorderLeft(BorderStyle.THIN, rango, hojaAlquiler);
        RegionUtil.setBorderRight(BorderStyle.THIN, rango, hojaAlquiler);
        
        fila = hojaAlquiler.createRow(2);                                       // FILA 2
        fila.createCell(0).setCellValue("");
        fila.createCell(1).setCellValue("PERIODO: "+mesActual+"/"+anioActual2);
        
        RegionUtil.setBorderLeft(BorderStyle.THIN, rango2, hojaAlquiler);
        RegionUtil.setBorderRight(BorderStyle.THIN, rango2, hojaAlquiler);
        RegionUtil.setBorderBottom(BorderStyle.THIN, rango2, hojaAlquiler);
        
        Row encabezado = hojaAlquiler.createRow(3);                             //FILA 3
        encabezado.setHeight(tamFila3);
        encabezado.createCell(0).setCellValue("");
        
        encabezado.createCell(1).setCellValue("DPTO");                          // COLUMNA 1, FILA 3
        encabezado.getCell(1).setCellStyle(estilo7);
        
        encabezado.createCell(2).setCellValue("INQUILINO");                     // COLUMNA 2, FILA 3
        encabezado.getCell(2).setCellStyle(estilo7);
            
        encabezado.createCell(3).setCellValue("ALQ. "+mesActual+"/"+anioActual2);// COLUMNA 3, FILA 3
        encabezado.getCell(3).setCellStyle(estilo7);
        
        encabezado.createCell(4).setCellValue("OTRAS F.");                      // COLUMNA 4, FILA 3
        encabezado.getCell(4).setCellStyle(estilo7);
        
        encabezado.createCell(5).setCellValue("EXPENSAS "+periodoExpensa[0]+"/"+periodoExpensa[1]);// COLUMNA 5, FILA 3
        encabezado.getCell(5).setCellStyle(estilo7);
        
        encabezado.createCell(6).setCellValue("COCHERAS");                      // COLUMNA 6, FILA 3
        encabezado.getCell(6).setCellStyle(estilo7);
        
        encabezado.createCell(7).setCellValue("intereses por atr.");              // COLUMNA 7, FILA 3
        encabezado.getCell(7).setCellStyle(estilo7);
        
        encabezado.createCell(8).setCellValue("saldo mes ant.");                // COLUMNA 8, FILA 3
        encabezado.getCell(8).setCellStyle(estilo7);
        
        encabezado.createCell(9).setCellValue("OTROS");                         // COLUMNA 9, FILA 3
        encabezado.getCell(9).setCellStyle(estilo7);
            
        encabezado.createCell(10).setCellValue("TOTAL");                         // COLUMNA 10, FILA 3
        encabezado.getCell(10).setCellStyle(estilo7);
        
        encabezado.createCell(11).setCellValue("PAGO EFECTIVO");                // COLUMNA 11, FILA 3
        encabezado.getCell(11).setCellStyle(estilo7);
        
        encabezado.createCell(12).setCellValue("PAGO TARJETA");                 // COLUMNA 12, FILA 3
        encabezado.getCell(12).setCellStyle(estilo7);
        
        encabezado.createCell(13).setCellValue("PAGO BANCO");                   // COLUMNA 13, FILA 3
        encabezado.getCell(13).setCellStyle(estilo7);
        
        encabezado.createCell(14).setCellValue("SALDO");                        // COLUMNA 14, FILA 3
        encabezado.getCell(14).setCellStyle(estilo7);
        
        encabezado.createCell(15).setCellValue("FECHA PAGO");                   // COLUMNA 15, FILA 3
        encabezado.getCell(15).setCellStyle(estilo7);
        
        return hojaAlquiler;
    }
    
    public Sheet cargarCuerpoHojaAlquiler(Sheet hojaAlquiler, int fi, short tamFilaDefault, String ubicacionDepto, String apellidoInquilino, 
            String nombreInquilino, float montoAlquiler, float otrasFacturas, float montoExpensa, float precioCochera, float totalesPorIntereses,
            float saldoMesAnterior, float otros, float totales, float efectivo, float tarjeta, float banco, float saldo, String fechaPago, String obsAlquiler){
            
            Row fila = hojaAlquiler.createRow(fi);
            fila.setHeight(tamFilaDefault);
            fila.createCell(1).setCellValue(ubicacionDepto);
            fila.getCell(1).setCellStyle(estilo5);
            
            fila.createCell(2).setCellValue(apellidoInquilino+", "+nombreInquilino);
            fila.getCell(2).setCellStyle(estilo5);
            
            fila.createCell(3).setCellValue(montoAlquiler);
            fila.getCell(3).setCellStyle(estilo10);
            fila.getCell(3).getNumericCellValue();
            
            fila.createCell(4).setCellValue(otrasFacturas);
            fila.getCell(4).setCellStyle(estilo10);
            fila.getCell(4).getNumericCellValue();
            
            fila.createCell(5).setCellValue(montoExpensa);
            fila.getCell(5).setCellStyle(estilo10);
            fila.getCell(5).getNumericCellValue();
            
            fila.createCell(6).setCellValue(precioCochera);
            fila.getCell(6).setCellStyle(estilo10);
            fila.getCell(6).getNumericCellValue();
            
            fila.createCell(7).setCellValue(totalesPorIntereses);
            fila.getCell(7).setCellStyle(estilo10);
            fila.getCell(7).getNumericCellValue();
            
            fila.createCell(8).setCellValue(saldoMesAnterior);
            fila.getCell(8).setCellStyle(estilo10);
            fila.getCell(8).getNumericCellValue();
            
            fila.createCell(9).setCellValue(otros);
            fila.getCell(9).setCellStyle(estilo10);
            fila.getCell(9).getNumericCellValue();
            
            fila.createCell(10).setCellValue(totales);
            fila.getCell(10).setCellStyle(estilo10);
            fila.getCell(10).getNumericCellValue();
            
            fila.createCell(11).setCellValue(efectivo);
            fila.getCell(11).setCellStyle(estilo10);
            fila.getCell(11).getNumericCellValue();
            
            fila.createCell(12).setCellValue(tarjeta);
            fila.getCell(12).setCellStyle(estilo10);
            fila.getCell(12).getNumericCellValue();
            
            fila.createCell(13).setCellValue(banco);
            fila.getCell(13).setCellStyle(estilo10);
            fila.getCell(13).getNumericCellValue();
            
            fila.createCell(14).setCellValue(saldo);          
            fila.getCell(14).setCellStyle(estilo10);
            fila.getCell(14).getNumericCellValue();
            
            fila.createCell(15).setCellValue(fechaPago);
            fila.getCell(15).setCellStyle(estilo10);
            
        return hojaAlquiler;
    }
    
    public Sheet cargarPieHojaAlquiler(Sheet hojaAlquiler, String obsAlquiler, int j){
        int ultiF = j;
        // FILA TOTALES
        String[] columnas;
        columnas = configurarColumnas(12);
        Row fila = hojaAlquiler.createRow(j+1);
        ultiF = ultiF+1;
        fila.createCell(2).setCellValue("TOTALES");
        fila.getCell(2).setCellStyle(estilo5);
        int col = 3;
        for(int i = 0; i < columnas.length; i++){
            fila.createCell(col).setCellFormula("SUM("+columnas[i]+"4:"+columnas[i]+""+ultiF+")");
            fila.getCell(col).setCellStyle(estilo10);
            fila.getCell(col).getNumericCellValue();
            col++;
        }
        
        if(!obsAlquiler.isEmpty()){
            fila = hojaAlquiler.createRow(j+3);
            fila.createCell(0).setCellValue("");
            fila.getCell(0).setCellValue("");

            CellRangeAddress rango3 = new CellRangeAddress(fila.getRowNum(), fila.getRowNum()+3, 1, 7);

            hojaAlquiler.addMergedRegion(rango3);
            fila.createCell(1).setCellValue("");
            fila.getCell(1).setCellValue(obsAlquiler);
            fila.getCell(1).setCellStyle(estilo11);
            RegionUtil.setBorderTop(BorderStyle.THIN, rango3, hojaAlquiler);
            RegionUtil.setBorderLeft(BorderStyle.THIN, rango3, hojaAlquiler);
            RegionUtil.setBorderRight(BorderStyle.THIN, rango3, hojaAlquiler);
            RegionUtil.setBorderBottom(BorderStyle.THIN, rango3, hojaAlquiler);
        }
        
        return hojaAlquiler;
    }
    
    public Alquiler alquilerAbuscar(int mesAlquiler, int anioAlquiler, List<Alquiler> alquileresInqui){
        Alquiler unAlquiler = null;
        int i = 0;
        
        while(i < alquileresInqui.size()){
            if(Integer.valueOf(formatoMes.format(alquileresInqui.get(i).getFecha())) == mesAlquiler && Integer.valueOf(formatoAnio.format(alquileresInqui.get(i).getFecha())) == anioAlquiler){
                unAlquiler = alquileresInqui.get(i);
                i = alquileresInqui.size();
            }else{
                i++;
            }
        }
        
        return unAlquiler;
    }
    
    public List<Alquiler> obtenerCantAlquileresInpagos(List<Alquiler> alquileresInqui, Date fechaAlquilerBuscado, Date fechaUltimoAlquilerPagado){
        List<Alquiler> alquileresInpagos = new LinkedList();
        
        for(Alquiler unAlqui : alquileresInqui){
            if(unAlqui.getUnPago() == null){
                // If compareTo == 0 -> Son iguales. If compareTo > 0 es mayor a la fecha. If compareTo < 0 
                if(unAlqui.getFecha().compareTo(fechaUltimoAlquilerPagado) > 0 || unAlqui.getFecha().compareTo(fechaUltimoAlquilerPagado) == 0){
                    if(unAlqui.getFecha().compareTo(fechaAlquilerBuscado) < 0 || unAlqui.getFecha().compareTo(fechaAlquilerBuscado) == 0){
                        alquileresInpagos.add(unAlqui);
                    }
                }else if(unAlqui.getFecha().compareTo(fechaUltimoAlquilerPagado) < 0){
                    alquileresInpagos.add(unAlqui);
                }
            }
        }
        
        return alquileresInpagos;
    }
    
    
    public List<Alquiler> obtenerCantAlquiInpagos(List<Alquiler> alquileresInqui, Date fechaAlquilerBuscado){
        List<Alquiler> alquileresInpagos = new LinkedList();
        
        for(Alquiler unAlqui : alquileresInqui){
            if(unAlqui.getUnPago() == null){
                // If compareTo == 0 -> Son iguales. If compareTo > 0 es mayor a la fecha. If compareTo < 0 
                if(unAlqui.getFecha().compareTo(fechaAlquilerBuscado) < 0 || unAlqui.getFecha().compareTo(fechaAlquilerBuscado) == 0){
                    alquileresInpagos.add(unAlqui);
                }
            }
        }
        
        return alquileresInpagos;
    }
    
    public float obtenerPrecioCochera(Alquiler alquilerInquilino){
        float precioCochera = 0;
        
        precioCochera = alquilerInquilino.getTotal() - alquilerInquilino.getMonto();
        
        return precioCochera;
    }
    
    // Sólo generará un reporte de Expensa/as
    public XSSFWorkbook generarExpensa(XSSFWorkbook libro, long idEdificio, int mesIngresado, int anioIngresado, List<Inquilino> inquilinos, String obsExpensa){
        Edificio unEdificio = unaControladora.obtenerEdificio(idEdificio);
        
        for(Inquilino unInqui : inquilinos){
            Departamento unDepartamento = unaControladora.obtenerDepartamentoInquilino(idEdificio, unInqui.getId());
            if(unDepartamento != null){
                Expensa unaExpensa = unaControladora.obtenerExpensaReporte(unDepartamento.getId(), mesIngresado, anioIngresado);
                if(unaExpensa != null){
                    Sheet hojaExpensa = libro.createSheet("Expensa "+unDepartamento.getUbicacion()); // Se genera una hoja dentro del Libro Excel
                    hojaExpensa = configurarHojaExpensa(hojaExpensa, unDepartamento, unEdificio);
                    // FILA 5
                    Row fila = hojaExpensa.createRow(5);
                    fila.createCell(0).setCellValue("");
                    fila.createCell(1).setCellValue("PERIODO");
                    int f = 7, indice, cantidadServicioExpensa = unaExpensa.getServiciosExpensa().size();

                    fila.createCell(2).setCellValue("EXPENSAS "+mesIngresado+"/"+anioIngresado); // Traer el último período y año de la Expensa
                    fila.getCell(2).setCellStyle(estilo2);

                    // FILA 6
                    fila = hojaExpensa.createRow(6);
                    fila.createCell(0).setCellValue("");
                    fila.createCell(1).setCellValue("CONCEPTOS");
                    fila.getCell(1).setCellStyle(estilo3);
                    fila.createCell(2).setCellValue("MONTO");
                    fila.getCell(2).setCellStyle(estilo3);
                    if(unaExpensa.getMes() == mesIngresado && unaExpensa.getAnio() == anioIngresado){
                        // Se autogeneran las filas de servicios que posee esta expensa.
                        for(indice = 0; indice < cantidadServicioExpensa; indice++){
                            fila = hojaExpensa.createRow(f++);
                            fila.createCell(0).setCellValue("");
                            fila.createCell(1).setCellValue(unaExpensa.getServiciosExpensa().get(indice).getNombre());
                            fila.getCell(1).setCellStyle(estilo3);
                            String montoSinComa = unaControladora.reemplazarString(formatoDecimal.format(unaExpensa.getServiciosExpensa().get(indice).getMonto()));
                            Double montoFinal = Double.valueOf(montoSinComa);
                            fila.createCell(2).setCellValue(montoFinal);
                            fila.getCell(2).setCellStyle(estilo3);
                            fila.getCell(2).getNumericCellValue();// Hacer algo al respecto con esto.. y con el Simbolo $ en montoFinal. Linea 331
                        }
                    }

                    ultimaFila = f;

                    fila = hojaExpensa.createRow(f++);
                    fila.createCell(0).setCellValue("");
                    fila.createCell(1).setCellValue("TOTAL");
                    fila.getCell(1).setCellStyle(estilo4);
                    fila.createCell(2).setCellFormula("SUM(C8:C"+ultimaFila+")");
                    fila.getCell(2).setCellStyle(estilo4);
                    if(!obsExpensa.isEmpty()){
                        fila = hojaExpensa.createRow(f+1);
                        fila.createCell(0).setCellValue("");
                        fila.getCell(0).setCellValue("");

                        CellRangeAddress rango = new CellRangeAddress(fila.getRowNum(), fila.getRowNum()+3, 1, 2);

                        hojaExpensa.addMergedRegion(rango);
                        fila.createCell(1).setCellValue("");
                        fila.getCell(1).setCellValue(obsExpensa);
                        fila.getCell(1).setCellStyle(estilo11);
                        RegionUtil.setBorderTop(BorderStyle.THIN, rango, hojaExpensa);
                        RegionUtil.setBorderLeft(BorderStyle.THIN, rango, hojaExpensa);
                        RegionUtil.setBorderRight(BorderStyle.THIN, rango, hojaExpensa);
                        RegionUtil.setBorderBottom(BorderStyle.THIN, rango, hojaExpensa);
                    }
                }else{
                    // Código para los que no tienen Expensas...
                    /*
                    fila.createCell(2).setCellValue("EXPENSAS "+mesIngresado+"/"+anioIngresado); // Traer el último período y año de la Expensa
                    fila.getCell(2).setCellStyle(estilo2);

                    // FILA 6
                    fila = hojaExpensa.createRow(6);
                    fila.createCell(0).setCellValue("");
                    fila.createCell(1).setCellValue("CONCEPTOS");
                    fila.getCell(1).setCellStyle(estilo3);
                    fila.createCell(2).setCellValue("MONTO");
                    fila.getCell(2).setCellStyle(estilo3);*/
                }
            }
            
        }
        
        return libro;
    }
    
    // Generará un reporte de Alquiler/es y Expensa/as en un mismo documento de Excel.
    public XSSFWorkbook generarAlquilerExpensa(XSSFWorkbook libro, long idEdificio, int mes, int anio, List<Inquilino> inquilinos, String obsAlquiler, String obsExpensa){
        libro = generarAlquiler(libro, idEdificio, mes, anio, inquilinos, obsAlquiler);
        int[] periodoExpensa = unaControladora.obtenerPeriodoExpensa(mes, anio);
        libro = generarExpensa(libro, idEdificio, periodoExpensa[0], periodoExpensa[1], inquilinos, obsExpensa);
        
        return libro;
    }
    
    public Sheet configurarHojaExpensa(Sheet hojaExpensa, Departamento unDepartamento, Edificio unEdificio){
        hojaExpensa.setColumnWidth(1, 13700);                                          // Columna n° 1 (B), tamaño
        hojaExpensa.setColumnWidth(2, 7350);                                           // Columna n° 2 (C), tamaño
        // FILA 1
        Row fila = hojaExpensa.createRow(1);
        fila.createCell(0).setCellValue("");
        fila.createCell(1).setCellValue("EDIFICIO "+unEdificio.getNombre());
        fila.getCell(1).setCellStyle(estilo);
        fila.createCell(2).setCellValue(unEdificio.getDireccion());
        // FILA 2
        fila = hojaExpensa.createRow(2);
        fila.createCell(0).setCellValue("");
        fila.createCell(1).setCellValue("RECIBO DE EXPENSA");
        // FILA 3
        fila = hojaExpensa.createRow(3);
        fila.createCell(0).setCellValue("");
        fila.createCell(1).setCellValue("NOMBRE LOCATARIO");
        fila.createCell(2).setCellValue(unDepartamento.getUnInquilino().toString());
        fila.getCell(2).setCellStyle(estilo2);
        // FILA 4
        fila = hojaExpensa.createRow(4);
        fila.createCell(0).setCellValue("");
        fila.createCell(1).setCellValue("DEPARTAMENTO");
        fila.createCell(2).setCellValue(unDepartamento.getUbicacion());
        fila.getCell(2).setCellStyle(estilo2);
        
        return hojaExpensa;
    }
    
    public float obtenerSaldoMesAnterior(long idInquilino){
        List<Pago> pagosInquilino = unaControladora.obtenerPagosInquilino(idInquilino);
        List<Pago> pagosOrdenados = new LinkedList();
        float saldoMesAnterior = 0;
        
        if(pagosInquilino.size() > 0){
            for(Pago unPago : pagosInquilino){
                pagosOrdenados.add(unPago);
            }
            
            Collections.sort(pagosOrdenados, (Pago p1, Pago p2) -> p1.getFecha().compareTo(p2.getFecha()));
            if(pagosInquilino.size() > 1){
                saldoMesAnterior = pagosOrdenados.get(pagosOrdenados.size()-2).getSaldo();
            }
        }
        
        return saldoMesAnterior;
    }
    
    public int[] obtenerPeriodoExpensa(Date fechaActual){
        int[] periodo = new int[2];
        int mesActual = Integer.valueOf(formatoMes.format(fechaActual)), anioActual = Integer.valueOf(formatoAnio.format(fechaActual));
        
        if(mesActual == 12){
            periodo[0] = 1;
            periodo[1] = anioActual-1;
        }else{
            periodo[0] = mesActual-1;
            periodo[1] = anioActual;
        }
        
        return periodo;
    }
    
    public String[] configurarColumnas(int tamanio){
        String[] columnas = new String[tamanio];
        // COLUMNAS DEL EXCEL
        columnas[0] = "D";
        columnas[1] = "E";
        columnas[2] = "F";
        columnas[3] = "G";
        columnas[4] = "H";
        columnas[5] = "I";
        columnas[6] = "J";
        columnas[7] = "K";
        columnas[8] = "L";
        columnas[9] = "M";
        columnas[10] = "N";
        columnas[11] = "O";
        
        return columnas;
    }
    
    public float buscarPrecioCochera(long idAlquiler, float montoAlquiler, float totalAlquiler){
        float precioCochera;
        
        precioCochera = totalAlquiler - montoAlquiler;
        
        return precioCochera;
    }
}
