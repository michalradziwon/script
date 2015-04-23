
  package gen;
  public class U_Gen133 {
  		@com.google.inject.Inject
  		public U_Gen133(U_Gen134 u_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  