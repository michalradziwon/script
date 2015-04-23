
  package gen;
  public class Z_Gen58 {
  		@com.google.inject.Inject
  		public Z_Gen58(Z_Gen59 z_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  