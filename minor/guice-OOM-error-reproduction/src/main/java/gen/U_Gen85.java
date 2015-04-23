
  package gen;
  public class U_Gen85 {
  		@com.google.inject.Inject
  		public U_Gen85(U_Gen86 u_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  