
  package gen;
  public class U_Gen82 {
  		@com.google.inject.Inject
  		public U_Gen82(U_Gen83 u_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  