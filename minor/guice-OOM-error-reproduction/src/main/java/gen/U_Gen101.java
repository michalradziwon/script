
  package gen;
  public class U_Gen101 {
  		@com.google.inject.Inject
  		public U_Gen101(U_Gen102 u_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  