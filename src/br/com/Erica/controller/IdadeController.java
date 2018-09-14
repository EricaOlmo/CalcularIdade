package br.com.Erica.controller;

import br.com.Erica.model.IdadeModel;
import br.com.Erica.view.IdadeView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Erica
 */
public class IdadeController implements ActionListener{

    private IdadeView minhaView;

    public IdadeController() {
        minhaView = new IdadeView();
        IdadeModel model = new IdadeModel();
        minhaView.setCalcula(model); //metodo ja criado antes
        this.minhaView.addControllerActionListener(this);
        this.minhaView.setVisible(true);
    }
        
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (minhaView!=null){
            this.calculaIdade();
        }
    }
    
    private void calculaIdade() {
       IdadeModel idadeCalc = minhaView.getCalcula();
       idadeCalc.getIdadeModel();
       minhaView.setCalcula(idadeCalc);
       
    }
    
}
