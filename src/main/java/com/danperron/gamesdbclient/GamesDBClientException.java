
package com.danperron.gamesdbclient;

/**
 *
 * @author Dan Perron <danp3rr0n@gmail.com>
 */
public class GamesDBClientException extends Exception{
    
    private static final long serialVersionUID = 147443563456L;

    public GamesDBClientException() {
    }

    public GamesDBClientException(final String message) {
        super(message);
    }

    public GamesDBClientException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public GamesDBClientException(final Throwable cause) {
        super(cause);
    }
}