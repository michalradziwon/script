
  package gen;
  public class U_Gen44 {
  		@com.google.inject.Inject
  		public U_Gen44(U_Gen45 u_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  