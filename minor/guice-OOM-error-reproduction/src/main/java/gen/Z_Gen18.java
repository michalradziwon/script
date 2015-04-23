
  package gen;
  public class Z_Gen18 {
  		@com.google.inject.Inject
  		public Z_Gen18(Z_Gen19 z_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  