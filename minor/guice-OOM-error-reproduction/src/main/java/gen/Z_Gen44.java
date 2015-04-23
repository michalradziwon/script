
  package gen;
  public class Z_Gen44 {
  		@com.google.inject.Inject
  		public Z_Gen44(Z_Gen45 z_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  