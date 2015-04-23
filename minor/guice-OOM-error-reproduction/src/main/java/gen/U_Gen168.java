
  package gen;
  public class U_Gen168 {
  		@com.google.inject.Inject
  		public U_Gen168(U_Gen169 u_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  