
  package gen;
  public class D_Gen134 {
  		@com.google.inject.Inject
  		public D_Gen134(D_Gen135 d_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  