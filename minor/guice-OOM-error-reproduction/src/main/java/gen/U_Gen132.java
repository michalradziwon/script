
  package gen;
  public class U_Gen132 {
  		@com.google.inject.Inject
  		public U_Gen132(U_Gen133 u_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  