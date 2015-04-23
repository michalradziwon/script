
  package gen;
  public class U_Gen103 {
  		@com.google.inject.Inject
  		public U_Gen103(U_Gen104 u_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  