
  package gen;
  public class D_Gen1 {
  		@com.google.inject.Inject
  		public D_Gen1(D_Gen2 d_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  