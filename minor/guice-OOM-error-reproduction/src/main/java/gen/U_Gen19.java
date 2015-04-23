
  package gen;
  public class U_Gen19 {
  		@com.google.inject.Inject
  		public U_Gen19(U_Gen20 u_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  