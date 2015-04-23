
  package gen;
  public class D_Gen146 {
  		@com.google.inject.Inject
  		public D_Gen146(D_Gen147 d_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  