package ru.mirea.task26.ex;

public class HeshTable {
    private int M, N, D; // M - размер, N - количество непустых адресов, D - количество удалённых адресов;
    private HeshTableNode[] keys;

    public void heshCreateTable(int M) {
        this.M = M;
        this.N = 0;
        this.D = 0;
        this.keys = new HeshTableNode[M];
        for (int i = 0; i < M; i++)
        {
            this.keys[i] = new HeshTableNode(0, 0,  false, true);
        }
    }

    public int heshFunc(int key, int L){
        return key % L;
    }

    public void heshInsert(int key, int ind)
    {
        int i = heshFunc(key, this.M);
        while (!keys[i].isOpen && i < this.M) i++;
        if (i < this.M && (this.N + this.D < (this.M * 0.75)))
        {
            if (keys[i].isDeleted) D--;
            keys[i] = new HeshTableNode(key, ind, false, false);
            N++;
        }
        else
        {
            rehesh();
            heshInsert(key, ind);
        }
    }

    public void rehesh()
    {
        int M = this.M;
        HeshTableNode[] tmpKeys = this.keys;
        heshCreateTable(this.M * 2);
        for (int i = 0; i < M; i++)
        {
            if (!tmpKeys[i].isOpen) heshInsert(tmpKeys[i].key, tmpKeys[i].ind);
        }
    }

    public HeshTableNode heshFind(int key)
    {
        int ind = heshFunc(key, this.M);
        while (this.keys[ind].key != key && ind < this.M && (keys[ind].isOpen || keys[ind].isDeleted)) ind++;
        if (keys[ind].key == key) return keys[ind];
        else return null;
    }

    public void heshDel(int key)
    {
        HeshTableNode t = heshFind(key);
        if (t != null)
        {
            t.isOpen = true;
            t.isDeleted = true;
            this.D++;
            this.N--;
        }
    }

    public void heshOutput()
    {
        System.out.println("Хеш таблица:");
        System.out.println("i        key        ind        isOpen        isDeleted");
        for(int i = 0; i < this.M; i++)
        {
            System.out.println(i + "        "
                    + keys[i].key + "        " + keys[i].ind
            + "        " + keys[i].isOpen + "        " +
                    keys[i].isDeleted);
        }
    }
}
