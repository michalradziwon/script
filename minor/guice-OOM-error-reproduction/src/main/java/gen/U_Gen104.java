
  package gen;
  public class U_Gen104 {
  		@com.google.inject.Inject
  		public U_Gen104(U_Gen105 u_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  