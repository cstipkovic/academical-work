/* 
 * File:   Carro.h
 * Author: cstipkovic
 *
 * Created on August 24, 2013, 8:58 AM
 */

#ifndef CARRO_H
#define	CARRO_H

class Carro {
public:
    Carro();
    Carro(const Carro& orig);
    virtual ~Carro();
private:
    float qtCombustivel, autonomiaCombustivel;
};

#endif	/* CARRO_H */

