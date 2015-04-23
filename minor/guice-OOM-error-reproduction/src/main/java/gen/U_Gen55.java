
  package gen;
  public class U_Gen55 {
  		@com.google.inject.Inject
  		public U_Gen55(U_Gen56 u_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  