
  package gen;
  public class Z_Gen162 {
  		@com.google.inject.Inject
  		public Z_Gen162(Z_Gen163 z_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  