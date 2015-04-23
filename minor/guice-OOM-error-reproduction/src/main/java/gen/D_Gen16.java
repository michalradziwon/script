
  package gen;
  public class D_Gen16 {
  		@com.google.inject.Inject
  		public D_Gen16(D_Gen17 d_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  