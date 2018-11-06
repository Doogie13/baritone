/*
 * This file is part of Baritone.
 *
 * Baritone is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Baritone is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Baritone.  If not, see <https://www.gnu.org/licenses/>.
 */

package baritone.bot;

import baritone.bot.entity.EntityBot;
import com.mojang.authlib.GameProfile;
import net.minecraft.network.NetworkManager;
import net.minecraft.util.Session;

/**
 * @author Brady
 * @since 10/23/2018
 */
public interface IBaritoneUser {

    /**
     * Called when the user successfully logs into a server.
     */
    void onLoginSuccess(GameProfile profile);

    /**
     * @return The network manager that is responsible for the current connection.
     */
    NetworkManager getNetworkManager();

    /**
     * @return The locally managed entity for this user.
     */
    EntityBot getEntity();

    /**
     * Returns the user login session. Should never be {@code null}, as this should be set when the
     * user is constructed.
     *
     * @return This users's login session
     */
    Session getSession();

    /**
     * Returns the game profile for the account represented by this user.
     *
     * @return This users's profile.
     */
    GameProfile getProfile();
}