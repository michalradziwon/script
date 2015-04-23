
  package gen;
  public class Z_Gen53 {
  		@com.google.inject.Inject
  		public Z_Gen53(Z_Gen54 z_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  