
  package gen;
  public class Z_Gen170 {
  		@com.google.inject.Inject
  		public Z_Gen170(Z_Gen171 z_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  