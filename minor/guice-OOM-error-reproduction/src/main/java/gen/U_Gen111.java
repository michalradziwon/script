
  package gen;
  public class U_Gen111 {
  		@com.google.inject.Inject
  		public U_Gen111(U_Gen112 u_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  