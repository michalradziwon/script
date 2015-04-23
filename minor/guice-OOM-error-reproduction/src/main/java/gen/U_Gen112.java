
  package gen;
  public class U_Gen112 {
  		@com.google.inject.Inject
  		public U_Gen112(U_Gen113 u_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  