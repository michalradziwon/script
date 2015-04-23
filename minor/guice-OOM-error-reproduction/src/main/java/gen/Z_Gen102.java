
  package gen;
  public class Z_Gen102 {
  		@com.google.inject.Inject
  		public Z_Gen102(Z_Gen103 z_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  