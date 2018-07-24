/*
 * Copyright (c) 2014, Stephan Fuhrmann &lt;s@sfuhrm.de&gt;
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package de.sfuhrm.sphlib;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Number with multiplier, like "5 M".
 * @author Stephan Fuhrmann &lt;s@sfuhrm.de&gt;
 */
public class SizeWithMultiplier {

    private final long base;
    private final Multiplier multiplier;

    public SizeWithMultiplier(long base, Multiplier multiplier) {
        this.base = base;
        this.multiplier = multiplier;
    }

    public long getBase() {
        return base;
    }

    public Multiplier getMultiplier() {
        return multiplier;
    }

    public long getNumber() {
        return base * multiplier.multiplier();
    }

    public static SizeWithMultiplier parseString(String in) {
        Pattern p = Pattern.compile("(-?[0-9]+) *([KMGT])");
        Matcher m = p.matcher(in);
        if (m.matches()) {
            long num = Long.parseLong(m.group(1));
            Multiplier unit = Multiplier.valueOf(m.group(2));
            return new SizeWithMultiplier(num, unit);
        }
        throw new IllegalArgumentException("Unparseable: "+in);
    }

    @Override
    public String toString() {
        return Long.toString(base) + multiplier;
    }
}
