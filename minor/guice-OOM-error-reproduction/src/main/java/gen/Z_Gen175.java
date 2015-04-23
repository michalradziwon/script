
  package gen;
  public class Z_Gen175 {
  		@com.google.inject.Inject
  		public Z_Gen175(Z_Gen176 z_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  