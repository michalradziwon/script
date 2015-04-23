
  package gen;
  public class U_Gen195 {
  		@com.google.inject.Inject
  		public U_Gen195(U_Gen196 u_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  