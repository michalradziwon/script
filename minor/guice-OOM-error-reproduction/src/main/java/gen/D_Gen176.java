
  package gen;
  public class D_Gen176 {
  		@com.google.inject.Inject
  		public D_Gen176(D_Gen177 d_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  