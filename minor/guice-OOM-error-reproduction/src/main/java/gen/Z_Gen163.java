
  package gen;
  public class Z_Gen163 {
  		@com.google.inject.Inject
  		public Z_Gen163(Z_Gen164 z_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  