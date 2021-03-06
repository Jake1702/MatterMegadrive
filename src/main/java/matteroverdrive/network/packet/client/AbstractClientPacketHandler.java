package matteroverdrive.network.packet.client;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import matteroverdrive.network.packet.AbstractPacketHandler;
import net.minecraft.entity.player.EntityPlayer;

public abstract class AbstractClientPacketHandler<T extends IMessage> extends AbstractPacketHandler<T> {
    public final IMessage handleServerMessage(EntityPlayer player, T message, MessageContext ctx) {
        return null;
    }
}