
  package gen;
  public class D_Gen147 {
  		@com.google.inject.Inject
  		public D_Gen147(D_Gen148 d_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  