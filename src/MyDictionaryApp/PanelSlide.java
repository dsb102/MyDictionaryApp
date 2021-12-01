package MyDictionaryApp;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;


public class PanelSlide extends javax.swing.JPanel {

    public PanelSlide() {
        initComponents();
        list = new ArrayList<>();
        timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                animate();
            }
        });
    }

    private final List<Component> list;
    private final Timer timer;
    // tốc độ chạy animate slide
    private int speed = 1;
    private Component comExit;
    private Component comShow;
    private int currrentShowing;
    private boolean animateRight;

    public void init(Component... com) {
        if (com.length > 0) {
            for (Component component : com) {
                list.add(component);
                component.setSize(getSize());
                component.setVisible(false);
                this.add(component);
            }
            Component show = list.get(0);
            show.setVisible(true);
            show.setLocation(0, 0);
        }
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void show(int index) {
        if (!timer.isRunning()) {
            if (list.size() > 2 && index < list.size() && index != currrentShowing) {
                comShow = list.get(index);
                comExit = list.get(currrentShowing);
                animateRight = index < currrentShowing;
                currrentShowing = index;
                comShow.setVisible(true);
                if (animateRight) {
                    comShow.setLocation(-comShow.getWidth(), 0);
                } else {
                    comShow.setLocation(getWidth(), 0);
                }
                timer.start();
            }
        }
    }

    private void animate() {
        if (animateRight) {
            if (comShow.getLocation().x < 0) {
                comShow.setLocation(comShow.getLocation().x + speed, 0);
                comExit.setLocation(comExit.getLocation().x + speed, 0);
            } else {
                comShow.setLocation(0, 0);
                timer.stop();
                comExit.setVisible(false);
            }
        } else {
            if (comShow.getLocation().x > 0) {
                comShow.setLocation(comShow.getLocation().x - speed, 0);
                comExit.setLocation(comExit.getLocation().x - speed, 0);
            } else {
                comShow.setLocation(0, 0);
                timer.stop();
                comExit.setVisible(false);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(26, 39, 68));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1048, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
