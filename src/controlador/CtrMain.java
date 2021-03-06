/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.BasicDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JComponent;
import modelo.Callback;
import modelo.Rol;
import modelo.Sesion;
import modelo.Usuario;
import vista.FrmMain;

/**
 * Controlador principal para el formulario principal
 * @author Carlos chavez laguna
 */
public class CtrMain implements ActionListener, WindowListener{

    private FrmMain mFrmMain;
    private Usuario mUsuario;      
    private CtrNSeguridad mCtrNSeguridad;
    private CtrNReserva mCtrNReserva;    
    private CtrNServicio mCtrNServicio;
    private CtrNAlojamiento mCtrNAlojamiento;
    private CtrlMantenerRDLH mCtrMantenimiento;
    private CtrGenerarLHPISO mCtrGenerarLHPISO;
    private CtrlActualizarEstadoHabitacionADisponible mCtrlActualizarEHabD;
    private CtrIncluido mCtrIncluido;
    private Callback mInvokeCallback;
    private CtrFacturacion mctrFacturacion;
    
    private final String LOG_TAG="CtrMain",LOG_TAG_ERROR="CtrMain-error";
    
    //constructores
    public CtrMain() {        
    }
    
    public CtrMain(FrmMain frmMain) {        
        mFrmMain=frmMain;
        mFrmMain.SmnMantenerUsuario.addActionListener(this);
        mFrmMain.smMantenerRoles.addActionListener(this);
        mFrmMain.MnVerPerfil.addActionListener(this);
        mFrmMain.SmnReporteSesiones.addActionListener(this);
        mFrmMain.smMantenerEmpleado.addActionListener(this);
        mFrmMain.MnGenerarReserva.addActionListener(this);        
        mFrmMain.MnSalir.addActionListener(this);                
        mFrmMain.smServicioExtra.addActionListener(this);
        mFrmMain.smServicioHabitacion.addActionListener(this);
        mFrmMain.smRegistrarAlojamiento.addActionListener(this);
        mFrmMain.smReporteAlojamiento.addActionListener(this);
        mFrmMain.MantenerRLH.addActionListener(this);
        mFrmMain.GenerarLLHP.addActionListener(this);        
        mFrmMain.formulario.addActionListener(this); //mantenimiento
        //mFrmMain.MnFacturacion.addActionListener(this);
        mFrmMain.smRegistrarCobro.addActionListener(this);
       

        
        //arreglando conflictos merge--------------------
        mCtrIncluido=CtrIncluido.getInstance();
        
        mInvokeCallback=new Callback<String>(){
            @Override
            public void execute(String[] args) {
                mCtrIncluido.showForm(args[0]);
            }        
        };

        //eventos de ventana
        mFrmMain.addWindowListener(this);
        
    }
    
    /**
     * 
     * ActionPerformed, recibe todos los eventos de UI
     * por componente, lo identificas y ejecutas la acción
     * dependiendo del nombre de este último.
     * PD: refierase al componente como: TextField, Button, etc.
     * 
     * @param e el ui llama pasa este parámetro por componente
     */ 
    @Override
    public void actionPerformed(ActionEvent e) {
        JComponent obj=(JComponent) e.getSource();
        System.out.println(obj.getName());
        switch(obj.getName()){
            //SEGURIDAD
            case "pmantenerusuario":    
                this.mCtrNSeguridad.showFrmMantenerUsuario();
                break;
            case "pperfil":
                this.mCtrNSeguridad.showFrmVerPerfil();
                break;
            case "pmantenerroles":
                this.mCtrNSeguridad.showFrmMantenerRol();
                break;
            case "preportesesiones":
                this.mCtrNSeguridad.showFrmReportarSesiones();
                break;
            case "pMantenerEmpleado":
                this.mCtrNSeguridad.showFrmMantenerEmpleado();
                break;
            //RESERVA
            case "pGenerarReserva":
                this.mCtrNReserva.showFrmGenerarReserva();                
                break;
            //SERVICIO
            case "pServicioHabitacion":
                this.mCtrNServicio.showFrmServicioHabitacion();
                break;
            case "pServicioExtra":
                this.mCtrNServicio.showFrmServicioExtra();
                break;
            //ALOJAMIENTO
            case "pRegistrarAlojamiento":
                this.mCtrNAlojamiento.showFrmAlojamiento();
                break;
            case "pReporteAlojamiento":
                this.mCtrNAlojamiento.showFrmReporteAlojamiento();
                break;
            case "pmantener":
                this.mCtrMantenimiento.showFrmMantenerRegistro();
                break;
            case "pGenerarL":
                this.mCtrGenerarLHPISO.showFrmGenerarlistaLHP();
                break;
            case "pActualizarE":
             this.mCtrlActualizarEHabD.showFrmActualizarEstadoHabitacionADisponile();
            break;

            //FACTURACION
            case "pRegistrarCobro":
                this.mctrFacturacion.showFrmFacturacion();
                break;   
            //MANTENIMIENTO
            case "pMantenimiento":
                break;
            //OTROS
            case "exit":
                Usuario.getInstance()
                        .getCurrentSesion()
                        .finishSesion();
                System.out.println(LOG_TAG+": ---------------cerrando sesión---------------");
                System.exit(0);                
                break;
        }
                
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
             
    }

    /**
     * Evento que se ejecuta cuando la ventana
     * se está cerrando.
     * 
     * @param e objeto evento
     */
    @Override
    public void windowClosing(WindowEvent e) {
        Usuario.getInstance()
                        .getCurrentSesion()
                        .finishSesion();
        System.out.println(LOG_TAG+": ---------------cerrando sesión---------------");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
    //método importante
    /**
     * Init <br>
     * método que inicializa las configuraciones
     * importantes del sistema.
     */
    public void init(){            
        //inicializar la conexión de base de datos
        BasicDao.init();        
        BasicDao.DEBUG=false;
        //maximizar la ventana principal
        mFrmMain.maximize();
        //inhabilitar el formulario principal
        disableFrmMain();
        //mostrar el login (seguridad)
        mCtrNSeguridad.showFrmLogin();                
                
        
        mCtrNSeguridad.loadData();
        //cuando el usuario se logea, se crea una nueva sesión
        //del usuario en el sistema
        mCtrNSeguridad.setOnUserLogged(new Callback<String>(){
            @Override
            public void execute(String[] args) {                
                //habilitar el formulario principal                
                
                
                //crear nueva sesión y asignarle al usuario correspondiente
                Usuario currentUser =Usuario.getInstance();
                Sesion currentSesion=new Sesion();
                currentUser.setCurrentSesion(currentSesion);
                currentSesion.startSesion();
                currentSesion.setIdSesion(Sesion.getLastSesionOfUser(currentUser.getIdUser()).getIdSesion());
                System.out.println(LOG_TAG+": ---------------iniciando sesión---------------");
                
                
                enableFrmMain();
                enableMenus();
            }
        });
        
        //pasar el callback invocador (interfaz) a todas
        //las controladoras de negocio
        
        
    }
    //setters and getters
    public CtrFacturacion getMctrFacturacion() {
        return mctrFacturacion;
    }

    public void setMctrFacturacion(CtrFacturacion mctrFacturacion) {    
        this.mctrFacturacion = mctrFacturacion;
    }

    public CtrNSeguridad getCtrNFacturacion() {
        return mCtrNSeguridad;
    }

    public void setCtrNSeguridad(CtrNSeguridad ctrNSeguridad) {
        this.mCtrNSeguridad = ctrNSeguridad;
    }
    
    public CtrNReserva getCtrNReserva() {
        return mCtrNReserva;
    }

    public void setCtrNReserva(CtrNReserva mCtrNReserva) {
        this.mCtrNReserva = mCtrNReserva;
    }

    public CtrNServicio getCtrNServicio() {
        return mCtrNServicio;
    }

    public void setCtrNServicio(CtrNServicio ctrNServicio) {
        this.mCtrNServicio = ctrNServicio;
    }

    public CtrNAlojamiento getCtrNAlojamiento() {
        return mCtrNAlojamiento;
    }

    public CtrlMantenerRDLH getCtrMatenerRLH() {
        return mCtrMantenimiento;
    }
    
    public void setCtrlMantenimiento(CtrlMantenerRDLH ctrMantener)
    {
        this.mCtrMantenimiento=ctrMantener;
    }
     public CtrGenerarLHPISO getCtrGenerarLHPISO() {
        return mCtrGenerarLHPISO;
    }
    
    public void setCtlGenerarLHPISO(CtrGenerarLHPISO ctrGenerarLHPISO)
    {
        this.mCtrGenerarLHPISO=ctrGenerarLHPISO;
    }
     public CtrlActualizarEstadoHabitacionADisponible getCtrActualizarEstadoHabitacionADisponible() {
        return mCtrlActualizarEHabD;
    }
    
    public void setCtlActualizarEstadoHabitacionADisponible(CtrlActualizarEstadoHabitacionADisponible ctrlActualizarEstadoHabitacionADisponible)
    {
        this.mCtrlActualizarEHabD=ctrlActualizarEstadoHabitacionADisponible;
    }
    public void setCtrNAlojamiento(CtrNAlojamiento ctrNAlojamiento) {
        this.mCtrNAlojamiento = ctrNAlojamiento;
    }    
    /**
     * Permite habilitar y desabilitar menus dependiendo
     * del tipo de rol que el usuario principal tiene.
     * 
     */
    public void enableMenus(){
        mUsuario=Usuario.getInstance();
        Rol userRol=mUsuario.getRolUser();
        String[] pestanaList=mUsuario.getRolUser().getPestanasHabilitadas();
        
        System.out.println(userRol.getNombreRol());
        //iterar cada  pestaña que se va a habilitar 
        for(String pestana :pestanaList) {
            System.out.println(pestana);
            switch(pestana){
                //FACTURACIÓN
                case "pfacturacion":
                    mFrmMain.MnFacturacion.setEnabled(true);
                    break;
                    
                //RESERVA
                case "preserva":
                    mFrmMain.MnReserva.setEnabled(true);
                    break;
                //SERVICIO
                case "pServicio":
                    mFrmMain.MnServicio.setEnabled(true);
                    break;
                //ALOJAMIENTO
                case "pAlojamiento":
                     mFrmMain.MnAlojamiento.setEnabled(true);
                     break;
                //MANTENIMIENTO
                case "pMantenimiento":
                    mFrmMain.MnMantenimiento.setEnabled(true);
                    break;
                    
                //TODOS
                case "all":
                    mFrmMain.MnAdministrador.setEnabled(true);
                    mFrmMain.MnFacturacion.setEnabled(true);
                    mFrmMain.MnReserva.setEnabled(true);
                    mFrmMain.MnAlojamiento.setEnabled(true);
                    mFrmMain.MnServicio.setEnabled(true);
                    mFrmMain.MnMantenimiento.setEnabled(true);

            }
        }
            
    }
    
    
    /**
     * showFrmMain <br>
     * Permite mostrar el formulario principal
     *      
    */ 
    private void showFrmMain(){
        mFrmMain.setVisible(true);
    }
    
    
    /**
     * hideFrmMain <br>
     * Permite mostrar el formulario principal
     *      
    */ 
    private void hideFrmMain(){
        mFrmMain.setVisible(false);        
    }
    
    /**
     * disableFrmMain <br>
     * inhabilita el formulario principal
     *      
    */ 
    private void disableFrmMain(){
        mFrmMain.setEnabled(false);
        mFrmMain.toBack();
    }
    
    
    /**
     * enableFrmMain <br>
     * habilita el formulario principal
     *      
    */ 
    private void enableFrmMain(){
        mFrmMain.setEnabled(true);
    }


}

