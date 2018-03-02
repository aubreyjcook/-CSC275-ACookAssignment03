public class Item {
	String name = "none";
	String weight = "none";
	String value = "none";
	String durability = "none";
	String ID = "none";
			
	Item(){}
	
	//constructor
	public Item(String itemName, String itemWeight, String itemValue, String itemDurability, String itemID) {
		this.name = itemName;
		this.weight = itemWeight;
		this.value = itemValue;
		this.durability = itemDurability;
		this.ID = itemID;
	}
	
	//setter methods
	public void setItemName(String newItemName) {
		this.name = newItemName;
	}
	
	public void setItemWeight(String newItemWeight) {
		this.weight = newItemWeight;
	}
	
	public void setItemValue(String newItemValue) {
		this.value = newItemValue;
	}
	
	public void setItemDurability(String newItemDurability) {
		this.durability = newItemDurability;
	}
	
	public void setItemID(String newItemID) {
		this.ID = newItemID;
	}
	
	//getter methods
	public String getItemName() {
		return name;
	}
	
	public String getItemWeight() {
		return weight;
	}
	
	public String getItemValue() {
		return value;
	}
	
	public String getItemDurability() {
		return durability;
	}
	
	public String getItemID() {
		return ID;
	}
}
