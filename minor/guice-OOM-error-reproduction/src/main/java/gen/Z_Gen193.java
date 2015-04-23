
  package gen;
  public class Z_Gen193 {
  		@com.google.inject.Inject
  		public Z_Gen193(Z_Gen194 z_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  