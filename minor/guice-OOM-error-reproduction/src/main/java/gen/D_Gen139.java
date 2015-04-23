
  package gen;
  public class D_Gen139 {
  		@com.google.inject.Inject
  		public D_Gen139(D_Gen140 d_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  