/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team5.desktop.card;

/**
 *
 * @author Пользователь
 */
public class NumericCard extends Card{
    public NumericCard(int icon, String color)
    {
        super(icon, color);
    }

    @Override
    public void setColor(String color) {
        super.setColor(color); 
    }

    @Override
    public String getColor() {
        return super.getColor(); 
    }

    @Override
    public void setIcon(int icon) {
        super.setIcon(icon); 
    }

    @Override
    public int getIcon() {
        return super.getIcon(); 
    }

    @Override
    public String toString() {
        return "Numeric "+getColor()+" "+getIcon();
    }

    @Override
    public boolean equals(Object obj) {
        if(this.getClass()==obj.getClass())
        {
            if((((NumericCard)obj).getColor()==this.getColor())&&((NumericCard)obj).getIcon()==this.getIcon())
                return true;
            else
                return false;
        }
        else
            return false;
    }

    @Override
    public int hashCode() {
        return this.getIcon()^this.getColor().length();
    }
    
    
    
}

