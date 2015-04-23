
  package gen;
  public class Z_Gen21 {
  		@com.google.inject.Inject
  		public Z_Gen21(Z_Gen22 z_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  