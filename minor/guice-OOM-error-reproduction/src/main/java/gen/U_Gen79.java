
  package gen;
  public class U_Gen79 {
  		@com.google.inject.Inject
  		public U_Gen79(U_Gen80 u_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  