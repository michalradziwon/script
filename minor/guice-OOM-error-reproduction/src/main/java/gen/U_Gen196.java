
  package gen;
  public class U_Gen196 {
  		@com.google.inject.Inject
  		public U_Gen196(U_Gen197 u_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  