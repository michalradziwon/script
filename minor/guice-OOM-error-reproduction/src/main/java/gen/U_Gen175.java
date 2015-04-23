
  package gen;
  public class U_Gen175 {
  		@com.google.inject.Inject
  		public U_Gen175(U_Gen176 u_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  