
  package gen;
  public class Z_Gen95 {
  		@com.google.inject.Inject
  		public Z_Gen95(Z_Gen96 z_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  