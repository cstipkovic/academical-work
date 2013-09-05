class OverloadingSumMethod {
	public:
		OverloadingSumMethod();
		OverloadingSumMethod(double);
		OverloadingSumMethod(double, double);
		OverloadingSumMethod(double, double, double);
		OverloadingSumMethod(double, double, double, double);
		OverloadingSumMethod(double []);

	private:
		void infoMessage();
};