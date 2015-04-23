
  package gen;
  public class Z_Gen94 {
  		@com.google.inject.Inject
  		public Z_Gen94(Z_Gen95 z_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  