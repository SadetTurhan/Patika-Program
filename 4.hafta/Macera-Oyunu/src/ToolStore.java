public class ToolStore extends NormalLoc{
    public ToolStore(Player player){
        super(player, "Mağaza");
    }
    @Override
    public boolean onLocation(){
        System.out.println("Mağazaya hoşgeldiniz ! ");
        return true;
    }
}
