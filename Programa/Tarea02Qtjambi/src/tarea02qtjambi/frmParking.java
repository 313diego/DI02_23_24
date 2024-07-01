/** ******************************************************************************
 ** Form generated from reading ui file 'frmParking.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ******************************************************************************* */
package tarea02qtjambi;

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;
import javax.swing.JOptionPane;

public class frmParking implements com.trolltech.qt.QUiForm<QDialog> {

    public QLabel labelFrameDatosCliente;
    public QLabel labelFrameDatosReserva;
    public QLabel labelFrameLimpieza;
    public QLabel labelBotones;
    public QWidget widget;
    public QGridLayout gridLayout;
    public QLabel labelDatosCliente;
    public QLabel labelNombre;
    public QLineEdit lineEditNombre;
    public QLabel labelApellidos;
    public QLineEdit lineEditApellidos;
    public QLabel labelTelefono;
    public QLineEdit lineEditTelefono;
    public QWidget widget1;
    public QGridLayout gridLayout_2;
    public QLabel labelDatosReserva;
    public QLabel labelFecIni;
    public QLabel labelFecFin;
    public QCalendarWidget calendarWidgetIni;
    public QCalendarWidget calendarWidgetFin;
    public QLabel labelTipoVehiculo;
    public QRadioButton radioButtonGrande;
    public QRadioButton radioButtonPeque;
    public QRadioButton radioButtonMoto;
    public QLabel labelPlazas;
    public QSpinBox spinBoxPlazas;
    public QLabel labelTipoPlaza;
    public QComboBox comboBoxTipoPlaza;
    public QLabel labelLimpieza;
    public QCheckBox checkBoxLimpieza;
    public QWidget widget2;
    public QGridLayout gridLayout_3;
    public QLabel labelTipoLimpieza;
    public QRadioButton radioButtonLimpComp;
    public QRadioButton radioButtonLimpExt;
    public QRadioButton radioButtonLimpInt;
    public QWidget widget3;
    public QGridLayout gridLayout_4;
    public QPushButton pushButtonEnviar;
    public QPushButton pushButtonCerrar;
    public QPushButton pushButtonLimpiar;

    public frmParking() {
        super();
    }
    
    // Hacer visible o no los radiobutton de limpieza y su etiqueta
    void cambiarL() {
        //si se ha activado la casilla de verificacion mostraremos el mensaje
        if (checkBoxLimpieza.isChecked()) {
            labelTipoLimpieza.setVisible(true);
            radioButtonLimpComp.setVisible(true);
            radioButtonLimpExt.setVisible(true);
            radioButtonLimpInt.setVisible(true);
        } else {
            labelTipoLimpieza.setVisible(false);
            radioButtonLimpComp.setVisible(false);
            radioButtonLimpExt.setVisible(false);
            radioButtonLimpInt.setVisible(false);
        }

    }
    
    // Metodo para que al cerrar la ventana mostramos el mensaje
    void cerrarP() {
        JOptionPane.showMessageDialog(null, "La ventana se va a cerrar");
        System.exit(0);
    }
    // Metodo para mostarar mensaje, limpiar los cambios y cerrar la ventana al pulsar enviar
    void enviarP() {
        JOptionPane.showMessageDialog(null, "Reserva realizada con exito");
        lineEditNombre.clear();
        lineEditApellidos.clear();
        lineEditTelefono.clear();
        cerrarP();
        
    }

    @Override
    public void setupUi(QDialog Dialog) {
        Dialog.setObjectName("Dialog");
        Dialog.resize(new QSize(953, 673).expandedTo(Dialog.minimumSizeHint()));
        labelFrameDatosCliente = new QLabel(Dialog);
        labelFrameDatosCliente.setObjectName("labelFrameDatosCliente");
        labelFrameDatosCliente.setEnabled(false);
        labelFrameDatosCliente.setGeometry(new QRect(10, 10, 931, 141));
        QPalette palette = new QPalette();
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(170, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Light, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(212, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(85, 127, 127));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(113, 170, 170));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(170, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.AlternateBase, new QColor(212, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(170, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Light, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Midlight, new QColor(212, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Dark, new QColor(85, 127, 127));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(113, 170, 170));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(170, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.AlternateBase, new QColor(212, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(85, 127, 127));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(170, 255, 255));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Light, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Midlight, new QColor(212, 255, 255));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Dark, new QColor(85, 127, 127));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(113, 170, 170));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(85, 127, 127));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(85, 127, 127));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(170, 255, 255));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(170, 255, 255));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.AlternateBase, new QColor(170, 255, 255));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        labelFrameDatosCliente.setPalette(palette);
        labelFrameDatosCliente.setAutoFillBackground(true);
        labelFrameDatosCliente.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.NoFrame);
        labelFrameDatosReserva = new QLabel(Dialog);
        labelFrameDatosReserva.setObjectName("labelFrameDatosReserva");
        labelFrameDatosReserva.setGeometry(new QRect(10, 160, 931, 361));
        QPalette palette1 = new QPalette();
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(170, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Light, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(212, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(85, 127, 127));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(113, 170, 170));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(170, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.AlternateBase, new QColor(212, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(170, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Light, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Midlight, new QColor(212, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Dark, new QColor(85, 127, 127));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(113, 170, 170));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(170, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.AlternateBase, new QColor(212, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(85, 127, 127));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(170, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Light, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Midlight, new QColor(212, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Dark, new QColor(85, 127, 127));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(113, 170, 170));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(85, 127, 127));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(85, 127, 127));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(170, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(170, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.AlternateBase, new QColor(170, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        labelFrameDatosReserva.setPalette(palette1);
        labelFrameDatosReserva.setAutoFillBackground(true);
        labelFrameDatosReserva.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.NoFrame);
        labelFrameLimpieza = new QLabel(Dialog);
        labelFrameLimpieza.setObjectName("labelFrameLimpieza");
        labelFrameLimpieza.setEnabled(false);
        labelFrameLimpieza.setGeometry(new QRect(10, 540, 741, 121));
        QPalette palette2 = new QPalette();
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(170, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Light, new QColor(255, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(212, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(85, 127, 127));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(113, 170, 170));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(170, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.AlternateBase, new QColor(212, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(170, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Light, new QColor(255, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Midlight, new QColor(212, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Dark, new QColor(85, 127, 127));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(113, 170, 170));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(170, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.AlternateBase, new QColor(212, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(85, 127, 127));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(170, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Light, new QColor(255, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Midlight, new QColor(212, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Dark, new QColor(85, 127, 127));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(113, 170, 170));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(85, 127, 127));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(85, 127, 127));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(170, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(170, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.AlternateBase, new QColor(170, 255, 255));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        labelFrameLimpieza.setPalette(palette2);
        labelFrameLimpieza.setAutoFillBackground(true);
        labelFrameLimpieza.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.NoFrame);
        labelFrameLimpieza.setWordWrap(false);
        labelBotones = new QLabel(Dialog);
        labelBotones.setObjectName("labelBotones");
        labelBotones.setGeometry(new QRect(760, 540, 181, 121));
        QPalette palette3 = new QPalette();
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(170, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Light, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(212, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(85, 127, 127));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(113, 170, 170));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(170, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.AlternateBase, new QColor(212, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(170, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Light, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Midlight, new QColor(212, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Dark, new QColor(85, 127, 127));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(113, 170, 170));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(170, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.AlternateBase, new QColor(212, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(85, 127, 127));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(170, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Light, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Midlight, new QColor(212, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Dark, new QColor(85, 127, 127));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(113, 170, 170));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(85, 127, 127));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(85, 127, 127));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(170, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(170, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.AlternateBase, new QColor(170, 255, 255));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        labelBotones.setPalette(palette3);
        labelBotones.setAutoFillBackground(true);
        labelBotones.setWordWrap(false);
        widget = new QWidget(Dialog);
        widget.setObjectName("widget");
        widget.setGeometry(new QRect(20, 10, 911, 131));
        gridLayout = new QGridLayout(widget);
        gridLayout.setObjectName("gridLayout");
        labelDatosCliente = new QLabel(widget);
        labelDatosCliente.setObjectName("labelDatosCliente");
        QFont font = new QFont();
        font.setPointSize(14);
        font.setBold(true);
        font.setWeight(75);
        labelDatosCliente.setFont(font);

        gridLayout.addWidget(labelDatosCliente, 0, 0, 1, 2);

        labelNombre = new QLabel(widget);
        labelNombre.setObjectName("labelNombre");

        gridLayout.addWidget(labelNombre, 1, 0, 1, 1);

        lineEditNombre = new QLineEdit(widget);
        lineEditNombre.setObjectName("lineEditNombre");

        gridLayout.addWidget(lineEditNombre, 1, 1, 1, 1);

        labelApellidos = new QLabel(widget);
        labelApellidos.setObjectName("labelApellidos");

        gridLayout.addWidget(labelApellidos, 2, 0, 1, 1);

        lineEditApellidos = new QLineEdit(widget);
        lineEditApellidos.setObjectName("lineEditApellidos");

        gridLayout.addWidget(lineEditApellidos, 2, 1, 1, 1);

        labelTelefono = new QLabel(widget);
        labelTelefono.setObjectName("labelTelefono");

        gridLayout.addWidget(labelTelefono, 3, 0, 1, 1);

        lineEditTelefono = new QLineEdit(widget);
        lineEditTelefono.setObjectName("lineEditTelefono");

        gridLayout.addWidget(lineEditTelefono, 3, 1, 1, 1);

        widget1 = new QWidget(Dialog);
        widget1.setObjectName("widget1");
        widget1.setGeometry(new QRect(20, 170, 904, 341));
        gridLayout_2 = new QGridLayout(widget1);
        gridLayout_2.setObjectName("gridLayout_2");
        labelDatosReserva = new QLabel(widget1);
        labelDatosReserva.setObjectName("labelDatosReserva");
        QFont font1 = new QFont();
        font1.setPointSize(14);
        font1.setBold(true);
        font1.setItalic(false);
        font1.setWeight(75);
        labelDatosReserva.setFont(font1);

        gridLayout_2.addWidget(labelDatosReserva, 0, 0, 1, 2);

        labelFecIni = new QLabel(widget1);
        labelFecIni.setObjectName("labelFecIni");

        gridLayout_2.addWidget(labelFecIni, 1, 0, 1, 1);

        labelFecFin = new QLabel(widget1);
        labelFecFin.setObjectName("labelFecFin");

        gridLayout_2.addWidget(labelFecFin, 1, 5, 1, 1);

        calendarWidgetIni = new QCalendarWidget(widget1);
        calendarWidgetIni.setObjectName("calendarWidgetIni");
        calendarWidgetIni.setEnabled(true);
        QPalette palette4 = new QPalette();
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(170, 255, 0));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Light, new QColor(213, 255, 127));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(191, 255, 63));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(85, 127, 0));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(113, 170, 0));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(170, 255, 0));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.AlternateBase, new QColor(212, 255, 127));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(170, 255, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Light, new QColor(213, 255, 127));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Midlight, new QColor(191, 255, 63));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Dark, new QColor(85, 127, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(113, 170, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(170, 255, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.AlternateBase, new QColor(212, 255, 127));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(85, 127, 0));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(170, 255, 0));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Light, new QColor(213, 255, 127));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Midlight, new QColor(191, 255, 63));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Dark, new QColor(85, 127, 0));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(113, 170, 0));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(85, 127, 0));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(85, 127, 0));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(170, 255, 0));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(170, 255, 0));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.AlternateBase, new QColor(170, 255, 0));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        calendarWidgetIni.setPalette(palette4);
        calendarWidgetIni.setMinimumDate(new QDate(2023, 1, 1));
        calendarWidgetIni.setFirstDayOfWeek(com.trolltech.qt.core.Qt.DayOfWeek.Monday);
        calendarWidgetIni.setGridVisible(true);

        gridLayout_2.addWidget(calendarWidgetIni, 2, 0, 1, 5);

        calendarWidgetFin = new QCalendarWidget(widget1);
        calendarWidgetFin.setObjectName("calendarWidgetFin");
        QPalette palette5 = new QPalette();
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(170, 255, 0));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Light, new QColor(213, 255, 127));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(191, 255, 63));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(85, 127, 0));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(113, 170, 0));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(170, 255, 0));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.AlternateBase, new QColor(212, 255, 127));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(170, 255, 0));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Light, new QColor(213, 255, 127));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Midlight, new QColor(191, 255, 63));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Dark, new QColor(85, 127, 0));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(113, 170, 0));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(170, 255, 0));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.AlternateBase, new QColor(212, 255, 127));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(85, 127, 0));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(170, 255, 0));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Light, new QColor(213, 255, 127));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Midlight, new QColor(191, 255, 63));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Dark, new QColor(85, 127, 0));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(113, 170, 0));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(85, 127, 0));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(85, 127, 0));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(170, 255, 0));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(170, 255, 0));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.AlternateBase, new QColor(170, 255, 0));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        calendarWidgetFin.setPalette(palette5);
        calendarWidgetFin.setMinimumDate(new QDate(2023, 1, 1));
        calendarWidgetFin.setFirstDayOfWeek(com.trolltech.qt.core.Qt.DayOfWeek.Monday);
        calendarWidgetFin.setGridVisible(true);

        gridLayout_2.addWidget(calendarWidgetFin, 2, 5, 1, 2);

        labelTipoVehiculo = new QLabel(widget1);
        labelTipoVehiculo.setObjectName("labelTipoVehiculo");

        gridLayout_2.addWidget(labelTipoVehiculo, 3, 0, 1, 1);

        radioButtonGrande = new QRadioButton(widget1);
        radioButtonGrande.setObjectName("radioButtonGrande");

        gridLayout_2.addWidget(radioButtonGrande, 3, 1, 1, 3);

        radioButtonPeque = new QRadioButton(widget1);
        radioButtonPeque.setObjectName("radioButtonPeque");

        gridLayout_2.addWidget(radioButtonPeque, 3, 4, 1, 2);

        radioButtonMoto = new QRadioButton(widget1);
        radioButtonMoto.setObjectName("radioButtonMoto");

        gridLayout_2.addWidget(radioButtonMoto, 3, 6, 1, 1);

        labelPlazas = new QLabel(widget1);
        labelPlazas.setObjectName("labelPlazas");

        gridLayout_2.addWidget(labelPlazas, 4, 0, 1, 1);

        spinBoxPlazas = new QSpinBox(widget1);
        spinBoxPlazas.setObjectName("spinBoxPlazas");
        spinBoxPlazas.setMinimum(1);
        spinBoxPlazas.setMaximum(50);

        gridLayout_2.addWidget(spinBoxPlazas, 4, 1, 1, 1);

        labelTipoPlaza = new QLabel(widget1);
        labelTipoPlaza.setObjectName("labelTipoPlaza");

        gridLayout_2.addWidget(labelTipoPlaza, 4, 2, 1, 1);

        comboBoxTipoPlaza = new QComboBox(widget1);
        comboBoxTipoPlaza.setObjectName("comboBoxTipoPlaza");
        comboBoxTipoPlaza.setMaxVisibleItems(3);
        comboBoxTipoPlaza.setMinimumContentsLength(1);

        gridLayout_2.addWidget(comboBoxTipoPlaza, 4, 3, 1, 2);

        labelLimpieza = new QLabel(widget1);
        labelLimpieza.setObjectName("labelLimpieza");

        gridLayout_2.addWidget(labelLimpieza, 4, 5, 1, 1);

        checkBoxLimpieza = new QCheckBox(widget1);
        checkBoxLimpieza.setObjectName("checkBoxLimpieza");

        gridLayout_2.addWidget(checkBoxLimpieza, 4, 6, 1, 1);

        widget2 = new QWidget(Dialog);
        widget2.setObjectName("widget2");
        widget2.setGeometry(new QRect(20, 550, 721, 71));
        gridLayout_3 = new QGridLayout(widget2);
        gridLayout_3.setObjectName("gridLayout_3");
        labelTipoLimpieza = new QLabel(widget2);
        labelTipoLimpieza.setObjectName("labelTipoLimpieza");
        labelTipoLimpieza.setEnabled(false);
        QFont font2 = new QFont();
        font2.setPointSize(14);
        font2.setBold(true);
        font2.setWeight(75);
        labelTipoLimpieza.setFont(font2);

        gridLayout_3.addWidget(labelTipoLimpieza, 0, 0, 1, 1);

        radioButtonLimpComp = new QRadioButton(widget2);
        radioButtonLimpComp.setObjectName("radioButtonLimpComp");
        radioButtonLimpComp.setEnabled(false);

        gridLayout_3.addWidget(radioButtonLimpComp, 1, 0, 1, 1);

        radioButtonLimpExt = new QRadioButton(widget2);
        radioButtonLimpExt.setObjectName("radioButtonLimpExt");
        radioButtonLimpExt.setEnabled(false);

        gridLayout_3.addWidget(radioButtonLimpExt, 1, 1, 1, 1);

        radioButtonLimpInt = new QRadioButton(widget2);
        radioButtonLimpInt.setObjectName("radioButtonLimpInt");
        radioButtonLimpInt.setEnabled(false);

        gridLayout_3.addWidget(radioButtonLimpInt, 1, 2, 1, 1);

        widget3 = new QWidget(Dialog);
        widget3.setObjectName("widget3");
        widget3.setGeometry(new QRect(780, 550, 142, 95));
        gridLayout_4 = new QGridLayout(widget3);
        gridLayout_4.setObjectName("gridLayout_4");
        pushButtonEnviar = new QPushButton(widget3);
        pushButtonEnviar.setObjectName("pushButtonEnviar");
        pushButtonEnviar.setFlat(false);

        gridLayout_4.addWidget(pushButtonEnviar, 0, 0, 1, 1);

        pushButtonCerrar = new QPushButton(widget3);
        pushButtonCerrar.setObjectName("pushButtonCerrar");

        gridLayout_4.addWidget(pushButtonCerrar, 1, 0, 1, 1);

        pushButtonLimpiar = new QPushButton(widget3);
        pushButtonLimpiar.setObjectName("pushButtonLimpiar");

        gridLayout_4.addWidget(pushButtonLimpiar, 2, 0, 1, 1);

        labelNombre.setBuddy(lineEditNombre);
        labelApellidos.setBuddy(lineEditApellidos);
        labelTelefono.setBuddy(lineEditTelefono);
        labelFecIni.setBuddy(calendarWidgetIni);
        labelFecFin.setBuddy(calendarWidgetFin);
        labelTipoVehiculo.setBuddy(radioButtonGrande);
        labelPlazas.setBuddy(spinBoxPlazas);
        labelTipoPlaza.setBuddy(comboBoxTipoPlaza);
        labelLimpieza.setBuddy(checkBoxLimpieza);
        retranslateUi(Dialog);
        // Mostrar o no el frame de limpieza si esta clicado
        checkBoxLimpieza.clicked.connect(labelFrameLimpieza, "setEnabled(boolean)");
        // Al pulsar cerrar llamamos al metodo cerrar
        pushButtonCerrar.clicked.connect(this, "cerrarP()");
        // Al pulsar el boton Limpiar limpiamos los campos
        pushButtonLimpiar.clicked.connect(lineEditNombre, "clear()");
        pushButtonLimpiar.clicked.connect(lineEditApellidos, "clear()");
        pushButtonLimpiar.clicked.connect(lineEditTelefono, "clear()");
        // Al estar seleccionado el checkbox limpieza desabiitamos los radiobutton y el label de limpieza
        checkBoxLimpieza.clicked.connect(radioButtonLimpExt, "setEnabled(boolean)");
        checkBoxLimpieza.clicked.connect(radioButtonLimpInt, "setEnabled(boolean)");
        checkBoxLimpieza.clicked.connect(labelTipoLimpieza, "setEnabled(boolean)");
        checkBoxLimpieza.clicked.connect(radioButtonLimpComp, "setEnabled(boolean)");
        // Al pulsar el boton enviar llamamos al metodo enviarP
        pushButtonEnviar.clicked.connect(this, "enviarP()");

        Dialog.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog Dialog) {
        Dialog.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Dialog", null));
        labelFrameDatosCliente.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>En estos campos debes incluir tu nombre, apellidos y telefono.</p></body></html>", null));
        labelFrameDatosCliente.setText("");
        labelFrameDatosReserva.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>En estos campos debes incluir los datos de la reserva</p></body></html>", null));
        labelFrameDatosReserva.setText("");
        labelFrameLimpieza.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>En estos campos debes seleccionar que tipo de limpieza deseas</p></body></html>", null));
        labelFrameLimpieza.setText("");
        labelBotones.setText("");
        labelDatosCliente.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Datos del cliente", null));
        labelNombre.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>&amp;Nombre:</p></body></html>", null));
        lineEditNombre.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Introduce tu nombre</p></body></html>", null));
        labelApellidos.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>&amp;Apellidos:</p></body></html>", null));
        lineEditApellidos.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Introduce tus apellidos</p></body></html>", null));
        labelTelefono.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>&amp;Telefono:</p><p><br/></p></body></html>", null));
        lineEditTelefono.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Introduce tu tel\u00e9fono</p></body></html>", null));
        labelDatosReserva.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Datos de la reserva", null));
        labelFecIni.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Fecha de inicio:", null));
        labelFecFin.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Fecha de fin:", null));
        calendarWidgetIni.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Selecciona la fecha de entrada en el parking</p></body></html>", null));
        calendarWidgetFin.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Selecciona la fecha de salida del parking</p></body></html>", null));
        labelTipoVehiculo.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Tipo de vehiculo:", null));
        radioButtonGrande.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Selecciona esta casilla para vehiculos de mas de 4,5 metros de largo</p><p><br/></p></body></html>", null));
        radioButtonGrande.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Vehiculo grande (+4,5m)", null));
        radioButtonPeque.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Selecciona esta casilla si tu vehiculo mide menos de 4,5 metros de largo</p><p><br/></p></body></html>", null));
        radioButtonPeque.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Vehiculo peque\u00f1o", null));
        radioButtonMoto.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Selecciona esta casilla si es una motocicleta o ciclomotor</p></body></html>", null));
        radioButtonMoto.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Motocicleta", null));
        labelPlazas.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>&amp;Numero de plazas:</p></body></html>", null));
        spinBoxPlazas.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Selecciona el numero de plazas que desea reservar</p></body></html>", null));
        labelTipoPlaza.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Tipo de plaza:", null));
        comboBoxTipoPlaza.clear();
        comboBoxTipoPlaza.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Estandar", null));
        comboBoxTipoPlaza.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Premium", null));
        comboBoxTipoPlaza.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Deluxe", null));
        comboBoxTipoPlaza.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Selecciona el tipo de plaza que desea</p></body></html>", null));
        labelLimpieza.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Limpieza:", null));
        checkBoxLimpieza.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Marque esta casilla si dese contratar el servicio de limpieza para su vehiculo</p></body></html>", null));
        checkBoxLimpieza.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Marque la casilla si desea contratar limpieza", null));
        labelTipoLimpieza.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Seleccione el tipo de limpieza", null));
        radioButtonLimpComp.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Seleccione esta casilla si desea un lavado completo de su vehiculo</p></body></html>", null));
        radioButtonLimpComp.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Limpieza completa", null));
        radioButtonLimpExt.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Seleccione esta casilla si desea un lavado exterior de su vehiculo</p></body></html>", null));
        radioButtonLimpExt.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Lavado exterior", null));
        radioButtonLimpInt.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Seleccione esta casilla si desea un lavado interior de su vehiculo</p></body></html>", null));
        radioButtonLimpInt.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Lavado interior", null));
        pushButtonEnviar.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Pulse este boton para enviar la reserva</p></body></html>", null));
        pushButtonEnviar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "ENVIAR", null));
        pushButtonCerrar.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Pulsa este boton para cerrar la ventana de reserva</p></body></html>", null));
        pushButtonCerrar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "CERRAR", null));
        pushButtonLimpiar.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Pulsa este boton si desea borrar los datos introducidos</p></body></html>", null));
        pushButtonLimpiar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "LIMPIAR CAMPOS", null));
    } // retranslateUi

}
