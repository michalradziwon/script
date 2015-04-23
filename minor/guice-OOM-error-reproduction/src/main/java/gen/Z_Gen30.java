
  package gen;
  public class Z_Gen30 {
  		@com.google.inject.Inject
  		public Z_Gen30(Z_Gen31 z_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  