
  package gen;
  public class Z_Gen43 {
  		@com.google.inject.Inject
  		public Z_Gen43(Z_Gen44 z_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  