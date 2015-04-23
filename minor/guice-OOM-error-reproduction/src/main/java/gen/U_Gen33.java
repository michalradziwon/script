
  package gen;
  public class U_Gen33 {
  		@com.google.inject.Inject
  		public U_Gen33(U_Gen34 u_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  