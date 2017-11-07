package com.lyt.designpatterns.builder.example2;

// StringBuilder, 以后学习XML解析中，JDOM库中的类：DomBuilder,SaxBuilder
public class HPAirShipBuilder implements AirShipBuilder {
    
    @Override
    public Engine builderEngine() {
        System.out.println("构建发动机！");
        return new Engine("发卡发动机！");
    }
    
    @Override
    public EscapeTower builderEscapeTower() {
        
        System.out.println("构建逃逸塔");
        return new EscapeTower("发卡逃逸塔");
    }
    
    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建轨道舱");
        return new OrbitalModule("发卡轨道舱");
    }
    
}
