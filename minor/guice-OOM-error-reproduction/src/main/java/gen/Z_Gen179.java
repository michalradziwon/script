
  package gen;
  public class Z_Gen179 {
  		@com.google.inject.Inject
  		public Z_Gen179(Z_Gen180 z_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  