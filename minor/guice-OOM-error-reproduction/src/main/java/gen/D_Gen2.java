
  package gen;
  public class D_Gen2 {
  		@com.google.inject.Inject
  		public D_Gen2(D_Gen3 d_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  