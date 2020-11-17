import dip.counterExample.BadCuttingRobot;
import dip.counterExample.BadPizzaCutterArm;
import dip.example.CuttingRobot;
import dip.example.KnifeArm;
import dip.example.PizzaCutterArm;
import isp.counterExample.BadRobotWithAntennas;
import isp.counterExample.BadRobotWithoutAntennas;
import isp.example.RobotWithAntennas;
import isp.example.RobotWithoutAntennas;
import lsp.images.Circle;
import lsp.images.Figure;
import lsp.images.Square;
import lsp.images.Triangle;
import lsp.robot.BadEden;
import lsp.robot.Eden;
import lsp.robot.Sam;
import ocp.counterExample.BadRobotV1;
import ocp.counterExample.BadRobotV2_1;
import ocp.counterExample.BadRobotV2_2;
import ocp.counterExample.BadRobotV2_3;
import ocp.example.RobotV1;
import ocp.example.RobotV2;
import srp.counterExample.BadRobot;
import srp.example.ChefRobot;
import srp.example.DriverRobot;
import srp.example.GardenerRobot;
import srp.example.PainterRobot;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        System.out.println("|------------------------------------------|");
        System.out.println("|Demonstrating examples of SOLID Principles|");
        System.out.println("|------------------------------------------|");
        System.out.println("All examples are based on https://medium.com/backticks-tildes/the-s-o-l-i-d-principles-in-pictures-b34ce2f1e898");

        System.out.println();
        singleResponsibilityPrinciple();

        System.out.println();
        openClosedPrinciple();

        System.out.println();
        liskovSubstitutionPrinciple();

        System.out.println();
        liskovSubstitutionPrinciple2();

        System.out.println();
        interfaceSegregationPrinciple();

        System.out.println();
        dependencyInversionPrinciple();
    }

    public static void singleResponsibilityPrinciple() {
        System.out.println("Single Responsibility Principle Example:");
        System.out.println("----------------------------------------");
        BadRobot badRobot = new BadRobot();

        System.out.println(badRobot.cook());
        System.out.println(badRobot.trimPlants());
        System.out.println(badRobot.paint());
        System.out.println(badRobot.drive());

        ChefRobot chef = new ChefRobot();
        System.out.println(chef.cook());

        GardenerRobot gardener = new GardenerRobot();
        System.out.println(gardener.trimPlants());

        PainterRobot painter = new PainterRobot();
        System.out.println(painter.paint());

        DriverRobot driver = new DriverRobot();
        System.out.println(driver.drive());
    }

    public static void openClosedPrinciple() {
        System.out.println("Open Closed Principle Example:");
        System.out.println("------------------------------");

        BadRobotV1 badRobotV1 = new BadRobotV1();
        BadRobotV2_1 badRobotV2_1 = new BadRobotV2_1();
        BadRobotV2_2 badRobotV2_2 = new BadRobotV2_2();
        BadRobotV2_3 badRobotV2_3 = new BadRobotV2_3();

        System.out.println(badRobotV1.cut());
        System.out.println(badRobotV2_1.cut());
        System.out.println(badRobotV2_2.paint());
        System.out.println(badRobotV2_3.paint());

        RobotV1 robotV1 = new RobotV1();
        RobotV2 robotV2 = new RobotV2();

        System.out.println(robotV1.cut());
        System.out.println(robotV2.cut());
        System.out.println(robotV2.paint());
    }

    public static void liskovSubstitutionPrinciple() {
        System.out.println("Liskov Substitution Principle Example:");
        System.out.println("--------------------------------------");

        Sam sam = new Sam();
        System.out.println(sam.makeCoffee());

        Sam eden = new Eden();
        System.out.println(eden.makeCoffee());

        //Sam badEden = new BadEden();
        BadEden badEden = new BadEden();
        System.out.println(badEden.makeCoffee());
    }

    public static void liskovSubstitutionPrinciple2() {
        System.out.println("Liskov Substitution Principle Example 2:");
        System.out.println("----------------------------------------");

        List<Figure> figures = new ArrayList<>();
        figures.add(new Figure());
        figures.add(new Square());
        figures.add(new Triangle());
        figures.add(new Circle());

        figures.forEach(figure -> System.out.println(String.format("Here is a %s", figure.getName())));
    }

    public static void interfaceSegregationPrinciple() {
        System.out.println("Interface Segregation Principle Example:");
        System.out.println("----------------------------------------");

        BadRobotWithAntennas badRobotWithAntennas = new BadRobotWithAntennas();
        BadRobotWithoutAntennas badRobotWithoutAntennas = new BadRobotWithoutAntennas();

        try {
            System.out.println(badRobotWithAntennas.rotateArms());
            System.out.println(badRobotWithAntennas.spinAround());
            System.out.println(badRobotWithAntennas.wiggleAntennas());
            System.out.println(badRobotWithoutAntennas.rotateArms());
            System.out.println(badRobotWithoutAntennas.spinAround());
            System.out.println(badRobotWithoutAntennas.wiggleAntennas());
        } catch (Exception e) {
            System.out.println("Somebody doesn't behave well: " + e.getMessage());
        }

        RobotWithAntennas robotWithAntennas = new RobotWithAntennas();
        RobotWithoutAntennas robotWithoutAntennas = new RobotWithoutAntennas();

        System.out.println(robotWithAntennas.rotateArms());
        System.out.println(robotWithAntennas.spinAround());
        System.out.println(robotWithAntennas.wiggleAntennas());
        System.out.println(robotWithoutAntennas.rotateArms());
        System.out.println(robotWithoutAntennas.spinAround());
        //System.out.println(robotWithoutAntennas.wiggleAntennas());
    }

    public static void dependencyInversionPrinciple() {
        System.out.println("Dependency Inversion Principle Example:");
        System.out.println("---------------------------------------");

        BadCuttingRobot badCuttingRobot = new BadCuttingRobot();
        System.out.println(badCuttingRobot.cutPizza(new BadPizzaCutterArm()));

        CuttingRobot cuttingRobot = new CuttingRobot();
        System.out.println(cuttingRobot.cutPizza(new PizzaCutterArm()));
        System.out.println(cuttingRobot.cutPizza(new KnifeArm()));
    }
}
