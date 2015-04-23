
  package gen;
  public class Z_Gen51 {
  		@com.google.inject.Inject
  		public Z_Gen51(Z_Gen52 z_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  