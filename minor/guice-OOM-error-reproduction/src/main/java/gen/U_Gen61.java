
  package gen;
  public class U_Gen61 {
  		@com.google.inject.Inject
  		public U_Gen61(U_Gen62 u_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  