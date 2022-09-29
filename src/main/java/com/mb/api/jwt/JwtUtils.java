package com.mb.api.jwt;

import java.util.Base64;
import java.util.Date;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtils
{
	public static void main(String[] args)
	{
	
		
		String secretKey = "MINDBOWSER";
		String token  = Jwts.builder()
	
		.setSubject("sachin")
		.setIssuer("Mindbowser")
	    .setIssuedAt(new Date(System.currentTimeMillis()))
	    .setExpiration(new Date(new Date().getTime() + 5))
		.signWith(SignatureAlgorithm.HS512, 
				Base64.getEncoder().encode(secretKey.getBytes()))
		.compact();
		
		System.out.println(token);
		
		Claims claims = Jwts.parser()
		.setSigningKey(Base64.getEncoder().encode(secretKey.getBytes()))
		.parseClaimsJws(token)
		.getBody();
		
		
		System.out.println(claims.getIssuer());
		System.out.println(claims.getSubject());
		System.out.println(claims.getIssuedAt());
		System.out.println(claims.getExpiration());

	}
}
