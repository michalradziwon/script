
  package gen;
  public class D_Gen177 {
  		@com.google.inject.Inject
  		public D_Gen177(D_Gen178 d_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  