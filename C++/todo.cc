class X{
	public :
	virtual X foo(X);
};

class Y: public X{
};

class Z: public Y{
};

class A{
	public:
	X foo(X aa){
		return aa;
	}

};

class B: public A{

};

int main()
{
    B bb;
    A aa;
    X xx;
    Y yy;
    Z zz;
    xx = bb.foo(xx);
    yy = bb.foo(yy);
    bb.foo(zz);
    aa.foo(yy);
    aa.foo(xx);
    aa.foo(zz);
    
    return 0;
}