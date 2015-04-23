
  package gen;
  public class U_Gen53 {
  		@com.google.inject.Inject
  		public U_Gen53(U_Gen54 u_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  