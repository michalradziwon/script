
  package gen;
  public class Z_Gen184 {
  		@com.google.inject.Inject
  		public Z_Gen184(Z_Gen185 z_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  