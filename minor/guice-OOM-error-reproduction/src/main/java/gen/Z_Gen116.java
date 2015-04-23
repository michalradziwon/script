
  package gen;
  public class Z_Gen116 {
  		@com.google.inject.Inject
  		public Z_Gen116(Z_Gen117 z_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  