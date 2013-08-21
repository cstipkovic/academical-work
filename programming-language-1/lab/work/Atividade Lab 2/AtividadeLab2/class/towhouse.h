/* 
 * File:   towhouse.h
 * Author: cstipkovic
 *
 * Created on August 20, 2013, 11:24 PM
 */

#ifndef TOWHOUSE_H
#define	TOWHOUSE_H

class towhouse {
public:
    towhouse();
    towhouse(const towhouse& orig);
    virtual ~towhouse();
private:
    string address;
    int number;

};

#endif	/* TOWHOUSE_H */

