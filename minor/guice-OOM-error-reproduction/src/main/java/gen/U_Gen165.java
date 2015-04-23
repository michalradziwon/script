
  package gen;
  public class U_Gen165 {
  		@com.google.inject.Inject
  		public U_Gen165(U_Gen166 u_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  