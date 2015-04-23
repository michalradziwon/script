
  package gen;
  public class U_Gen35 {
  		@com.google.inject.Inject
  		public U_Gen35(U_Gen36 u_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  