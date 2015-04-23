
  package gen;
  public class Z_Gen29 {
  		@com.google.inject.Inject
  		public Z_Gen29(Z_Gen30 z_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  