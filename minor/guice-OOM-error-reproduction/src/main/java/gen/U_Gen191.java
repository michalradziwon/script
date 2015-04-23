
  package gen;
  public class U_Gen191 {
  		@com.google.inject.Inject
  		public U_Gen191(U_Gen192 u_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  