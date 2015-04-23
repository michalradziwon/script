
  package gen;
  public class U_Gen197 {
  		@com.google.inject.Inject
  		public U_Gen197(U_Gen198 u_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  