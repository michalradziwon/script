
  package gen;
  public class D_Gen80 {
  		@com.google.inject.Inject
  		public D_Gen80(D_Gen81 d_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  