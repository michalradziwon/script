
  package gen;
  public class Z_Gen54 {
  		@com.google.inject.Inject
  		public Z_Gen54(Z_Gen55 z_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  