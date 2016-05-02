/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics.matcher;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emivo
 */
public class QueryBuilder {

    private List<Matcher> matchers;

    public QueryBuilder() {
        formatMatchers();
    }

    public void playsIn(String team) {
        matchers.add(new PlaysIn(team));
    }

    public void hasAtLeast(int value, String category) {
        matchers.add(new HasAtLeast(value, category));
    }
    
    public void hasFewerThan(int value, String category) {
        matchers.add(new HasFewerThan(value, category));
    }
    
    public void oneOf(Matcher... matchers) {
        formatMatchers();
        this.matchers.add(new Or(matchers));
    }
    
    public Matcher build() {
        Matcher[] tmp = (Matcher[]) matchers.toArray();
        formatMatchers();
        return new And(tmp);
    }

    protected void formatMatchers() {
        this.matchers = new ArrayList<Matcher>();
    }
}
