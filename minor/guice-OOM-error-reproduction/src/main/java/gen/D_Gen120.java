
  package gen;
  public class D_Gen120 {
  		@com.google.inject.Inject
  		public D_Gen120(D_Gen121 d_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  