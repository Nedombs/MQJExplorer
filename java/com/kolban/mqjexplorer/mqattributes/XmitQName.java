// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   XmitQName.java

package com.kolban.mqjexplorer.mqattributes;

import com.kolban.utils.StringUtils;

// Referenced classes of package com.kolban.mqjexplorer.mqattributes:
//            QNameComboBox

public class XmitQName extends QNameComboBox
{

    public XmitQName()
    {
        setEditable(true);
    }

    public String getValue()
    {
        return StringUtils.pad((String)getSelectedItem(), 48);
    }

    public void init(String as[])
    {
        if(as == null)
        {
            System.out.println("XmitQName::values: No values supplied");
            return;
        }
        for(int i = 0; i < as.length; i++)
            addItem(as[i].trim());

    }

    public void setValue(String s)
    {
        setSelectedItem(s.trim());
    }
}
