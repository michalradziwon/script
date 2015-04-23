
  package gen;
  public class D_Gen36 {
  		@com.google.inject.Inject
  		public D_Gen36(D_Gen37 d_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  