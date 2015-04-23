
  package gen;
  public class U_Gen69 {
  		@com.google.inject.Inject
  		public U_Gen69(U_Gen70 u_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  