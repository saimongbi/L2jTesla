package dev.l2j.tesla.gameserver.network.clientpackets;

import dev.l2j.tesla.gameserver.model.actor.Player;

public final class RequestPrivateStoreManageSell extends L2GameClientPacket
{
	@Override
	protected void readImpl()
	{
	}
	
	@Override
	protected void runImpl()
	{
		final Player player = getClient().getPlayer();
		if (player == null)
			return;
		
		player.tryOpenPrivateSellStore(false);
	}
}