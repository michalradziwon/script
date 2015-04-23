
  package gen;
  public class U_Gen146 {
  		@com.google.inject.Inject
  		public U_Gen146(U_Gen147 u_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  