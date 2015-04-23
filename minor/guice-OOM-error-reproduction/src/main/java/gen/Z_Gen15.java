
  package gen;
  public class Z_Gen15 {
  		@com.google.inject.Inject
  		public Z_Gen15(Z_Gen16 z_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  