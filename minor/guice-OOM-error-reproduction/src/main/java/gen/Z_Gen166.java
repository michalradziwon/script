
  package gen;
  public class Z_Gen166 {
  		@com.google.inject.Inject
  		public Z_Gen166(Z_Gen167 z_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  