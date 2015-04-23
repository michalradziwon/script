
  package gen;
  public class U_Gen163 {
  		@com.google.inject.Inject
  		public U_Gen163(U_Gen164 u_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  