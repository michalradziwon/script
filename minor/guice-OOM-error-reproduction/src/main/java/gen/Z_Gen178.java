
  package gen;
  public class Z_Gen178 {
  		@com.google.inject.Inject
  		public Z_Gen178(Z_Gen179 z_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  