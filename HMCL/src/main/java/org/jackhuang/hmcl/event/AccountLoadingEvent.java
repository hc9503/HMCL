/*
 * Hello Minecraft! Launcher.
 * Copyright (C) 2018  huangyuhui <huanghongxun2008@126.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see {http://www.gnu.org/licenses/}.
 */
package org.jackhuang.hmcl.event;

import org.jackhuang.hmcl.auth.Account;
import org.jackhuang.hmcl.util.ToStringBuilder;

import java.util.Collection;
import java.util.Collections;

/**
 * This event gets fired when loading accounts.
 * <br>
 * This event is fired on the {@link org.jackhuang.hmcl.event.EventBus#EVENT_BUS}
 *
 * @author huangyuhui
 */
public class AccountLoadingEvent extends Event {

    private final Collection<Account> accounts;

    /**
     * Constructor.
     *
     * @param source {@link org.jackhuang.hmcl.setting.Settings}
     */
    public AccountLoadingEvent(Object source, Collection<Account> accounts) {
        super(source);
        this.accounts = Collections.unmodifiableCollection(accounts);
    }


    public Collection<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("source", source)
                .append("accounts", accounts)
                .toString();
    }
}

