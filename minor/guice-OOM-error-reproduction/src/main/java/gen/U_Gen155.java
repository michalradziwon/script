
  package gen;
  public class U_Gen155 {
  		@com.google.inject.Inject
  		public U_Gen155(U_Gen156 u_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  