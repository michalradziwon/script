
  package gen;
  public class Z_Gen124 {
  		@com.google.inject.Inject
  		public Z_Gen124(Z_Gen125 z_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  