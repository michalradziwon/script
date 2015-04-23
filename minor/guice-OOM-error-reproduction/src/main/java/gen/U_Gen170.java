
  package gen;
  public class U_Gen170 {
  		@com.google.inject.Inject
  		public U_Gen170(U_Gen171 u_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  