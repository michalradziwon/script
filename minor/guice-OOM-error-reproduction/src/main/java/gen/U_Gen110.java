
  package gen;
  public class U_Gen110 {
  		@com.google.inject.Inject
  		public U_Gen110(U_Gen111 u_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  