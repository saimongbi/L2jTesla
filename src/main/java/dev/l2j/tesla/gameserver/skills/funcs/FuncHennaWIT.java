package dev.l2j.tesla.gameserver.skills.funcs;

import dev.l2j.tesla.gameserver.skills.Env;
import dev.l2j.tesla.gameserver.skills.basefuncs.Func;
import dev.l2j.tesla.gameserver.enums.actors.HennaType;
import dev.l2j.tesla.gameserver.model.actor.Player;

public class FuncHennaWIT extends Func
{
	private static final HennaType STAT = HennaType.WIT;
	private static final FuncHennaWIT INSTANCE = new FuncHennaWIT();
	
	public static Func getInstance()
	{
		return INSTANCE;
	}
	
	private FuncHennaWIT()
	{
		super(STAT.getStats(), 0x10, null, null);
	}
	
	@Override
	public void calc(Env env)
	{
		final Player player = env.getPlayer();
		if (player != null)
			env.addValue(player.getHennaList().getStat(STAT));
	}
}