class LFUCache {
    E[] map=new E[100_001];
    ArrayDeque<E>[] freqBuckets= new ArrayDeque[10_001];
    int lf=0,capacity;
    boolean block=false;

    public LFUCache(int capacity) {
        this.capacity=capacity;
        if(capacity==0) block=true;
    }
    
    public int get(int key) {
        if(block) return -1;
        E v=map[key];
        if(v==null) return -1;
        updateFreq(v);
        return v.value;
    }
    
    public void put(int key, int value) {
        if(block) return;
        E v=map[key];
        if(v==null) {
            if(capacity==0) {
                map[freqBuckets[lf].removeFirst().key]=null;
                capacity++;
            }
            v=new E(key,value);
            capacity--;
        } else v.value=value;
        updateFreq(v);
        map[key]=v;
    }

    private void updateFreq(E keyE) {
        if(keyE.f==0||(keyE.f==lf&&freqBuckets[keyE.f].size()==1)) lf=keyE.f+1;
        if(keyE.f++!=0) freqBuckets[keyE.f-1].remove(keyE);
        ArrayDeque bucket=freqBuckets[keyE.f];
        if(bucket==null) freqBuckets[keyE.f]=bucket=new ArrayDeque<>();
        bucket.add(keyE);
    }

    class E {
        int f=0,key,value;
        public E(int key, int value) {
            this.key=key;
            this.value=value;
        }
    }
}