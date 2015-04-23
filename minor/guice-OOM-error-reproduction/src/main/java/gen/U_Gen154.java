
  package gen;
  public class U_Gen154 {
  		@com.google.inject.Inject
  		public U_Gen154(U_Gen155 u_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  