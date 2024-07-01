/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea02qtjambi;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QMainWindow;
/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
        QApplication app = new QApplication(args);
        //app.initialize(args);
        QMainWindow mw = new QMainWindow();
        FrmPrincipal principal = new FrmPrincipal();
        principal.setupUi( mw );
        mw.show();
        app.exec();
    }

}
