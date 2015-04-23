
  package gen;
  public class U_Gen99 {
  		@com.google.inject.Inject
  		public U_Gen99(U_Gen100 u_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  