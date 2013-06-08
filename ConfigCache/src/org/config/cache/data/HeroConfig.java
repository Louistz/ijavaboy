package org.config.cache.data;

import org.config.cache.StringArray;
import org.config.cache.core.IConfig;

/**
 * Ӣ�����ñ�
 * @author zhangchun
 * 2012-12-12
 */
public class HeroConfig implements IConfig {	
	private Integer id;//�佫id
	private String name;//�佫����	
	private Integer quality;//�佫��Ʒ�ף�1-3�ֱ������ͨ����ʿ������,4Ϊ����佫ģ��
	private String iconId;//�佫�ĵ�ͷ��
	private Integer command;//�佫��ͳ����
	private Integer commandGrowth;//�佫�ʱ���������ֵ	
	private Integer strength;//�佫��ʼ������ֵ
	private Integer strengthGrowth;//�佫��ʼ����������ֵ
	private Integer intelligence;//�佫��ʼ������ֵ
	private Integer intelligenceGrowth;//�佫��ʼ����������		
	private Integer skill1;//�佫����������skill1������1
	private Integer skill2;//�佫����������skill2������2
	private Integer skill3;//�佫����������skill3������3
	private Integer skill4;//�佫����������skill4������4
	private Integer skill5;//�佫����������skill5������5
	private Integer skill6;//�佫����������skill6������6	
	private Integer geniusFoot;//�佫�ĳ�ʼ�������� 0-5 �ֱ��Ӧ ��-S��
	private Integer geniusBow;//�佫�ĳ�ʼ�������� 0-5 �ֱ��Ӧ ��-S��
	private Integer geniusKnight;//�佫�ĳ�ʼ������� 0-5 �ֱ��Ӧ ��-S��
	private Integer geniusEquipment;//�佫�ĳ�ʼ��е���� 0-5 �ֱ��Ӧ ��-S��	
	
	@Override
	public void fromStringArray(StringArray values) {
		
		this.id = values.getInt();
		this.name = values.getString();
		this.quality=values.getInt();
		this.iconId=values.getString();
		this.command=values.getInt();
		this.commandGrowth=values.getInt();
		this.strength=values.getInt();
		this.strengthGrowth=values.getInt();
		this.intelligence=values.getInt();
		this.intelligenceGrowth=values.getInt();
		this.skill1=values.getInt();
		this.skill2=values.getInt();
		this.skill3=values.getInt();
		this.skill4=values.getInt();
		this.skill5=values.getInt();
		this.skill6=values.getInt();
		this.geniusFoot=values.getInt();
		this.geniusBow=values.getInt();
		this.geniusKnight=values.getInt();
		this.geniusEquipment =values.getInt();
	}

	@Override
	public String getKey() {

		return this.id+"";
	}



	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final Integer getQuality() {
		return quality;
	}

	public final void setQuality(Integer quality) {
		this.quality = quality;
	}

	public final String getIconId() {
		return iconId;
	}

	public final void setIconId(String iconId) {
		this.iconId = iconId;
	}

	public final int getCommand() {
		return command;
	}

	public final void setCommand(int command) {
		this.command = command;
	}

	public final Integer getCommandGrowth() {
		return commandGrowth;
	}

	public final void setCommandGrowth(Integer commandGrowth) {
		this.commandGrowth = commandGrowth;
	}

	public final Integer getStrength() {
		return strength;
	}

	public final void setStrength(Integer strength) {
		this.strength = strength;
	}

	public final Integer getStrengthGrowth() {
		return strengthGrowth;
	}

	public final void setStrengthGrowth(Integer strengthGrowth) {
		this.strengthGrowth = strengthGrowth;
	}

	public final Integer getIntelligence() {
		return intelligence;
	}

	public final void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}

	public final Integer getIntelligenceGrowth() {
		return intelligenceGrowth;
	}

	public final void setIntelligenceGrowth(Integer intelligenceGrowth) {
		this.intelligenceGrowth = intelligenceGrowth;
	}

	public final int getSkill1() {
		return skill1;
	}

	public final void setSkill1(int skill1) {
		this.skill1 = skill1;
	}

	public final int getSkill2() {
		return skill2;
	}

	public final void setSkill2(int skill2) {
		this.skill2 = skill2;
	}

	public final int getSkill3() {
		return skill3;
	}

	public final void setSkill3(int skill3) {
		this.skill3 = skill3;
	}

	public final int getSkill4() {
		return skill4;
	}

	public final void setSkill4(int skill4) {
		this.skill4 = skill4;
	}

	public final int getSkill5() {
		return skill5;
	}

	public final void setSkill5(int skill5) {
		this.skill5 = skill5;
	}

	public final int getSkill6() {
		return skill6;
	}

	public final void setSkill6(int skill6) {
		this.skill6 = skill6;
	}

	public final int getGeniusFoot() {
		return geniusFoot;
	}

	public final void setGeniusFoot(int geniusFoot) {
		this.geniusFoot = geniusFoot;
	}

	public final int getGeniusBow() {
		return geniusBow;
	}

	public final void setGeniusBow(int geniusBow) {
		this.geniusBow = geniusBow;
	}

	public final int getGeniusKnight() {
		return geniusKnight;
	}

	public final void setGeniusKnight(int geniusKnight) {
		this.geniusKnight = geniusKnight;
	}

	public final int getGeniusEquipment() {
		return geniusEquipment;
	}

	public final void setGeniusEquipment(int geniusEquipment) {
		this.geniusEquipment = geniusEquipment;
	}

	public final void setId(Integer id) {
		this.id = id;
	}

	public final Integer getId() {
		return id;
	}

	
}