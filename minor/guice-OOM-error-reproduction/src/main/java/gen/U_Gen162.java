
  package gen;
  public class U_Gen162 {
  		@com.google.inject.Inject
  		public U_Gen162(U_Gen163 u_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  