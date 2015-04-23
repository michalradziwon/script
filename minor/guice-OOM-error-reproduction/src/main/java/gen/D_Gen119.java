
  package gen;
  public class D_Gen119 {
  		@com.google.inject.Inject
  		public D_Gen119(D_Gen120 d_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  