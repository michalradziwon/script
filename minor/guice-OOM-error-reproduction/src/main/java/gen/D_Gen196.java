
  package gen;
  public class D_Gen196 {
  		@com.google.inject.Inject
  		public D_Gen196(D_Gen197 d_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  