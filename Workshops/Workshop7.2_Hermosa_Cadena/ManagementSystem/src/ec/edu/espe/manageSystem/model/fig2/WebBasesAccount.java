/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.manageSystem.model.fig2;

/**
 *
 * @author Labs-DCCO
 */
public class WebBasesAccount extends Account{
    private String url;
    private String lastAccessedDate;

    public WebBasesAccount(String label, String createdOnDate, String lastModifiedOn) {
        super(label, createdOnDate, lastModifiedOn);
    }
    
}
