
  package gen;
  public class U_Gen17 {
  		@com.google.inject.Inject
  		public U_Gen17(U_Gen18 u_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  