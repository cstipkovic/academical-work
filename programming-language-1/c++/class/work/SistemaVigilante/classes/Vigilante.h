#ifndef VIGILANTE_H
#define	VIGILANTE_H

class Vigilante {
public:
	virtual bool invasao() = 0;
	void resetStatus();
};

#endif