package java.simulator.factories;

import java.simulator.animals.DuckCall;
import java.simulator.animals.MallardDuck;
import java.simulator.animals.Quackable;
import java.simulator.animals.RedheadDuck;
import java.simulator.animals.RubberDuck;
import java.simulator.animals.decorated.QuackCounter;
import java.simulator.animals.decorated.QuackEcho;

public class CountAndEchoDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new QuackEcho(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new QuackEcho(new RedheadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new QuackEcho(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new QuackEcho(new RubberDuck()));
    }
}
