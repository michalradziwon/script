
  package gen;
  public class Z_Gen113 {
  		@com.google.inject.Inject
  		public Z_Gen113(Z_Gen114 z_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  