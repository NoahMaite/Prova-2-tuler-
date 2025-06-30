//Nayara Pereira Soares CB3030717 

import java.util.Scanner;

public class Hora {

    private int _hora;
    private int _min;
    private int _seg;
    private static final Scanner _sc = new Scanner(System.in);

    public Hora() {
        while (true) {
            System.out.print("Digite a hora (0-23): ");
            int h = _sc.nextInt();
            if (h < 0 || h > 23) {
                System.err.println("Hora inválida! Tente novamente.");
                continue;
            }

            System.out.print("Digite o minuto (0-59): ");
            int m = _sc.nextInt();
            if (m < 0 || m > 59) {
                System.err.println("Minuto inválido! Tente novamente.");
                continue;
            }

            System.out.print("Digite o segundo (0-59): ");
            int s = _sc.nextInt();
            if (s < 0 || s > 59) {
                System.err.println("Segundo inválido! Tente novamente.");
                continue;
            }
            setHor(h);
            setMin(m);
            setSeg(s);
            break;
        }
    }

    public Hora(int h, int m, int s) {
        if (h >= 0 && h <= 23) {
            _hora = h;
        } else {
            System.err.println("Hora inválida! Valor ignorado.");
        }
        if (m >= 0 && m <= 59) {
            _min = m;
        } else {
            System.err.println("Minuto inválido! Valor ignorado.");
        }
        if (s >= 0 && s <= 59) {
            _seg = s;
        } else {
            System.err.println("Segundo inválido! Valor ignorado.");
        }
    }

    public void setHor(int h) {
        if (h < 0 || h > 23) {
            System.err.println("Valor 'h' inserido inválido");
            return;
        }
        _hora = h;
    }

    public void setHor() {
        int hora = 0;
        do {
            System.out.println("Digite a hora:");
            hora = _sc.nextInt();
            if (hora < 0 || hora > 23) {
                System.err.println("Hora inválida! Tente novamente.");
            }
        } while (hora > 23 || hora < 0);
        _hora = hora;
    }

    public void setMin(int m) {
        if (m < 0 || m > 59) {
            System.err.println("Valor 'm' inserido inválido");
            return;
        }
        _min = m;
    }

    public void setMin() {
        int minuto = 0;
        do {
            System.out.println("Digite o minuto:");
            minuto = _sc.nextInt();
            if (minuto < 0 || minuto > 59) {
                System.err.println("Minuto inválido! Tente novamente.");
            }
        } while (minuto > 59 || minuto < 0);
        _min = minuto;
    }

    public void setSeg(int s) {
        if (s < 0 || s > 59) {
            System.err.println("Valor 's' inserido inválido");
            return;
        }
        _seg = s;
    }

    public void setSeg() {
        int segundo = 0;
        do {
            System.out.println("Digite o segundo:");
            segundo = _sc.nextInt();
            if (segundo < 0 || segundo > 59) {
                System.err.println("Segundo inválido! Tente novamente.");
            }
        } while (segundo > 59 || segundo < 0);
        _seg = segundo;
    }

    public int getHor() {
        return _hora;
    }

    public int getMin() {
        return _min;
    }

    public int getSeg() {
        return _seg;
    }

    public String getHora1() {
        String horaStr = (_hora < 10 ? "0" : "") + _hora;
        String minStr = (_min < 10 ? "0" : "") + _min;
        String segStr = (_seg < 10 ? "0" : "") + _seg;
        return horaStr + ":" + minStr + ":" + segStr;
    }

    public String getHora2() {
        int hora12 = _hora % 12;
        hora12 = (hora12 == 0) ? 12 : hora12;
        String periodo = (_hora < 12) ? "AM" : "PM";
        String horaStr = (hora12 < 10 ? "0" : "") + hora12;
        String minStr = (_min < 10 ? "0" : "") + _min;
        String segStr = (_seg < 10 ? "0" : "") + _seg;
        return horaStr + ":" + minStr + ":" + segStr + " " + periodo;
    }

    public int getSegundos() {
        return (_hora * 3600) + (_min * 60) + _seg;
    }
}
