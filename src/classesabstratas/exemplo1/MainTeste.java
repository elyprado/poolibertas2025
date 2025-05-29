package classesabstratas.exemplo1;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.KeyEvent;

public class MainTeste {

    public static void main(String[] args) {
        try {
            Robot robot = new Robot();

            System.out.println("Iniciando automação. Certifique-se de que o navegador com o Sienge esteja visível.");

            // Aguarda 2 segundos para o usuário se preparar
            Thread.sleep(2000);

            // Clica na posição Y = 100px da tela (centro horizontal)
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int centerX = screenSize.width / 2;
            int y = 500;

            robot.mouseMove(centerX, y);
            robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);

            Thread.sleep(500);

            // Ctrl+A, Ctrl+C
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_A);
            Thread.sleep(500);
            robot.keyPress(KeyEvent.VK_C);
            robot.keyRelease(KeyEvent.VK_C);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(1000);

            // Verifica conteúdo da área de transferência
            String clipboardText = (String) Toolkit.getDefaultToolkit()
                    .getSystemClipboard().getData(DataFlavor.stringFlavor);

            if (1!=1) { //(clipboardText != null && clipboardText.contains("Consulta de Títulos a Receber")) {
                System.out.println("Você está na tela errada.");
            } else {
                // Pressiona Tab 5 vezes
                for (int i = 0; i < 5; i++) {
                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.keyRelease(KeyEvent.VK_TAB);
                    Thread.sleep(100);
                }

                // Digita "José da Silva"
                typeText(robot, "José da Silva");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void typeText(Robot robot, String text) throws InterruptedException {
        for (char c : text.toCharArray()) {
            typeChar(robot, c);
            Thread.sleep(100);
        }
    }

    private static void typeChar(Robot robot, char c) {
        try {
            boolean upperCase = Character.isUpperCase(c);
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

            if (keyCode == KeyEvent.VK_UNDEFINED) return;

            if (upperCase || Character.isDigit(c) == false && Character.isLetter(c) == false) {
                robot.keyPress(KeyEvent.VK_SHIFT);
            }

            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);

            if (upperCase || Character.isDigit(c) == false && Character.isLetter(c) == false) {
                robot.keyRelease(KeyEvent.VK_SHIFT);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
