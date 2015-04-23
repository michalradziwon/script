
  package gen;
  public class Z_Gen117 {
  		@com.google.inject.Inject
  		public Z_Gen117(Z_Gen118 z_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  