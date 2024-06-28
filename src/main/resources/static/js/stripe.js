 const stripe = Stripe('pk_test_51PQjYLRp0b525NJuc8JvrC52oCegMvcBieCeEpANsC07oOqDPlx8MNudwTh07ROUJV1BurWS1tcdYHryRggwHDor00xZt9mqeg');
 const paymentButton = document.querySelector('#paymentButton');
 
 paymentButton.addEventListener('click', () => {
   stripe.redirectToCheckout({
     sessionId: sessionId
   })
 });