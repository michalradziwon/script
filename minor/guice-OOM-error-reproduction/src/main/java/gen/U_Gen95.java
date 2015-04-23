
  package gen;
  public class U_Gen95 {
  		@com.google.inject.Inject
  		public U_Gen95(U_Gen96 u_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  