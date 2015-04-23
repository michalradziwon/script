
  package gen;
  public class U_Gen177 {
  		@com.google.inject.Inject
  		public U_Gen177(U_Gen178 u_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  