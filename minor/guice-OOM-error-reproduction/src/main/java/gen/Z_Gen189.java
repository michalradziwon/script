
  package gen;
  public class Z_Gen189 {
  		@com.google.inject.Inject
  		public Z_Gen189(Z_Gen190 z_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  