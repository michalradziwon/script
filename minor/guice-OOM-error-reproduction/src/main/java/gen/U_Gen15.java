
  package gen;
  public class U_Gen15 {
  		@com.google.inject.Inject
  		public U_Gen15(U_Gen16 u_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  