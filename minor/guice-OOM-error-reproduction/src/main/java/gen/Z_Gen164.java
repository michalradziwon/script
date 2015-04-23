
  package gen;
  public class Z_Gen164 {
  		@com.google.inject.Inject
  		public Z_Gen164(Z_Gen165 z_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  