
  package gen;
  public class Z_Gen158 {
  		@com.google.inject.Inject
  		public Z_Gen158(Z_Gen159 z_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  